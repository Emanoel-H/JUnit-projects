import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExceptionTest {

    @Test
    void validarCenarioDeExcecaoNaTransferencia(){
        Conta contaOrigem = new Conta("123456", 0);
        Conta contaDestino = new Conta("456548", 100);

        TransferenciaEntreContas transferenciaEntreContas = new TransferenciaEntreContas();

        Assertions.assertDoesNotThrow(() -> transferenciaEntreContas.transfere(contaOrigem, contaDestino, 20));

        Assertions.assertDoesNotThrow(() -> SaqueConta.saca(contaOrigem, 0));

//        Assertions.assertDoesNotThrow(() -> SaqueConta.saca(contaOrigem, 100));
        //Assertions.assertThrows(IllegalArgumentException.class,
          //      () -> transferenciaEntreContas.transfere(contaOrigem, contaDestino, -1));
    }
}
