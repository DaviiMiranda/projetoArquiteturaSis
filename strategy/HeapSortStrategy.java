package strategy;

import java.util.Collections;
import java.util.List;

public class HeapSortStrategy implements SortStrategy {

    @Override
    public void sort(List<Integer> numbers) {
        System.out.println("Ordenando a lista usando HeapSort...");
        int n = numbers.size();

        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(numbers, n, i);
        }

        for (int i = n - 1; i > 0; i--) {
            Collections.swap(numbers, 0, i);

            heapify(numbers, i, 0);
        }
    }

    private void heapify(List<Integer> list, int n, int i) {
        int largest = i; 
        int left = 2 * i + 1; 
        int right = 2 * i + 2; 

        if (left < n && list.get(left) > list.get(largest)) {
            largest = left;
        }

        if (right < n && list.get(right) > list.get(largest)) {
            largest = right;
        }

        if (largest != i) {
            Collections.swap(list, i, largest);

            heapify(list, n, largest);
        }
    }
}