/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main.factory;

/**
 *
 * @author User
 */
public class TarjetaBasicaFactory extends TarjetaCreditoFactory {
    @Override
    public TarjetaCredito crearTarjetaCredito() {
        return new TarjetaBasica();
    }
}