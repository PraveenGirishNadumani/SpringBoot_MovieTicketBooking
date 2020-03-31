package com.praveen.springboottiketbookings.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name="tableMovie")
@EntityListeners(AuditingEntityListener.class)
public class Movie {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long M_id;
	
	@Column(nullable=false)
	private String M_name;
	
	@Column(nullable=false)
	private String M_director;
	
	
	private String M_description;

	public long getM_id() {
		return M_id;
	}

	public void setM_id(long m_id) {
		M_id = m_id;
	}

	public String getM_name() {
		return M_name;
	}

	public void setM_name(String m_name) {
		M_name = m_name;
	}

	public String getM_director() {
		return M_director;
	}

	public void setM_director(String m_director) {
		M_director = m_director;
	}

	public String getM_description() {
		return M_description;
	}

	public void setM_description(String m_description) {
		M_description = m_description;
	}
	
	
	
}
