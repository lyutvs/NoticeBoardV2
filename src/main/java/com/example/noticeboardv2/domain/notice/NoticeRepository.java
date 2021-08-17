package com.example.noticeboardv2.domain.notice;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface NoticeRepository extends JpaRepository<Notice, Long> {

    @Query("select p from Notice p order by p.id desc")
    List<Notice> findAllDesc();

}
