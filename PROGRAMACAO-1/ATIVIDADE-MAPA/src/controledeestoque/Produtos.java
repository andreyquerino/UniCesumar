/*
 * SUPERIOR DE TECNOLOGIA EM ANÁLISE E DESENVOLVIMENTO DE SISTEMAS - UNICESUMAR
 * MAPA - PROGRAMAÇÃO I - 2021
 * Andrey Querino
 * RA 1971669-5
 *
 */

package controledeestoque;

import java.text.NumberFormat;  //Tipos de formatação de números
import java.util.Locale; // Códigos de Línguas

public class Produtos {

    private String nome;
    private float preco;
    private String unidade;
    private int quantidade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {

        Locale localeBR = new Locale("pt","BR"); // Adicionando a linguagem português Brasil
        NumberFormat dinheiro = NumberFormat.getCurrencyInstance(localeBR); // Formatação do preço do produto para moeda REAL

        return "NOME: " + nome + "\n" +
               "PREÇO: " + dinheiro.format(preco) + "\n" + //R$ *****
               "UNIDADE: " + unidade + "\n" +
               "QUANTIDADE: " + quantidade;
    }

    public void setSomarQuantidade(int quantidade) {
        this.quantidade += quantidade;
    }

    public void setSubitrairQuantidade(int quantidade) {
        this.quantidade -= quantidade;
    }

}
