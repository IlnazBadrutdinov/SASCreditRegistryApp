package ru.akbars.integro.dao;

import java.util.ArrayList;
import java.util.List;

public class DictIntegroCreMethod {
	String methodName;
	Integer cacheUse;
	String creMethod;
	List<DictCreConnectorCode> connectorCodeList;
	
	public DictIntegroCreMethod () {
		connectorCodeList = new ArrayList<DictCreConnectorCode>();
	}
	
	public String getMethodName() {
		return methodName;
	}
	public void setMethodName(String methodName) {
		this.methodName = methodName;
	}
	public Integer getCacheUse() {
		return cacheUse;
	}
	public void setCacheUse(Integer cacheUse) {
		this.cacheUse = cacheUse;
	}
	public String getCreMethod() {
		return creMethod;
	}
	public void setCreMethod(String creMethod) {
		this.creMethod = creMethod;
	}
	public List<DictCreConnectorCode> getConCode() {
		return connectorCodeList;
	}
	public void setConCode(List<DictCreConnectorCode> conCode) {
		this.connectorCodeList = conCode;
	}
}
