package learn.java8.lessons;

import static learn.java8.lessons.StrengthShotType.STRONG;
import static learn.java8.lessons.StrengthShotType.WEAK;

class Players {
    void shotStrength(Player player) {
        shot(() -> setStrengthShotType(player));
    }

    private void setStrengthShotType(Player player) {
        if (isExperiencedPlayer(player)) {
            player.setStrengthShotType(STRONG);
        } else {
            player.setStrengthShotType(WEAK);
        }
    }

    private boolean isExperiencedPlayer(Player player) {
        return player.getYearsOfExperience() > 3;
    }

    private void shot(Playable player) {
        player.move();
    }
}
