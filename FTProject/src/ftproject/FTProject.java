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
 public static LinkedList<Doctors>  DocList = new LinkedList<Doctors>();
 public static LinkedList<Prisoners>  PriList = new LinkedList<Prisoners>();
 public static ArrayList<FIR>  FirList = new ArrayList<FIR>();
 public static ArrayList<Visitors>  VList = new ArrayList<Visitors>();
 public static ArrayList<Guards>  GList = new ArrayList<Guards>();   
 public static ArrayList<Jailors>  JaiList = new ArrayList<Jailors>();  
 public static ArrayList<Works>  WorkList = new ArrayList<Works>();
 public static ArrayList<SickPrisoners>  SickList = new ArrayList<SickPrisoners>();
 
   
 
     
    
    /**
     * @param args the command line arguments
     */
        
    public static void main(String[] args) {     
      
      Entrance start = new Entrance();
      start.setVisible(true);

      
       
    }
    
    
}
