package com.example.noticeboardv2.controller;

import com.example.noticeboardv2.dto.web.log.LogSaveRequestDTO;
import com.example.noticeboardv2.service.LogService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class LogApiController {

    private final LogService logService;

    @PostMapping("/api/v1/log")
    public Long save(@RequestBody LogSaveRequestDTO logSaveRequestDTO) {
        return logService.save(logSaveRequestDTO);
    }

    @GetMapping("/api/v1/log/{boardName}/{articleId}")
    public Long getViewCount(@PathVariable("boardName") String boardName,
                             @PathVariable("articleId") Long articleId) {
        return logService.getViewCountByBoardNameAndArticleId(boardName, articleId);
    }
}
