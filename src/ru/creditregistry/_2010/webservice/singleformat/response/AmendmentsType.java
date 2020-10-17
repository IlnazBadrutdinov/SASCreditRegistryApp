package ru.creditregistry._2010.webservice.singleformat.response;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "amendmentsType", propOrder = {
    "amendment"
})

public class AmendmentsType {

	@XmlElement(name = "AMENDMENT", required = true)
	protected List<AmendmentType> amendment;

	public List<AmendmentType> getAMENDMENT() {
	   if (amendment == null) {
		   amendment = new ArrayList<AmendmentType>();
	   }
	   return this.amendment;
	}
	
}
