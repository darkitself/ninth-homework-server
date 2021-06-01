package com.homework.ninthhomeworkserver;

import com.homework.ninthhomeworkserver.dto.ListenerRequest;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Service;

import java.lang.reflect.Type;

@Service
public class RabbitService {
    private final RabbitTemplate template;

    public RabbitService(RabbitTemplate template) {
        this.template = template;
    }

    public Object sendAndReceive(String queue, ListenerRequest request, Type type) {
        return template.convertSendAndReceiveAsType(queue, request, ParameterizedTypeReference.forType(type));
    }
}