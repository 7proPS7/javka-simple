package learn.java8.lessons.lambdaexpr;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Spy;

import java.util.Arrays;

import static learn.java8.lessons.lambdaexpr.StrengthShotType.STRONG;
import static learn.java8.lessons.lambdaexpr.StrengthShotType.WEAK;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.given;
import static org.mockito.MockitoAnnotations.initMocks;

@RunWith(JUnitParamsRunner.class)
public class PlayersTest {
    @Spy
    private Player player = new Player("Pawel", "Sykala", 24);

    @InjectMocks
    private Players players;

    @Before
    public void setup() {
        initMocks(this);
    }

    public Iterable playerExperienced() {
        return Arrays.asList(
                new Object[]{1, WEAK},
                new Object[]{4, STRONG});
    }

    @Test
    @Parameters(method = "playerExperienced")
    public void shouldCheckWhatStrengthIsInvoke(int experiencedYear, StrengthShotType expectedType) {
        given(player.getYearsOfExperience()).willReturn(experiencedYear);

        players.shotStrength(player);

        assertThat(player.getStrengthShotType()).isEqualTo(expectedType);
    }
}