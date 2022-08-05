package by.tms.java.lesson18.time_api;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input e-mail : ");
        String email = scanner.next();

        Pattern pattern = Pattern.compile("^[a-zA-Z]\\w+@\\w+\\.(org|com)");
        Matcher matcher = pattern.matcher(email);
        if (matcher.find()) {
            System.out.println("Input correct e-mail.");
        } else {
            System.out.println("Input not true e-mail,repeat again.");
        }


        Pattern pattern2 = Pattern.compile("0[xX][0-9a-fA-F]+\\b");
        Matcher matcher2 = pattern2.matcher("0X1G2 fsd 10X1G2 fsdf 0X1f asdfasd 0x12 sfgasdf 0XAB asdf 1x24F asdf df 0TaC");
        while (matcher2.find()) {
            System.out.println(matcher2.group());
        }
    }
}
