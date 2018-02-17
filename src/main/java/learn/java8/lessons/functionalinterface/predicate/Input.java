package learn.java8.lessons.functionalinterface.predicate;

import java.util.Optional;

public interface Input {
    Optional<String> getGameName();

    Optional<String> getGameAuthor();
}
