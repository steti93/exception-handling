package com.exception.demo.action;

import org.springframework.stereotype.Component;

@Component
public class SoutAction {

    public void print(final String message) {
        // SOME huge logic
        System.out.println(message);
    }
}
