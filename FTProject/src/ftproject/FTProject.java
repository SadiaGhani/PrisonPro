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

    private static FTProject instance;
    private LinkedList<Doctors> DocList;
    private LinkedList<Prisoners> PriList;
    private ArrayList<FIR> FirList;
    private ArrayList<Visitors> VList;
    private ArrayList<Guards> GList;
    private ArrayList<Jailors> JaiList;
    private ArrayList<Works> WorkList;
    private ArrayList<SickPrisoners> SickList;

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

    public static FTProject getInstance() {
        if (instance == null) {
            instance = new FTProject();
        }

        return instance;
    }

    public FTProject() {
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

    public static void readDataDoctors() {

        try {
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
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Doctor's File Not Found");
        }
    }
    //function to write in doctors file

    public static void writeDataDoctors() {
        try {
            FileWriter wr = new FileWriter("Doctors.txt");
            BufferedWriter br = new BufferedWriter(wr);
            for (int i = 0; i < FTProject.getInstance().DocList.size(); i++) {
                br.write(FTProject.getInstance().DocList.get(i).getDId() + ",");
                br.write(FTProject.getInstance().DocList.get(i).getDName() + ",");
                br.write(FTProject.getInstance().DocList.get(i).getGender() + ",");
                br.write(FTProject.getInstance().DocList.get(i).getDAge() + ",");
                br.write(FTProject.getInstance().DocList.get(i).getDContact() + ",");
                br.write(FTProject.getInstance().DocList.get(i).getDDtime() + ",");
                br.write(FTProject.getInstance().DocList.get(i).getDSalary() + "\n");

            }
            br.flush();
            br.close();
            wr.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Doctors's File Not Found");
        }
    }
    //function to read data from visitors file

    public static void readVisitorsData() {
        try {
            FileReader fr = new FileReader("Visitors.txt");
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();
            while (line != null) {
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

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Visitor's File Not Found");
        }
    }
    //function to write data in file

    public static void writeDataVisitors() {
        try {
            FileWriter fw = new FileWriter("Visitors.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            for (int i = 0; i < FTProject.getInstance().VList.size(); i++) {
                bw.write(FTProject.getInstance().VList.get(i).getVId() + ",");
                bw.write(FTProject.getInstance().VList.get(i).getVName() + ",");
                bw.write(FTProject.getInstance().VList.get(i).getVCnic() + ",");
                bw.write(FTProject.getInstance().VList.get(i).getVContact() + ",");
                bw.write(FTProject.getInstance().VList.get(i).getVRelation() + "\n");
            }
            bw.flush();
            bw.close();
            fw.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, " Visitor's File Not Found");
        }
    }
    //read data guards

    public static void readDataGuards() {
        try {
            FileReader fr = new FileReader("Guards.txt");
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();
            while (line != null) {
                String[] token = line.split("/");
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

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Guard's File Not Found");
        }
    }
    // write data guards

    public static void writeDataGuards() {
        try {
            FileWriter fw = new FileWriter("Guards.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            for (int i = 0; i < FTProject.getInstance().GList.size(); i++) {
                bw.write(FTProject.getInstance().GList.get(i).getGID() + "/");
                bw.write(FTProject.getInstance().GList.get(i).getGName() + "/");
                bw.write(FTProject.getInstance().GList.get(i).getGAge() + "/");
                bw.write(FTProject.getInstance().GList.get(i).getGContact() + "/");
                bw.write(FTProject.getInstance().GList.get(i).getGAddress() + "/");
                bw.write(FTProject.getInstance().GList.get(i).getGTime() + "/");
                bw.write(FTProject.getInstance().GList.get(i).getGDutyHours() + "/");
                bw.write(FTProject.getInstance().GList.get(i).getGShift() + "\n");

            }
            bw.flush();
            bw.close();
            fw.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Guard's File Not Found");
        }
    }
    // read data of SickPrisoners

    public static void readDataSickPrisoners() {
        try {
            FileReader fr = new FileReader("SickPrisoners.txt");
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();
            while (line != null) {
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
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Sick Prisoner's File Not Found");
        }

    }
    // write data of Sick Prisoners in file

    public static void writeDataSickPrisoners() {
        try {
            FileWriter fw = new FileWriter("SickPrisoners.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            for (int i = 0; i < FTProject.getInstance().SickList.size(); i++) {
                bw.write(FTProject.getInstance().SickList.get(i).getDId() + ",");
                bw.write(FTProject.getInstance().SickList.get(i).p.getPName() + ",");
                bw.write(FTProject.getInstance().SickList.get(i).getGender() + ",");
                bw.write(FTProject.getInstance().SickList.get(i).p.getPSection() + ",");
                bw.write(FTProject.getInstance().SickList.get(i).getDName() + ",");
                bw.write(FTProject.getInstance().SickList.get(i).getDisease() + "\n");
            }
            bw.flush();
            bw.close();
            fw.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Sick Prisoner's File Not Found");
        }
    }
    // Read Data prisoners in file

    public static void readDataPrisoners() {
        try {
            FileReader fr = new FileReader("Prisoners.txt");
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();
            while (line != null) {
                String[] token = line.split("//");
                Prisoners p = new Prisoners();
                p.setFPId(token[0]);
                p.setName(token[1]);
                p.setPAge(Integer.parseInt(token[2]));
                p.setPGender(token[3]);
                p.setPAddress(token[4]);
                p.setPSection(token[5]);
                p.setRoom(Integer.parseInt(token[6]));
                p.setCDetails(token[7]);
                p.setDateIN(token[8]);
                p.setDateOUT(token[9]);

                FTProject.getInstance().PriList.add(p);
                line = br.readLine();

            }
            br.close();
            fr.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Prisoner's File Not Found");
        }

    }
    //Write data Prisoners in File

    public static void writeDataPrisoners() {
        try {
            FileWriter fw = new FileWriter("Prisoners.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            for (int i = 0; i < FTProject.getInstance().PriList.size(); i++) {
                bw.write(FTProject.getInstance().PriList.get(i).getPId() + "//");
                bw.write(FTProject.getInstance().PriList.get(i).getPName() + "//");
                bw.write(FTProject.getInstance().PriList.get(i).getPAge() + "//");
                bw.write(FTProject.getInstance().PriList.get(i).getPGender() + "//");
                bw.write(FTProject.getInstance().PriList.get(i).getPAddress() + "//");
                bw.write(FTProject.getInstance().PriList.get(i).getPSection() + "//");
                bw.write(FTProject.getInstance().PriList.get(i).getPRoom() + "//");
                bw.write(FTProject.getInstance().PriList.get(i).getCDetails() + "//");
                bw.write(FTProject.getInstance().PriList.get(i).getDateIN() + "//");
                bw.write(FTProject.getInstance().PriList.get(i).getDateOUT() + "\n");
            }
            bw.flush();
            bw.close();
            fw.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Prisoner's File Not Found");
        }

    }
// read data of jailors from file
    public static void readDataJailors()
    {
        try {
            FileReader fr = new FileReader("Jailors.txt");
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();
            while (line != null) {
                String[] token = line.split(",");
                Jailors j = new Jailors();
                j.setFJId(token[0]);
                j.setJName(token[1]);
                j.setJAge(Integer.parseInt(token[2]));
                j.setJGender(token[3]);
                j.setJContact(token[4]);
                j.setJAddress(token[5]);            
                j.setJUserName(token[6]);
                j.setJPassword(token[7]);

                FTProject.getInstance().JaiList.add(j);
                line = br.readLine();

            }
            br.close();
            fr.close();
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Jailor's File Not Found");
        }
    }
    // write data of jailors in file
    public static void writeDataJailors()
    {
        try
        {
            FileWriter fw = new FileWriter("Jailors.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            for (int i = 0; i < FTProject.getInstance().JaiList.size(); i++) {
                bw.write(FTProject.getInstance().JaiList.get(i).getJId() + ",");
                bw.write(FTProject.getInstance().JaiList.get(i).getJName() + ",");
                bw.write(FTProject.getInstance().JaiList.get(i).getJAge() + ",");
                bw.write(FTProject.getInstance().JaiList.get(i).getJGender() + ",");
                bw.write(FTProject.getInstance().JaiList.get(i).getJContact() + ",");
                bw.write(FTProject.getInstance().JaiList.get(i).getJAddress() + ",");
                bw.write(FTProject.getInstance().JaiList.get(i).getJUserName() + ",");
                bw.write(FTProject.getInstance().JaiList.get(i).getJPassword() + "\n");
                }
            bw.flush();
            bw.close();
            fw.close();
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Jailor's File Not Found");
        }
    }
     // write data in FIR File
    public static void writeDataFIR()
    {
        try {
            FileWriter fw = new FileWriter("FIR.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            for (int i = 0; i < FTProject.getInstance().FirList.size(); i++) {
                bw.write(FTProject.getInstance().FirList.get(i).getFirNumber() + "//");
                bw.write(FTProject.getInstance().FirList.get(i).getCName() + "//");                
                bw.write(FTProject.getInstance().FirList.get(i).getCFatherName() + "//");
                bw.write(FTProject.getInstance().FirList.get(i).getCNumber()+ "//");
                bw.write(FTProject.getInstance().FirList.get(i).getAddress() + "//");
                bw.write(FTProject.getInstance().FirList.get(i).getDistrictOfIncident() + "//");
                bw.write(FTProject.getInstance().FirList.get(i).getPoliceStation() + "//");
                bw.write(FTProject.getInstance().FirList.get(i).getSHOname() + "//");
                bw.write(FTProject.getInstance().FirList.get(i).getPlaceOfIncident() + "//");
                bw.write(FTProject.getInstance().FirList.get(i).getDetailsofIncident() + "//");
                bw.write(FTProject.getInstance().FirList.get(i).getDateOfIncident()+ "\n");
                }
            bw.flush();
            bw.close();
            fw.close();
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "FIR File Not Found");
        }
    }
     // read Data from FIR file
     public static void readDataFIR()
     {
         try {
              FileReader fr = new FileReader("FIR.txt");
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();
            while (line != null) {
                String[] token = line.split("//");
                FIR f = new FIR();
                f.setFFirNumber(token[0]);
                f.setName(token[1]);
                f.setFName(token[2]);
                f.setContact(token[3]);
                f.setAddress(token[4]);
                f.setDistrictOfIncident(token[5]);            
                f.setPoliceStation(token[6]);
                f.setSHOName(token[7]);
                f.setPOfIncident(token[8]);
                f.setDetailsofIncident(token[9]);
                f.setDateOfIncident(token[10]);
                

                FTProject.getInstance().FirList.add(f);
                line = br.readLine();

            }
            br.close();
            fr.close();
         }
          catch (Exception e) {
            JOptionPane.showMessageDialog(null, "FIR File Not Found");
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
        readDataPrisoners();
        readDataJailors();
        readDataFIR();
        Entrance start = new Entrance();
        start.setVisible(true);

    }

}
