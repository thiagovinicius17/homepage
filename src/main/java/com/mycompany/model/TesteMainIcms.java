/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.model;

import java.math.BigDecimal;

/**
 *
 * @author Thiago Vinicius
 */
public class TesteMainIcms {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal("1000.0"),"ICMS_MG");
        IcmsFactory icmsFactory = new IcmsFactory();
        BigDecimal resultado = icmsFactory.getIcmsPorEstado("ICMS_MG").calculoporRegiao(orcamento);
        System.out.println(resultado);
    }
    
}
