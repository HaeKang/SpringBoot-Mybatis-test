package com.example.demo.repository;

import com.example.demo.model.Board;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
public interface BoardMapper {

    void create(String title, String content, String writer);
    void update(String title, String content, Integer bno);
    void delete(Integer bno);

    Board read(Integer bno);
    List<Board> listAll();

}
