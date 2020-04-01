package com.praveen.springboottiketbookings.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name="tableMovie")
@EntityListeners(AuditingEntityListener.class)
public class Movie {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long M_id;
	
	@NotBlank
	private String M_name;
	
	@NotBlank
	private String M_director;
	
	
	private String M_description;
	
	@OneToMany(mappedBy = "theMovie")
	public List<Show> theShow;

	public long get_id() {
		return M_id;
	}

	public void set_id(long m_id) {
		M_id = m_id;
	}

	public String get_name() {
		return M_name;
	}

	public void set_name(String m_name) {
		M_name = m_name;
	}

	public String get_director() {
		return M_director;
	}

	public void set_director(String m_director) {
		M_director = m_director;
	}

	public String get_description() {
		return M_description;
	}

	public void set_description(String m_description) {
		M_description = m_description;
	}
	
	
	
}
