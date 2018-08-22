package com.rolandoramirezx.springwebcoffeeshop;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController("coffee")
public class CoffeeResource {

    @RequestMapping
    public List<Coffee> getCoffee(){
        List<Coffee> coffeeList = new ArrayList<Coffee>();

        Coffee coldBrew = new Coffee(1, "Cold brew coffee");
        Coffee icedCoffee = new Coffee(2, "Iced coffee");
        Coffee latte = new Coffee(3, "latte");

        return coffeeList;
    }

}
