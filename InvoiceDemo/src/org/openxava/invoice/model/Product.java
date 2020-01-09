package org.openxava.invoice.model;

import java.math.*;

import javax.persistence.*;

import org.openxava.annotations.*;

@Entity
public class Product {
	
	@Id @Column(length=9)
	private int number;
	
	@Column(length=40) @Required
	private String description;
	
	@Required
	private BigDecimal unitPrice;
	
	@Stereotype("IMAGES_GALLERY") 
	@Column(length=32)
	private String photos; 

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BigDecimal getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(BigDecimal unitPrice) {
		this.unitPrice = unitPrice;
	}

	public String getPhotos() {
		return photos;
	}

	public void setPhotos(String photos) {
		this.photos = photos;
	}

}
