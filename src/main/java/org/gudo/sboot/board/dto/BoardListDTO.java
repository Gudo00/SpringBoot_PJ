package org.gudo.sboot.board.dto;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class BoardListDTO {

    private Long bno;

    private String title;

    private String writer;

    private LocalDateTime regDate;

    private int viewCnt;

    private long replyCnt;

}
