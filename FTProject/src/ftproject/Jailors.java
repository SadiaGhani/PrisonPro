/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ftproject;

import java.util.Random;

/**
 *
 * @author Mask
 */
public class Jailors extends Details {
    
    private String JId;
    private String JAddress;
    private String JUserName;
    private String JPassword;
    private String JGender;
    //setters and getters

    public String getJGender() {
        return JGender;
    }

    public void setJGender(String JGender) {
        this.JGender = JGender;
    }
    
    public String  GeneratePID()
    {
        String s = "J-";
        Random rand = new Random();
        for(int i = 0 ; i < 3 ; i++)
        {
            s +=rand.nextInt(9)+1;
                  }
            
         this.JId = s;   
        
        return s;
    }
    
    public void setJId()
    {
        String id = GeneratePID();
        this.JId = id;
        
    }
     public void setFJId(String id)
    {
        
        this.JId = id;
        
    }

    public String getJId() {
        return JId;
    }
   
    public String getJAddress() {
        return JAddress;
    }

    public boolean setJAddress(String JAddress) {
        boolean f = false;
         int size = JAddress.length();
        for(int i = 0 ; i< size ; i++)
        {
            if((JAddress.charAt(i)>='a'&&JAddress.charAt(i)<='z')||(JAddress.charAt(i)>='A'&&JAddress.charAt(i)<='Z')||JAddress.charAt(i)==' ' ||JAddress.charAt(i)=='.'  ||JAddress.charAt(i)==',' ||JAddress.charAt(i)=='-' ||JAddress.charAt(i)=='#' ||JAddress.charAt(i)=='/' )
            {
                        
                this.JAddress = JAddress;
                f = true;
            }
            
        }


       return f;
    }

    public String getJUserName() {
        return JUserName;
    }

    public boolean setJUserName(String JUserName) {
        boolean f = false;
         int size = JUserName.length();
        for(int i = 0 ; i< size ; i++)
        {
            if((JUserName.charAt(i)>='a'&&JUserName.charAt(i)<='z')||(JUserName.charAt(i)>='A'&&JUserName.charAt(i)<='Z')  || JUserName.charAt(i)=='_'|| JUserName.charAt(i)=='@')
            {
                        
                this.JUserName = JUserName;
                f = true;
            }
            
        }


       return f;
        
    }

    public String getJPassword() {
        return JPassword;
    }

    public boolean setJPassword(String JPassword) {
        boolean f = false;
         int size = JPassword.length();
        for(int i = 0 ; i< size ; i++)
        {
            if((JPassword.charAt(i)>='a'&&JPassword.charAt(i)<='z')|| (JPassword.charAt(i)>='A'&&JPassword.charAt(i)<='Z')||  JPassword.charAt(i)=='-' ||(JPassword.charAt(i)>= '0' && JPassword.charAt(i) <= '9' ) || JPassword.charAt(i) <= '@' || JPassword.charAt(i) <= '#' || JPassword.charAt(i) <= '*')
            {
                        
                this.JPassword = JPassword;
                f = true;
            }
            
        }


       return f;
    }

    

   
    
}
