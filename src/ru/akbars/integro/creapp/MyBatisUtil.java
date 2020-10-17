/**
 * 
 */
package ru.akbars.integro.creapp;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Logger;

/**
 * @author rusile
 *
 */
public class MyBatisUtil
{

	private static SqlSessionFactory factory;
    private static final Logger LOG = Logger.getLogger(MyBatisUtil.class.getName());
    
	private MyBatisUtil() {
	}
	static
	{
        LOG.info("Initializing myBatis.");
		Reader reader = null;
		try {
			reader = Resources.getResourceAsReader("configuration.xml");
		} catch (IOException e) {
			throw new RuntimeException(e.getMessage());
		}
		factory = new SqlSessionFactoryBuilder().build(reader);
        LOG.info("Finished initializing of myBatis.");
	}
	public static SqlSessionFactory getSqlSessionFactory()
	{
		return factory;
	}
}
