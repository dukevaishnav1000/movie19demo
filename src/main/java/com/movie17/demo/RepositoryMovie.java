package com.movie17.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class RepositoryMovie {

    public HashMap<Movie,Director> hm=new HashMap<Movie,Director>();

    public ResponseEntity<String> setValues(String m , String d) {

        Movie movie=new Movie();
        movie.setName(m);
        Director director=new Director();
        director.setName(d);
        if(!hm.containsKey(m)) {
            hm.put(movie, director);
            return new ResponseEntity("Pair Inserted Successfully !!! ", HttpStatus.OK);
        }
        else
        return new ResponseEntity("Movie already exists !!!",HttpStatus.ALREADY_REPORTED);
    }

    public String searchDirector(String m){


        for(Map.Entry<Movie,Director> mp: hm.entrySet()){
            if(mp.getKey().getName().equals(m))
            return mp.getValue().getName();
        }
        return "No such movie exists ";
    }
}
