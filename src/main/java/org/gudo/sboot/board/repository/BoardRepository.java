package org.gudo.sboot.board.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.gudo.sboot.board.entities.BoardEntity;

public interface BoardRepository extends JpaRepository<BoardEntity, Long>, BoardSearch{


}
