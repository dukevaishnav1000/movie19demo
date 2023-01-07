package com.movie17.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
public class ServiceMovie {
    @Autowired
    RepositoryMovie rm;
    public ResponseEntity<String> addMovieAndDirector(String m, String d)
    {
        return rm.setValues(m,d);
    }

    public String getDirector(String movie){

        return rm.searchDirector(movie);
    }
}
