/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package navigatebusinesswebsite;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Scanner;

public class NavigateBusinessWebsite {
    public static void main(String[] args) {
        try{
            Scanner sc  =   new Scanner(System.in);
            System.out.println("Enter url in this format (http://www.typewebsiteintohere.com) : ");
            String url =   sc.next();
            Desktop.getDesktop().browse(new URL(url).toURI());
        }
        catch(IOException | URISyntaxException E){
            System.err.println("Exp : "+E.getMessage());
        }
    }
}
    
    
