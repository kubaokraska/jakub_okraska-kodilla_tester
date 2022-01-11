public class FirstClass {


    public static void main(String[] args) {
        Notebook notebook = new Notebook(600,601,1975);
        Notebook heavyNotebook= new Notebook(2100,500,2017);
        Notebook oldNotebook = new Notebook (900,1200,1986);
        System.out.println(notebook.weight + "g " + notebook.price);
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.checkYAP();
       System.out.println(heavyNotebook.weight+"g " +heavyNotebook.price);
       heavyNotebook.checkPrice();
       heavyNotebook.checkWeight();
       heavyNotebook.checkYAP();
      System.out.println(oldNotebook.weight+"g " + oldNotebook.price);
      oldNotebook.checkPrice();
      oldNotebook.checkWeight();
      oldNotebook.checkYAP();




    }
}