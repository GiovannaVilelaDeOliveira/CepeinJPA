package cepein.mapeamento.produto.dto;

import cepein.mapeamento.pessoa.dto.PessoaDtoParaRelacionamento;
import cepein.mapeamento.pessoa_produto.PessoaProduto;
import cepein.mapeamento.pessoa_produto.dto.PessoaProdutoDto;
import cepein.mapeamento.produto.model.Produto;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;
import java.util.stream.Collectors;

@Getter
@AllArgsConstructor
public class ProdutoDto {

    private Long id;

    private String Descricao;

    private List<PessoaDtoParaRelacionamento> pessoaListComJoinTable;
    private List<PessoaDtoParaRelacionamento> pessoaListComEmbeddable;
    public static List<ProdutoDto> converter(List<Produto> produtoList){
        return produtoList.stream()
                .map(produto -> new ProdutoDto(produto.getId(), produto.getDescricao(),
                        PessoaDtoParaRelacionamento.converter(produto.getPessoaListComJoinTable()),
                        PessoaDtoParaRelacionamento.converterPessoaProduto(produto.getPessoaProdutoList())))
                .collect(Collectors.toList());
    }
}
