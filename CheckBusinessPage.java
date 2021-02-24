/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checkbusinesspage;

import java.sql.*;

public class CheckBusinessPage {
    public static void main(String[] args) {
         try {
            String url = "jdbc:msql://200.210.220.1:1114/Demo";
             try (Connection c = DriverManager.getConnection(url,"","")) {
                 Statement s = c.createStatement();
                 ResultSet r;
                 
                 r = s.executeQuery("SELECT businessPage FROM App WHERE customerSelection = businessID");
                 while ( r.next() ) {
                     String websiteName = r.getString("businessPage");
                     System.out.println(websiteName);
                 }}
        } catch (SQLException e) {
            System.err.println("Exception. ");
            System.err.println(e.getMessage());
        }
    }
}
    
    

