package cepein.mapeamento.pessoa.dto;


import cepein.mapeamento.pessoa.model.Pessoa;
import cepein.mapeamento.pessoa_produto.PessoaProduto;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
@Getter
@AllArgsConstructor
public class PessoaDtoParaRelacionamento {

    private Long id;

    private String nome;

    private String uuid;


    public PessoaDtoParaRelacionamento(Pessoa pessoa){
        this.id = pessoa.getId_pessoa();
        this.nome = pessoa.getNome();
        this.uuid = pessoa.getUuid();

    }
    public PessoaDtoParaRelacionamento(PessoaProduto pessoaProduto){
        this.id = pessoaProduto.getPessoa().getId_pessoa();
        this.nome = pessoaProduto.getPessoa().getNome();
        this.uuid = pessoaProduto.getPessoa().getUuid();

    }




    public static List<PessoaDtoParaRelacionamento> converter(List<Pessoa> pessoaList){
        return pessoaList.stream()
                .map(PessoaDtoParaRelacionamento::new)
                .collect(Collectors.toList());
    }

    public static List<PessoaDtoParaRelacionamento> converterPessoaProduto(List<PessoaProduto> pessoaProdutoList){
        return pessoaProdutoList.stream()
                .map(PessoaDtoParaRelacionamento::new)
                .collect(Collectors.toList());
    }

}
