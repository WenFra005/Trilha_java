package OperadorTenário;
public class OperadorTenário {
      
    public static void main(String[] args) {
         //forma normal
         int a, b;
         a = 5;
         b = 6;
             String resultadox = "";
         if(a==b)
             resultadox = "verdadeiro";
         else
             resultadox = "falso";
         System.out.println(resultadox);
 
         //forma ternária
         int c, d;
         c = 5;
         d = 5;
         
         String resultadoy = c==d ?"verdadereiro" : "falso";
 
         System.out.println(resultadoy);
    }
}

