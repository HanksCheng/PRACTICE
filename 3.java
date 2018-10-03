import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        int h=scn.nextInt();
        int m=scn.nextInt();
        int h2=scn.nextInt();
        int m2=scn.nextInt();
        int FUCK=h2*60-h*60+m2-m;
        if (FUCK<=240){

            System.out.println(120+160+((FUCK-240)/30)*60);
        }else if(FUCK>=120&&FUCK<=240){
            int money2=(Tt/30)*40;
            System.out.println(money2);
        }else{
            int money3 = (Tt / 30) * 60;
            System.out.println(money3);
        }
    }
}
