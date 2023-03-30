/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.model;

/**
 *
 * @author Thiago Vinicius
 */
public class IcmsFactory {
    public CalculoporRegiao getIcmsPorEstado(String nomeEstado){
        if(nomeEstado.equalsIgnoreCase("ICMS_MG")){
            return new IcmsMG();      
        }else if(nomeEstado.equalsIgnoreCase("ICMS_SP")){
            return new IcmsSP();
        }else if(nomeEstado.equalsIgnoreCase("ICMS_RJ")){
            return new IcmsRJ();
        }else if(nomeEstado.equalsIgnoreCase("ICMS_ES")){
            return new IcmsES();
        }else{
            return null;
        }       
    }
}
