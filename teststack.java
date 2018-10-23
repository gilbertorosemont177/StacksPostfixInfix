//package stacks;
public class teststack {
    
    
    public static void main(String args[]){
     
        StackPostInFix stackpostinfix= new StackPostInFix("15 7 1 1 + - / 3 * 2 1 1 + + -");
     stackpostinfix.start();
     stackpostinfix.PrintresultInfix();
       
        
    }
  
}