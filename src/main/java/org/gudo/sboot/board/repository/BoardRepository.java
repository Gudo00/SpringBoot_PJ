package org.gudo.sboot.board.repository;

import org.gudo.sboot.board.entities.BoardEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<BoardEntity, Long>, BoardSearch{


}
