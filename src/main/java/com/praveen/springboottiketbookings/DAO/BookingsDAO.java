package com.praveen.springboottiketbookings.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.praveen.springboottiketbookings.model.Bookings;
import com.praveen.springboottiketbookings.respository.BookingsRepository;

@Service
public class BookingsDAO {

	@Autowired
	BookingsRepository theBookingsRepository;
	
//	Get the available seat for the movie 
	public Bookings getAvailableSeat(long showID) {
		return theBookingsRepository.getOne(showID);
	}
	
//	Book the seat 
	public Bookings bookTheSeat(Bookings book) {
		return theBookingsRepository.save(book);
	}
	
}
