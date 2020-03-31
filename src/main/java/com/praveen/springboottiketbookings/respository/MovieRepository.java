package com.praveen.springboottiketbookings.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.praveen.springboottiketbookings.model.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}
