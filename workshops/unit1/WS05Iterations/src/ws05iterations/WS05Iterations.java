
package ws05iterations;

/**
 *
 * @author BIOSTAR
 */
public class WS05Iterations {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
    int i;
    
    i = 0;
    
    System.out.println("==== this is a while loop from 1 to 10 ====");
    
    while (i<10){
       System.out.println("i ->" + i);
          //i += 1;
          i++;
          //i= i + 1;
        }
    System.out.println("first 5 even numbers ");
     i = 2;
    while (i<=10){
       System.out.println("i -> is even ");
     i += 2; 
    }
    
    System.out.println("first 5 odd numbers ");
     i = 2;
     
    for(int j=1 ; j<10 ; j+=2){
       System.out.println("odd number " + j);
     i += 2; 
    }
    
    int stop;
    
    stop = 10;
    
    for(int j=1 ; j< stop ; j+=2){
       System.out.println("odd number " + j);
     i += 2; 
    }
    
    System.out.println("Multiplication tables : 7 ");
    
    int top=12;
    int product=0;
    int table = 7;
    for(int j=1 ; j<= top ; j++){
        product= table * j;
    
    System.out.println(" 7 * " + j + " = " + product);
        
    }
  }
}
