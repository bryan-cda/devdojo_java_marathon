package unckecked;

import org.assertj.core.api.BDDAssertions;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest
public class UncheckedExceptionTest {
    @DisplayName("Test ArrayIndexOutOfBoundsException when access invalid index on array")
    @Test
    public void  givenGenericClass_whenTryToAccessIndexOutArrayThenReturnException(){
        String[] arr = {"test"};
        int i = 1;
        ArrayIndexOutOfBoundsException e = assertThrows(
                ArrayIndexOutOfBoundsException.class,
                ()-> UncheckedException.main(arr, i));
    }

    @Test
    @DisplayName("Test return of array String")
    public void givenGenericClass_whenTryToAccessIndexInArrayThenReturnException(){
        String[] arr = {"test"};
        int i = 0;
        assertThat(UncheckedException.main(arr, i)).isEqualTo("test");
    }
}
