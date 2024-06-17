package com.example.demo.domain.board.service;

import com.example.demo.domain.board.dto.request.BoardSaveRequestDto;

public interface BoardService {
    Long saveBoard(BoardSaveRequestDto boardSaveRequestDto);
}
