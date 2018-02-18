package learn.java8.lessons.functionalinterface.function;

import learn.java8.lessons.functionalinterface.Input;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Optional;

import static java.util.Optional.of;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.verifyZeroInteractions;

@RunWith(MockitoJUnitRunner.class)
public class FunctionClassTest {
    private static final String CORRECT_PESEL_NUMBER = "12345678912";
    private static final String INCORRECT_PESEL_NUMBER = "12";
    private static final Optional<String> OPTIONAL_CORRECT_PESEL = of(CORRECT_PESEL_NUMBER);
    private static final Optional<String> OPTIONAL_INCORRECT_PESEL = of(INCORRECT_PESEL_NUMBER);

    @Spy
    private Person person = new Person();

    @Mock
    private Input input;

    @InjectMocks
    private FunctionClass functionClass;

    @Test
    public void shouldSetPersonPeselNumberIfCorrected() {
        given(input.getPersonPesel()).willReturn(OPTIONAL_CORRECT_PESEL);

        functionClass.calculatePersonValue(person);

        assertThat(person.getPesel()).isEqualTo(CORRECT_PESEL_NUMBER);
    }

    @Test
    public void shouldDoNotSetPersonPeselNumberIfIncorrect() {
        given(input.getPersonPesel()).willReturn(OPTIONAL_INCORRECT_PESEL);

        functionClass.calculatePersonValue(person);

        verifyZeroInteractions(person);
    }
}
