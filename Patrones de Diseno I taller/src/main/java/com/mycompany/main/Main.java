/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main;

/**
 *
 * @author User
 */
import com.mycompany.main.factory.*;
import com.mycompany.main.facade.VirtualCare;
import com.mycompany.main.decorator.*;

public class Main {
    public static void main(String[] args) {
        // Ejemplo de uso del patrón Factory Method
        System.out.println("Ejemplo de Factory Method:");
        
        TarjetaCreditoFactory basicaFactory = new TarjetaBasicaFactory();
        TarjetaCredito tarjetaBasica = basicaFactory.crearTarjetaCredito();
        System.out.println("Tipo: " + tarjetaBasica.getTipo() + ", Costo Anual: " + tarjetaBasica.getCostoAnual() + ", Limite de Credito: " + tarjetaBasica.getLimiteCredito());

        TarjetaCreditoFactory premiumFactory = new TarjetaPremiumFactory();
        TarjetaCredito tarjetaPremium = premiumFactory.crearTarjetaCredito();
        System.out.println("Tipo: " + tarjetaPremium.getTipo() + ", Costo Anual: " + tarjetaPremium.getCostoAnual() + ", Limite de Credito: " + tarjetaPremium.getLimiteCredito());

        TarjetaCreditoFactory vipFactory = new TarjetaVIPFactory();
        TarjetaCredito tarjetaVIP = vipFactory.crearTarjetaCredito();
        System.out.println("Tipo: " + tarjetaVIP.getTipo() + ", Costo Anual: " + tarjetaVIP.getCostoAnual() + ", Limite de Credito: " + tarjetaVIP.getLimiteCredito());

        System.out.println("\nEjemplo de Facade:");
        VirtualCare virtualCare = new VirtualCare();

        System.out.println("Customer interacting with VirtualCare:");
        virtualCare.transaction1();

        System.out.println("\nEjemplo de Decorator:");
        Notificable notification = new Notification();

        Notificable whatsappNotification = new WhatsAppDecorator(notification);
        Notificable signalNotification = new SignalDecorator(whatsappNotification);
        Notificable wireNotification = new WireDecorator(signalNotification);
        Notificable telegramNotification = new TelegramDecorator(wireNotification);

        telegramNotification.sendNotification();
        
    }
}