package com.example.CodingShuttle.Homework1.aliceAndHerBekary;


import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "cakeFlavor.ev", havingValue = "Choco")
public class ChocolateSyrup implements Syrup{
    @Override
    public String getSyrupType() {

        return "chocolate flavor syrup";
    }
}
