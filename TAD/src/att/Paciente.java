package att;

import java.util.ArrayList;
import java.util.List;

public class Paciente {
    private String nome;
    private String cpf;
    private String telefone;
    private String endereco;
    private int idade;
    private String sintomas;

    public Paciente(String nome, String cpf, String telefone, String endereco, int idade, String sintomas) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.endereco = endereco;
        this.idade = idade;
        this.sintomas = sintomas;
    }

    public void setNome(String nNome) {
        this.nome = nNome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setCpf(String nCpf) {
        this.cpf = nCpf;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setTelefone(String nTelefone) {
        this.telefone = nTelefone;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public void setEndereco(String nEndereco) {
        this.endereco = nEndereco;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public void setIdade(int nIdade) {
        this.idade = nIdade;
    }

    public int getIdade() {
        return this.idade;
    }
}
