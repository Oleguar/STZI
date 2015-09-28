package info.teib.lab.oleguar.lab1;
// created by Olegh Lazoryk 27.09.15//
import java.util.Scanner;
public class RandomGame {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);/*задаємо екземпляр класу Scanner*/
        boolean a = true;/*задаємо булеву змінну а*/

        int n = 100;
        int m = n/2;
        System.out.println("Ваше число "+m+" ?");/*перша ітерація*/

        do{
            String command = sc.nextLine();
            if(command.contains("more")){/*якщо наше число більше за запропоноване то викликаємо функцію plus*/
                System.out.println("your number is " + plus());
            }
            if(command.contains("less")){/*якщо наше число менше за запропоноване то викликаємо функцію minus*/
                System.out.println("your number is "+ minus());
                a=false;
            }
            if(!command.contains("less")||!command.contains("more")){
                System.out.println("please, write a proper commandddddd");
            }
        }while(a==true);/*змінна а необхідна щоб завершити цикл*/

    }
    public static int plus(){
        Scanner sc = new Scanner(System.in);
        int n=100;
        int m=n/2;
        boolean end = false;
        do{
            int k = (n+m)/2;
            System.out.println("your number is "+k+" ?");
            String command = sc.nextLine();
            if(command.contains("more")){
                m=(n+m)/2;/*якщо наше число більше за запропоноване то m надається значення попереднього k*/
            }
            if(command.contains("less")){
                n=(n+m)/2;/*якщо наше число більше за запропоноване то n надається значення попереднього k*/
            }
            if(command.contains("gotcha")){/*якщо наше число дорівнює запропонованому цикл закінчується і функція повертає */
                end=true;/*значення k */
                return k;
            }

        }while(end==false);
        return 0;
    }
    public static int minus(){
        Scanner sc = new Scanner(System.in);
        int n=0;
        int m=50;
        boolean end = false;
        do{
            int k =(n+m)/2;
            System.out.println("your number is "+k+" ?");
            String command = sc.nextLine();
            if(command.contains("more")){
                n=(n+m)/2;
            }
            if(command.contains("less")){
                m=(n+m)/2;
            }
            if(!command.contains("less")||!command.contains("more")){
                System.out.println("please, write a proper command");
            }
            if(command.contains("gotcha")){
                end=true;
                return k;
            }
        }while(end==false);
        return 0;
    }
}

