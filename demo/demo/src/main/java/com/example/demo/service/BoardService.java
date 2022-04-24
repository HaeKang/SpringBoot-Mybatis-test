package com.example.demo.service;

import com.example.demo.model.Board;
import com.example.demo.repository.BoardMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardService {

    BoardMapper boardMapper;

    public BoardService(BoardMapper boardMapper){
        this.boardMapper = boardMapper;
    }

    public List<Board> listAll(){
        return boardMapper.listAll();
    }

    public void create(String title, String content, String writer){
        boardMapper.create(title, content, writer);
    }

   public void update(String title, String content, Integer bno){
        boardMapper.update(title, content, bno);
   }

    public void delete(Integer bno){
        boardMapper.delete(bno);
    }

    public Board read(Integer bno){
        return boardMapper.read(bno);
    }

}
