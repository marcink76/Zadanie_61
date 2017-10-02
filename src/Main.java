import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int[] array = new int[10];
        int[] mirrorArray = new int[10];
        int count = 0;
        int count2 = mirrorArray.length - 1;
        int count3 = 0;

        for (count = 0; count < array.length + mirrorArray.length; count++) {
            if (count <= 9) {
                array[count] = Randomize.randomize();
                System.out.println(count + " " + array[count]);
            }
            if (count > 9) {
                mirrorArray[count2] = array[count3];
                System.out.println(count3 + " " + mirrorArray[count3]);
                count3++;
                count2--;
            }
        }
        for (int temp : array) {
            System.out.print(temp);

        }
        for (int temp : mirrorArray) {
            System.out.print(temp);
        }


    }
}
