package com.ykostrub.message.reactive;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MessageReactiveApplication {

  public static void main(String[] args) {
    SpringApplication.run(MessageReactiveApplication.class, args);
  }

}