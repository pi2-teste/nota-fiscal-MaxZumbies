/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.sp.notafiscalmvc.controller;

/**
 *
 * @author lucas
 */
public class NotaFiscalController {
    
    private NotaFiscalController controller;
    
    public static boolean salvar(int numNota, double valorNota){
        System.out.println("agora estou no controller");
        System.out.println(numNota);
        System.out.println(valorNota);
        return true;
    }
}
