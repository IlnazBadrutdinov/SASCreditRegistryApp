package ru.akbars.integro.creapp;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService(name = "SASCreditRegistryPort", targetNamespace = "http://creapp.integro.akbars.ru/")
public interface SASCreditRegistryPort 
{
	@WebMethod(operationName = "executeRequest", action = "urn:ExecuteRequest")
	@WebResult(name = "return")
	IntegrationResponse executeRequest(@WebParam(name = "requestData") RequestData requestData);
}