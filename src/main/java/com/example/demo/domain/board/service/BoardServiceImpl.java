package com.example.demo.domain.board.service;

import com.example.demo.domain.board.dto.request.BoardSaveRequestDto;
import com.example.demo.domain.board.dto.response.BoardSaveResponseDto;
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

    @Override
    public BoardSaveResponseDto getBoard(Long id) {
        Board board = boardRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("해당 게시판이 없습니다. boardId=" + id));
                // 조회값이 없을 경우 정해진 에러문 반환

        BoardSaveResponseDto result = toDto(board);

        return result;
    }

    private BoardSaveResponseDto toDto(Board board) {
        BoardSaveResponseDto result = BoardSaveResponseDto.builder()
                .id(board.getId())
                .name(board.getName())
                .build();

        return result;
    }
}
