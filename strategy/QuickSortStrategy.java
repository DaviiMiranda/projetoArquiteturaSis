package strategy;

import java.util.Collections;
import java.util.List;

/**
 * Estratégia concreta que implementa o algoritmo QuickSort.
 */
public class QuickSortStrategy implements SortStrategy {

    @Override
    public void sort(List<Integer> numbers) {
        System.out.println("Ordenando a lista usando QuickSort...");
        quickSort(numbers, 0, numbers.size() - 1);
    }

    // Método recursivo principal do QuickSort
    private void quickSort(List<Integer> list, int begin, int end) {
        if (begin < end) {
            int partitionIndex = partition(list, begin, end);

            quickSort(list, begin, partitionIndex - 1);
            quickSort(list, partitionIndex + 1, end);
        }
    }

    // Método auxiliar para particionar a lista
    private int partition(List<Integer> list, int begin, int end) {
        int pivot = list.get(end);
        int i = (begin - 1);

        for (int j = begin; j < end; j++) {
            if (list.get(j) <= pivot) {
                i++;
                Collections.swap(list, i, j);
            }
        }

        Collections.swap(list, i + 1, end);
        return i + 1;
    }
}