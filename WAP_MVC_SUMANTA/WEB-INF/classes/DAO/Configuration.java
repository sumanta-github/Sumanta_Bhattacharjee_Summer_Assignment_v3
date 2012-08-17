package DAO;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.tomcat.dbcp.dbcp.BasicDataSource;

public class Configuration {

      Context context;

      public Configuration()
      {

            try{

                     BasicDataSource bdSource = new BasicDataSource();
                     bdSource.setDriverClassName("org.apache.derby.jdbc.EmbeddedDriver");
                     bdSource.setUrl("jdbc:derby:c:\\Users\\SONY\\sumanta");

                     context = new InitialContext();


                     context.bind("db_connect",bdSource);
                     context.bind("login_table","users");
                     context.bind("message_table","comments");
             }catch(Exception e){
                    e.printStackTrace();
             }
      }

      Context getConfiguration()
      {
             return context;
      }
}