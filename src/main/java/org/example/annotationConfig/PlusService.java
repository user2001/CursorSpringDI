package org.example.annotationConfig;

import org.springframework.stereotype.Component;

@Component
public class PlusService {
    public int doMath(int a, int b) {
        return a + b;
    }
}
