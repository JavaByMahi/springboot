package com.nit.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import org.hibernate.annotations.Type;

import lombok.Data;
@Data
@Entity
@DiscriminatorValue("CHEQUE")
public class ChequePayment extends Payment{
	@Type(type ="long" )
	private Long chequeNo;
	@Column(length = 20)
	private  String chequeType;
	
	private LocalDate expiredDate;
	@Override
	public String toString() {
		return "ChequePayment [chequeNo=" + chequeNo + ", chequeType=" + chequeType + ", expiredDate=" + expiredDate
				+ "]";
	}
	
}
