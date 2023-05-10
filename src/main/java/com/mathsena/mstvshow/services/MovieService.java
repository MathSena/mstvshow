package com.mathsena.mstvshow.services;

import com.mathsena.mstvshow.dto.MovieDTO;
import com.mathsena.mstvshow.entities.Movie;
import com.mathsena.mstvshow.repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    public List<MovieDTO> findAll(){
        List<Movie> result = movieRepository.findAll();
        List<MovieDTO> dto = result.stream().map(x->new MovieDTO(x)).toList();
        return dto;

    }

}
