
package squareoo;

public class Square {
    private final int sideSize;
    
    public Square(int size) {
        sideSize = size;
    }
    
    public void draw(char symbol) {
        for (int rowCounter = 0; rowCounter < sideSize; rowCounter++) {
            if (rowCounter == 0 || rowCounter == sideSize - 1) {
                printFullLine(symbol);
            } else {
                printEmptyLine(symbol);
            }
            System.out.print("\n");
        }
    }
    
    private void printFullLine(char symbol) {
        for (int columnCounter = 0; columnCounter < sideSize; columnCounter++) {
            System.out.print(symbol + " ");
        }
    }
    
    private void printEmptyLine(char symbol) {
        System.out.print(symbol + " ");
        for (int columnCounter = 0; columnCounter < sideSize - 2; columnCounter++) {
            System.out.print("  ");
        }
        System.out.print(symbol + " ");
    }
}
