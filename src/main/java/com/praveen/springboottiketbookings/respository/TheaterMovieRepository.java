package com.praveen.springboottiketbookings.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.praveen.springboottiketbookings.model.TheaterMovie;


public interface TheaterMovieRepository extends JpaRepository<TheaterMovie, Long> {

}
