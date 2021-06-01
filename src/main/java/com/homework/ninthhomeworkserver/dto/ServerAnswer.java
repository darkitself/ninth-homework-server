package com.homework.ninthhomeworkserver.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ServerAnswer {
    private Integer id;
    private State state;
    private LocalDateTime time;

    ServerAnswer(Integer id, State state, LocalDateTime time) {
        this.id = id;
        this.state = state;
        this.time = time;
    }

    public static ServerAnswer getServerAnswer(ListenerAnswer answer){
        return new ServerAnswer(answer.getId(), answer.getState(), answer.getTime());
    }
}