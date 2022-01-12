import java.util.Random;

public class RandomNumbers {
    static int max = 0;
    static int min = 30;

    public static void main(String[] args) {

        Random r = new Random();

        int result = 0;

        while (result < 5000) {
            System.out.println("Max number= "+ max);
            System.out.println("Min number= " + min);

            int temp= 0; //zmienna tymczasowa
            temp = r.nextInt(31);
            getMax(temp);
            getMin(temp);

            result +=temp;

            System.out.println("Max number= "+ max);
            System.out.println("Min number= " + min);
        }

        System.out.println("Suma= " + result);
        System.out.println("Najwieksza wartosc= " + max);
        System.out.println("Najmniejsza wartosc= " + min);
    }

    public static void getMax(int number) {
        if (number > max) {
            max = number;
        }
    }

    public static void getMin(int number) {
        if (number < min) {
            min = number;
        }
    }
}