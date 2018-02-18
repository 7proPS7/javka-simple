package learn.java8.lessons.functionalinterface.predicate;

import learn.java8.lessons.functionalinterface.Input;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Optional;

import static java.util.Optional.empty;
import static java.util.Optional.of;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.verifyZeroInteractions;

@RunWith(MockitoJUnitRunner.class)
public class PredicateClassTest {
    private static final Optional<String> OPTIONAL_GAME_NAME = of("FIFA18");
    private static final Optional<String> OPTIONAL_GAME_AUTHOR = of("EA_SPORT");
    private static final Optional<String> SOME_OPTIONAL_DESCRIPTION = of("someDescription");
    private static final Optional<String> SOME_OPTIONAL_LANGUAGE = of("someLanguage");
    private static final String GAME_NAME = "FIFA18";
    private static final String GAME_AUTHOR = "EA_SPORT";
    private static final String SOME_DESCRIPTION = "someDescription";
    private static final String SOME_LANGUAGE = "someLanguage";

    @Mock
    private Input input;

    @Spy
    private Game game = new Game();

    @InjectMocks
    private PredicateClass predicateClass;

    @Test
    public void shouldSetGameValuesIfExist() {
        given(input.getGameName()).willReturn(OPTIONAL_GAME_NAME);
        given(input.getGameAuthor()).willReturn(OPTIONAL_GAME_AUTHOR);
        given(input.getGameDescription()).willReturn(SOME_OPTIONAL_DESCRIPTION);
        given(input.getGameLanguage()).willReturn(SOME_OPTIONAL_LANGUAGE);

        predicateClass.calculateGameValue(game);

        assertThat(game.getName()).isEqualTo(GAME_NAME);
        assertThat(game.getAuthor()).isEqualTo(GAME_AUTHOR);
        assertThat(game.getDescription()).isEqualTo(SOME_DESCRIPTION);
        assertThat(game.getLanguage()).isEqualTo(SOME_LANGUAGE);
    }

    @Test
    public void shouldDoNotSetGameValuesIfNotExist() {
        given(input.getGameName()).willReturn(empty());
        given(input.getGameAuthor()).willReturn(empty());
        given(input.getGameDescription()).willReturn(empty());
        given(input.getGameLanguage()).willReturn(empty());

        predicateClass.calculateGameValue(game);

        verifyZeroInteractions(game);
    }
}
