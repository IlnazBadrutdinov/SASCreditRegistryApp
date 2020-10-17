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
import java.util.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Logger;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.TypeHandler;

public class CustomDateHandler implements TypeHandler {
	@Override
	public void setParameter(PreparedStatement ps, int i, Object parameter, JdbcType jdbcType) throws SQLException {
		if (null != parameter) {
			if (parameter.getClass().equals(String.class)) 
			{
				System.out.println(parameter);
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH.mm");
				Date date;
				try
				{
					date = sdf.parse((String) parameter);
					ps.setDate(i, (java.sql.Date) date);
				} catch (ParseException e)
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}	
			} 
		} else {
			ps.setDate(i, null);
		}
	}

	@Override
	public Object getResult(ResultSet rs, String columnName) throws SQLException {
		Timestamp time = rs.getTimestamp(columnName);
		System.out.println(time.toString());
		if (null == time) 
		{
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