/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ftproject;

/**
 *
 * @author MASTER COMPUTERS
 */
public class Details {
    
    private String JName;
    private String JContact;
    private int JAge;
    
     public String getJName() {
        return JName;
    }

    public boolean setJName(String JName) {
        boolean f = false;
        int size = JName.length();
        for(int i = 0 ; i< size ; i++)
        {
            if((JName.charAt(i)>='a'&&JName.charAt(i)<='z')||(JName.charAt(i)>='A'&&JName.charAt(i)<='Z')||JName.charAt(i)==' ')
            {
                        
                this.JName = JName;
                f = true;
            }
            
        }
     return f;
    }
    
     public String getJContact() {
        return JContact;
    }

    public boolean setJContact(String JContact) {
         boolean f = false;
        int size = JContact.length();
        if(size==11)
            {
        for(int i = 0 ; i< size ; i++)
        {
            
            if(JContact.charAt(i) >=  '0' && JContact.charAt(i) <= '9');
            {
                        
                this.JContact = JContact;
                f = true;
            }           
        }            
          }

       return f;
    }
    
     public int getJAge() {
        return JAge;
    }

    public boolean setJAge(int JAge) {
      boolean f = false;
      if(JAge  >= 18 &&  JAge <= 75)
      {
          this.JAge=JAge;
          f = true;
      }
        
       return f;
    }
    
}
