package br.locadora.DTO;

public class ClientePFDto {
    public String nome;
    public String cpf;
    public String dataNascimento;
    public String endereco;
    public String contato;
    public String cnh;

    public ClientePFDto(String nome, String cpf, String dataNascimento, String endereco, String contato, String cnh) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
        this.contato = contato;
        this.cnh = cnh;
    }
}
