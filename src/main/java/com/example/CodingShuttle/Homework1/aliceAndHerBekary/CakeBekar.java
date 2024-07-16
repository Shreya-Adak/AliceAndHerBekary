package com.example.CodingShuttle.Homework1.aliceAndHerBekary;

import org.springframework.stereotype.Service;


@Service
public class CakeBekar {

    //Autowired no need to do this when it's final and there is a constructor injection
    final private Frosting f;

   // Autowired no need to do this when it's final and there is a constructor injection
    final private Syrup s;


    //this is a constructor injection


    public CakeBekar(Frosting f, Syrup s){
        this.f = f;
        this.s = s;
    }
    public void bakeCake(){
        System.out.println("Cake is baking with "+f.getFrostingType()+" and "+s.getSyrupType());
    }
}
