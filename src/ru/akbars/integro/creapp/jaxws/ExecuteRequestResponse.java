
package ru.akbars.integro.creapp.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * This class was generated by Apache CXF 2.4.1
 * Wed Aug 22 18:43:50 MSK 2018
 * Generated source version: 2.4.1
 */

@XmlRootElement(name = "executeRequestResponse", namespace = "http://creapp.integro.akbars.ru/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "executeRequestResponse", namespace = "http://creapp.integro.akbars.ru/")

public class ExecuteRequestResponse {

    @XmlElement(name = "return")
    private ru.akbars.integro.creapp.IntegrationResponse _return;

    public ru.akbars.integro.creapp.IntegrationResponse getReturn() {
        return this._return;
    }

    public void setReturn(ru.akbars.integro.creapp.IntegrationResponse new_return)  {
        this._return = new_return;
    }

}
