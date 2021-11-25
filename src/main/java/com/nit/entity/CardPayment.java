package com.nit.entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import org.hibernate.annotations.Type;

import lombok.Data;
@Data
@Entity
@DiscriminatorValue("CARD")
public class CardPayment extends Payment{
	@Type(type = "long")
	private Long cardNo;
	@Column(length = 20)
	private  String cardType;
	@Column(length = 20)
	private String gateway;
	@Override
	public String toString() {
		return "CardPayment [cardNo=" + cardNo + ", cardType=" + cardType + ", gateway=" + gateway + "]";
	}
	
}
