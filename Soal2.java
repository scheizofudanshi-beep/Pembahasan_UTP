package ASPRAK.Bahas_UTS;

import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) {
        // Ketik kode kalian di sini...
        Scanner in = new Scanner(System.in);
        
        int muchAct = in.nextInt(); //banyak aksi
        int muchHP = in.nextInt(); //banyak HP boss
        int elCount = 0; //menghitung banyak elemental reaction
        int missCount = 0; //menghitung banyak miss (Anemo & Geo)

        String[] elOne = new String[muchAct];
        String[] elTwo = new String[muchAct];
        
        for(int i=0; i<muchAct; i++){
            elOne[i] = in.next();
            elTwo[i] = in.next();
        }
        
        for(int i=0; i<muchAct; i++){
            if(elOne[i].equals("Abyss") || elTwo[i].equals("Abyss")){
                System.out.println("Shield Activated! Battle Ended!");
                break; //langsung keluar dari for loop, tidak menjalankan kode selanjutnya lagi
            } else if((elOne[i].equals("Anemo") && elTwo[i].equals("Geo")) || (elTwo[i].equals("Anemo") && elOne[i].equals("Geo"))){
                //kondisi harus lengkap agar tidak terjadi error
                System.out.println("Serangan Meleset!");
                missCount += 1;
                continue;
            } else if((elOne[i].equals("Pyro") && elTwo[i].equals("Cryo")) || (elTwo[i].equals("Pyro") && elOne[i].equals("Cryo"))){
                System.out.println("Melt DMG: 2000");
                elCount += 1;
                muchHP -= 2000;
            } else if((elOne[i].equals("Pyro") && elTwo[i].equals("Hydro")) || (elTwo[i].equals("Pyro") && elOne[i].equals("Hydro"))){
                System.out.println("Vaporize DMG: 1500");
                elCount += 1;
                muchHP -= 1500;
            } else if(elOne[i].equals(elTwo[i]) || elTwo[i].equals(elOne[i])){
                //gunakan .equals() untuk pembandingan nilai dari dua string
                System.out.println("Serangan Lemah DMG: 500");
                muchHP -= 500;
            } else{
                //tidak perlu kondisi sesuai arahan soal
                //karena semua kondisi yang harus ditandakan sudah dicek di atas
                System.out.println("Normal DMG: 1000");
                muchHP -= 1000;
            }
            
            if(muchHP>0){
                System.out.println("Sisa HP Boss: " + muchHP);
            } else{
                System.out.println("Boss sudah dikalahkan!");
                break; //keluar dari for loop
            }
        }
        
        System.out.print("HASIL: ");
        
        if(muchHP<=0){ //boss sudah mati atau belum
            if(elCount>=1){ //ada reaksi elemental atau tidak
                if(missCount == 0){ //miss atau tidak
                    System.out.println("BINTANG 3");
                } else{
                    System.out.println("BINTANG 2");
                }
            } else{
                System.out.println("BINTANG 1");
            }
        } else{
            System.out.println("GAGAL");
        }
    }
}
