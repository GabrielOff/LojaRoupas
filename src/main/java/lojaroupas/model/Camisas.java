/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lojaroupas.model;

/**
 *
 * @author OffSys
 */
public class Camisas {

    public Integer idCamisa;
    public String cor;
    public String tamanho;
    public double preco;
    public String marca;

    public static String fabricante = "GabrielAraujo";

    public Camisas() {

    }

    public Camisas(String cor, String tamanho, double preco, String marca) {
        this.cor = cor;
        this.tamanho = tamanho;
        this.preco = preco;
        this.marca = marca;

    }

    public Camisas(Integer idCamisa, String cor, String tamanho, double preco, String marca) {
        this.idCamisa = idCamisa;
        this.cor = cor;
        this.tamanho = tamanho;
        this.preco = preco;
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public static String getFabricante() {
        return fabricante;
    }

    public static void setFabricante(String fabricante) {
        Camisas.fabricante = fabricante;
    }

    public Integer getIdCamisa() {
        return idCamisa;
    }

    public void setIdCamisa(Integer idCamisa) {
        this.idCamisa = idCamisa;
    }
}
