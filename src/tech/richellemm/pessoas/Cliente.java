package tech.richellemm.pessoas;

import tech.richellemm.auxiliares.Profissao;

public class Cliente extends Pessoa {
    private String codigo;
    private Profissao profissao;

    public void cadastrar(){

    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Profissao getProfissao() {
        return profissao;
    }

    public void setProfissao(Profissao profissao) {
        this.profissao = profissao;
    }
}
