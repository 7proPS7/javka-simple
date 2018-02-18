package learn.java8.lessons.functionalinterface.function;

import learn.java8.lessons.functionalinterface.Input;

import java.util.function.Function;

public class FunctionClass {
    private final Function<String, Integer> correctPesel = String::length;
    private final Input input;

    public FunctionClass(Input input) {
        this.input = input;
    }

    private boolean isPeselCorrect(String pesel) {
        return correctPesel.apply(pesel) == 11;
    }

    public void calculatePersonValue(Person person) {
        input.getPersonPesel().filter(this::isPeselCorrect).ifPresent(person::setPesel);
    }
}
