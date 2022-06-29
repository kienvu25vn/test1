/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Bai4;

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
        List<News> newList = new ArrayList<>();
        int t = 1;
        while (true) {
            int[] rateList = new int[3];
            System.out.println("--------------------------------------------");
            System.out.println("1-Insert news" + "\n"
                    + "2-View list news" + "\n"
                    + "3-Average rate" + "\n"
                    + "4-Exit");
            System.out.println("--------------------------------------------");
            System.out.println("Choose an option: ");
            String input = in.nextLine();
            if (input.equals("4")) {
                break;
            }
            switch (input) {
                case "1":
                    System.out.println("Enter a News:");
                    String title = in.nextLine();
                    String publishDate = in.nextLine();
                    String author = in.nextLine();
                    String content = in.nextLine();
                    System.out.println("Enter 3 rates:");
                    for (int i = 0; i < 3; i++) {
                        rateList[i] = Integer.parseInt(in.nextLine());
                    }
                    News news = new News(t++, title, publishDate, author, content);
                    news.calculate(rateList);
                    newList.add(news);
                    break;
                case "2":
                    for (News ns : newList) {
                        ns.display();
                    }
                    break;
                case "3":
                   for (News ns : newList) {
                        ns.display();
                    }
                    break;
                default:
                    throw new AssertionError();
            }
        }
    }

}
