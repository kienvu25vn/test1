/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai4;

/**
 *
 * @author Admin
 */
import java.util.*;

public class News implements INews {

    private int id;
    private String title, publishDate, author, content;
    private float averageRate;
    
    public News(int id, String title, String publishDate, String author, String content) {
        this.id = id;
        this.title = title;
        this.publishDate = publishDate;
        this.author = author;
        this.content = content;
    }

    public void calculate(int arr[]) {
        this.averageRate = (float)(arr[0] + arr[1] + arr[2]) / 3;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public String getAuthor() {
        return author;
    }

    public String getContent() {
        return content;
    }

    public float getAverageRate() {
        return averageRate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void display() {
        System.out.println("Id: " + this.id + "\n"
                + "Title: " + this.title + "\n"
                + "PublishDate: " + this.publishDate + "\n"
                + "Author: " + this.author + "\n"
                + "Content: " + this.content + "\n"
                + "AverageRate: " + String.format("%.2f" , this.averageRate));
    }
}
