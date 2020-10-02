package br.com.example.exception;

import br.com.example.exception.InvalidSexyTypeException;
import br.com.example.exception.SexyTypeException;
import org.junit.Before;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertThrows;

@SpringBootTest
public class SexyTypeExceptionTest {

    private SexyTypeException sexyTypeException;

    @Before
    public void setup(){
        this.sexyTypeException = new SexyTypeException();
    }

    @Test
    public void givenGenericServiceToDeclareSexyType_whenPassValidSexyMale_thenReturnMale() throws InvalidSexyTypeException {
        assertThat(sexyTypeException.declareSexyType("m")).isEqualTo("male");
    }

    @Test
    public void givenGenericServiceToDeclareSexyType_whenPassValidSexyFemale_thenReturnFemale() throws InvalidSexyTypeException {
        assertThat(sexyTypeException.declareSexyType("f")).isEqualTo("female");
    }

    @Test
    public void givenGenericServiceToDeclareSexyType_whenPassInvalidSexy_thenThrowInvalidSexyTypeException() throws InvalidSexyTypeException {
        Exception exception = assertThrows(InvalidSexyTypeException.class, () ->{
            this.sexyTypeException.declareSexyType("none");
        });
        assertThat(exception.getMessage()).contains("This is not a valid sexy type: ");
    }
}
