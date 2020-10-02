package checked;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest
public class CheckedExceptionTest {
    @Test
    public void givenGenericClass_whenTryToCloneObjectWithNoCloneableClass_thenReturnException(){
        CheckedException c = new CheckedException();
        OtherClass o = new OtherClass();

        CloneNotSupportedException e = assertThrows(CloneNotSupportedException.class,
                ()->  c.clone());

    }
}
