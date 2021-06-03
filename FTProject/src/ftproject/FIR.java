/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ftproject;

import java.util.Random;

/**
 *
 * @author Sadia Ghani
 */
public class FIR {
    private String FirNumber;
    private String CName;
    private String CFatherName;
    private String CNumber;
    private String Address;
    private String PoliceStation;
    private String SHOname;
    private String PlaceOfIncident;
    private String DistrictOfIncident;
    private String DetailsofIncident;
    
    public void GenerateDID()
    {
        String s = "F-";
        Random rand = new Random();
        for(int i = 0 ; i < 5 ; i++)
        {
            s +=rand.nextInt();
            
            
        }
            
         this.FirNumber = s;   
        
        
    }
    public boolean setFirNumber(String FirNumber)
    {
        boolean flag = false;
        int size = FirNumber.length();
        return flag;
    }
    /**
     * 
     * @param CName
     * @return 
     */
    public boolean setName( String CName)
    {
        boolean flag = false;
        int size = CName.length();
         for(int i=0; i<size; i++)
    {
      if((CName.charAt(i)>='A' &&CName.charAt(i)<='Z') ||( CName.charAt(i)>='a' && CName.charAt(i)<='z' )|| CName.charAt(i)==' ')
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
        this.CName= CName;
    }
    
    return flag;   
    }
    /**
     * 
     * @return 
     */
    public String getCName() {
        return CName;
    }
    
    /**
     * 
     * @param CFatherName
     * @return 
     */
    public boolean setFName( String CFatherName)
    {
        boolean flag = false;
        int size = CFatherName.length();
         for(int i=0; i<size; i++)
    {
      if((CFatherName.charAt(i)>='A' &&CFatherName.charAt(i)<='Z') ||( CFatherName.charAt(i)>='a' && CFatherName.charAt(i)<='z' )|| CFatherName.charAt(i)==' ')
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
        this.CFatherName= CFatherName;
    }
    
    return flag;   
    }
    /**
     * 
     * @return 
     */
      
     public String getCFatherName() {
        return CFatherName;
    }

    public String getFirNumber() {
        return FirNumber;
    }
/**
 * 
 * @param CNumber
 * @return 
 */
   public boolean setContact(String CNumber)
    { 
        boolean flag = false;
        int size =CNumber.length();
        if(size == 11)
        {
        for(int i=0; i<size; i++)
        {
            if(CNumber.charAt(i)>= '0' && CNumber.charAt(i)<= '9')
            {
                flag = true;
            }
            else 
            {
                flag = false;
                break;
            }
            
        }
        }
        else
        {
            flag = false;
        }
        if(flag==true)
        {
            this.CNumber = CNumber;
        }
        return flag;
    }
/**
 * 
 * @return 
 */
    public String getCNumber() {
        return CNumber;
    }
    /**
     * 
     * @param Address
     * @return 
     */
    public boolean setAddress( String Address)
    {
        boolean flag = false;
        int size = Address.length();
         for(int i=0; i<size; i++)
    {
      if((Address.charAt(i)>='A' &&Address.charAt(i)<='Z') ||( Address.charAt(i)>='a' && Address.charAt(i)<='z' )|| Address.charAt(i)==' ' ||(Address.charAt(i)>= '0' && Address.charAt(i)<= '9'))
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
        this.Address= Address;
    }
    return flag;
    }
    /**
     * 
     * @return 
     */
    public String getAddress() {
        return Address;
    }
    /**
     * 
     * @param PoliceStation
     * @return 
     */
     public boolean setPoliceStation( String PoliceStation)
    {
        boolean flag = false;
        int size = PoliceStation.length();
         for(int i=0; i<size; i++)
    {
      if((PoliceStation.charAt(i)>='A' &&PoliceStation.charAt(i)<='Z') ||( PoliceStation.charAt(i)>='a' && PoliceStation.charAt(i)<='z' )|| PoliceStation.charAt(i)==' ')
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
        this.PoliceStation= PoliceStation;
    }
    
    return flag;   
    }
     /**
      * 
      * @return 
      */
    public String getPoliceStation() {
        return PoliceStation;
    }
    /**
     * 
     * @param SHOname
     * @return 
     */
    public boolean setSHOName( String SHOname)
    {
        boolean flag = false;
        int size = SHOname.length();
         for(int i=0; i<size; i++)
    {
      if((SHOname.charAt(i)>='A' &&SHOname.charAt(i)<='Z') ||( SHOname.charAt(i)>='a' && SHOname.charAt(i)<='z' )|| SHOname.charAt(i)==' ')
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
        this.SHOname= SHOname;
    }
    return flag;
    }
    /**
     * 
     * @return 
     */
    public String getSHOname() {
        return SHOname;
    }
    /**
     * 
     * @param PlaceOfIncident
     * @return 
     */
    public boolean setPOfIncident( String PlaceOfIncident)
    {
        boolean flag = false;
        int size = PlaceOfIncident.length();
         for(int i=0; i<size; i++)
    {
      if((PlaceOfIncident.charAt(i)>='A' &&PlaceOfIncident.charAt(i)<='Z') ||( PlaceOfIncident.charAt(i)>='a' && PlaceOfIncident.charAt(i)<='z' )|| PlaceOfIncident.charAt(i)==' ' ||(PlaceOfIncident.charAt(i)>= '0' && PlaceOfIncident.charAt(i)<= '9'))
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
        this.PlaceOfIncident= PlaceOfIncident;
    }
    return flag;
    }
/**
 * 
 * @return 
 */
    public String getPlaceOfIncident() {
        return PlaceOfIncident;
    }
    /**
     * 
     * @param DistrictOfIncident
     * @return 
     */
    public boolean setDistrictOfIncident( String DistrictOfIncident)
    {
        boolean flag = false;
        int size = DistrictOfIncident.length();
         for(int i=0; i<size; i++)
    {
      if((DistrictOfIncident.charAt(i)>='A' &&DistrictOfIncident.charAt(i)<='Z') ||( DistrictOfIncident.charAt(i)>='a' && DistrictOfIncident.charAt(i)<='z' )|| DistrictOfIncident.charAt(i)==' ')
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
        this.DistrictOfIncident= DistrictOfIncident;
    }
    
    return flag;   
    }
    /**
     * 
     * @return 
     */
    public String getDistrictOfIncident() {
        return DistrictOfIncident;
    }
/**
 * 
 * @return 
 */
    public String getDetailsofIncident() {
        return DetailsofIncident;
    }
/**
 * 
 * @param DetailsofIncident 
 */
    public void setDetailsofIncident(String DetailsofIncident) {
        this.DetailsofIncident = DetailsofIncident;
    }
    
    
}
