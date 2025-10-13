package strategy;

import java.util.List;


public interface SortStrategy {
    /**
     * Ordena a lista de números fornecida.
     * @param numbers A lista a ser ordenada.
     */
    void sort(List<Integer> numbers);
}