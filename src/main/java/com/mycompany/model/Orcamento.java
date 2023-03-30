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
public class Orcamento {
    public BigDecimal ValorOrcamento;
    public String IcmsRegiao;

    public Orcamento(BigDecimal ValorOrcamento, String IcmsRegiao) {
        this.ValorOrcamento = ValorOrcamento;
        this.IcmsRegiao = IcmsRegiao;
    }

    public BigDecimal getValorOrcamento() {
        return ValorOrcamento;
    }

    public void setValorOrcamento(BigDecimal ValorOrcamento) {
        this.ValorOrcamento = ValorOrcamento;
    }

    public String getIcmsRegiao() {
        return IcmsRegiao;
    }

    public void setIcmsRegiao(String IcmsRegiao) {
        this.IcmsRegiao = IcmsRegiao;
    }
    
   
    
}
