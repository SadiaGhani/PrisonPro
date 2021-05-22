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
public class FTProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FAdd fa = new FAdd();
        fa.setVisible(true);
        
        FView fv = new FView();
        fv.setVisible(true);
        
        FDelete fd = new FDelete();
        fd.setVisible(true);
        
        PAdd pa = new PAdd();
        pa.setVisible(true);
        
        PUpdate pu = new PUpdate();
        pu.setVisible(true);
        
        PDelete pd = new PDelete();
        pd.setVisible(true);
        
        PSearch ps = new PSearch();
        ps.setVisible(true);
        
        AWork aw = new AWork();
        aw.setVisible(true);
        
        DAdd da = new DAdd();
        da.setVisible(true);
        
        // TODO code application logic here
    }
    
}
