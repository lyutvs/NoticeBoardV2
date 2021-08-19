package com.example.noticeboardv2.dto.web;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class BasicResponseDTO {

    private final String name;
    private final int amount;
}
