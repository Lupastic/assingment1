import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File file= new File("C:\\Users\\begim\\IdeaProjects\\assingment1\\src\\coordinates");
        Scanner scan = new Scanner(file);
        shape shape = new shape();


        while(scan.hasNextLine()){
            double x = scan.nextDouble();
            double y = scan.nextDouble();

            shape.addPoint(new point(x,y));
        }

        System.out.println("Perimeter: " + shape.calculatePerimeter() );
        System.out.println("Longest: " + shape.getLongest());
        System.out.println("Average Side: " + shape.getAverageSide());


    }
}