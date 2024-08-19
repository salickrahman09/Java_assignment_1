public class logical_ope {
    public static void main(String[] args) { 
   
   
        int a = 5; 
        int b = 10; 
        int c = 15; 
 
         
        int sum1 = a + b;  
        int sum2 = b + c;  
 
        // Logical AND (&&) 
        System.out.println("sum1 == 15 && sum2 == 25: " + (sum1 == 15 && sum2 == 25));
  
 
        // Logical OR (||) 
        System.out.println("sum1 == 20 || sum2 == 25: " + (sum1 == 20 || sum2 == 25)); 
 
 
        // Logical NOT (!) 
        System.out.println("!(sum1 == 15): " + !(sum1 == 15));  
        System.out.println("!(sum2 == 20): " + !(sum2 == 20));  
 
        // Logical XOR (^) 
        System.out.println("(sum1 == 15) ^ (sum2 == 20): " + ((sum1 == 15) ^ (sum2 == 20)));
   
 } 
}
