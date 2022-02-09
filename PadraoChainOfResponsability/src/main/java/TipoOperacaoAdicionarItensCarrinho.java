public class TipoOperacaoAdicionarItensCarrinho implements TipoOperacao {

    private static TipoOperacaoAdicionarItensCarrinho tipoOperacaoAdicionarItensCarrinho = new TipoOperacaoAdicionarItensCarrinho();

    private TipoOperacaoAdicionarItensCarrinho() {};

    public static TipoOperacaoAdicionarItensCarrinho getTipoOperacaoAdicionarItensCarrinho() {
        return tipoOperacaoAdicionarItensCarrinho;
    }

}
