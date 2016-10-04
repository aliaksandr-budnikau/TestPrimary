package com.example;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class CustomComponent implements IComponent {
    @Override
    public String getMessage() {
        return "CustomComponent";
    }
}
