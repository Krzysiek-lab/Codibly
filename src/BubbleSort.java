import org.jetbrains.annotations.Nullable;

import java.util.Collections;
import java.util.List;

public class BubbleSort {

    @SuppressWarnings("all")
    public List<Double> sort(@Nullable List<Double> input) {
        int size = input.size();
        double begin = 0;
        if (input == null) {
            throw new NullPointerException("input is null");
        } else if (input.contains(null)) {
            input.removeIf(e -> e == null);
        } else if (input.size() == 1) {
            return input;
        } else {
            for (int i = 0; i < size; i++) {
                for (int j = 1; j < (size - i); j++) {
                    if (input.get(j - 1) > input.get(j)) {
                        begin = input.get(j - 1);
                        Collections.swap(input, input.indexOf(input.get(j - 1)), input.indexOf(input.get(j)));
                    }
                }
            }
        }
        return input;
    }
}
