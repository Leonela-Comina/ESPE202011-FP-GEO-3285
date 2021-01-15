
package hw03iterations;

public class HW03Iterations {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    int listn;
    
    listn= 1;
    
    System.out.println("==== this is a while loop from 1 to 15 ====");  
    
    while (listn<=15){
       System.out.println("listn number -> " + listn);
        
       listn++;
         
    }
    
   System.out.println("Multiplication tables : 15 ");
    
    int top=12;
    int product=0;
    int table = 15;
    for(int n=1 ; n<= top ; n++){
        product= table * n;
    
  System.out.println(" 15 * " + n + " = " + product);
    }
    
    int difference = 4;
    int initvalue = 6;
     int number;
    int finalvalue= 62;
    
    System.out.println("Arithmetic progression from 6 to 60 ");
    
    while (initvalue<=62){
        
    System.out.println( initvalue );
    
   initvalue += difference;
   
   
    }
    
    
    
    
  }
}
