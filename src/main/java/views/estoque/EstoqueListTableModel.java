package views.estoque;

import models.EstoqueRoupa;

import javax.swing.table.AbstractTableModel;
import java.util.List;

public class EstoqueListTableModel extends AbstractTableModel {
    private List<EstoqueRoupa> roupas;

    private final String[] colunas = {
            "ID", "Nome da Peça", "Tamanho", "Cor", "Quantidade", "Preço Unitário", "Categoria"
    };

    public EstoqueListTableModel(List<EstoqueRoupa> roupas) {
        this.roupas = roupas;
    }

    public void setRoupas(List<EstoqueRoupa> roupas) {
        this.roupas = roupas;
        fireTableDataChanged();
    }

    @Override
    public int getRowCount() {
        return roupas != null ? roupas.size() : 0;
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        EstoqueRoupa roupa = roupas.get(rowIndex);
        return switch (columnIndex) {
            case 0 -> roupa.getId();
            case 1 -> roupa.getNomePeca();
            case 2 -> roupa.getTamanho();
            case 3 -> roupa.getCor();
            case 4 -> roupa.getQuantidade();
            case 5 -> roupa.getPrecoUnitario();
            case 6 -> roupa.getCategoria();
            default -> null;
        };
    }

    @Override
    public String getColumnName(int column) {
        return colunas[column];
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return switch (columnIndex) {
            case 0, 4 -> Integer.class;
            case 5 -> Double.class;
            default -> String.class;
        };
    }
}
