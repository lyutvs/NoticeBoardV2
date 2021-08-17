package com.example.noticeboardv2.service;

import com.example.noticeboardv2.domain.posts.PostsRepository;
import com.example.noticeboardv2.dto.web.PostsSaveRequestDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@RequiredArgsConstructor
@Service
public class PostsService {
    private final PostsRepository postsRepository;

    @Transactional
    public Long save(PostsSaveRequestDTO requestDTO) {
        return postsRepository.save(requestDTO.toEntity())
                .getId();
    }
}
