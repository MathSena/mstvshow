package com.mathsena.mstvshow.controller;

import com.mathsena.mstvshow.dto.MovieDTO;
import com.mathsena.mstvshow.services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/movies")
public class MovieController {

    @Autowired
    private MovieService movieService;

    @GetMapping()
    public List<MovieDTO> findAll(){
        List<MovieDTO> result = movieService.findAll();
        return result;

    }
}
