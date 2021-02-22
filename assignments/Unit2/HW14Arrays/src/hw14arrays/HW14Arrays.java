package hw14arrays;

import java.util.Scanner;

/**
 *
 * @author Leonela_Comina
 */
public class HW14Arrays {
public static void main(String[]args) { 
    
    int[]salaries;
    String[]professionsSalary = {"Doctor","Enginner","Teacher"};
    
     Scanner input = new Scanner(System.in);
        int n;
        System.out.println(" ******* ENTER YOUR SALARY ******* ");
        n =   input.nextInt();
     
        salaries = new int [n];
         for (int i = 0; i < n; i++) {
            System.out.print("THE SALARY IS -->"  + (i + 1));
                    
             salaries[i] = input.nextInt();
                    
             
        }

        for (int salary1 : salaries){
            System.out.println("THE SALARY IS -->" + salary1);
        }

       

       for (String salary :professionsSalary){
            System.out.println("Professions" + professionsSalary );
            
           
        }
       
      
    
    
        
        


    }
}  


