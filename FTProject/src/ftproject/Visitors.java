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
public class Visitors {
    private String VName;
    private String VCnic;
    private String VRelation;
    private String VContact;
    private String VId;

    //setters and getters
    
    
     public String  GenerateVId()
    {
        String s = "V-";
        Random rand = new Random();
        for(int i = 0 ; i < 3 ; i++)
        {
            s +=rand.nextInt(9)+1;           
          
        }
            
         this.VId = s;   
        
        return s;
    }
    
    public void setVId()
    {
        String id = GenerateVId();
        this.VId = id;
        
    }
    public void setFVId( String id)
    {
       
        this.VId = id;
        
    }

    public String getVId() {
        return VId;
    }
    
    
    public String getVName() {
        return VName;
    }

    public boolean setVName(String VName) {
         boolean f = false;
        int size = VName.length();
        for(int i = 0 ; i< size ; i++)
        {
            if((VName.charAt(i)>='a'&&VName.charAt(i)<='z')||(VName.charAt(i)>='A'&&VName.charAt(i)<='Z')||VName.charAt(i)==' ')
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
            this.VName = VName;
        }


        return f;
    }

    public String getVCnic() {
        return VCnic;
    }

    public boolean setVCnic(String VCnic) {
        boolean f = false;
        int size = VCnic.length();
        if(size==13)
        {
            for(int i = 0 ; i < size ; i++)
            {
                if(VCnic.charAt(i)>='0'&&VCnic.charAt(i)<='9')
                {
                    f = true;
                   this.VCnic = VCnic; 
                }
            }
        }
        return f;
    }

    public String getVRelation() {
        return VRelation;
    }

    public boolean setVRelation(String VRelation) {
           boolean f = false;
        int size = VRelation.length();
        for(int i = 0 ; i< size ; i++)
        {
            if((VRelation.charAt(i)>='a'&&VRelation.charAt(i)<='z')||(VRelation.charAt(i)>='A'&&VRelation.charAt(i)<='Z')||VRelation.charAt(i)==' ')
            {
                        
                this.VRelation = VRelation;
                f = true;
            }
            
        }


        return f;

    }

    public String getVContact() {
        return VContact;
    }

    public boolean setVContact(String VContact) {
            boolean f = false;
        int size = VContact.length();
        if(size==11)
            {
        for(int i = 0 ; i< size ; i++)
        {
            
            if(VContact.charAt(i)>='0'&&VContact.charAt(i)<='9')
            {
                        
                this.VContact = VContact;
                f = true;
            }
            
        }
            
          }

       return f;

    }
    
    
}
