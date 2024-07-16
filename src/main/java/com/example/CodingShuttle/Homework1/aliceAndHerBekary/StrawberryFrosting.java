package com.example.CodingShuttle.Homework1.aliceAndHerBekary;


import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;

import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "cakeFlavor.ev", havingValue = "Strawberry")

public class StrawberryFrosting implements Frosting{
    @Override
     public String getFrostingType() {
        return "Strawberry flavor frosting";
    }
}
