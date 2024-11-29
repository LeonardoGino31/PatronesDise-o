/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main.facade;

/**
 *
 * @author Gino Leonardo
 */
public class VirtualCare {
    private SubSystem1 subSystem1;
    private SubSystem2 subSystem2;
    private SubSystem3 subSystem3;

    public VirtualCare() {
        subSystem1 = new SubSystem1();
        subSystem2 = new SubSystem2();
        subSystem3 = new SubSystem3();
    }
    
    public void transaction1() {
        System.out.println("Executing Transaction 1:");
        subSystem1.connectionByInternet();
        subSystem2.verifyNumber();
        subSystem3.receiveMessage();
    }

    public void transaction2() {
        System.out.println("Executing Transaction 2:");
        subSystem1.connectionByPhone();
        subSystem2.verifyId();
        subSystem3.save();
    }

    public void transaction3() {
        System.out.println("Executing Transaction 3:");
        subSystem1.connectionByMessage();
        subSystem2.verifyIP();
        subSystem3.notifyUser();
    }

    public void operation() {
        System.out.println("Performing a general operation:");
        subSystem1.connectionByInternet();
        subSystem2.verifyNumber();
        subSystem3.save();
    }
}
