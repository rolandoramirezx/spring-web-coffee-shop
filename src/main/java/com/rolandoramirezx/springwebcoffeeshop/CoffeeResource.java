package com.rolandoramirezx.springwebcoffeeshop;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CoffeeResource {

    @RequestMapping("coffee")
    public List<Coffee> getCoffee(){
        List<Coffee> coffeeList = new ArrayList<Coffee>();

        Coffee coldBrew = new Coffee();
        coldBrew.setId(1);
        coldBrew.setDescription("Cold brew coffee");

        Coffee icedCoffee = new Coffee();
        icedCoffee.setId(2);
        icedCoffee.setDescription("Iced coffee");

        Coffee latte = new Coffee();
        latte.setId(3);
        latte.setDescription("latte");

        coffeeList.add(coldBrew);
        coffeeList.add(icedCoffee);
        coffeeList.add(latte);

        return coffeeList;
    }

}
