/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai3;

/**
 *
 * @author Admin
 */
import java.util.*;

public class Square {

    private float canh;

    public Square(float canh) {
        this.canh = canh;
    }

    public float doDaiCanh() {
        return this.canh;
    }

    public float chuVi() {
        return this.canh * 4;
    }

    public double dienTich() {
        return Math.pow(canh, 2);
    }

    public String toString() {
        return "Canh: " + this.canh + "\n"
                + "Chu vi: " + chuVi() + "\n"
                + "Dien tich: " + dienTich() + "\n";
    }
}
