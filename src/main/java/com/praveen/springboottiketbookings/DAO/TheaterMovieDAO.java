package com.praveen.springboottiketbookings.DAO;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.praveen.springboottiketbookings.model.TheaterMovie;
import com.praveen.springboottiketbookings.respository.TheaterMovieRepository;

@Service
public class TheaterMovieDAO {
	
	@Autowired
	TheaterMovieRepository theTheaterMovieRepository;
	
//	to save data of the move show 
	public TheaterMovie save(TheaterMovie t) {
		return theTheaterMovieRepository.save(t);
	}
	
//	to fetch all the moves available with bookmyshow
	public List<TheaterMovie> getAllShow(){
		return theTheaterMovieRepository.findAll();
	}

//	fetch Movie by ID 
	public Optional<TheaterMovie> findOne(long ID){
		return theTheaterMovieRepository.findById(ID);
	}
	
//	Delete movie by entity 
	public void deleteTheaterMovie(TheaterMovie tm) {
		theTheaterMovieRepository.delete(tm);
	}
}
