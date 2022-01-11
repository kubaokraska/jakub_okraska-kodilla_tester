import java.util.Random;
public class RandomNumbers {

    public static void main(String[] args) {
      Grades tab= new Grades();
        Random r = new Random();
        int max=0;
        int min=30;
        int result = 0;

        while (result < 5000) {
          tab.add(r.nextInt(31));
          result= result+tab.showLast();


        }

     for(int i=0;i<tab.size;i++) {
         if (max < tab.grades[i]) {
             max = tab.grades[i];
         }
         else if(min > tab.grades[i]){
             min=tab.grades[i];
         }


     }
        System.out.println("Ilość elementów tablicy= "+ tab.size);
        System.out.println("Suma= "+ result);
        System.out.println("Najwieksza wartosc= " + max);
        System.out.println("Najmniejsza wartosc= "+ min);


    }


}





