package com.praveen.springboottiketbookings.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="tableShow")
@EntityListeners(AuditingEntityListener.class)
public class Show {
	
	@Id
	@GeneratedValue
	private long show_Id;
	
	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private Theater theTheater;
	
	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private Movie theMovie;
	
	@NotBlank
	private String show_time;

	public long getShow_Id() {
		return show_Id;
	}

	public void setShow_Id(long show_Id) {
		this.show_Id = show_Id;
	}

	public Theater getTheTheater() {
		return theTheater;
	}

	public void setTheTheater(Theater theTheater) {
		this.theTheater = theTheater;
	}

	public Movie getTheMovie() {
		return theMovie;
	}

	public void setTheMovie(Movie theMovie) {
		this.theMovie = theMovie;
	}

	public String getShow_time() {
		return show_time;
	}

	public void setShow_time(String show_time) {
		this.show_time = show_time;
	}
	
	
	

}
