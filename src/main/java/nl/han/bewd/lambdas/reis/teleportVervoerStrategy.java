package nl.han.bewd.lambdas.reis;

public class teleportVervoerStrategy implements VervoerStrategy {
    @Override
    public int berekenReistijd(boolean isReisTijdensSpits) {
        if (isReisTijdensSpits) {
            return 1;
        } else {
            return 0;
        }
    }
}
