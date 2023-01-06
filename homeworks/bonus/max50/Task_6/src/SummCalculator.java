import java.util.HashMap;

public final class SummCalculator {

    public static int calculateSumm(HashMap<String, Integer> name2Amount,
                                    HashMap<String, Integer> name2Price) {
        int sum = 0;
        for (var entry : name2Amount.entrySet() )
            sum += entry.getValue() * name2Price.get(entry.getKey() );
        return sum;
    }
}