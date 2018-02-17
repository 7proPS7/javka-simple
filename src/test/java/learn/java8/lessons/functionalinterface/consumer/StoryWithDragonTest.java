package learn.java8.lessons.functionalinterface.consumer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(MockitoJUnitRunner.class)
public class StoryWithDragonTest {
    private static final int START_POINTS = 0;
    private static final int EXPECTED_POINTS = 10;

    @Spy
    private Player player = new Player("Pawel", START_POINTS);

    @InjectMocks
    private StoryWithDragon storyWithDragon;

    @Test
    public void shouldAddPointsForPlayerWhichKilledDragon() {
        storyWithDragon.givePointToPlayer(player);

        assertThat(player.getPoints()).isEqualTo(EXPECTED_POINTS);
    }
}
