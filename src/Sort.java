
import java.util.ArrayList;

public class Sort {

    // PART A. implementing selection sort
    public static void selectionSort(int[] elements) {
        for (int i = 0; i < elements.length; i++) {
            int min = elements[i];
            int minIdx = i;
            for (int j = i; j < elements.length; j++) {
                if (min > elements[j]) {
                    minIdx = j;
                    min = elements[j];
                }
            }
            int temp = elements[i];
            elements[i] = elements[minIdx];
            elements[minIdx] = temp;
        }
    }

    // PART B. sorting a 1000-word list
    public static void selectionSortWordList(ArrayList<String> words) {
        for (int i = 0; i < words.size(); i++) {
            String least = words.get(i);
            int smallestWord = i;
            for (int j = i; j < words.size(); j++) {
                if (least.compareTo(words.get(j)) > 0) {
                    least = words.get(j);
                    smallestWord = j;
                }
            }
            String temp = words.get(i);
            words.set(i, least);
            words.set(smallestWord, temp);
        }
    }
}