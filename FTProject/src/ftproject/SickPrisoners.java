/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ftproject;

import java.util.Random;

/**
 *
 * @author MASTER COMPUTERS
 */
public class SickPrisoners extends Doctors{
    Prisoners p =  new Prisoners();
    public String Gender;
    private String SPId;
    private String Disease;
    
    
    @Override
     public String  GenerateDID()
    {
        String s = "PS-";
        Random rand = new Random();
        for(int i = 0 ; i < 3 ; i++)
        {
            s +=rand.nextInt(9)+1;
                  }
            
         this.SPId = s;   
        
        return s;
    }
    
    @Override
    public void setDID()
    {
        String id = GenerateDID();
        this.SPId = id;
        
    }
    public void setFDID(String id)
    {
        
        this.SPId = id;
        
    }

    @Override
    public String getDId() {
        return SPId;
    }
    
    public boolean setDisease( String Disease)
    {
        boolean flag = false;
        int size = Disease.length();
         for(int i=0; i<size; i++)
    {
      if((Disease.charAt(i)>='A' &&Disease.charAt(i)<='Z') ||( Disease.charAt(i)>='a' && Disease.charAt(i)<='z' )||( Disease.charAt(i)>='0' && Disease.charAt(i)<='9' ) || Disease.charAt(i)==' ')
      {
        flag = true;
        
      }
      else
      {
        flag= false;
        break;
      }
    }
    if(flag== true)
    {
        this.Disease= Disease;
    }
    
    return flag;   
    }

    public String getDisease() {
        return Disease;
    }
    
    
}
