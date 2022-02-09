


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class OperacaoTest {



    EtapaLogin etapaLogin;
    EtapaCarrinho etapaCarrinho;
    EtapaPagamento etapaPagamento;

    @BeforeEach
    void setup() {
        etapaLogin = new EtapaLogin(null);
        etapaCarrinho = new EtapaCarrinho(etapaLogin);
        etapaPagamento = new EtapaPagamento(etapaCarrinho);
    }

    @Test
    void deveAutorizarPagamento() {
        assertEquals("Pagamento efetuado com sucesso", etapaPagamento.realizarOperacao(new Operacao(TipoOperacaoEfetuarPagamento.getTipoOperacaoEfetuarPagamento())));
    }

    @Test
    void deveAutorizarColocarItensCarrinho() {
        assertEquals("Itens colocado no carrinho com sucesso", etapaCarrinho.realizarOperacao(new Operacao(TipoOperacaoAdicionarItensCarrinho.getTipoOperacaoAdicionarItensCarrinho())));
    }

    @Test
    void deveAutorizarEtapaLogin() {
        assertEquals("Login Efetuado com sucesso", etapaLogin.realizarOperacao(new Operacao(TipoOperacaoLogarUsuario.getTipoOperacaoLogarUsuario())));
    }

}
