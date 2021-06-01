package com.homework.ninthhomeworkserver.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ListenerAnswer {
    private Integer id;
    private State state;
    private LocalDateTime time;
    private String message;
}