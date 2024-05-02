package cepein.mapeamento.acore.domain.models;

import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Produto {

    private Long id;

    private String descricao;

    private List<Pessoa> pessoaListComJoinTable;
    private List<Pessoa> pessoaListComEmbeddable;
}
