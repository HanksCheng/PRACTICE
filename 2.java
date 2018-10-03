import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int a=scn.nextInt();
        int b=scn.nextInt();
        int A1=a+b;
        int A2=a*b;
        int A3=a-b;
        int A4=a/b;
        int A5=a%b;
        System.out.println(a+"+"+b+"="+A1);
        System.out.println(a+"*"+b+"="+A2);
        System.out.println(a+"-"+b+"="+A3);
        System.out.println(a+"/"+b+"="+A4+"..."+A5);
    }
}
