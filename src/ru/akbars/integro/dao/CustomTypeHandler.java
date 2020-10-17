package ru.akbars.integro.dao;

import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.TypeHandler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CustomTypeHandler implements TypeHandler {
	@Override
	public void setParameter(PreparedStatement ps, int i, Object parameter, JdbcType jdbcType) throws SQLException {
		Double intValue = null;
		if ((null != parameter) && (!(parameter.toString().trim().isEmpty()))) {
			if (parameter.getClass().equals(String.class)) {
				String doubleParameter = (String) parameter;
				if (doubleParameter.contains(",")) {
					doubleParameter = doubleParameter.replace(",", ".");
				}
				intValue = Double.valueOf(doubleParameter);
				ps.setObject(i, intValue, java.sql.Types.DOUBLE);
			}
			else if (parameter.getClass().equals(Double.class)) {
				intValue = Double.valueOf((Double) parameter);
				ps.setObject(i, intValue, java.sql.Types.DOUBLE);
			}
		}
		else {
			ps.setObject(i, intValue, java.sql.Types.DOUBLE);
		}
	}
	
	@Override
	public Object getResult(ResultSet rs, String columnName) throws SQLException {
		Integer intValue = rs.getInt(columnName);
		if (null==intValue) {
			return null;
		}
		return intValue;
	}

	@Override
	public Object getResult(ResultSet resultSet, int i) {
		return null;
	}

	@Override
	public Object getResult(CallableStatement cs, int columnIndex) {
		return null;
	}
}
