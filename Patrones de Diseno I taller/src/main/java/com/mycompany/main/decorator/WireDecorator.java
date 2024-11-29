/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main.decorator;

/**
 *
 * @author User
 */
public class WireDecorator extends NotificableDecorator {
    public WireDecorator(Notificable wrapee) {
        super(wrapee);
    }

    @Override
    public void sendNotification() {
        super.sendNotification();
        sendWireNotification();
    }

    private void sendWireNotification() {
        System.out.println("Enviando notificacion via Wire.");
    }
}

