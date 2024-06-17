package com.example.demo.domain.board.service;

import com.example.demo.domain.board.dto.request.BoardSaveRequestDto;
import com.example.demo.domain.board.entity.Board;
import com.example.demo.domain.board.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BoardServiceImpl implements BoardService {
    private final BoardRepository boardRepository;

    @Override
    public Long saveBoard(BoardSaveRequestDto boardSaveRequestDto) {
        Board save = boardRepository.save(
                Board.builder()
                        .name(boardSaveRequestDto.getName())
                        .contents(boardSaveRequestDto.getContents())
                        .build()
        );

        return save.getId();
    }
}
