import java.util.Scanner;

class exp1{
    public static void main(String[] args) {
        Scanner nameScanner = new Scanner(System.in);
        String name = nameScanner.nextLine();
        int num = 0;
        for (int i = 0; i < name.length(); i++) {
            char ch;
            ch = name.charAt(i);
            num++;
            System.out.println(ch + " " + num + ": " + (int)ch);
        }
}}