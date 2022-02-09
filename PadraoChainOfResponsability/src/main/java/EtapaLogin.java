public class EtapaLogin  extends Etapa{

    public EtapaLogin(Etapa proximaEtapa) {
        listaPermissaoOperacao.add(TipoOperacaoLogarUsuario.getTipoOperacaoLogarUsuario());
        setProximaEtapa(proximaEtapa);
    }


    @Override
    public String getDescricaoEtapa() {
        return "Login Efetuado";
    }
}
