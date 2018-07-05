package com.example.demo.family;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class FamilyController {

    @Autowired
    private TempRepository tempRepository;

    @RequestMapping("/xd")
    public @ResponseBody Temp addTemp(@RequestParam(value = "name", defaultValue = "Word") String name){
        Temp temp = new Temp();
        temp.setContent(name);
        tempRepository.save(temp);
        return temp;
    }

//    @RequestMapping("/all")
//    @RequestBody
//    public Iterable<Temp> getAllTemp(){
//        return tempRepository.findAll();
//    }

    @RequestMapping("/all")
    public Iterable<Temp> getAllTemp(){
        return tempRepository.findAll();
    }
}
