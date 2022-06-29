/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Bai3;

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
        System.out.println("Nhap canh: ");
        float canh = Float.parseFloat(in.nextLine());
        Square sq = new Square(canh);
        System.out.println("Do dai canh: " + sq.doDaiCanh());
        System.out.println("Chu vi: " + sq.chuVi());
        System.out.println("Dien tich: " + sq.dienTich());
        System.out.println("Thong tin: ");
        System.out.println(sq);
    }

}
