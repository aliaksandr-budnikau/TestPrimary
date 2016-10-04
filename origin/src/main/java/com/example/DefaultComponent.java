package com.example;

import org.springframework.stereotype.Component;

@Component
public class DefaultComponent implements IComponent {
    @Override
    public String getMessage() {
        return "DefaultComponent";
    }
}
