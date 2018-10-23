
//package stacks;
import java.util.ArrayList;

public class StackPostInFix {
    
    String [] chaineString;
    ArrayList<String> stack = new ArrayList<String>();
  
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
            //lorsque cest un operator( + , - , * ,/)
            int getindexlistString=i;
            String chainestack="";
            String operator=" "+chaineString[i]+" ";
            if(stack.size()>=2){
               int getlastIndexValueinList= stack.size()-1;
               int valuepreviewlastIndex=--getlastIndexValueinList;
                   
             String testchaine=stack.get(stack.size()-1);
             String testchaineprevie=stack.get(valuepreviewlastIndex);
             chainestack =  (++getindexlistString>=tablength)? testchaineprevie+operator+testchaine:"("+testchaineprevie+operator+testchaine+")";
             stack.set(valuepreviewlastIndex, chainestack);
               
               pop();
                      System.out.println("------ STACK PROCESS-------");
                for (String val : stack) {
                    
                    System.out.println(val);
                }  
            }
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
 System.out.println("");
 System.out.println("--------------  Résultat Final ------------");
 for (String infixresult : stack) {
     System.out.println(infixresult);
 }
}

}
