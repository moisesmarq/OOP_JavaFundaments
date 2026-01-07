package main.java;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import main.java.model.entities.Post;

public class Start {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        
        System.out.print("****** MENU ******");
        System.out.print("1 - Create a post ");
        System.out.print("2 - View the posts ");
        System.out.print("3 - Like a post ");
        System.out.print("4 - Comment a post ");
        System.out.print("******************");

        int option = scan.nextInt();


        if (option == 1){
            System.out.print("****** Create a post ******");
            System.out.println("Enter a post data: ");
            System.out.print("Title: ");
            String title = scan.next();
            System.out.print("Content: ");
            String content = scan.next();
            Post post = new Post(sdf.parse(LocalDateTime.now().toString()), title, content);
        }
        
        

        scan.close();
    }
}
