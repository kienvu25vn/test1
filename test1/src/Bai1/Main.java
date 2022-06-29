/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Bai1;

/**
 *
 * @author Admin
 */
import java.util.*;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        double delta;
        while (true) {
            System.out.println("Nhap a:");
            float a = Float.parseFloat(in.nextLine());
            System.out.println("Nhap b:");
            float b = Float.parseFloat(in.nextLine());
            System.out.println("Nhap c:");
            float c = Float.parseFloat(in.nextLine());
            delta = Math.pow(b, 2) - 4 * a * c;
            if (delta < 0) {
                System.out.println("Invalid!");
                continue;
            } else {
                System.out.println("Can delta: " + String.format("%.2f",Math.sqrt(delta)));;
                break;
            }
        }

    }

}
