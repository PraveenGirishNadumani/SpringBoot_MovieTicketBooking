package com.praveen.springboottiketbookings.model;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "tableBookings")
@EntityListeners(AuditingEntityListener.class)
public class Bookings {
	
	@Id
	private long show_id;
	
	private int A1;
	private int A2;
	private int A3;
	private int A4;
	private int A5;
	
	private int B1;
	private int B2;
	private int B3;
	private int B4;
	private int B5;
	
	private int C1;
	private int C2;
	private int C3;
	private int C4;
	private int C5;

	
	
	public long getShow_id() {
		return show_id;
	}
	public void setShow_id(long show_id) {
		this.show_id = show_id;
	}
	public int getA1() {
		return A1;
	}
	public void setA1(int a1) {
		A1 = a1;
	}
	public int getA2() {
		return A2;
	}
	public void setA2(int a2) {
		A2 = a2;
	}
	public int getA3() {
		return A3;
	}
	public void setA3(int a3) {
		A3 = a3;
	}
	public int getA4() {
		return A4;
	}
	public void setA4(int a4) {
		A4 = a4;
	}
	public int getA5() {
		return A5;
	}
	public void setA5(int a5) {
		A5 = a5;
	}
	public int getB1() {
		return B1;
	}
	public void setB1(int b1) {
		B1 = b1;
	}
	public int getB2() {
		return B2;
	}
	public void setB2(int b2) {
		B2 = b2;
	}
	public int getB3() {
		return B3;
	}
	public void setB3(int b3) {
		B3 = b3;
	}
	public int getB4() {
		return B4;
	}
	public void setB4(int b4) {
		B4 = b4;
	}
	public int getB5() {
		return B5;
	}
	public void setB5(int b5) {
		B5 = b5;
	}
	public int getC1() {
		return C1;
	}
	public void setC1(int c1) {
		C1 = c1;
	}
	public int getC2() {
		return C2;
	}
	public void setC2(int c2) {
		C2 = c2;
	}
	public int getC3() {
		return C3;
	}
	public void setC3(int c3) {
		C3 = c3;
	}
	public int getC4() {
		return C4;
	}
	public void setC4(int c4) {
		C4 = c4;
	}
	public int getC5() {
		return C5;
	}
	public void setC5(int c5) {
		C5 = c5;
	}
	
	
}
