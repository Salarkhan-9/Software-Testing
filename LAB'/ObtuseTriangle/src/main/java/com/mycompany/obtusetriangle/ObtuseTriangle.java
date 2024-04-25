

package com.mycompany.obtusetriangle;

import java.util.Scanner;

public class ObtuseTriangle {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        System.out.println("----Drawing Obtuse Triangle---- ");
        System.out.print("Enter Angle 1 : ");
        int angle1 = scanner.nextInt();
        System.out.print("Enter Angle 2 : ");
        int angle2 = scanner.nextInt();
        System.out.print("Enter Angle 3 : ");
        int angle3 = scanner.nextInt();
        int result = angle1 + angle2 + angle3;
        if (angle1 < 0 || angle2 < 0 || angle3 < 0) {
            System.out.println("Angle's Can't be negative in Triangle ");
        } else if (result > 90 && result < 180) {
            System.out.println("Your Triangle is Obtuse-triangle.");
        } else {
            System.out.println("Your Triangle is NOT Obtuse-triangle.");
        }
        scanner.close();
    }
}

