package br.com.fiap.locadora.model;

public class Veiculo {

    private String placa;
    private String modelo;
    private String marca;
    private int ano;
    private Boolean disponivel;

    public void marcarComoDisponivel(){
        this.disponivel = true;
    }

    public void marcarComoIndisponivel(){
        this.disponivel = false;
    }

    public Veiculo() {
    }

    public Veiculo(String placa, String modelo, String marca, int ano, Boolean disponivel) {
        this.placa = placa;
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.disponivel = disponivel;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Boolean getDisponivel() {
        return disponivel;
    }

    public void setDisponivel(Boolean disponivel) {
        this.disponivel = disponivel;
    }
}
