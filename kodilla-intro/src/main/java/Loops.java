import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public class Loops {


    public static void main (String [] arg) {

        int[] number = new int[]{1, 2, 3, 4};
       System.out.println(sumNumbers(number));



    }



    public static int sumNumbers(int @NotNull [] numbers) {
        int result = 0;
        for (int i = 0; i < numbers.length; i++) {
            result = result + numbers[i];
        }
        return result;
    }

}



