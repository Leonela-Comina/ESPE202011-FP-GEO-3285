
package areahexagonfloat;


public class AreaHexagonFloat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    float area;
    float side;
    float apothem;
    
    side = (float) 1587.234;
    apothem = (float) (side/1.15);
    area= ((3*side)*apothem);
    
     System.out.println("the area of the hexagon which side is equal to " + side + 
            "u" + ", and, its apothem is equal to " + apothem + "u " + 
            " is equal to --> " + area + "u2 ");
         
        
    }
    
}
