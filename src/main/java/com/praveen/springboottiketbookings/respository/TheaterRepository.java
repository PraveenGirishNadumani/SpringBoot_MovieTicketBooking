package com.praveen.springboottiketbookings.respository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.praveen.springboottiketbookings.model.City;
import com.praveen.springboottiketbookings.model.Theater;

public interface TheaterRepository extends JpaRepository<Theater, Long> {

	public List<Theater> findByCity(City ID);
}
