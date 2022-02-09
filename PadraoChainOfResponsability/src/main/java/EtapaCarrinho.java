public class EtapaCarrinho extends Etapa{

    public EtapaCarrinho(Etapa proximaEtapa) {
        listaPermissaoOperacao.add(TipoOperacaoAdicionarItensCarrinho.getTipoOperacaoAdicionarItensCarrinho());
        setProximaEtapa(proximaEtapa);
    }


    @Override
    public String getDescricaoEtapa() {
        return "Itens colocado no carrinho";
    }
}
