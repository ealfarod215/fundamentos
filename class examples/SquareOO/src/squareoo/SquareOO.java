package squareoo;

public class SquareOO {

    public static void main(String[] args) {
        Square square1 = new Square(5);
        Square square2 = new Square(15);
        
        square1.draw('.');
        System.out.println();
        
        square1.draw('*');
        System.out.println();
        
        square1.draw('+');
        System.out.println();
        
        square2.draw('#');
    }
    
}
