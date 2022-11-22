/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projectphone;

/**
 *
 * @author WIN 11
 * Maria Astri T
 * 21103056
 * S1SI-05-C
 */
public class Xiaomi implements Phone {
    private int volume;
    private boolean isPowerOn;
    
    public Xiaomi(){
        this.volume = 25;
    }
    
    public void powerOn(){
        isPowerOn = true;
        System.out.println("Handphone Menyala....");
        System.out.println("Selamat Datang di XIOMI");
        System.out.println("Android version 11");
    }
    
    public void powerOff(){
        isPowerOn = false;
        System.out.println("Handphone Dimatikan");
    }
    
    public int getVolume(){
        return this.volume;
    }
    
    public void volumeUp(){
        if(isPowerOn){
            if(this.volume == MAX_VOLUME){
                System.out.println("Volume Full!!");
                System.out.println("Sudah "+this.getVolume());
            }else{
                this.volume += 10;
                System.out.println("Volume sekarang : "+this.getVolume());
            }
        }else{
            System.out.println("Silahkan Nyalakan Handphone Anda...");
        }
    }
    
    public void volumeDown(){
        if(isPowerOn){
            if(this.volume == MIN_VOLUME){
                System.out.println("Volume = 0");
            }else{
                this.volume -= 10;
                System.out.println("Volume Sekarang : "+this.getVolume());
            }
        }else{
            System.out.println("Silahkan Nyalakan Handphone Anda...");
        }
    }
}
