package com.homework.ninthhomeworkserver.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class ServerRequest {
    @NotBlank
    private String name;
    @NotBlank
    private String login;
    @NotBlank
    private String password;
    @NotBlank
    private String phoneNumber;
}