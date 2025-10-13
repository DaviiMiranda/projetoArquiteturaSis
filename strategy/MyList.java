package strategy;

import java.util.ArrayList;
import java.util.List;


public class MyList {
    private List<Integer> data = new ArrayList<>();

    private SortStrategy strategy;

    public MyList() {
        this.strategy = new QuickSortStrategy();
    }

    public void add(int number) {
        this.data.add(number);
    }


    /**
     * Permite que o cliente altere a estratégia de ordenação em tempo de execução.
     * @param strategy A nova estratégia a ser usada.
     */
    public void setSortStrategy(SortStrategy strategy) {
        this.strategy = strategy;
    }

    
    public void sort() {
        strategy.sort(this.data);
    }

    public void display() {
        System.out.println(data);
    }
}
