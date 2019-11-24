package com.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by lenovo on 24/11/2019.
 */
@RestController
public class CatController {
    @Autowired
    public CatService catService;
    @RequestMapping("/likename")
    public List<Cat> likeName(String name) {
        return catService.likeName(name);
    }
    @RequestMapping("/save")
    public Cat save(){
        Cat cat = new Cat();
        cat.setName("hello");
        catService.save(cat);
        return cat;
    }
}
