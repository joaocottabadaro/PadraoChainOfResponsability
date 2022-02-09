public class TipoOperacaoEfetuarPagamento implements TipoOperacao {


    private static TipoOperacaoEfetuarPagamento tipoOperacaoEfetuarPagamento = new TipoOperacaoEfetuarPagamento();

    private TipoOperacaoEfetuarPagamento() {};

    public static TipoOperacaoEfetuarPagamento getTipoOperacaoEfetuarPagamento() {
        return tipoOperacaoEfetuarPagamento;
    }
}
