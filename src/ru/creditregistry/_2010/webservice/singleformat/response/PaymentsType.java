package ru.creditregistry._2010.webservice.singleformat.response;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "paymentsType", propOrder = {
    "payment"
})
public class PaymentsType {
	
	@XmlElement(name = "PAYMENT", required = true)
	protected List<PaymentType> payment;

	public List<PaymentType> getPAYMENT() {
	   if (payment == null) {
	       payment = new ArrayList<PaymentType>();
	   }
	   return this.payment;
	}

}


