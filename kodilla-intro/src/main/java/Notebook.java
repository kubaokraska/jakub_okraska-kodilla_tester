public class Notebook {
    int weight;
    int price;
    int year;

    public Notebook(int weight,int price,int year){
this.weight=weight;
this.price=price;
this.year=year;


    }

    public void checkPrice(){
        if(this.price <=600){
            System.out.println("This notebook is cheap.");
        }
        else if (this.price> 600 && this.price<1000){
            System.out.println("This price is good");
        }
        else {
            System.out.println("This notebook is expensive");
        }

        }

    public void checkWeight(){
        if(this.weight<=700){
            System.out.println("This is light");
        }
        else if(this.weight>800 && this.weight<1000){
            System.out.println("This is normal weight");
        }
        else{
            System.out.println("This is overweight");
        }


    }

    public void checkYAP(){
        if(this.price<700 && this.year<1976){
            System.out.println("This book is cheap and old ");
        }
        else if((this.price>=700 && this.price<1300) && this.year>=1976){
            System.out.println("This book has good price and nice year ");
        }
else{
        System.out.println("Whatever. Who cares");
        }

    }

    }





