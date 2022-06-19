package ucgenHipotenusBulma;

import java.util.Scanner;

public class ucgenHipotenusBulma {

    public static void main(String[] args) {
        double a;
        double b;
        double hipotenus;

        Scanner input = new Scanner(System.in);

        System.out.print("A kenarinin uzunluğunu giriniz: ");
        a = input.nextInt();

        System.out.print("B kenarinin uzunluğunu giriniz: ");
        b = input.nextInt();


        hipotenus = Math.sqrt((a*a)+(b*b));
        System.out.print("Hipotenus uzunlugu: ");
        System.out.println(hipotenus);
    }
}
