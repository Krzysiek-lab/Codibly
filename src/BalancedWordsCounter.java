import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class BalancedWordsCounter {

    public Integer count(String input) {
        int value = 0;
        List<String> list = new ArrayList<>();
        if (input == null) {
            throw new RuntimeException("input is null");
        } else if (input.chars().map(a -> (char) a).anyMatch(e -> !Character.isAlphabetic(e))) {
            throw new RuntimeException("input contains non alphabetical character(s)");
        } else if (input.isEmpty()) {
            return 0;
        } else {
            value = counter(input).size();
        }
        return value;
    }

    private boolean isBalanced(String input) {
        String word = input;
        List<Integer> indices = new ArrayList<>();
        int counter = 0;
        for (int i = 0; i < word.length(); ) {
            char ch = word.toCharArray()[i];
            for (int j = 0; j <= word.length() + 1; j++) {
                if (word.contains(ch + "")) {
                    counter++;
                    word = word.replaceFirst(String.valueOf(ch), "");
                    if (!word.contains(ch + "")) {
                        break;
                    }
                }
            }
            indices.add(counter);
            counter = 0;
        }
        return indices.stream().allMatch(e -> Objects.equals(e, indices.get(0)));
    }

    private List<String> counter(String input) {
        String balancedWord = "";
        List<String> newList = new ArrayList<>(Arrays.asList(input.split("")));
        for (int i = 0; i < input.length(); i++) {
            balancedWord = String.valueOf(input.charAt(i));
            for (int j = i + 1; j < input.length(); j++) {
                balancedWord += String.valueOf(input.charAt(j));
                if (input.contains(balancedWord) && isBalanced(balancedWord)) {
                    newList.add(balancedWord);
                }
            }
            balancedWord = "";
        }
        return newList;
    }
}
















