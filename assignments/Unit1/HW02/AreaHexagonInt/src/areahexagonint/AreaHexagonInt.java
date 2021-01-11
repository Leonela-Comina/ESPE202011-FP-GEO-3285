
package areahexagonint;

public class AreaHexagonInt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    int area;
    int side;
    int apothem;
    
    side = 7568;
    apothem = (int) (side/1.15);
    area = (int) ((3*side)*apothem);
    
    System.out.println("the area of the hexagon which side is equal to " + side + 
            "u" + ", and, its apothem is equal to " + apothem + "u " + 
            " is equal to --> " + area + "u2 ");
    
    
            
            
        
    }
    
}
