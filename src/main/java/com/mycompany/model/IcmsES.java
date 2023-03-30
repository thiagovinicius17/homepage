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
public class IcmsES  implements CalculoporRegiao{
    @Override
    public BigDecimal calculoporRegiao(Orcamento orcamento){
        return orcamento.getValorOrcamento().multiply(new BigDecimal("0.12"));
    }    
}
