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
public class Prisoners {
    private String PId;
    private String PName;
    private int PAge;
    private String PGender;
    private String PSection;
    private int PRoom;
    private String PAddress;
    private String CDetails;
    private String dateIN;
    private String dateOUT;

    public void setDateIN(String dateIN) {
        this.dateIN = dateIN;
    }

    public void setDateOUT(String dateOUT) {
        this.dateOUT = dateOUT;
    }

    public String getDateIN() {
        return dateIN;
    }

    public String getDateOUT() {
        return dateOUT;
    }

    public void setPGender(String PGender) {
        this.PGender = PGender;
    }

    public String getPGender() {
        return PGender;
    }
    
    
   public String  GeneratePID()
    {
        String s = "P-";
        Random rand = new Random();
        for(int i = 0 ; i < 3 ; i++)
        {
            s +=rand.nextInt(9)+1;
                  }
            
         this.PId = s;   
        
        return s;
    }
    
    public void setPId()
    {
        String id = GeneratePID();
        this.PId = id;
        
    }
    public void setFPId(String id)
    {
        
        this.PId = id;
        
    }

    public String getPId() {
        return PId;
    }
    
    
     public boolean setName( String PName)
    {
        boolean flag = false;
        int size = PName.length();
         for(int i=0; i<size; i++)
    {
      if((PName.charAt(i)>='A' &&PName.charAt(i)<='Z') ||( PName.charAt(i)>='a' && PName.charAt(i)<='z' )|| PName.charAt(i)==' ')
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
        this.PName= PName;
    }
    
    return flag;   
    }

    public String getPName() {
        return PName;
    }
    
    public boolean setPAge(int PAge) {
      boolean flag = false;
      if(PAge>=10&&PAge<=80)
      {
          this.PAge=PAge;
          flag = true;
      }
        
       return flag;
    }

    public int getPAge() {
        return PAge;
    }
    
    
    
  public boolean setPSection(String PSection)
  {
      boolean flag = false;
      if(PSection.charAt(0)== 'A' ||PSection.charAt(0)== 'B'|| PSection.charAt(0)== 'C'|| PSection.charAt(0)== 'D' )
      {
          this.PSection = PSection;
          flag = true;
      }
      return flag;
  }
    public String getPSection() {
        return PSection;
    }
    public boolean setRoom(int PRoom)
    {
        boolean flag= false;
        if(PRoom > 0 && PRoom <= 400)
        {
            this.PRoom = PRoom;
            flag = true;
            
        }
        return flag;
    }
    public int getPRoom() {
        return PRoom;
    }
     
    public boolean setCDetails( String CDetails)
    {
        boolean flag = false;
        int size = CDetails.length();
         for(int i=0; i<size; i++)
    {
      if((CDetails.charAt(i)>='A' &&CDetails.charAt(i)<='Z') ||( CDetails.charAt(i)>='a' && CDetails.charAt(i)<='z' )|| CDetails.charAt(i)==' ' ||(CDetails.charAt(i)>= '0' && CDetails.charAt(i)<= '9'))
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
        this.CDetails= CDetails;
    }
    return flag;
    }
    
    
     public String getCDetails() {
        return CDetails;
    }
     
     
    public String getPAddress() {
        return PAddress;
    }

    public boolean setPAddress( String PAddress)
    {
        boolean flag = false;
        int size = PAddress.length();
         for(int i=0; i<size; i++)
    {
      if((PAddress.charAt(i)>='A' &&PAddress.charAt(i)<='Z') ||( PAddress.charAt(i)>='a' && PAddress.charAt(i)<='z' )|| PAddress.charAt(i)==' ' ||(PAddress.charAt(i)>= '0' && PAddress.charAt(i)<= '9') ||  PAddress.charAt(i)==',' || PAddress.charAt(i)=='#' || PAddress.charAt(i)=='.' || PAddress.charAt(i)=='-' || PAddress.charAt(i)=='/')
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
        this.PAddress= PAddress;
    }
    return flag;
    }

   
     
}
