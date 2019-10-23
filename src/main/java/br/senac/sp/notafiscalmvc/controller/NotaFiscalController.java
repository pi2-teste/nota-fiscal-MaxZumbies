package br.senac.sp.notafiscalmvc.controller;

import br.senac.sp.notafiscalmvc.DAO.NotaFiscalDAO;
import br.senac.sp.notafiscalmvc.model.NotaFiscal;

/**
 *
 * @author gabriel.max
 */
public class NotaFiscalController {
    
    private NotaFiscalController controller;
    
    public static boolean salvar(int numNota, String nomeProd, double valorNota){
        System.out.println("\nAgora estou no controller");
        System.out.println("Número da nota: "+numNota);
        System.out.println("Nome do produto: "+nomeProd);
        System.out.println("Valor da nota: "+valorNota);
        
        NotaFiscal nota = new NotaFiscal();
        nota.setValNota(valorNota);
        nota.setNomeProd(nomeProd);
        nota.setNumNota(numNota);
        
        NotaFiscalDAO dao = new NotaFiscalDAO();
        dao.addNota(nota);
        
        return true;
    }
}
