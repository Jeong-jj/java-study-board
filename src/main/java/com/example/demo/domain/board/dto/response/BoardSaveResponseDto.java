package com.example.demo.domain.board.dto.response;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class BoardSaveResponseDto {
    private Long id;

    private String name;
}
