package com.praveen.springboottiketbookings.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.praveen.springboottiketbookings.DAO.CityDAO;
import com.praveen.springboottiketbookings.DAO.MovieDAO;
import com.praveen.springboottiketbookings.model.City;
import com.praveen.springboottiketbookings.model.Movie;

@RestController
@RequestMapping("/api")
public class TicketBookingController {
	
	@Autowired
	CityDAO theCityDAO;
	
	@Autowired
	MovieDAO theMovieDAO;
	
//	@Autowired
//	TheaterDAO theTheaterDAO;
//	
//	@Autowired
//	TheaterMovieDAO theTheaterMovieDAO;
	
//	For debugging purpose
	@GetMapping("/test")
	public String returnString() {
		return "hellow world";
	}
	
	
//	Add city to DB
	@PostMapping("/city")
	public City createCity(@Valid @RequestBody City c) {
		return theCityDAO.save(c);
	}
	
	
//	Add Movie to the table
	@PostMapping("/movie")
	public Movie createMovie(@Valid @RequestBody Movie m) {
		return theMovieDAO.save(m);
	}
	
//	get all City
	@GetMapping("/city")
	public List<City> getCity(){
		return theCityDAO.getCity(); 
	}
	
//	Get all Movie
	@GetMapping("/movie")
	public List<Movie> getMovie(){
		return theMovieDAO.getMovie();
	}
	
//	get City by particular ID
	
	@GetMapping("/city/{ID}")
	public ResponseEntity<City> getOneCity(@PathVariable(value="ID") long ID){
		City theCity = theCityDAO.findOne(ID);
		if(theCity == null) {
			 return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok().body(theCity);
	
	}
	
//	Get movie by ID
	
	@GetMapping("/movie/{ID}")
	public ResponseEntity<Movie> getOneMovie(@PathVariable(value="ID") long ID){
		Movie theMovie = theMovieDAO.findOne(ID);
		if(theMovie == null) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok().body(theMovie);
	}
	
//	?update the City 
	@PutMapping("/city/{ID}")
	public ResponseEntity<City> updateCity(@PathVariable(value="ID") long ID, @Valid @RequestBody City c){
		
		City theCity = theCityDAO.findOne(ID);
		
		if(theCity == null) {
			return ResponseEntity.notFound().build();
			
		}
		theCity.setName(c.getName());
		theCity.setPincode(c.getPincode());
		theCity.setState(c.getState());
		
		City updatedCity = theCityDAO.save(theCity);
		return ResponseEntity.ok().body(updatedCity);
		
	}
	
//	update Movie
	@PutMapping("/movie/:ID")
	public ResponseEntity<Movie> updateMovie(@PathVariable(value="ID") long ID,@Valid @RequestBody Movie m){
		Movie theMovie = theMovieDAO.findOne(ID);
		if(theMovie == null) {
			return ResponseEntity.notFound().build();
		}
		theMovie.setM_name(m.getM_name());
		theMovie.setM_director(m.getM_director());
		theMovie.setM_description(m.getM_description());
		
		Movie updatedMovie = theMovieDAO.save(theMovie);
		return ResponseEntity.ok().body(updatedMovie);
	}
	
	
//	Delete City Data
	@DeleteMapping("/city/{ID}")
	public ResponseEntity<City> deleteCity(@PathVariable(value="ID") long ID){
		
		City theCity = theCityDAO.findOne(ID);
		if(theCity == null) {
			return ResponseEntity.notFound().build();	
		}
		
		theCityDAO.deletecity(theCity);
		
		return ResponseEntity.ok().build(); 
	}
	
//	Delete a Movie
	@DeleteMapping("/movie")
	public ResponseEntity<Movie> deleteMovie(@PathVariable(value= "ID") long ID){
		Movie theMovie = theMovieDAO.findOne(ID);
		if(theMovie == null) {
			return ResponseEntity.notFound().build();
		}
		theMovieDAO.deleteMovie(theMovie);
		return ResponseEntity.ok().build();
	}
	
	
	

}










