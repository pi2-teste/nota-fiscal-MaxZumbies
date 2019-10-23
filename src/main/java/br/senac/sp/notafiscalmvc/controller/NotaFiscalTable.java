package br.senac.sp.notafiscalmvc.controller;

/**
 *
 * @author gabriel.max
 */

import br.senac.sp.notafiscalmvc.DAO.NotaFiscalDAO;
import br.senac.sp.notafiscalmvc.model.NotaFiscal;
import javax.swing.table.AbstractTableModel;

public class NotaFiscalTable extends AbstractTableModel {
    private String[] columnNames = {"Número da nota","Descrição Produto","Valor"};

    public int getColumnCount() {
        return 3;
    }

    public int getRowCount() {
        //implementar metodo
        return NotaFiscalDAO.conta();
    }

    public String getColumnName(int col) {
        return columnNames[col];
    }

    public Object getValueAt(int row, int col) {
        //implementar metodo
        NotaFiscal nota;
        nota = NotaFiscalDAO.linha(row);
        switch (col) {
            case 0:
                return nota.getNumNota();
            case 1:
                return nota.getNomeProd();
            default:   
                return nota.getValNota();
        }
    }

    public Class getColumnClass(int c) {
        return getValueAt(0, c).getClass();
    }

}
