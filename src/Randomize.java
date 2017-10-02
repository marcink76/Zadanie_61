import java.util.Random;

public class Randomize {
    public static int randomize(){
        Random random = new Random();
        int rand = random.nextInt(10);
        return rand;
    }
}
