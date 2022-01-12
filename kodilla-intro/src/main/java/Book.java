public class Book {
    private String author;
    private String title;


    public static Book of (String author, String title){
        Book book= new Book();
        book.title=title;
        book.author=author;

        return book;
    }

    public void print(){
        System.out.println(author);
        System.out.println(this.title); // yyyyyyyy????????????



    }

}
