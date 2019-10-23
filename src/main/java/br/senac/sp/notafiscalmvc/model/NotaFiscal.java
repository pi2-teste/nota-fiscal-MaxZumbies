package br.senac.sp.notafiscalmvc.model;

/**
 *
 * @author gabriel.max
 */
public class NotaFiscal {
    double valNota;
    int numNota;
    
    public NotaFiscal() {
        System.out.println("inicializando um objeto do tipo NotaFiscal");
    }
    
    public double getValNota() {
        return valNota;
    }

    public void setValNota(double valNota) {
        System.out.print("O objeto nota recebeu um valor:");
        System.out.println(valNota);
        this.valNota = valNota;
    }

    public int getNumNota() {
        return numNota;
    }

    public void setNumNota(int numNota) {
        System.out.print("O objeto nota recebeu um numero de nota:");
        System.out.println(numNota);
        this.numNota = numNota;
    }
    
    
}