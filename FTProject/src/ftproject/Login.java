/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ftproject;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author MASTER COMPUTERS
 */
public class Login extends Jailors {

    String a;
    String b;
   

    public boolean credentials(String a, String b) {

        try {
            boolean flag = false;
            FileReader read = new FileReader("Jailors.txt");
            BufferedReader buffer = new BufferedReader(read);
          
            String line = buffer.readLine();
         
            while (line != null || line != "") 
            { 
                
                
                String[] token = line.split(",");
                if (token[6].equals(a) && token[7].equals(b)) 
                {
                   
                    return true;
                   
                } else 
                {
                
                    flag = false;
                }
                line = buffer.readLine();
            }

            return flag;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Invalid");
        }
    return false;
    }
}
