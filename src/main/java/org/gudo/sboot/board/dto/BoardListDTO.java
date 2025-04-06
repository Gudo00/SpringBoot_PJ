package org.gudo.sboot.board.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class BoardListDTO {

    private Long bno;

    private String title;

    private String writer;

    private LocalDateTime regDate;

    private int viewCnt;

    private long replyCnt;

}
