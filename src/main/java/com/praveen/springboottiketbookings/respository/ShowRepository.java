package com.praveen.springboottiketbookings.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.praveen.springboottiketbookings.model.Show;

@Repository
public interface ShowRepository extends JpaRepository<Show, Long> {

}
