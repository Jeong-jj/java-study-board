package com.example.demo.domain.board.controller;

import com.example.demo.domain.board.dto.request.BoardSaveRequestDto;
import com.example.demo.domain.board.dto.response.BoardSaveResponseDto;
import com.example.demo.domain.board.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/board")
@RequiredArgsConstructor
public class BoardController {
    private final BoardService boardService;

    @PostMapping
    public ResponseEntity<Long> saveBoard(@RequestBody BoardSaveRequestDto boardSaveRequestDto) {
        Long save = boardService.saveBoard(boardSaveRequestDto);

        return ResponseEntity.status(HttpStatus.CREATED).body(save);
    }

    @GetMapping("/{id}")
    public ResponseEntity<BoardSaveResponseDto> getBoard(@PathVariable(name = "id") Long id) {
        BoardSaveResponseDto responseDto = boardService.getBoard(id);

        return ResponseEntity.status(HttpStatus.OK).body(responseDto);
    }
}
