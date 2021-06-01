package com.homework.ninthhomeworkserver.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

@Data
public class ListenerRequest implements Serializable {
    @NotBlank
    private Integer id;
    @NotBlank
    private String name;
    @NotBlank
    private String phoneNumber;

    ListenerRequest(Integer id, String name, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public static ListenerRequest getListenerRequest(ServerRequest req) {
        return new ListenerRequest(1234, req.getName(), req.getPhoneNumber());
    }
}