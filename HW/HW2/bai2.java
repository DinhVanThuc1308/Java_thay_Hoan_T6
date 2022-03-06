import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class bai2 {
    public static int[][] create2DIntMatrixFromFile(String filename) throws Exception {
        int[][] matrix = null;

        // If included in an Eclipse project.
        InputStream stream = ClassLoader.getSystemResourceAsStream(filename);
        BufferedReader buffer = new BufferedReader(new InputStreamReader(stream));

        // If in the same directory - Probably in your case...
        // Just comment out the 2 lines above this and uncomment the line
        // that follows.
        //BufferedReader buffer = new BufferedReader(new FileReader(filename));

        String line;
        int row = 0;
        int size = 0;

        while ((line = buffer.readLine()) != null) {
            String[] vals = line.trim().split("\\s+");

            // Lazy instantiation.
            if (matrix == null) {
                size = vals.length;
                matrix = new int[size][size];
            }

            for (int col = 0; col < size; col++) {
                matrix[row][col] = Integer.parseInt(vals[col]);
            }

            row++;
        }

        return matrix;
    }

    public static void printMatrix(int[][] matrix) {
        String str = "";
        int size = matrix.length;

        if (matrix != null) {
            for (int row = 0; row < size; row++) {
                str += " ";
                for (int col = 0; col < size; col++) {
                    str += String.format("%2d",  matrix[row][col]);
                    if (col < size - 1) {
                        str += " | ";
                    }
                }
                if (row < size - 1) {
                    str += "\n";
                    for (int col = 0; col < size; col++) {
                        for (int i = 0; i < 4; i++) {
                            str += "-";
                        }
                        if (col < size - 1) {
                            str += "+";
                        }
                    }
                    str += "\n";
                } else {
                    str += "\n";
                }
            }
        }

        System.out.println(str);
    }

    public static void main(String[] args) {
        int[][] matrix = null;

        try {
            matrix = create2DIntMatrixFromFile("input.txt");
        } catch (Exception e) {
            e.printStackTrace();
        }

        printMatrix(matrix);
    }
}
