/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main.decorator;

/**
 *
 * @author User
 */
public abstract class NotificableDecorator implements Notificable {
    protected Notificable wrapee;

    public NotificableDecorator(Notificable wrapee) {
        this.wrapee = wrapee;
    }

    @Override
    public void sendNotification() {
        wrapee.sendNotification();
    }
}
