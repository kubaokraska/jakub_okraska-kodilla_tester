public class FirstClass {


    public static void main(String[] args) {
      Notebook notebook = new Notebook(600,601,1975);
        Notebook heavyNotebook= new Notebook(2100,500,2017);
        Notebook oldNotebook = new Notebook (900,1200,1986);

        printCheckPriceWeight(notebook);
        printCheckPriceWeight(heavyNotebook);
        System.out.println(oldNotebook.weight + "g " + oldNotebook.price);
        oldNotebook.checkPrice();
        oldNotebook.checkWeight();
        oldNotebook.checkYAP();

    Grades grade = new Grades();

    /*int x=5;

        grade.add(x);
        grade.add(3);
        grade.add(5);
        grade.add(5);


       grade.printGrades();
       System.out.println(grade.showLast());
       System.out.println(grade.returnAverage());

*/






    }

    private static void printCheckPriceWeight(Notebook notebook) {
        System.out.println(notebook.weight + "g " + notebook.price);
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.checkYAP();
    }
}