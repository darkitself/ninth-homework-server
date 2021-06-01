package com.homework.ninthhomeworkserver;
import com.homework.ninthhomeworkserver.dto.ListenerAnswer;
import com.homework.ninthhomeworkserver.dto.ListenerRequest;
import com.homework.ninthhomeworkserver.dto.ServerAnswer;
import com.homework.ninthhomeworkserver.dto.ServerRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@Validated
@RestController
public class Controller {

    private final RabbitService rabbitService;

    public Controller(RabbitService rabbitService) {
        this.rabbitService = rabbitService;
    }

    @PostMapping("/rabbit")
    public ResponseEntity getJson(@Valid @RequestBody ServerRequest req){
        var listenerRequest = ListenerRequest.getListenerRequest(req);
        var listenerAnswer = (ListenerAnswer)rabbitService.sendAndReceive("queue", listenerRequest, ListenerAnswer.class);
        return new ResponseEntity<>(ServerAnswer.getServerAnswer(listenerAnswer), HttpStatus.OK);
    }
}