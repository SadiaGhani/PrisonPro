/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ftproject;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author MASTER COMPUTERS
 */
public class Login extends Jailors {
    
    String a;
    String b;
    ArrayList<Jailors> j = FTProject.JaiList;
    public  boolean credentials(String a, String b)
    {
        boolean flag = false;
        for (int i = 0; i < j.size(); i++) {
            if (a.equals(FTProject.JaiList.get(i).getJUserName()) && b.equals(FTProject.JaiList.get(i).getJPassword()) ) {

                flag = true;
            } 
        }
        return flag;
    }
    }

