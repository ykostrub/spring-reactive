package com.ykostrub.message.reactive.controller;

import com.ykostrub.message.reactive.model.Message;
import java.time.Duration;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
public class MessageController {

  @GetMapping(value = "/messages", produces = MediaType.APPLICATION_STREAM_JSON_VALUE)
  public Flux<Message> getMessages(){
    return Flux.interval(Duration.ofSeconds(1)).map(time->  Message.builder().id(time).message("Message - " + time).build());
  }
}
