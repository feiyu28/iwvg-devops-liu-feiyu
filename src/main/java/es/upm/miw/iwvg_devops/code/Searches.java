package es.upm.miw.iwvg_devops.code;

import java.util.Optional;
import java.util.stream.Stream;

public class Searches {

    public Stream<Double> findDecimalFractionByNegativeSignFraction() {
        return new UsersDatabase().findAll()
                .flatMap(user -> user.getFractions().stream()
                        .filter(fraction -> fraction.getNumerator() < 0
                                || fraction.getDenominator() < 0))
                .map(Fraction::decimal);
    }

    public Stream<String> findUserNameBySomeImproperFraction() {
        return new UsersDatabase().findAll()
                .filter(user -> user.getFractions().stream()
                        .anyMatch(Fraction::isImproper))
                .map(User::getName);
    }

    public Fraction findHighestFraction() {
        Optional<Double> maxValue = new UsersDatabase().findAll()
                .flatMap(user -> user.getFractions().stream())
                .map(Fraction::decimal).filter(decimal -> !decimal.isNaN() && !decimal.isInfinite())
                .max(Double::compareTo);
        return new UsersDatabase().findAll()
                .flatMap(user -> user.getFractions().stream()
                        .filter(fraction -> fraction.decimal() == maxValue.orElse(Double.NaN)))
                .findFirst()
                .orElse(null);
    }

    public Fraction findFractionDivisionByUserId(String id) {
        return new UsersDatabase().findAll()
                .filter(user -> id.equals(user.getId()))
                .flatMap(user -> user.getFractions().stream())
                .reduce(Fraction::divide)
                .orElse(null);
    }
}