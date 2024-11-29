/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main.facade;

/**
 *
 * @author User
 */
public class TiendaFacade {
    private SubsistemaA subsistemaA;
    private SubsistemaB subsistemaB;

    public TiendaFacade() {
        this.subsistemaA = new SubsistemaA();
        this.subsistemaB = new SubsistemaB();
    }

    public void realizarTransaccion() {
        subsistemaA.servicioA();
        subsistemaB.servicioB();
    }
}
