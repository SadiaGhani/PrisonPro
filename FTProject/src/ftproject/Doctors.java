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
public class Doctors {
    private String DName;
    private String DContact;
    private int DAge;
    private double DSalary;
    private int DDtime;
    private String DId;
    private String gender;
    //getters and setters

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
   
    
    public String getDName() {
        return DName;
    }

    public boolean setDName(String DName) {
       boolean f = false;
          int size = DName.length();
        for(int i = 0 ; i< size ; i++)
        {
            if((DName.charAt(i)>='a'&&DName.charAt(i)<='z')||(DName.charAt(i)>='A'&&DName.charAt(i)<='Z')||DName.charAt(i)==' ')
            {
                        
               
                f = true;
            }
            else
                
            {
                f = false;
                break;
            }

        }
        if(f == true)
        {
             this.DName = DName;
        }
        
        
        return f;
        
    }

    public String getDContact() {
        return DContact;
    }

    public boolean setDContact(String DContact) {
        boolean f = false;
         int size = DContact.length();
        if(size==11)
            {
        for(int i = 0 ; i< size ; i++)
        {
            
            if(DContact.charAt(i)>='0'&&DContact.charAt(i)<='9')
            {
                        
                this.DContact = DContact;
                f = true;
            }
            
        }
            
          }

        
        
        
        return f;
    }

    public int getDAge() {
        return DAge;
    }

    public boolean setDAge(int DAge) {
        boolean f = false;
        
        if(DAge>=25&&DAge<=75)
        {
            this.DAge = DAge;
            f = true;
        }
       
        
        return f;
    }

    public double getDSalary() {
        return DSalary;
    }

    public boolean setDSalary(double DSalary) {
    
        this.DSalary = DSalary;
       return true;
       
    }

    public int getDDtime() {
        return DDtime;
    }

    public boolean setDDtime(int DDtime) {
        boolean f = false;
        if(DDtime >=2 && DDtime <= 24)
        {
            f = true;
        this.DDtime = DDtime;
        }
        return f;
    }

 


    //id generator
    public String  GenerateDID()
    {
        String s = "D-";
        Random rand = new Random();
        for(int i = 0 ; i < 3 ; i++)
        {
            s +=rand.nextInt(9)+1;
            
            
        }
            
         this.DId = s;   
        
        return s;
    }
    
    public void setFDID(String id)
    {
        this.DId = id;
        
    }
    
    public void setDID()
    {
        String id = GenerateDID();
        this.DId = id;
        
    }

    public String getDId() {
        return DId;
    }
    
}
