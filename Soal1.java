import java.util.Scanner;
public class Soal1{
    public static void main(String[] args){
        // Ketik kode kalian di sini...
        Scanner in = new Scanner(System.in);
        int muchPesanan = in.nextInt();
        int workerLevel = in.nextInt();
        int upah = 0;
        
        switch(workerLevel){ //cek level pekerja
            case 1:
                upah = 30000 + (1000*muchPesanan);
                break;
            case 2:
                upah = 50000 + (1500*muchPesanan);
                break;
            case 3:
                upah = 75000 + (2000*muchPesanan);
                break;
            default:
                break;
        }
        
        if(muchPesanan>=0 && muchPesanan % 2 == 0){ //bonus apabila ada pesanan dan jumlah pesanan merupakan bilangan genap
            upah += 100000;
        }
        
        System.out.println(upah);
    }
}
