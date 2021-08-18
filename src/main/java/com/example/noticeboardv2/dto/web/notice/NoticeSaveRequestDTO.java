package com.example.noticeboardv2.dto.web.notice;

import com.example.noticeboardv2.domain.notice.Notice;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class NoticeSaveRequestDTO {
    private String title;
    private String content;
    private String author;
    private Long authorId;

    @Builder
    public NoticeSaveRequestDTO(String title, String content, String author, Long authorId) {
        this.title = title;
        this.content = content;
        this.author = author;
        this.authorId = authorId;
    }

    public Notice toEntity() {
        return Notice.builder()
                .title(title)
                .content(content)
                .author(author)
                .authorId(authorId)
                .build();
    }
}
