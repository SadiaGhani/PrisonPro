/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ftproject;

/**
 *
 * @author Mask
 */
public class Jailors {
    
    public String JName;
    public String JContact;
    public String JAddress;
    public String JUserName;
    public String JPassword;
    public String JGender;
    public int JAge;

    //setters and getters
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
            
            if(JContact.charAt(i)>=0&&JContact.charAt(i)<=9)
            {
                        
                this.JContact = JContact;
                f = true;
            }
            
        }
            
          }

       return f;
    }

    public String getJAddress() {
        return JAddress;
    }

    public boolean setJAddress(String JAddress) {
        boolean f = false;
         int size = JAddress.length();
        for(int i = 0 ; i< size ; i++)
        {
            if((JAddress.charAt(i)>='a'&&JAddress.charAt(i)<='z')||(JAddress.charAt(i)>='A'&&JAddress.charAt(i)<='Z')||JAddress.charAt(i)==' ')
            {
                        
                this.JAddress = JAddress;
                f = true;
            }
            
        }


       return f;
    }

    public String getJUserName() {
        return JUserName;
    }

    public boolean setJUserName(String JUserName) {
        boolean f = false;
         int size = JUserName.length();
        for(int i = 0 ; i< size ; i++)
        {
            if((JUserName.charAt(i)>='a'&&JUserName.charAt(i)<='z')||(JUserName.charAt(i)>='A'&&JUserName.charAt(i)<='Z')||JUserName.charAt(i)==' ')
            {
                        
                this.JUserName = JUserName;
                f = true;
            }
            
        }


       return f;
        
    }

    public String getJPassword() {
        return JPassword;
    }

    public boolean setJPassword(String JPassword) {
        boolean f = false;
         int size = JPassword.length();
        for(int i = 0 ; i< size ; i++)
        {
            if((JPassword.charAt(i)>='a'&&JPassword.charAt(i)<='z')||(JPassword.charAt(i)>='A'&&JPassword.charAt(i)<='Z')||JPassword.charAt(i)==' '||(JPassword.charAt(i)>=0&&JPassword.charAt(i)<=9))
            {
                        
                this.JPassword = JPassword;
                f = true;
            }
            
        }


       return f;
    }

    public String getJGender() {
        return JGender;
    }

    public boolean setJGender(String JGender) {
        boolean f = false;
        if(JGender=="male"||JGender=="female"||JGender=="Male"||JGender=="Female")
        {
            this.JGender = JGender;
            f = true;
        }
        
                   
       return f;
    }

    public int getJAge() {
        return JAge;
    }

    public boolean setJAge(int JAge) {
      boolean f = false;
      if(JAge>=16&&JAge<=75)
      {
          this.JAge=JAge;
          f = true;
      }
        
       return f;
    }
    
}
