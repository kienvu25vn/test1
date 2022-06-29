/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Bai2;

/**
 *
 * @author Admin
 */
import java.util.*;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static int count(int chiSo) {
        if (chiSo <= 25) {
            return chiSo * 1000;
        } else if (chiSo <= 75) {
            return (chiSo - 25) * 1250 + 25 * 1000;
        } else if (chiSo <= 150) {
            return (chiSo - 75)  * 1800 + 50 * 1250 + 25 * 1000;
        } else {
            return (chiSo - 150 ) * 2500 + 75 * 1800 + 50 * 1250 + 25 * 1000;
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        System.out.println("Nhap chi so dien: ");
        int chiSo = Integer.parseInt(in.nextLine());
        System.out.println("Tien dien: " + count(chiSo));
    }

}
