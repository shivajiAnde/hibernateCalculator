package org.ass.calculator.util;

import java.util.Properties;

public class ConnectionProperiesUtil {

		public static Properties getMysqlDbProperties() {
			Properties properties = new Properties();
			
			properties.setProperty("connection.driver_class","com.mysql.cj.jdbc.Driver");
			
			properties.setProperty("hibernate.connection.url","jdbc:mysql://localhost:3306/config_db");
			
			properties.setProperty("hibernate.connection.username","root");
			
			properties.setProperty("hibernate.connection.password","root");
			
			properties.setProperty("hibernate.show_sql","true");
			
//			properties.setProperty("org.hibernate.dialect","org.hibernate.dialect.MySQL8Dialect");
			
			properties.setProperty("hibernate.hbm2ddl.auto", "update");
			
			return properties;
			
		}
}
