package uz.spring.euroclimate.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import uz.spring.euroclimate.domain.PostEntity;
import uz.spring.euroclimate.exception.NotFoundException;
import uz.spring.euroclimate.model.PostDto;
import uz.spring.euroclimate.model.mapper.PostMapper;
import uz.spring.euroclimate.model.request.PostRequest;
import uz.spring.euroclimate.repository.PostRepository;

import java.util.UUID;

@Service
public class PostService {
    private final PostRepository postRepository;
    private final PostMapper postMapper;


    public PostService(final PostRepository postRepository) {
        this.postRepository = postRepository;
        this.postMapper = PostMapper.INSTANCE;
    }


    public Mono<UUID> add(final PostRequest request) {
        PostEntity postEntity = postMapper.toEntity(request);


        return postRepository.save(postEntity).map(PostEntity::getId);
    }

    public Page<PostDto> findAll(final Integer page, final Integer size) {
        return postRepository.findAllBy(PageRequest.of(page, size))
                .map(postMapper::toDto);
    }

    public Mono<PostDto> findById(final UUID id) {
        return postRepository.findById(id).
                switchIfEmpty(Mono.error(new NotFoundException("Argument not found by this id : " + id)))
                .map(postMapper::toDto);
    }

    public Mono<Void> update(final UUID id, final PostRequest request) {

        return postRepository
                .findById(id)
                .flatMap(postEntity -> {
                    postMapper.update(postEntity, request);
                    return postRepository.save(postEntity);
                })
                .then();

    }

    public Mono<Void> delete(final UUID id) {
        return postRepository.deleteById(id);
    }

}
