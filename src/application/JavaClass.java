/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

/**
 *
 * @author Dell
 */
public class JavaClass {
    
    
   
    
    
    public static void main(String[] args) {
            
             
        int a =0;     
        JavaClass cl = new JavaClass();
        
        System.out.println("Number of occurences : " + cl.firstmethod());
        
        a = cl.secondmethod();
        char d = (char)a;
        
        System.out.println("Highest ASCII value " + d );
        
        System.out.println("Number of occurences : " + cl.thirdmethod());
        
        
    }
    
    public static int firstmethod()
    {
         String st = "Successfull";
        char ch = 'l';
        int i, c =0;
        
        for(i = 0 ; i < st.length() ; i ++ )
        {
            char ch2 = st.charAt(i);
            
            if(ch == ch2)
            {
                c++;
            }
        }
        return c;
        
    }
 
    
      public static int secondmethod()
      {
          
          char ch[] = {'a' , 'b' ,'c' } ;
          int max=0;
          for (int i = 0; i < ch.length; i++) {
              
              if(ch[i] >max)
              {
                   max=ch[i];
              }
              
          }
          
          char ch2 = (char)max;
          return max;
          
                    
        
      }
      
      public boolean thirdmethod()
      {
          String st = "Successfull";
          char ch = 'p';
          
          boolean b= false;
          for (int i = 0; i < st.length(); i++) {
              
              char ch2 =st.charAt(i);
              if(ch2 == ch)
                   b = true;
              
          }
          
          
         if(b == true)
             return true;
         else
             return false;
      }
      
      
}


 