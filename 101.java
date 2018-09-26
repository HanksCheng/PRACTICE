import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner chr=new Scanner(System.in);
        System.out.println("輸入要轉換之字元:");
        char ch=chr.next().charAt(0);
        System.out.println("轉換成ASCII碼.....");
        System.out.println("ASCII碼為:"+(int)ch);
    }
}
