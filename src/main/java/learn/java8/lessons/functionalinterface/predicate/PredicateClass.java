package learn.java8.lessons.functionalinterface.predicate;

import java.util.function.Predicate;

public class PredicateClass {
    private final Input input;

    private Predicate<String> empty = String::isEmpty;

    public PredicateClass(Input input) {
        this.input = input;
    }

    private boolean isNotEmpty(String input) {
        return !empty.test(input);
    }

    public void calculateGameValue(Game game) {
        input.getGameName().filter(this::isNotEmpty).ifPresent(game::setName);
        input.getGameAuthor().filter(this::isNotEmpty).ifPresent(game::setAuthor);
        input.getGameDescription().filter(this::isNotEmpty).ifPresent(game::setDescription);
    }
}