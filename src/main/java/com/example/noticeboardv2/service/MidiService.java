package com.example.noticeboardv2.service;

import com.example.noticeboardv2.domain.midi.Midi;
import com.example.noticeboardv2.domain.midi.MidiRepository;
import com.example.noticeboardv2.dto.web.midi.MidiPublicResponseDTO;
import com.example.noticeboardv2.dto.web.midi.MidiRequestDTO;
import com.example.noticeboardv2.dto.web.midi.MidiResponseDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class MidiService {
    private final MidiRepository midiRepository;

    @Transactional
    public Long save(MidiRequestDTO requestDTO) {
        return midiRepository.save(requestDTO.toEnity()).getId();
    }

    @Transactional
    public Long update(Long id, MidiRequestDTO requestDTO) {
        Midi midi = midiRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("해당 파일이 없습니다. id=" + id));
        midi.update(requestDTO);
        return midi.getId();
    }

    @Transactional
    public void delete(Long id) {
        Midi midi = midiRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("해당 파일이 없습니다. id=" + id));
        midiRepository.delete(midi);
    }

    // 미디 한 곡 불러오기
    public MidiResponseDTO findById(Long id) {
        Midi midi = midiRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("해당 파일이 없습니다. id=" + id));

        return new MidiResponseDTO(midi);
    }

    @Transactional(readOnly = true)
    public List<MidiPublicResponseDTO> findAll() {
        return midiRepository.findAll().stream()
                .map(MidiPublicResponseDTO::new)
                .collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public List<MidiPublicResponseDTO> findByUserId(Long userId) {
        return midiRepository.findByUserId(userId).stream()
                .map(MidiPublicResponseDTO::new)
                .collect(Collectors.toList());
    }
}
