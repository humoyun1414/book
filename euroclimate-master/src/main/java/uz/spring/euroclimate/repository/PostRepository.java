package uz.spring.euroclimate.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import reactor.core.publisher.Flux;
import uz.spring.euroclimate.domain.PostEntity;

import java.util.UUID;

public interface PostRepository extends R2dbcRepository<PostEntity, UUID> {
    Page<PostEntity> findAllBy(final Pageable pageable);
}
