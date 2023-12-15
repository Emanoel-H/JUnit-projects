import org.junit.jupiter.api.*;

import java.time.LocalDateTime;

public class ConsultarDadosDePessoaTest {

    @BeforeAll
    static void configuraConexao(){
        GerenciadorDeConexaoComDB.iniciarConexao();
    }

    @BeforeEach
    void insereDadosParaTeste(){
        GerenciadorDeConexaoComDB.insereDados(new Pessoa("Claudia", LocalDateTime.now()));
    }

    @AfterEach
    void removeDadosDoTeste(){
        GerenciadorDeConexaoComDB.removeDados(new Pessoa("Claudia", LocalDateTime.now()));
    }

    @Test
    void validarDadosDeRetorno(){
        Assertions.assertTrue(true);
    }

    @AfterAll
    static void finalizarConexao (){
        GerenciadorDeConexaoComDB.finalizarConexao();
    }
}
