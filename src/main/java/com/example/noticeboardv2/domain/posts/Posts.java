package com.example.noticeboardv2.domain.posts;

import com.example.noticeboardv2.domain.BaseTimeEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@ToString
@Entity
public class Posts extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 450, nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    private String author;

    private Long authorId;

    @Builder
    public Posts(String title, String content, String author, Long authorId) {
        this.title = title;
        this.content = content;
        this.author = author;
        this.authorId = authorId;
    }

    public void update(String title, String content) {
        this.title = title;
        this.content = content;
    }
}
