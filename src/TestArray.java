import java.util.Arrays;
import java.util.Random;

public class TestArray {

    public static void main(String[] args) {

       /* Random r = new Random();

        int minBound = 0;
        int maxBound = 100;*/

        //move size to separate variables, not to duplicate this values;
        int size1 = 10;
        int size2 = 20;

        int[][] array1 = new int[size1][size2];
        int[][] array2 = new int[size1][size2];
        int[][] array3 = new int[size1][size2];

        for (int i = 0; i < size1; i++) {
            for (int j = 0; j < size2; j++) {
                //try create separate method public static int getRandomValue(int min, int max);
                array1[i][j] = Rand.getRandomValue(0, 100);
                array2[i][j] = Rand.getRandomValue(0, 100);
                array3[i][j] = array2[i][j] * array1[i][j];

            }
        }

        for (int i = 0; i < array1.length; i++) {
            System.out.println(Arrays.toString(array1[i]));
        }

        System.out.println();

        for (int i = 0; i < array2.length; i++) {
            System.out.println(Arrays.toString(array2[i]));
        }

        System.out.println();

        for (int i = 0; i < array3.length; i++) {
            System.out.println(Arrays.toString(array3[i]));
        }
    }
}

