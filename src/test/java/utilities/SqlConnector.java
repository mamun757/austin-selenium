package utilities;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.*;

public class SqlConnector {
    private static final String url = "jdbc:postgresql://localhost:5432/mortgage_calculator";
    private static final String user = ReadConfigFiles.getPropertyValues("DbUser");
    private static final String password = ReadConfigFiles.getPropertyValues("DbPassword");

    private static final Logger LOGGER = LogManager.getLogger(SqlConnector.class);

    /**
     * Connection to the postgresql database
     * @return a connection object
     */

    private static Connection connect(){
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url,user,password);
        }catch (SQLException e){
          LOGGER.error("Sql Exception is: " + e.getMessage());
        }
        return conn;
    }

    /**
     * Reading data from a database
     * @param SQL is the method parameter that accept SQL Query
     * @return a result sets object
     * @throws SQLException
     */


    public  static ResultSet readData(String SQL) throws SQLException {
                 ResultSet resultSet = null;
                Connection conn = null;
        try {
           conn = connect();
           LOGGER.debug("Connection object value: " + conn);
           Statement statement = conn.createStatement();
           resultSet = statement.executeQuery(SQL);

        }catch (Exception e){
            LOGGER.error("Sql connection Exception is: " + e.getMessage());
        }finally {
            conn.close();
        }
        return resultSet;
    }
}
