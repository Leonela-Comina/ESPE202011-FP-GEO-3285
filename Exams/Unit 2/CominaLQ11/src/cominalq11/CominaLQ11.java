
package cominalq11;

import java.util.Scanner;

/**
 *
 * @author Leonela_Comina
 */
public class CominaLQ11 {
 public static void main(String[] args) {
   
     int [][] sum ;
     String [][] arraysum;
     int addend1 = 0;
     int addend2 = 0;
     int addend3 = 0;
     int addend4 = 0;
     int addend5 = 0;
    
     
     Scanner input = new Scanner(System.in);
     System.out.println("Enter five whole numbers");
     System.out.println("number 1 -->");
     addend1= input.nextInt();
     System.out.println("number 2 -->");
     addend2= input.nextInt();
     System.out.println("number 3 -->");
     addend3= input.nextInt();
     System.out.println("number 4 -->");
     addend4= input.nextInt();
     System.out.println("number 5 -->");
     addend5= input.nextInt();
     
     sum = new int [addend1][addend2];
  
     sum = readTheNumbersEntered(addend1, addend2);
     
          

    
   
        
        }
public static int [][] readTheNumbersEntered(int addend1,int addend2 ){
    int [][] sum;
    sum = new int [addend1][addend2];
   for(int i=0; i< addend1; i++){
            
        for(int j=0; j< addend2; j++){
            
        }
        }
        return sum;
    
}

}
     

      
