package cepein.mapeamento.app.usecases.pessoa;

import cepein.mapeamento.acore.domain.models.Pessoa;
import cepein.mapeamento.app.gateways.PessoaGatway;

import java.util.List;

public class EncontrarListaDePessoaUseCase {
    private PessoaGatway pessoaGatway;

    public EncontrarListaDePessoaUseCase(PessoaGatway pessoaGatway){
        this.pessoaGatway = pessoaGatway;
    }
    public List<Pessoa> encontrarListaPessoa(){
        return  this.pessoaGatway.encontrarTodasAsPessoa();
    }
}
