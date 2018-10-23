

import java.util.ArrayList;

public class StackPostInFix {
    
    String [] chaineString;
    ArrayList<String> stack = new ArrayList<String>();
    int index=0;
    public Stack(String inputvalue){
        chaineString=inputvalue.split(" ");

    }
    private void push(String s){
     
       stack.add(s);
    }
    private void pop(){
    
        int HeadIndexInList= stack.size()-1;
        stack.remove(HeadIndexInList);
    }
   public void start(){
            
           int i=0;    
           int tablength=chaineString.length;    
           
           
             while( i< tablength ){
                 if(letterOrNumber(chaineString[i])){
                     push(chaineString[i]);
               }
               else{
                  
              }
                    i++;
           }
    } 
    private boolean letterOrNumber(String checkValue)  

        {  
            try  
            {  
                double value = Double.parseDouble(checkValue);  
        }  
            catch(Exception erreur)  
        {  
          return false;  
        }  
            return true;  
    }
    public void PrintresultInfix(){
        
        for (String infixresult : stack) {
            System.out.println(infixresult);
        }
    }
    
}
