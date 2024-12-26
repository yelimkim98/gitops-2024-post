package naver.kiel0103.gitops2024post.controller;

import jakarta.annotation.PostConstruct;
import naver.kiel0103.gitops2024post.controller.dto.PostCreateRequest;
import naver.kiel0103.gitops2024post.domain.PostDomain;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
public class PostController {

    private final List<PostDomain> posts = new ArrayList<>();

    @PostMapping("/post")
    public ResponseEntity<PostDomain> create(@RequestBody PostCreateRequest request) {
        PostDomain post = new PostDomain(
                (long) (posts.size() + 1),
                request.getAuthorId(),
                request.getContent()
        );
        posts.add(post);
        return ResponseEntity.ok(post);
    }

    @GetMapping("/posts")
    public ResponseEntity<List<PostDomain>> getPosts() {
        return ResponseEntity.ok(posts);
    }
}
