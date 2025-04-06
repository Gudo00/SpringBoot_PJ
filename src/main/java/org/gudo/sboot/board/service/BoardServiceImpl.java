package org.gudo.sboot.board.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.gudo.sboot.board.dto.BoardListDTO;
import org.gudo.sboot.board.dto.PageRequestDTO;
import org.gudo.sboot.board.dto.PageResponseDTO;
import org.gudo.sboot.board.repository.BoardRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
@RequiredArgsConstructor
@Log4j2
public class BoardServiceImpl implements BoardService{

    private final BoardRepository repository;

    @Override
    public PageResponseDTO<BoardListDTO> list(PageRequestDTO requestDTO) {

        return repository.list(requestDTO);
    }

}
