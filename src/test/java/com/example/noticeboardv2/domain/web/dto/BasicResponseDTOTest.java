package com.example.noticeboardv2.domain.web.dto;

import com.example.noticeboardv2.dto.web.BasicResponseDTO;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BasicResponseDTOTest {

    @Test   
    public void 롬복_기능_테스트() {
        String name = "abc";
        int amount = 1000;

        BasicResponseDTO dto = new BasicResponseDTO(name, amount);

        assertThat(dto.getName()).isEqualTo(name);
        assertThat(dto.getAmount()).isEqualTo(amount);

    }
}
