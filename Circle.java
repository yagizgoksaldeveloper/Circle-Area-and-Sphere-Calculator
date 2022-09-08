import java.util.Scanner;
public class Circle {
    public static void main(String[] args) {
        int radius, a;
        double sphere, area, sectorArea;
        Scanner input = new Scanner(System.in);

        System.out.print("Dairenin yarıçapını giriniz. ");
        radius = input.nextInt(); //Dairenin yarıçapı kullanıcı tarafından alınır.

        sphere = 2 * Math.PI * radius; //Dairenin çevresini hesaplar.
        System.out.println(sphere);

        area = Math.PI * radius * radius; //Dairenin alanını hesaplar.
        System.out.println(area);

        //Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan program.
        System.out.println("Dairenin yarıçapını giriniz. ");
        radius = input.nextInt();

        System.out.println("Dairenin merkez açı ölçüsünü giriniz.");
        a = input.nextInt();

        sectorArea = (Math.PI * radius * radius * a) / 360;
        System.out.println(sectorArea);

    }
}
