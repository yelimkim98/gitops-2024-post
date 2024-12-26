package naver.kiel0103.gitops2024post.controller.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class PostCreateRequest {

    private Long authorId;
    private String content;
}
