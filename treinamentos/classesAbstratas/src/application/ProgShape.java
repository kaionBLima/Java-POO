package application;

import entities.Shape;
import enums.Colors;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import entities.Rectangle;
import entities.Circle;

public class ProgShape {

    public static void main (String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Shape> list = new ArrayList<>();

        System.out.print("Enter the number of shapes: ");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++){
            System.out.println("Shape #" + i + " data:");
            System.out.print("Rectangle or Circle(r/c): ");
            char c = sc.next().charAt(0);
            System.out.print("Color (BLACK, BLUE, RED): ");
            Colors color = Colors.valueOf(sc.next());

            if (c == 'r') {
                System.out.print("Width: ");
                double width = sc.nextDouble();
                System.out.print("Height: ");
                double height = sc.nextDouble();
                list.add(new Rectangle(color, width, height));
            } else {
                System.out.print("Raio:");
                double raio = sc.nextDouble();
                list.add(new Circle(color, raio));
            }

        }
        System.out.println();

        System.out.println("Shape areas: ");
        for (Shape shape : list) {
            System.out.println(String.format("%.2f", shape.area()));
        }
        sc.close();
    }
}
