package com.tiy;

/**
 * Created by jfabiano on 9/22/2016.
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.RequestBody;

@RestController
//this tells spring this controller is going to have end points that are going to take json, and return json specifically
public class JSONController {

    //@Autowired//says take the interface, create a concrete implementation that can speak to this repository
            //TodoRepository todos;//postgress db


//    receives a request object with the number of smalls and bigs in the factory as well as the desired amount of chocolate in kilos,
//    and returns an object (this could be your solution container) with the number of bigs and smalls required to make the amount of chocolate indicated.
    @RequestMapping(path = "/makeChocolate.json", method = RequestMethod.GET)
    public NeededChocolate chocolateRequest(Integer smalls, Integer bigs, Integer kilos) {
        //System.out.println("asking chocolateQuestion with: " + chocolateQuestion);

        ArrayList<Integer> answerList = new ArrayList<>();

        MakeChocolate myMaker = new MakeChocolate();

        NeededChocolate neededChocolate = myMaker.makeChocolate(smalls, bigs, kilos);

        return neededChocolate;

    }
}