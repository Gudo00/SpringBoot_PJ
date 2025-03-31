package org.gudo.sboot.todo.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

//테이블 용도
//@Table 생략시에는 클래스 이름이 테이블 이름
@Entity(name = "todo")
@Table(name = "tbl_todo")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Todo{

    //모든 엔티티는 반드시 Id가 존재
    //PK는 반드시 객체타입(기본자료형 사용불가)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long tno;

    @Column(nullable = false, length = 300)
    private String title;
    private String writer;

}
