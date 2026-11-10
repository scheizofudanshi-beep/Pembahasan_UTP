package ASPRAK.Bahas_UTS;

import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) {
        // Ketik kode kalian di sini...
        Scanner in = new Scanner(System.in);
        
        int muchAct = in.nextInt();
        int muchHP = in.nextInt();
        int elCount = 0;
        int missCount = 0;
        
        if(muchAct >= 1 && muchAct <=100){
            
        }


        String[] elOne = new String[muchAct];
        String[] elTwo = new String[muchAct];
        
        for(int i=0; i<muchAct; i++){
            elOne[i] = in.next();
            elTwo[i] = in.next();
        }
        
        for(int i=0; i<muchAct; i++){
            if(elOne[i].equals("Abyss") || elTwo[i].equals("Abyss")){
                System.out.println("Shield Activated! Battle Ended!");
                break;
            } else if((elOne[i].equals("Anemo") && elTwo[i].equals("Geo")) || (elTwo[i].equals("Anemo") && elOne[i].equals("Geo"))){
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
                System.out.println("Serangan Lemah DMG: 500");
                muchHP -= 500;
            } else{
                System.out.println("Normal DMG: 1000");
                muchHP -= 1000;
            }
            
            if(muchHP>0){
                System.out.println("Sisa HP Boss: " + muchHP);
            } else{
                System.out.println("Boss sudah dikalahkan!");
                break;
            }
        }
        
        System.out.print("HASIL: ");
        
        if(muchHP<=0){ //boss sudah mati
            if(elCount>=1){ //ada reaksi elemental
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
