package learn.java8.lessons.functionalinterface;

import java.util.Optional;

public interface Input {
    Optional<String> getGameName();

    Optional<String> getGameAuthor();

    Optional<String> getGameDescription();

    Optional<String> getGameLanguage();

    Optional<String> getPersonPesel();
}
