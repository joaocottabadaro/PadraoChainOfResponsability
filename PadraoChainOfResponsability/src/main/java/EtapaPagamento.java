public class EtapaPagamento  extends Etapa{

    public EtapaPagamento(Etapa proximaEtapa) {
        listaPermissaoOperacao.add(TipoOperacaoEfetuarPagamento.getTipoOperacaoEfetuarPagamento());
        setProximaEtapa(proximaEtapa);
    }


    @Override
    public String getDescricaoEtapa() {
        return "Pagamento efetuado";
    }
}
