public class unary_ope {
    public static void main(String[] args) { 
   
        int x = 10; 
              int y = -5; 
      
              // Unary Plus 
              System.out.println("+x: " + (+x));  
              // Unary Minus 
              System.out.println("-y: " + (-y));  
              // Pre-increment 
              System.out.println("++x: " + (++x));  
      
              // Post-increment 
              System.out.println("x++: " + (x++));  
              System.out.println("x after post-increment: " + x);  
      
              // Pre-decrement 
              System.out.println("--x: " + (--x));  
      
              // Post-decrement 
              System.out.println("x--: " + (x--));  
              System.out.println("x after post-decrement: " + x);  
      
              // Bitwise Complement 
              System.out.println("~y: " + (~y));  
      
      } 
}
