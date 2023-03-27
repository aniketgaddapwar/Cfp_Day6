package com.springboot.address_Book_Backend.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ResponseDTO {
    private String message;
    private Object object;

    public ResponseDTO(String message, Object object) {
        this.message = message;
        this.object = object;
    }
}
