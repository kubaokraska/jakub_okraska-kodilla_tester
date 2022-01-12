public class User {
    private String name;
    private int year;

    public User(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public static void main(String[] args) {
        User kasia = new User("Kasia", 20);
        User basia = new User("Basia", 12);
        User jola = new User("Jolanta", 40);
        User agata = new User("Agata", 52);
        User czesia = new User("Czeslawa", 82);
        User mira = new User("Mira", 1);
        User kuba = new User("Jakub", 27);

        User[] users = {kasia, basia, jola, agata, czesia, mira, kuba};

        int counter = 0;
        int aver = 0;
        for (int i = 0; i < users.length; i++) {
            counter = counter + users[i].year;
        }

        aver = counter / users.length;

        for (int i = 0; i < users.length; i++) {
            if (users[i].year < aver) {
                System.out.println(users[i].name + ". He/She is -> " + users[i].year + ". Average year is -> " + aver);
            }
        }
    }
}