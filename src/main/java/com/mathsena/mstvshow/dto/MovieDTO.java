package com.mathsena.mstvshow.dto;

import com.mathsena.mstvshow.entities.Movie;
import lombok.Data;

@Data
public class MovieDTO {

    private Long id;
    private String title;
    private Integer year;
    private String imgUrl;
    private String shortDescription;

    public MovieDTO(Movie movie){
        this.id = movie.getId();
        this.title = movie.getTitle();
        this.year = movie.getYear();
        this.imgUrl = movie.getImgUrl();
        this.shortDescription = movie.getShortDescription();
    }

}
