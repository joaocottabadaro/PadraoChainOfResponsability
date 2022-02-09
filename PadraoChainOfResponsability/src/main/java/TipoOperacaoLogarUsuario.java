public class TipoOperacaoLogarUsuario implements TipoOperacao {


    private static TipoOperacaoLogarUsuario tipoOperacaoLogarUsuario = new TipoOperacaoLogarUsuario();

    private TipoOperacaoLogarUsuario() {};

    public static TipoOperacaoLogarUsuario getTipoOperacaoLogarUsuario() {
        return tipoOperacaoLogarUsuario;
    }
}
