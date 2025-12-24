import java.util.Scanner;

public class Calender {
    public static void findDay(){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Month number(1-12):");
        int m=input.nextInt();

        System.out.println("Enter day Number:");
        int d=input.nextInt();

        System.out.println("Enter year:");
        int y=input.nextInt();

        int yo = y - (14 - m) / 12;

        int x=yo+ yo/4- yo/100 + yo/400;

        int mo = m + 12 * ((14 - m) / 12) - 2;

        int hh = (d +x + (31*mo) / 12) % 7;

        if(hh==0){
            System.out.println("Day of week is : "+ hh + ", Sunday");

        }else if(hh==1){
            System.out.println("Day of week is : "+ hh + ", Monday");

        }else if(hh==2){
            System.out.println("Day of week is : "+ hh + ", Tuesday");

        }else if(hh==3){
            System.out.println("Day of week is : "+ hh + ", Wednesday");

        }else if(hh==4){
            System.out.println("Day of week is : "+ hh + ", Thursday");

        }else if(hh==5){
            System.out.println("Day of week is : "+ hh + ", Friday");

        }else{
            System.out.println("Day of week is : "+ hh + ", Saturday");
        }
       


    }
    public static void main(String[] args) {
        Calender.findDay();
    }

}
