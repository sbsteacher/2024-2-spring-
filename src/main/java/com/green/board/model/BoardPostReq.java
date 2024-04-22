package com.green.board.model;

import lombok.*;

@Setter
@Getter
@ToString
public class BoardPostReq {
    private String title;
    private String contents;
    private String writer;
}
