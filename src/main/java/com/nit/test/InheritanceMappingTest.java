package com.nit.test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.nit.entity.CardPayment;
import com.nit.entity.ChequePayment;
import com.nit.utility.HibernateUtil;

public class InheritanceMappingTest {
	
public static void main(String[] args) {
	//get the session object
	Session ses=HibernateUtil.getSession();
	Transaction tx=null;
	boolean flag=false;
	try {
		if(ses.getTransaction().isActive()) {
			ses.beginTransaction();
			//prepare Objects
			CardPayment payment1=new CardPayment();
			 payment1.setAmount(9000.0); payment1.setCardNo(456788L); payment1.setCardType("credit");
			   payment1.setGateway("VISA");
			   
		    ChequePayment payment2=new ChequePayment();
		    payment2.setChequeNo(37868768768l);payment2.setAmount(7765.0);payment2.setChequeType(null);
		}
	}catch(Exception e) {
		e.printStackTrace();
	}
}
}