package com.example.demo.service;

import com.example.demo.model.Board;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class BoardServiceTest {

    @Autowired
    BoardService boardService;

    @Test
    @DisplayName("전체조회")
    void 전체조회() {
        // when
        List<Board> BoardList =  boardService.listAll();

        // then
        for (Board board: BoardList) {
            System.out.println(board.getTitle());
        }
    }

    @Test
    @DisplayName("생성")
    void 생성(){
        String title="test0415";
        String content="testing 0415";
        String writer="test_user";

        boardService.create(title, content, writer);
    }


}