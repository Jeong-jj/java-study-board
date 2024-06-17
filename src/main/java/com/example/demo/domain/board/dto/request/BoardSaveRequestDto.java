package com.example.demo.domain.board.dto.request;

import lombok.Data;

@Data
public class BoardSaveRequestDto {
    private String name;
    private String contents;
}
