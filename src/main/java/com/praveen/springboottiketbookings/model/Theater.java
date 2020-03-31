package com.praveen.springboottiketbookings.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name="tableTheater")
@EntityListeners(AuditingEntityListener.class)

public class Theater {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long T_id;
	
	@NotBlank
	private String T_name;
	
	@NotBlank
	private String T_area;

	public long getT_id() {
		return T_id;
	}

	public void setT_id(long t_id) {
		T_id = t_id;
	}

	public String getT_name() {
		return T_name;
	}

	public void setT_name(String t_name) {
		T_name = t_name;
	}

	public String getT_area() {
		return T_area;
	}

	public void setT_area(String t_area) {
		T_area = t_area;
	}
	
	
	

}
