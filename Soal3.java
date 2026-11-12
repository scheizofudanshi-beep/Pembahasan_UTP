
import java.util.Scanner;

public class Dekoder{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int genap = 0;
        int ganjil = 0;
        int prima = 0;

        int banyak = in.nextInt();

        if(banyak == 0){
            System.out.println("Data Kosong");
            return;
        }

        int[] angka = new int[banyak];

        for (int i = 0; i < banyak; i++) {
            angka[i] = in.nextInt();
        }

        for (int k = 0; k < banyak; k++) {
            int i;

            if(banyak % 2 == 0){
                i = banyak - 1 - k;
            } else{
                i = k;
            }

            boolean isPrima = true;

            if(angka[i] % 2 != 0){
                System.out.print(angka[i] + " = Ganjil");
                ganjil++;
            } else{
                System.out.print(angka[i] + " = Genap");
                genap++;
            }

            for(int j = 2; j < angka[i]; j++){
                if(angka[i] % j == 0){
                    isPrima = false;
                    break;
                }
            }

            if(isPrima && angka[i] > 1){
                System.out.print(" & Prima");
                prima++;
            }

            System.out.println();
        }

        System.out.println("|--------------------|");
        System.out.printf("%-7s: %d\n", "Genap", genap);
        System.out.printf("%-7s: %d\n", "Ganjil", ganjil);
        System.out.printf("%-7s: %d\n", "Prima", prima);
        System.out.println("|--------------------|");
    }
}
