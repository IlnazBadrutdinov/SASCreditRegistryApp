package ru.akbars.integro.dao;

import org.apache.ibatis.annotations.Select;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;

public interface RtdmSomeMapper {
	
	@Results({
		@Result(property = "methodName", column = "method_name"),
		@Result(property = "cacheUse", column = "cache_use"),
		@Result(property = "creMethod", column = "cre_method")
	})
	@Select("select upper(method_name) as method_name"
			+ ", cache_use"
			+ ", upper(cre_method) as cre_method"
			+ " from DICT_INTEGRO_CRE_METHOD")
	List<DictIntegroCreMethod> getIntegroMethod();

	@Results({
		@Result(property = "connectorCode", column = "connector_code"),
		@Result(property = "subrequestCode", column = "subrequest_code")
	})
	@Select("select connector_code, subrequest_code from DICT_CRE_CONNECTORCODE "
			+ " where upper(method_name) = upper( #{methodName, javaType=java.lang.String,  jdbcType=VARCHAR} )")
	List<DictCreConnectorCode> getConnectorCode(@Param("methodName") String methodName);
}