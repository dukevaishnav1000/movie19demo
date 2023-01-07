package com.movie17.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
class MainController {
    @Autowired
    ServiceMovie sm;

    /*
    POST request syntax --> http://localhost:8092/add-movie?movie=rikku&director=pipa
    */
    @PostMapping("/add-movie")
    public ResponseEntity<String> addMovieAndDirector(@RequestParam("movie") String m, @RequestParam("director") String d)
    {
        System.out.println("maincontroller called");
        return sm.addMovieAndDirector(m,d);
    }

//    GET request syntax --> http://localhost:8092/get-director-from-movie?movie=rikku
    @GetMapping("/get-director-from-movie")
    public String getDirector(@RequestParam("movie") String m){
        return sm.getDirector(m);
    }

}
