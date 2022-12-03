import java.util.Scanner;
public class dairealanıcevresi {
    public static void main(String[] args) {
        int r;
        double pi=3.14;
        Scanner girdiler = new Scanner(System.in);
        System.out.print("Dairenin yarı çapını yazınız:");
        r =girdiler.nextInt();

        double alan=pi*r*r;
        double cevre=2*pi*r;
        System.out.println("Daire Alanı:  "+ alan);
        System.out.println("Daire Çevresi: "+ cevre);





}
}