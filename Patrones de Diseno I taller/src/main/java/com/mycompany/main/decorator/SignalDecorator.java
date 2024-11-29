/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main.decorator;

/**
 *
 * @author User
 */
public class SignalDecorator extends NotificableDecorator {
    public SignalDecorator(Notificable wrapee) {
        super(wrapee);
    }

    @Override
    public void sendNotification() {
        super.sendNotification();
        sendSignalNotification();
    }

    private void sendSignalNotification() {
        System.out.println("Enviando notificacion via Signal.");
    }
}

