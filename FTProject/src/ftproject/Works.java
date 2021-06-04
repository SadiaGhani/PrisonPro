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
public class Works extends Prisoners {
    private String PId;
    private String task;
    private String status;
    private String feedback;
    @Override
    public String  GeneratePID()
    {
        String s = "PW-";
        Random rand = new Random();
        for(int i = 0 ; i < 3 ; i++)
        {
            s +=rand.nextInt(9)+1;
                  }
            
         this.PId = s;   
        
        return s;
    }
    
    @Override
    public void setPId()
    {
        String id = GeneratePID();
        this.PId = id;
        
    }

    @Override
    public String getPId() {
        return PId;
    }
    
     public boolean setPTask(String task)
  {
      boolean flag = false;
      if(task.equals("Cleaning") ||task.equals("Cooking")|| task.equals("Wood Work")|| task.equals("Planting") || task.equals("Stone Work"))
      {
        
          this.task = task;
          flag = true;
      }
      return flag;
  }

    public String getTask() {
        return task;
    }
      public boolean setStatus( String status)
    {
        boolean flag = false;
        int size = status.length();
         for(int i=0; i<size; i++)
    {
      if((status.charAt(i)>='A' &&status.charAt(i)<='Z') ||( status.charAt(i)>='a' && status.charAt(i)<='z' )|| status.charAt(i)==' ')
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
        this.status= status;
    }
    
    return flag;   
    }

    public String getStatus() {
        return status;
    }
   
     public boolean setFeedback(String feedback)
  {
      boolean flag = false;
      if(feedback.equals("*") ||feedback.equals("**")|| feedback.equals("***")|| feedback.equals("****") || feedback.equals("*****"))
      {
        
          this.feedback = feedback;
          flag = true;
      }
      return flag;
  }
    public String getFeedback() {
        return feedback;
    }

}
