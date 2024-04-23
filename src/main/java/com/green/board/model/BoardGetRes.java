package com.green.board.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class BoardGetRes {
    private long boardId;
    private String title;
    private String writer;
    private String createdAt;
}
