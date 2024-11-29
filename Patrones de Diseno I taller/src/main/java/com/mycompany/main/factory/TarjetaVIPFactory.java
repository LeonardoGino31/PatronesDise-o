/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main.factory;

import com.mycompany.main.factory.TarjetaCreditoFactory;

/**
 *
 * @author User
 */
public class TarjetaVIPFactory extends TarjetaCreditoFactory {
    @Override
    public TarjetaCredito crearTarjetaCredito() {
        return new TarjetaVIP();
    }
}
