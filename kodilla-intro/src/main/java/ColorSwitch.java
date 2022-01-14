import java.util.Scanner;

public class ColorSwitch {
    private static String getter;

    public static String getColor() {
        Scanner scan = new Scanner(System.in);
        getter = "0";
        String result = "0";
        System.out.println("Please write down first letter of your color");
        getter = scan.nextLine();

        switch (getter) {
            case "b":
                System.out.println("black");
                result = "black";
                break;
            case "y":
                System.out.println("yellow");
                result = "yellow";
                break;
            case "r":
                System.out.println("red");
                result = "red";
                break;
            case "p":
                System.out.println("purple");
                result = "purple";
                break;
            case "g":
                System.out.println("green");
                result = "green";
                break;
            case "w":
                System.out.println("white");
                result = "white";
                break;
            default:
                System.out.println("Please write down again");
        }
        return result;
    }
}
