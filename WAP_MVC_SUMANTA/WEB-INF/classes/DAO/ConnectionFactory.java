package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.*;
import java.io.*;
import java.net.*;
import javax.naming.Context;
import javax.sql.DataSource;

public class ConnectionFactory
{
       static String driverClassName;
       static String connectionUrl;
       static String loginTable;
       static String messageTable;
       static Context initContext;

       private static ConnectionFactory connectionFactory = null;



       static String getLoginTable()
       {
            return loginTable;
       }

       static String getMessageTable()
       {
            return messageTable;
       }

       private ConnectionFactory()
       {
            try {

                    initContext = new Configuration().getConfiguration();
                    loginTable = (String)initContext.lookup("login_table");
                    messageTable = (String)initContext.lookup("message_table");
               } catch (Exception e) {
                          e.printStackTrace();
               }
        }

        public Connection getConnection() throws Exception
        {
              Connection conn = null;
              DataSource ds=(DataSource)initContext.lookup("db_connect");
              conn = ds.getConnection();
              return conn;
        }

        public static ConnectionFactory getInstance()
        {
             if (connectionFactory == null)
             {
                 connectionFactory = new ConnectionFactory();
             }
             return connectionFactory;
        }
}