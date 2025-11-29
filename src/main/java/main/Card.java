package main;

import org.springframework.stereotype.Component;

@Component
public class Card {
    private String front;

    public String getFront() {
        return front;
    }

    public void setFront(String front) {
        this.front = front;
    }
}
