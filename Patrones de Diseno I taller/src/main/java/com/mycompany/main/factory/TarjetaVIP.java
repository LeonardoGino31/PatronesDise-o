/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main.factory;

/**
 *
 * @author User
 */
public class TarjetaVIP implements TarjetaCredito {
    @Override
    public String getTipo() {
        return "VIP";
    }

    @Override
    public double getCostoAnual() {
        return 200.0;
    }

    @Override
    public double getLimiteCredito() {
        return 5000.0;
    }
}
