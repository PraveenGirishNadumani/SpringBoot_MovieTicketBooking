package com.praveen.springboottiketbookings.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.praveen.springboottiketbookings.model.Show;
import com.praveen.springboottiketbookings.respository.ShowRepository;

@Service
public class ShowDAO {

	@Autowired
	ShowRepository theShowRepository;
	
//	Save the show
	public Show save(Show show)
	{
		return theShowRepository.save(show);
	}
	
//	Fetch all show 
	public List<Show> fetchAllShow(){
		return theShowRepository.findAll();
		
	}
	
//	Fetch show by ID
	public Show fetchById(long Id) {
		return theShowRepository.getOne(Id);
	}
	
}
