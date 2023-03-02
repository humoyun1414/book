package uz.spring.euroclimate.api;

import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import uz.spring.euroclimate.model.PostDto;
import uz.spring.euroclimate.model.request.PostRequest;
import uz.spring.euroclimate.service.PostService;

import java.util.UUID;

import static uz.spring.euroclimate.util.Constants.DEFAULT_VALUE_PAGE;
import static uz.spring.euroclimate.util.Constants.DEFAULT_VALUE_SIZE;

@RestController
@RequestMapping("/api/posts/v1")
public class PostController {

    private final PostService postService;


    public PostController(PostService postService) {
        this.postService = postService;
    }


    @PostMapping
    public Mono<UUID> add(@RequestBody final PostRequest request) {
        return postService.add(request);
    }

    @GetMapping
    public Page<PostDto> findAll(@RequestParam(name = "page", defaultValue = DEFAULT_VALUE_PAGE) final Integer page,
                                 @RequestParam(name = "size", defaultValue = DEFAULT_VALUE_SIZE) final Integer size) {
        return postService.findAll(page, size);
    }

    @GetMapping("/{id}")
    public Mono<PostDto> findById(@PathVariable(name = "id")final UUID id) {
        return postService.findById(id);
    }

    @PatchMapping("/{id}")
    public Mono<Void> update(@PathVariable(name = "id")final UUID id, @RequestBody final PostRequest request) {
        return postService.update(id, request);
    }

    @DeleteMapping("/{id}")
    public Mono<Void> delete(@PathVariable(value = "id") final UUID id) {
        return postService.delete(id);
    }


}
