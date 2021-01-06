
public class MagicSquareFactory {

    public MagicSquare createMagicSquare(int size) {

        MagicSquare square = new MagicSquare(size);

        // implement the creation of a magic square with the Siamese method algorithm here
        int n = size * size;
        int row = 0;
        int col = 0;
        int y = 0;
        int x = (int) size / 2;
        
        for (int i = 1; i <= n; i++) {
            if (i > 1) {
                //vertaa aiempaan, löydä uusi x ja y
                System.out.println("");
                System.out.println("i: " + i);
                System.out.println("col: " + col);
                System.out.println("row: " + row);
                x += 1;
                y -= 1;
                if (y < 0) {
                    y = size -1;
                }
                if (x > size -1) {
                    x = 0;
                }
                System.out.println("x: " + x);
                System.out.println("y: " + y);
                if (square.readValue(x, y) != 0) {
                    x = col;
                    y = row + 1;
                }
                    
                

            }
            //asetetaan
            System.out.println("placing: " + x + ", " + y);
            square.placeValue(x, y, i);
            row = y;
            col = x;
        }
        
        return square;
    }

}
