package learn.java8.lessons.functionalinterface.predicate;

import java.util.function.Predicate;

public class PredicateClass {
    private final Input input;

    private Predicate<String> notEmpty = in -> !in.isEmpty();

    public PredicateClass(Input input) {
        this.input = input;
    }

    private boolean isNotEmpty(String input) {
        return notEmpty.test(input);
    }

    public void calculateGameValue(Game game) {
        input.getGameName().filter(this::isNotEmpty).ifPresent(game::setName);
        input.getGameAuthor().filter(this::isNotEmpty).ifPresent(game::setAuthor);
        input.getGameDescription().filter(this::isNotEmpty).ifPresent(game::setDescription);
        input.getGameLanguage().filter(this::isNotEmpty).ifPresent(game::setLanguage);
    }
}
