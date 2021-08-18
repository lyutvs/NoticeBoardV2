package com.example.noticeboardv2.dto.web.log;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.extern.java.Log;

@Getter
@NoArgsConstructor
public class LogSaveRequestDTO {

    private String boardName, ipAddress;
    private Long articleId, userId;

    @Builder
    public LogSaveRequestDTO(String boardName, Long articleId, Long userId, String ipAddress) {
        this.boardName = boardName;
        this.articleId = articleId;
        this.userId = userId;
        this.ipAddress = ipAddress;
    }

    public Log toEntity() {
        return Log.builder()
                .boardName(boardName)
                .articleId(articleId)
                .userId(userId)
                .ipAddress(ipAddress)
                .build();
    }

}
