import java.util.ArrayList;

public abstract class Etapa {

    protected ArrayList listaPermissaoOperacao = new ArrayList();
    private Etapa proximaEtapa;

    public Etapa getProximaEtapa() {
        return proximaEtapa;
    }

    public void setProximaEtapa(Etapa proximaEtapa) {
        this.proximaEtapa = proximaEtapa;
    }

    public abstract String getDescricaoEtapa();

    public String realizarOperacao(Operacao operacao) {
        if(listaPermissaoOperacao.contains(operacao.getTipoOperacao())) {
            return getDescricaoEtapa() + " com sucesso";
        }
        else {
            if(proximaEtapa != null) {
                return proximaEtapa.realizarOperacao(operacao);
            }
            else {
                return "A operacao não pode ser realizada.";
            }
        }
    }
}
