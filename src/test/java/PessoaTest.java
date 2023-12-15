import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class PessoaTest {

    @Test
    void validarCalculoDeIdade(){
        Pessoa pessoa = new Pessoa("Julia",
                LocalDate.of(2020,1,1).atStartOfDay());
        Assertions.assertEquals(3, pessoa.getIdade());
    }

    @Test
    void deveRetornarSeEhMaiorDeIdade(){
        Pessoa jessica = new Pessoa("Jessica",
                LocalDate.of(2000,1,1).atStartOfDay());
        Assertions.assertTrue(jessica.ehMaiorDeIdade());
        
        Pessoa joao = new Pessoa("João", LocalDateTime.now());
        Assertions.assertFalse(joao.ehMaiorDeIdade());

    }
}
