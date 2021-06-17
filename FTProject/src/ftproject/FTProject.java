/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ftproject;

/**
 *
 * @author DELL PC
 */


import java.util.*;



public class FTProject {
//doctor mamay ki arraylist
   private  static FTProject instance;
 private  LinkedList<Doctors>  DocList ;
 private LinkedList<Prisoners>  PriList; 
 private ArrayList<FIR>  FirList ;
 private ArrayList<Visitors>  VList;
 private ArrayList<Guards>  GList ;  
 private ArrayList<Jailors>  JaiList; 
 private ArrayList<Works>  WorkList ;
 private ArrayList<SickPrisoners>  SickList; 

    public LinkedList<Doctors> getDocList() {
        return DocList;
    }

    public LinkedList<Prisoners> getPriList() {
        return PriList;
    }

    public ArrayList<FIR> getFirList() {
        return FirList;
    }

    public ArrayList<Visitors> getVList() {
        return VList;
    }

    public ArrayList<Guards> getGList() {
        return GList;
    }

    public ArrayList<Jailors> getJaiList() {
        return JaiList;
    }

    public ArrayList<Works> getWorkList() {
        return WorkList;
    }

    public ArrayList<SickPrisoners> getSickList() {
        return SickList;
    }
 
 public static FTProject getInstance()
 {
     if(instance==null)
         instance = new FTProject();
     
     return instance;
 }
 
   public FTProject()
   {
       DocList = new LinkedList<Doctors>();
       PriList = new LinkedList<Prisoners>();
       FirList = new ArrayList<FIR>();
       VList = new ArrayList<Visitors>();
       GList = new ArrayList<Guards>();
       JaiList = new ArrayList<Jailors>();
       WorkList = new ArrayList<Works>();
       SickList = new ArrayList<SickPrisoners>();
   }
 
     
    
    /**
     * @param args the command line arguments
     */
        
    public static void main(String[] args) {     
      
      Entrance start = new Entrance();
      start.setVisible(true);

      
       
    }
    
    
}
