public class Main {

    public static void main(String[] args) {

        int[] array = new int[10];
        int[] mirrorArray = new int[10];
        int count;
        int count2 = mirrorArray.length - 1;
        int count3 = 0;

        for (count = 0; count < array.length + mirrorArray.length; count++) {
            if (count <= array.length - 1) {
                array[count] = Randomize.randomize();
                System.out.println(array[count]);
            }
            if (count > array.length - 1) {
                mirrorArray[count2] = array[count3];
                System.out.println(mirrorArray[count3]);
                count3++;
                count2--;
            }
        }
    }
}
