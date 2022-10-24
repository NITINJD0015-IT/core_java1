//import Oracle.jdbc.driver.*;
import java.sql.*;


 class Test {

    public static void main(String[] args) throws Exception {
        //register jdbc driver s/w
        //create jdbc driver class object
        oracle.jdbc.driver.OracleDriver driver = new oracle.jdbc.driver.OracleDriver();
        //register jdbc driver s/w
        DriverManager.registerDriver(driver);
        //establish the connection with DB s/w
        Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger");
        //verify the connection
        if (conn == null) {
            System.out.println("Connection is not established");
        } else {
            System.out.println("Connection is established");
        }

    }//main

}//class