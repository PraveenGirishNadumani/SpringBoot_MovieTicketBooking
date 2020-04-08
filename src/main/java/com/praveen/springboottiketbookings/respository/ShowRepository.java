package com.praveen.springboottiketbookings.respository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.praveen.springboottiketbookings.model.Movie;
import com.praveen.springboottiketbookings.model.Show;

@Repository
public interface ShowRepository extends JpaRepository<Show, Long> {
	
	public List<Show> findBytheMovie(Movie m);
}
