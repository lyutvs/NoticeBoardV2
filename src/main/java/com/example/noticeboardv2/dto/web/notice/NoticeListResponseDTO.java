package com.example.noticeboardv2.dto.web.notice;

import com.example.noticeboardv2.domain.notice.Notice;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class NoticeListResponseDTO {

    private Long id;
    private String title, author;
    private LocalDateTime modifiedDate;

    public NoticeListResponseDTO(Notice entity) {
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.author = entity.getAuthor();
        this.modifiedDate = entity.getModifiedDate();
    }
}
