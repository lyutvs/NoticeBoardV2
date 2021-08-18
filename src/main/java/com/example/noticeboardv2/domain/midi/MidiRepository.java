package com.example.noticeboardv2.domain.midi;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MidiRepository extends JpaRepository<Midi, Long> {

    Midi findByHash(String hash);

    List<Midi> findByUserId(Long userId);
}
