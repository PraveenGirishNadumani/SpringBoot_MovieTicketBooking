package com.praveen.springboottiketbookings.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.praveen.springboottiketbookings.model.City;

@Repository
public interface CityRepository extends JpaRepository<City, Long> {

}
