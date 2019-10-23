/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.sp.notafiscalmvc.controller;

import br.senac.sp.notafiscalmvc.DAO.NotaFiscalDAO;
import br.senac.sp.notafiscalmvc.model.NotaFiscal;

/**
 *
 * @author lucas
 */
public class NotaFiscalController {
    
    private NotaFiscalController controller;
    
    public static boolean salvar(int numNota, double valorNota){
        System.out.println("agora estou no controller");
        System.out.println("número da nota: "+numNota);
        System.out.println("valor da nota: "+valorNota);
        
        NotaFiscal nota = new NotaFiscal();
        nota.setValNota(valorNota);
        nota.setNumNota(numNota);
        
        NotaFiscalDAO dao = new NotaFiscalDAO();
        dao.addNota(nota);
        
        return true;
    }
}
