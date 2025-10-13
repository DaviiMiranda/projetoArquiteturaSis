package strategy;
import java.util.List;

public class ShellSortStrategy implements SortStrategy {

    @Override
    public void sort(List<Integer> numbers) {
        System.out.println("Ordenando a lista usando ShellSort...");
        int n = numbers.size();

        // Começa com um gap grande e o reduz
        for (int gap = n / 2; gap > 0; gap /= 2) {
            // Realiza um insertion sort com o gap
            for (int i = gap; i < n; i++) {
                int temp = numbers.get(i);
                int j;
                for (j = i; j >= gap && numbers.get(j - gap) > temp; j -= gap) {
                    numbers.set(j, numbers.get(j - gap));
                }
                numbers.set(j, temp);
            }
        }
    }
}