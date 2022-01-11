public class LeapYear {

   static void rokPrz(int year) {

        int bufor = 1;

        while (bufor == 1) {
            if (year % 400 == 0) {

                System.out.println("Rok przestepny");
                bufor = 0;

            } else if (year % 4 == 0) {

                System.out.println("Rok przestepny");
                bufor = 0;
            } else
                System.out.println("Rok nieprzestepny");
            bufor = 0;


        }

    }


    public static void main(String[] args) {

    }
}
