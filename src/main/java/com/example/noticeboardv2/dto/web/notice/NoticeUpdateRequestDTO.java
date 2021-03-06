package com.example.noticeboardv2.dto.web.notice;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class NoticeUpdateRequestDTO {
    private String title, content;

    @Builder
    public NoticeUpdateRequestDTO(String title, String content) {
        this.title = title;
        this.content = content;
    }
}
