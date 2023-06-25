import java.sql.SQLOutput;
import java.util.Scanner;

public class RectangleInfo {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double width;
        double length;
        double area;
        double diagonal;
        length=0;
        width=0;
        String trashOne;
        String trashTwo;
        boolean done = false;
        System.out.println("Please enter the length of your rectangle:");
        do
        {
            if (in.hasNextDouble()) {
                width = in.nextDouble();
                in.nextLine();
                done = true;

            }else{
                trashOne=in.nextLine();
                System.out.println("You said your width was: "+trashOne);
                System.out.println("Invalid entry, try again!: ");}
        }while(!done);


        System.out.println("Please enter the width of your rectangle:");

        do
        {
            if (in.hasNextDouble()) {
                length = in.nextDouble();
                in.nextLine();
                done = true;

            }else{
                trashTwo=in.nextLine();
                System.out.println("You said your length was: " +trashTwo);
                System.out.println("Invalid entry, try again!: ");}
        }while(!done);
       area=length*width;
       diagonal=Math.sqrt((length*length)+(width*width));
        System.out.println("The area of your rectangle is: "+area);
        System.out.println("The diagonal of your rectangle is: "+diagonal);

    }
}
