package naver.kiel0103.gitops2024post.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class PostDomain {

    private final Long id;
    private final Long authorId;
    private final String content;
}
