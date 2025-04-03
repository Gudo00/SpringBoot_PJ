package org.gudo.sboot.board.repository;

import org.gudo.sboot.board.dto.BoardListDTO;
import org.gudo.sboot.board.dto.PageRequestDTO;
import org.gudo.sboot.board.dto.PageResponseDTO;

public interface BoardSearch {

    PageResponseDTO<BoardListDTO> list(PageRequestDTO pageRequestDTO);

}
