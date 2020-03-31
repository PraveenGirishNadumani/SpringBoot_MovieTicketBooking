package com.praveen.springboottiketbookings.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.praveen.springboottiketbookings.model.Theater;

public interface TheaterRepository extends JpaRepository<Theater, Long> {

}
