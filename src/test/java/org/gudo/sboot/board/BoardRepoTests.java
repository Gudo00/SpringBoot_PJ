package org.gudo.sboot.board;


import lombok.extern.log4j.Log4j2;
import org.gudo.sboot.board.dto.PageRequestDTO;
import org.gudo.sboot.board.entities.BoardEntity;
import org.gudo.sboot.board.repository.BoardRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Log4j2
public class BoardRepoTests {

    @Autowired(required = false)
    BoardRepository repository;

    @Test
    public void testList() {

        PageRequestDTO pageRequestDTO = new PageRequestDTO();
        // pageRequestDTO.setType("TCW");
        // pageRequestDTO.setKeyword("11");

        log.info(repository.list(pageRequestDTO));

    }

    @Test
    public void testInsert(){
        for (int i = 0; i < 123 ; i++) {

            BoardEntity boardEntity = BoardEntity.builder()
                    .title("Test" +i)
                    .content("Test Content "+i)
                    .writer("user" + (i %10))
                    .build();

            repository.save(boardEntity);

        }//end for
    }

}