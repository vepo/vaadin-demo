package com.vepo.vaadin.demo;
import java.time.LocalDateTime;

import javax.enterprise.context.ApplicationScoped;


/**
 * @author Ken Finnigan
 */
@ApplicationScoped
public class Greeter {
    public String greet() {
        return "Howdy at " + LocalDateTime.now();
    }
}