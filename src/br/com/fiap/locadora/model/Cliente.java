package br.com.fiap.locadora.model;

public class Cliente {

    private String cpf;
    private String nome;
    private String telefone;
    private String email;
    private Boolean alugando;

    public void marcarComoAlugando(){
        this.alugando = true;
    }

    public void marcarComoNaoAlugando(){
        this.alugando = false;
    }

    public Cliente() {
    }

    public Cliente(String cpf, String nome, String telefone, String email, Boolean alugando) {
        this.cpf = cpf;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.alugando = alugando;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getAlugando() {
        return alugando;
    }

    public void setAlugando(Boolean alugando) {
        this.alugando = alugando;
    }
}
