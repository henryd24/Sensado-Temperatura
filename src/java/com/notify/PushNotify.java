/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.notify;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Henry Daniel
 */
public class PushNotify {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        while (true) {
            try {
                System.out.println("Que más pues");
                Thread.sleep(5000);
            } catch (InterruptedException ex) {
                Logger.getLogger(PushNotify.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
