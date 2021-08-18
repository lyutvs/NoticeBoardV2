package com.example.noticeboardv2.dto.web.midi;

import com.example.noticeboardv2.domain.midi.Midi;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.apache.tomcat.jni.Local;

import java.time.LocalDateTime;

@Getter
@ToString
@NoArgsConstructor
public class MidiPublicResponseDTO {

    private Long id;

    private Long userId;    // 업로드한 사람

    private String category;

    private String customTitle;

    private String originalFileName;

    private LocalDateTime createdDate;

    private LocalDateTime modifiedDate;

    public MidiPublicResponseDTO(Midi midi) {
        this.id = midi.getId();
        this.userId = midi.getUserId();
        this.category = midi.getCategory();
        this.customTitle = midi.getCustomTitle();
        this.originalFileName = midi.getOriginalFileName();
        this.createdDate = midi.getCreatedDate();
        this.modifiedDate = midi.getModifiedDate();
    }}
