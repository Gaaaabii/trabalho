package views.estoque;

import models.EstoqueRoupa;
import dao.EstoqueRoupaDAO;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class EstoqueList extends JPanel {
    private EstoqueListTableModel tableModel;
    private JTable table;
    private EstoqueRoupaDAO estoqueRoupaDAO = new EstoqueRoupaDAO();

    public EstoqueList() {
        this.initComponents();
        this.loadEstoque();
    }

    private void loadEstoque() {
        List<EstoqueRoupa> roupas = estoqueRoupaDAO.listarTodos(); // ajuste aqui
        tableModel.setRoupas(roupas);
    }

    private void initComponents() {
        setLayout(new BorderLayout());

        tableModel = new EstoqueListTableModel(List.of());
        table = new JTable(tableModel);

        JScrollPane scrollPane = new JScrollPane(table);
        add(scrollPane, BorderLayout.CENTER);
    }
}
