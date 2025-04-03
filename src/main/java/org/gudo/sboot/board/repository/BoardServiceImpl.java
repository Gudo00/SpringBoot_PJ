package org.gudo.sboot.board.repository;

import org.gudo.sboot.board.service.BoardService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.gudo.sboot.board.dto.BoardListDTO;
import org.gudo.sboot.board.dto.PageRequestDTO;
import org.gudo.sboot.board.dto.PageResponseDTO;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Transactional
@Service
@RequiredArgsConstructor
@Log4j2
public class BoardServiceImpl implements BoardService {

    private final BoardRepository repository;

    @Override
    public PageResponseDTO<BoardListDTO> list(PageRequestDTO requestDTO) {

        return repository.list(requestDTO);
    }

}
