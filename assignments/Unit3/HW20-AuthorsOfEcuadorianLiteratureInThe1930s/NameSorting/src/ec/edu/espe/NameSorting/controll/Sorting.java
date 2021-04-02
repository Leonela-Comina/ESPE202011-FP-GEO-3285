/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.NameSorting.controll;

/**
 *
 * @author BIOSTAR
 */
public class Sorting {
    
    public int [] sortByBubbleSort(int[] names){
        int n = names.length;
        int temp;
        
        for(int i= 0; i<n-1;i++){
            for(int j= 0; j<n-i-1;j++)
            if(names[j]>names[j+1]){
                
                temp=names[j];
                names[j] = names[j+1];
                names[j+1]= temp;
            }
        }
     
        return names;
    }  
        
}    
     
        
}    
     
    
    

