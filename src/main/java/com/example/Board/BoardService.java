package com.example.Board;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BoardService {

    @Autowired
    BoardDAO boardDAO;

    public List<BoardVO> getBoardlist() {
        return boardDAO.getBoardList();
    }
}
