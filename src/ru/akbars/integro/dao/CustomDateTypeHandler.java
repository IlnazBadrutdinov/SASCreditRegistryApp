/**
 * 
 */
package ru.akbars.integro.dao;

/**
 * originally by
 * @author user358099 from http://stackoverflow.com/questions/17609406/mybatis-xmlgregoriancalendar-handler
 * Adjusted to timestamp fields in oracle by rusile
 *
 * */
import java.sql.CallableStatement;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Logger;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.TypeHandler;

public class CustomDateTypeHandler implements TypeHandler {
	@Override
	public void setParameter(PreparedStatement ps, int i, Object parameter, JdbcType jdbcType) throws SQLException {
		if (null != parameter) {
			if (parameter.getClass().equals(String.class)) {
				System.out.println(parameter);
				GregorianCalendar gregorianCalendar = new GregorianCalendar();
				int day;
				int month;
				int year;
				if (((String) parameter).contains(".")) {

					day = Integer.parseInt(parameter.toString().substring(0, 2));
					month = Integer.parseInt(parameter.toString().substring(3, 5));
					year = Integer.parseInt(parameter.toString().substring(6, 10));
				} else {
					day = Integer.parseInt(parameter.toString().substring(0, 2));
					month = Integer.parseInt(parameter.toString().substring(2, 4));
					year = Integer.parseInt(parameter.toString().substring(4, 8));
				}
				gregorianCalendar.set(year, month - 1, day);
				long time = gregorianCalendar.getTimeInMillis();
				java.sql.Date timeStamp = new java.sql.Date(time);
				ps.setDate(i, timeStamp);
			} else {
				if (parameter.getClass().equals(java.util.Date.class)) {

					java.util.Date d = (java.util.Date) parameter;
					System.out.println(d.toString());
					long time = d.getTime();
					java.sql.Timestamp date = new java.sql.Timestamp(time);
					ps.setTimestamp(i, date);

				}
			}
		} else {
			ps.setTimestamp(i, null);
		}
	}

	@Override
	public Object getResult(ResultSet rs, String columnName) throws SQLException {
		Timestamp time = rs.getTimestamp(columnName);
		System.out.println(time.toString());
		if (null == time) {
			return null;
		}
		XMLGregorianCalendar time2 = null;
		GregorianCalendar c = new GregorianCalendar();
		Calendar.getInstance().getWeekYear();
		c.setTime(time);
		try {
			time2 = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
		} catch (DatatypeConfigurationException e) {
			e.printStackTrace();
		}
		return time2;
	}

	@Override
	public Object getResult(CallableStatement cs, int columnIndex) throws SQLException {
		return "";
	}

	@Override
	public Object getResult(ResultSet rs, int columnIndex) throws SQLException {
		Timestamp time = rs.getTimestamp(columnIndex);

		if (null == time) {
			return null;
		}
		XMLGregorianCalendar time2 = null;
		GregorianCalendar c = new GregorianCalendar();

		c.setTime(time);
		try {

			time2 = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
		} catch (DatatypeConfigurationException e) {
			e.printStackTrace();
		}
		return time2;
	}
}