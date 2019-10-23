package br.senac.sp.notafiscalmvc.model;

/**
 *
 * @author gabriel.max
 */
public class NotaFiscal {
    int numNota;
    String nomeProd;
    double valNota;
    
    public NotaFiscal() {
        System.out.println("\ninicializando um objeto do tipo NotaFiscal");
    }
    
    public int getNumNota() {
        return numNota;
    }

    public void setNumNota(int numNota) {
        System.out.print("O objeto nota recebeu um numero de nota:");
        System.out.println(numNota);
        this.numNota = numNota;
    }
    
    public String getNomeProd() {
        return nomeProd;
    }

    public void setNomeProd(String nomeProd) {
        System.out.print("O objeto nota recebeu um nome de produto:");
        System.out.println(nomeProd);
        this.nomeProd = nomeProd;
    }
    
    public double getValNota() {
        return valNota;
    }

    public void setValNota(double valNota) {
        System.out.print("O objeto nota recebeu um valor:");
        System.out.println(valNota);
        this.valNota = valNota;
    }
}