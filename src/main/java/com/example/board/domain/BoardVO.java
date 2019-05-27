package com.example.board.domain;

import lombok.Data;

import java.util.Date;

@Data
public class BoardVO {
    private int bno;
    private String subject;
    private String content;
    private String writer;
    private Date reg_date;
    private int hit;


}
