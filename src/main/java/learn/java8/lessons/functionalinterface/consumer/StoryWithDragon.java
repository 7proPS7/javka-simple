package learn.java8.lessons.functionalinterface.consumer;

import java.util.function.Consumer;

public class StoryWithDragon {
    private static final int TEN_POINTS = 10;

    private Consumer<Player> playerConsumer = this::addPointsForKillingTheDragon;

    private void addPointsForKillingTheDragon(Player player) {
        player.setPoints(player.getPoints() + TEN_POINTS);
    }

    public void givePointToPlayer(Player player) {
        playerConsumer.accept(player);
    }
}
