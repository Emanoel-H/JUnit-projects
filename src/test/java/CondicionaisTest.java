import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledForJreRange;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.JRE;

public class CondicionaisTest {
    @Test
//    @EnabledIfEnvironmentVariable(named = "USER", matches = "William")
//    @EnabledForJreRange(min = JRE.JAVA_11, max = JRE.JAVA_17)
    @EnabledOnJre(JRE.JAVA_17)
    void validarAlgoSoNoUsuarioWilliam (){

        Assertions.assertEquals(10, 5+5);
    }
}
