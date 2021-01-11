
package areahexagonshort;


public class AreaHexagonShort {

   
    public static void main(String[] args) {
    
    short area;
    short side;
    short apothem;
    
    side= 8; 
    apothem= (short) (side/1.15);
    area= (short) ((3*side)*apothem);
    
    System.out.println("the area of the hexagon which side is equal to " 
            + side + "u" + ", and, its apothem is equal to " + apothem + "u " + 
            " is equal to --> " + area + "u2 ");
    
    
             
    }
    
}
