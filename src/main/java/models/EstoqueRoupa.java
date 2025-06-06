package models;
import jakarta.persistence.*;

    @Entity
    @Table(name = "estoque_roupa")
    public class EstoqueRoupa {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;

        private String nomePeca;      // Nome da peça de roupa
        private String tamanho;       // P, M, G, GG etc.
        private String cor;
        private int quantidade;
        private double precoUnitario;
        private String categoria;     // Ex: camiseta, calça, vestido...

        public EstoqueRoupa() {}

        public EstoqueRoupa(String nomePeca, String tamanho, String cor,
                            int quantidade, double precoUnitario, String categoria) {
            this.nomePeca = nomePeca;
            this.tamanho = tamanho;
            this.cor = cor;
            this.quantidade = quantidade;
            this.precoUnitario = precoUnitario;
            this.categoria = categoria;
        }

        public int getId() {
            return id;
        }

        public String getNomePeca() {
            return nomePeca;
        }

        public void setNomePeca(String nomePeca) {
            this.nomePeca = nomePeca;
        }

        public String getTamanho() {
            return tamanho;
        }

        public void setTamanho(String tamanho) {
            this.tamanho = tamanho;
        }

        public String getCor() {
            return cor;
        }

        public void setCor(String cor) {
            this.cor = cor;
        }

        public int getQuantidade() {
            return quantidade;
        }

        public void setQuantidade(int quantidade) {
            this.quantidade = quantidade;
        }

        public double getPrecoUnitario() {
            return precoUnitario;
        }

        public void setPrecoUnitario(double precoUnitario) {
            this.precoUnitario = precoUnitario;
        }

        public String getCategoria() {
            return categoria;
        }

        public void setCategoria(String categoria) {
            this.categoria = categoria;
        }
    }

