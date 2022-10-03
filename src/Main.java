import java.util.Scanner;

import static java.lang.Math.pow;

public class Main {
    public static void main(String[] args) {


        //Armstrong Sayı Nedir ?
        //N haneli bir sayının basamaklarının n’inci üstlerinin toplamı,
        // sayının kendisine eşitse, böyle sayılara Armstrong sayı denir.
        //Örneğin 407 sayısını ele alalım. (4^3)+ (0^3)+(7^3) = 64+0+343 = 407 sonucunu verir.
        // Bu da 407 sayısının armstrong bir sayı olduğunu gösterir.

        int number;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the number:");
        number = keyboard.nextInt();
        int counter=0;
        int flag=number;
        int enternumber=number;
        while(flag!=0){
            flag =flag/10;
            counter++;
        }
        System.out.println(counter+"\tbasamaklı bir sayı girdiniz.");

        int i;
        int sum=0;
        for(i=0;i<counter;i++){
            int rem;


            rem =number%10;
            sum += pow(rem,counter);
            number =number/10;

        }

        if(sum==enternumber){
            System.out.println("Bu sayı armstrong sayıdır.");
        }else
            System.out.println("Bu sayı armstrong sayı değildir.");





    }
}