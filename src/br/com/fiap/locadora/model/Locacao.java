package br.com.fiap.locadora.model;

import java.time.LocalDate;

public class Locacao {

    private Cliente cliente;
    private Veiculo veiculo;
    private String data_inicio;
    private String data_termino;
    private Boolean ativa;

    public void iniciarLocacao(){
        if (veiculo.getDisponivel()){
            if(!cliente.getAlugando()){
                this.data_inicio = LocalDate.now().toString();
                cliente.marcarComoAlugando();
                veiculo.marcarComoIndisponivel();
                this.ativa = true;
            }else{
                System.out.println("Sinto muito! O cliente já está alugando um veículo");
            }
        }else{
            System.out.println("Sinto muito! Esse veículo já esta sendo alugado por outro cliente");
        }
    }

    public void finzalizarLocacao(){
        if (!veiculo.getDisponivel()) {
            if (cliente.getAlugando()) {
                this.data_termino = LocalDate.now().toString();
                cliente.marcarComoNaoAlugando();
                veiculo.marcarComoDisponivel();
                this.ativa = false;
            } else {
                System.out.println("No momento esse cliente não está alugando nenhum veículo");
            }
        }else{
            System.out.println("No momento esse veículo não está sendo alugado por nenhum cliente ");
        }
        }

    public Locacao() {
    }

    public Locacao(Cliente cliente, Veiculo veiculo, String data_inicio, String data_termino, Boolean ativa) {
        this.cliente = cliente;
        this.veiculo = veiculo;
        this.data_inicio = data_inicio;
        this.data_termino = data_termino;
        this.ativa = ativa;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public String getData_inicio() {
        return data_inicio;
    }

    public void setData_inicio(String data_inicio) {
        this.data_inicio = data_inicio;
    }

    public String getData_termino() {
        return data_termino;
    }

    public void setData_termino(String data_termino) {
        this.data_termino = data_termino;
    }

    public Boolean getAtiva() {
        return ativa;
    }

    public void setAtiva(Boolean ativa) {
        this.ativa = ativa;
    }
}
