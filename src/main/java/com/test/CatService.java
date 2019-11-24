package com.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by lenovo on 24/11/2019.
 */
@Service
public class CatService {
    @Autowired
    private CatMapper catMapper;

    public List<Cat> likeName(String catName) {
        return catMapper.likeName(catName);
    }

    @Transactional
    public void save(Cat cat){
        catMapper.save(cat);

    }
}
