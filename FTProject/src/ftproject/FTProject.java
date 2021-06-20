/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ftproject;

/**
 *
 * @author 2020-CS-87
 * @author 2020-CS-55
 */


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.*;
import javax.swing.JOptionPane;



public class FTProject {
//Lists
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
   // Function to read data from doctors file
  public static void readDataDoctors()
  {
      
         try{  
            FileReader read = new FileReader("Doctors.txt");
            BufferedReader buffer = new BufferedReader(read);
            String line = buffer.readLine();
             while (line != null) {
                 String[] token = line.split(",");
                 Doctors d = new Doctors();
                 d.setFDID(token[0]);
                 d.setDName(token[1]);
                 d.setGender(token[2]);
                 d.setDAge(Integer.parseInt(token[3]));
                 d.setDContact(token[4]);
                 d.setDDtime(Integer.parseInt(token[5]));
                 d.setDSalary(Double.parseDouble(token[6]));
                 FTProject.getInstance().getDocList().add(d);

                 line = buffer.readLine();
             }

             read.close();
             buffer.close();
         }
         catch (Exception ex)
                 {
                   JOptionPane.showMessageDialog(null, "File Not Found");  
                 }
  }
  //function to write in doctors file
  public static void writeDataDoctors(){
       try{
       FileWriter wr = new FileWriter("Doctors.txt");
       BufferedWriter br = new BufferedWriter(wr);
        for(int i =0; i< FTProject.getInstance().DocList.size(); i++)
        {
             br.write(FTProject.getInstance().DocList.get(i).getDId() +",");
             br.write(FTProject.getInstance().DocList.get(i).getDName() +",");
             br.write(FTProject.getInstance().DocList.get(i).getGender() +",");
             br.write(FTProject.getInstance().DocList.get(i).getDAge() +",");
             br.write(FTProject.getInstance().DocList.get(i).getDContact() +",");
             br.write(FTProject.getInstance().DocList.get(i).getDDtime()+",");
             br.write(FTProject.getInstance().DocList.get(i).getDSalary() +"\n");
          
        }
        br.flush();
        br.close();
        wr.close();       
       }
       catch (Exception e)
       {
           JOptionPane.showMessageDialog(null, "File Not Found");  
       }
   }
  //function to read data from visitors file
  public static void readVisitorsData()
  {
      try{
          FileReader fr = new FileReader("Visitors.txt");
          BufferedReader br = new BufferedReader(fr);
          String line = br.readLine();
          while(line != null)
          {
              String[] token = line.split(",");
              Visitors v = new Visitors();
              v.setFVId(token[0]);
              v.setVName(token[1]);
              v.setVCnic(token[2]);
              v.setVContact(token[3]);
              v.setVRelation(token[4]);
              FTProject.getInstance().VList.add(v);
              line = br.readLine();
              
          }
          fr.close();
          br.close();
          
          
      }
      catch (Exception e)
      {
          JOptionPane.showMessageDialog(null, "File Not Found");  
      }
  }
      //function to write data in file
   public static void writeDataVisitors()
   {
       try
       {
          FileWriter fw = new FileWriter("Visitors.txt");
          BufferedWriter  bw = new BufferedWriter(fw);
          for(int i=0; i<FTProject.getInstance().VList.size(); i++)
          {
              bw.write(FTProject.getInstance().VList.get(i).getVId() + ",");
              bw.write(FTProject.getInstance().VList.get(i).getVName() + ",");
              bw.write(FTProject.getInstance().VList.get(i).getVCnic() + ",");
              bw.write(FTProject.getInstance().VList.get(i).getVContact() + ",");
              bw.write(FTProject.getInstance().VList.get(i).getVRelation()+ "\n");
          }
          bw.flush();
          bw.close();
          fw.close();
       }
       catch (Exception e)
      {
          JOptionPane.showMessageDialog(null, "File Not Found");  
      }
   }
     //read data guards
   public static void readDataGuards()
   {
       try
       {
           FileReader fr = new FileReader("Guards.txt");
          BufferedReader br = new BufferedReader(fr);
          String line = br.readLine();
          while(line != null)
          {
              String[] token = line.split(",");
             Guards g = new Guards(token[7]);
             
             g.setFGID(token[0]);
             g.setGName(token[1]);
             g.setGAge(Integer.parseInt(token[2]));
             g.setGContact(token[3]);
             g.setGAddress(token[4]);
             g.setGTime(token[5]);
             g.setGDutyHours(Integer.parseInt(token[6]));            
             FTProject.getInstance().GList.add(g);
             line = br.readLine();
              
          }
          fr.close();
          br.close();
          
          
       }
        catch (Exception e)
      {
          JOptionPane.showMessageDialog(null, "Guard's File Not Found");  
      }
   }
     // write data guards
   public static void writeDataGuards()
   {
       try
       {
          FileWriter fw = new FileWriter("Guards.txt");
          BufferedWriter  bw = new BufferedWriter(fw);
          for(int i=0; i<FTProject.getInstance().GList.size(); i++)
          {
              bw.write(FTProject.getInstance().GList.get(i).getGID()+ ",");
              bw.write(FTProject.getInstance().GList.get(i).getGName() + ",");
              bw.write(FTProject.getInstance().GList.get(i).getGAge() + ",");
              bw.write(FTProject.getInstance().GList.get(i).getGContact() + ",");
              bw.write(FTProject.getInstance().GList.get(i).getGAddress() + ",");
              bw.write(FTProject.getInstance().GList.get(i).getGTime() + ",");
              bw.write(FTProject.getInstance().GList.get(i).getGDutyHours() + ",");
              bw.write(FTProject.getInstance().GList.get(i).getGShift() + "\n");

          }
          bw.flush();
          bw.close();
          fw.close();
       }
       catch (Exception e)
      {
          JOptionPane.showMessageDialog(null, "File Not Found");  
      }
   }
     // read data of SickPrisoners
   public static void readDataSickPrisoners()
   {
       try
       {
       FileReader fr = new FileReader("SickPrisoners.txt");
       BufferedReader br = new BufferedReader(fr);
       String line = br.readLine();
       while(line != null)
       {
           String[] token = line.split(",");
           SickPrisoners sp = new SickPrisoners();
           sp.setFDID(token[0]);
           sp.p.setName(token[1]);
           sp.setGender(token[2]);
           sp.p.setPSection(token[3]);
           sp.setDName(token[4]);
           sp.setDisease(token[5]);
           
           FTProject.getInstance().SickList.add(sp);
           line = br.readLine();
           
       }
       br.close();
       fr.close();
       }
         catch (Exception e)
      {
          JOptionPane.showMessageDialog(null, "File Not Found");  
      }     
       
   }
   // write data of Sick Prisoners in file
   public static void writeDataSickPrisoners()
   {
       try
       {
          FileWriter fw = new FileWriter("SickPrisoners.txt");
          BufferedWriter  bw = new BufferedWriter(fw);
          for(int i=0; i<FTProject.getInstance().VList.size(); i++)
          {
              bw.write(FTProject.getInstance().SickList.get(i).getDId() + ",");
              bw.write(FTProject.getInstance().SickList.get(i).p.getPName() + ",");
              bw.write(FTProject.getInstance().SickList.get(i).getGender() + ",");
              bw.write(FTProject.getInstance().SickList.get(i).p.getPSection() + ",");
              bw.write(FTProject.getInstance().SickList.get(i).getDName()+ ",");
              bw.write(FTProject.getInstance().SickList.get(i).getDisease()+ "\n");
          }
          bw.flush();
          bw.close();
          fw.close();
       }
       catch (Exception e)
      {
          JOptionPane.showMessageDialog(null, "File Not Found");  
      }
   }
    /**
     * @param args the command line arguments
     */
        
    public static void main(String[] args) {  
       readDataDoctors();
       readVisitorsData();
       readDataGuards();
       readDataSickPrisoners();
      Entrance start = new Entrance();
      start.setVisible(true);

      
      
       
    }
    
    
}