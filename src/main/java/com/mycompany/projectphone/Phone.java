/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.projectphone;

/**
 *
 * @author WIN 11
 * Maria Astri T
 * 21103056
 * S1SI-05-C
 */
public interface Phone {
    int MAX_VOLUME = 100;
    int MIN_VOLUME = 0;
    
    void powerOn();
    void powerOff();
    void volumeUp();
    void volumeDown();
}
