package com.hib.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "employee_details")
public class studentDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="edId")
	private int edId;
	@Column(name="edArea")
	private String edArea;
	@Column(name="edCity")
	private String edCity;
	@Column(name="edPincode")
	private int edPincode;
	public int getEdId() {
		return edId;
	}
	public void setEdId(int edId) {
		this.edId = edId;
	}
	public String getEdArea() {
		return edArea;
	}
	public void setEdArea(String edArea) {
		this.edArea = edArea;
	}
	public String getEdCity() {
		return edCity;
	}
	public void setEdCity(String edCity) {
		this.edCity = edCity;
	}
	public int getEdPincode() {
		return edPincode;
	}
	public void setEdPincode(int edPincode) {
		this.edPincode = edPincode;
	}
	@Override
	public String toString() {
		return "studentDetails [edId=" + edId + ", edArea=" + edArea + ", edCity=" + edCity + ", edPincode=" + edPincode
				+ "]";
	}
	public studentDetails(String edArea, String edCity, int edPincode) {
		super();
		this.edArea = edArea;
		this.edCity = edCity;
		this.edPincode = edPincode;
	}
	public studentDetails() {
		super();
	}
	
}
