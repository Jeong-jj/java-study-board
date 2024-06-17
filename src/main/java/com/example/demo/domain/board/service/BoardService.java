package com.example.demo.domain.board.service;

import com.example.demo.domain.board.dto.request.BoardSaveRequestDto;
import com.example.demo.domain.board.dto.response.BoardSaveResponseDto;

public interface BoardService {
    Long saveBoard(BoardSaveRequestDto boardSaveRequestDto);

    BoardSaveResponseDto getBoard(Long id);
}
