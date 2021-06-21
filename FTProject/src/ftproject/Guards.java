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
public class Guards {

    private String GName;
    private int GAge;
    private String GAddress;
    private String GShift;
    private int GDutyHours;
    private String GID;
    private String GContact;
    private String GTime;

    //setters and getters
    public String getGName() {
        return GName;
    }

    public boolean setGName(String GName) {
        boolean f = false;
        int size = GName.length();
        for (int i = 0; i < size; i++) {
            if ((GName.charAt(i) >= 'a' && GName.charAt(i) <= 'z') || (GName.charAt(i) >= 'A' && GName.charAt(i) <= 'Z') || GName.charAt(i) == ' ') {

                this.GName = GName;
                f = true;
            }

        }

        return f;

    }

    public int getGAge() {
        return GAge;
    }

    public boolean setGAge(int GAge) {
        if (GAge >= 25 && GAge <= 60) {
            this.GAge = GAge;
            return true;
        } else {
            return false;
        }
    }

    public String getGAddress() {
        return GAddress;
    }

    public boolean setGAddress(String GAddress) {
        boolean f = false;
        int size = GAddress.length();
        for (int i = 0; i < size; i++) {
            if ((GAddress.charAt(i) >= 'a' && GAddress.charAt(i) <= 'z') || (GAddress.charAt(i) >= 'A' && GAddress.charAt(i) <= 'Z') || GAddress.charAt(i) == ' ' || (GAddress.charAt(i) >= 0 && GAddress.charAt(i) <= 9)||  GAddress.charAt(i)==',' || GAddress.charAt(i)=='#' || GAddress.charAt(i)=='.' || GAddress.charAt(i)=='-' || GAddress.charAt(i)=='/') 
            {
                this.GAddress = GAddress;
                f = true;
            }

        }

        return f;

    }

    public String getGShift() {
        return GShift;
    }

    public boolean setGShift(String GShift) {
        boolean f = false;
        if (GShift == "Night" || GShift == "Day") {
            f = true;
            this.GShift = GShift;
        }
        return f;
    }
     public Guards(){
         
     }
     public Guards(String GShift)
     {
         this.GShift = GShift; 
     }

    public int getGDutyHours() {
        return GDutyHours;
    }

    public boolean setGDutyHours(int GDutyHours) {
        boolean f = false;
        if (GDutyHours >= 2 && GDutyHours <= 24) {
            f = true;
            this.GDutyHours = GDutyHours;
        }
        return f;
    }

    

    public String getGContact() {
        return GContact;
    }

    public boolean setGContact(String GContact) {
        boolean f = false;
        int size = GContact.length();
        if (size == 11) {
            for (int i = 0; i < size; i++) {

                if (GContact.charAt(i) >= '0'& GContact.charAt(i) <= '9')
                {
                    this.GContact = GContact;
                    f = true;
                } 

            }

        }
        return f;

    }

    public String getGTime() {
        return GTime;
    }

    public boolean setGTime(String GTime) {
        
       boolean flag = false;
       int size = GTime.length();
       for(int i=0; i< size; i++)
       {
           if ((GTime.charAt(i) >= 'a' && GTime.charAt(i) <= 'z') || (GTime.charAt(i) >= 'A' && GTime.charAt(i) <= 'Z') ||(GTime.charAt(i) >= '0' && GTime.charAt(i) <= '9')|| GTime.charAt(i) == ' ') 
           {
               flag = true;
           }
           else
           {
               flag = false;
               break;
           }
       }
       if(flag == true)
       {
           this.GTime = GTime;
       }
       return flag;
    }

  //id work
    public String  GenerateGID()
    {
        String s = "G-";
        Random rand = new Random();
        for(int i = 0 ; i < 3 ; i++)
        {
            s +=rand.nextInt(9)+1;
            
            
        }

        return s;
    }
    
    public void setGID()
    {
        String id = GenerateGID();
        this.GID = id;
        
    }
     public void setFGID(String id)
    {
       
        this.GID = id;
        
    }

    public String getGID() {
        return GID;
    }
    
    
}
