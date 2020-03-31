package com.praveen.springboottiketbookings.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name="tableTheaterMovie")
@EntityListeners(AuditingEntityListener.class)
public class TheaterMovie {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long TM_id;
	
	@Column(nullable=false)
	private long TM_T_id;
	
	@Column(nullable=false)
	private long TM_M_id;
	
	@Column(nullable=false)
	private Date show;

	public long getTM_T_id() {
		return TM_T_id;
	}

	public void setTM_T_id(long tM_T_id) {
		TM_T_id = tM_T_id;
	}

	public long getTM_M_id() {
		return TM_M_id;
	}

	public void setTM_M_id(long tM_M_id) {
		TM_M_id = tM_M_id;
	}

	public Date getShow() {
		return show;
	}

	public void setShow(Date show) {
		this.show = show;
	}

}
