package com.example.noticeboardv2.domain.web.dto.toy;

import com.example.noticeboardv2.toy.LombokCar;
import org.junit.jupiter.api.Test;

public class LomvokCarTest {

    @Test
    public void 빌더_테스트_2() {
        String id = "2";
        String name = "James";

        LombokCar car2 = LombokCar.builder()
                .id(id)
                .name(name)
                .build();

        a(car2.getId()).isEqualTo(id);
        assertThat(car2.getName()).isEqualTo(name);

    }


}
