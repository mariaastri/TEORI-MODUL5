/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.projectphone;

/**
 *
 * @author WIN 11
 * Maria Astri T
 * 21103056
 * S1SI-05-C
 */
import java.util.Scanner;
public class ProjectPhone {

    public static void main(String[] args) {
        Phone redmi12Lite = new Xiaomi();
        Phone iPhone11 = new iPhone();
        Phone GalaxyA32 = new Samsung();
        Phone OppoA57 = new Oppo();
        PhoneUser k = new PhoneUser(redmi12Lite);
        PhoneUser l = new PhoneUser(iPhone11);
        PhoneUser m = new PhoneUser(GalaxyA32);
        PhoneUser n = new PhoneUser(OppoA57);
        Scanner input = new Scanner(System.in);
        int aksi;
        int pilihan;
        
        do{
            System.out.println("");
            System.out.println("\t--------------------------");
            System.out.println("\t--- APLIKASI INTERFACE ---");
            System.out.println("\t--------------------------\n");
            System.out.println("Pilihan Phone : ");
            System.out.println("[1] Xiomi");
            System.out.println("[2] iPhone");
            System.out.println("[3] Samsung");
            System.out.println("[4] Oppo");
            System.out.println("[0] Keluar");
            System.out.println("Silahkan Masukkan Pilihan Anda : ");
            pilihan = input.nextInt();
            System.out.println("");
            switch (pilihan){
                case 1  : 
                    do{
                        System.out.println("");
                        System.out.println("\t=== XIAOMI ===");
                        System.out.println("[1] Nyalakan HP");
                        System.out.println("[2] Matikan Hp");
                        System.out.println("[3] Perbesar Volume");
                        System.out.println("[4] Kecilkan Volume");
                        System.out.println("[5] Ganti HP");
                        System.out.println("[0] Exit");
                        System.out.println("Masukkan Pilihan Anda : ");
                        aksi = input.nextInt();
                        switch (aksi){
                            case 1 :
                                k.turnOnThePhone();
                                break;
                            case 2 :
                                k.turnOffThePhone();
                                break;
                            case 3 :
                                k.makeVolumeUp();
                                break;
                            case 4 :
                                k.makeVolumeDown();
                                break;
                            case 0 :
                                System.exit(0);
                                break;
                            default :
                                System.out.println("");
                            }
                        }while(aksi != 5);
                        break;
                        
                case 2 :
                    do{
                        System.out.println("");
                        System.out.println("\t=== IPHONE ===");
                        System.out.println("[1] Nyalakan HP");
                        System.out.println("[2] Matikan Hp");
                        System.out.println("[3] Perbesar Volume");
                        System.out.println("[4] Kecilkan Volume");
                        System.out.println("[5] Ganti HP");
                        System.out.println("[0] Exit");                        
                        System.out.println("Masukkan Pilihan Anda : ");
                        aksi=input.nextInt();
                        switch (aksi){
                            case 1 :
                                l.turnOnThePhone();
                                break;
                            case 2 :
                                l.turnOffThePhone();
                                break;
                            case 3 :
                                l.makeVolumeUp();
                                break;
                            case 4 :
                                l.makeVolumeDown();
                                break;
                            case 0 :
                                System.exit(0);
                                break;
                            default :
                                System.out.println("");   
                            }
                        }while(aksi != 5);   
                        break;
            
                case 3 :
                    do{
                        System.out.println("");
                        System.out.println("\t=== SAMSUNG ===");
                        System.out.println("[1] Nyalakan HP");
                        System.out.println("[2] Matikan Hp");
                        System.out.println("[3] Perbesar Volume");
                        System.out.println("[4] Kecilkan Volume");
                        System.out.println("[5] Ganti HP");
                        System.out.println("[0] Exit");
                        System.out.println("Masukkan Pilihan Anda : ");
                        aksi=input.nextInt();
                        switch (aksi){
                            case 1 :
                                m.turnOnThePhone();
                                break;
                            case 2 :
                                m.turnOffThePhone();
                                break;
                            case 3 :
                                m.makeVolumeUp();
                                break;
                            case 4 :
                                m.makeVolumeDown();
                                break;
                            case 0 :
                                System.exit(0);
                                break;
                            default :
                                System.out.println("");   
                            }
                        }while(aksi != 5);   
                        break;
                case 4 :
                    do{
                        System.out.println("");
                        System.out.println("\t=== OPPO ===");
                        System.out.println("[1] Nyalakan HP");
                        System.out.println("[2] Matikan Hp");
                        System.out.println("[3] Perbesar Volume");
                        System.out.println("[4] Kecilkan Volume");
                        System.out.println("[5] Ganti HP");
                        System.out.println("[0] Exit");
                        System.out.println("Masukkan Pilihan Anda : ");
                        aksi=input.nextInt();
                        switch (aksi){
                            case 1 :
                                n.turnOnThePhone();
                                break;
                            case 2 :
                                n.turnOffThePhone();
                                break;
                            case 3 :
                                n.makeVolumeUp();
                                break;
                            case 4 :
                                n.makeVolumeDown();
                                break;
                            case 0 :
                                System.exit(0);
                                break;
                            default :
                                System.out.println("");   
                            }
                        }while(aksi != 5);   
                        break;
                        
                case 0 :
                    System.exit(0);
                    break;
                    
                default :
                    System.out.println("Pilihan yang Anda Masukkan Salah");
            }
        }while(pilihan != 0);
    }
}
