package org.gudo.sboot.board.service;

import org.gudo.sboot.board.dto.BoardListDTO;
import org.gudo.sboot.board.dto.PageRequestDTO;
import org.gudo.sboot.board.dto.PageResponseDTO;

public interface BoardService {

    PageResponseDTO<BoardListDTO> list(PageRequestDTO requestDTO);

}
