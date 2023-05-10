package com.mathsena.mstvshow.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="tb_belonging")
public class Belonging {

    @EmbeddedId
    private BelongingPK id = new BelongingPK();

    private Integer position;

    public Belonging(Movie movie, MovieList movieList, Integer position){
        this.id.setMovie(movie);
        this.id.setList(movieList);
        this.position = position;

    }

    public Belonging() {

    }
}
