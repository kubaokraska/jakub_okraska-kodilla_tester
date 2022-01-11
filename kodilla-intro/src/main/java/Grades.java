public class Grades {

    public int[] grades;
    public int size;


    public Grades(){
        this.grades=new int[500];
        this.size=0;
    }

    public void add (int value) {
        if (this.size == 500) {
            return;
        }
        this.grades[this.size] = value;
        this.size++;
    }

    public int showLast () {
        return this.grades[this.size-1];
    }

    public int returnAverage(){
        int counter = 0;
        for(int i=0;i<this.size;i++){
            counter=counter + this.grades[i];

        }

        return (counter / this.size);



    }

    public void printGrades (){
        for(int i=0;i<this.size;i++){
            System.out.println(this.grades[i]);
        }



    }








}


