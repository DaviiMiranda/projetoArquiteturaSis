package strategy;

public class Main {
    public static void main(String[] args) {
        MyList myList = new MyList();
        myList.add(34);
        myList.add(12);
        myList.add(1);
        myList.add(89);
        myList.add(5);
        myList.add(22);

        System.out.println("Lista original:");
        myList.display();
        System.out.println("---------------------------------");

        myList.sort();
        System.out.println("Lista após QuickSort:");
        myList.display();
        System.out.println("---------------------------------");

        System.out.println("\n*** Trocando para a estratégia ShellSort ***\n");
        myList.setSortStrategy(new ShellSortStrategy());

        myList.add(4);
        myList.add(99);
        System.out.println("Lista desordenada novamente:");
        myList.display();
        System.out.println("---------------------------------");

        myList.sort();
        System.out.println("Lista após ShellSort:");
        myList.display();
        System.out.println("---------------------------------");

        System.out.println("\n*** Trocando para a nova estratégia HeapSort ***\n");
        myList.setSortStrategy(new HeapSortStrategy());

        myList.add(42);
        myList.add(15);
        System.out.println("Lista desordenada novamente:");
        myList.display();
        System.out.println("---------------------------------");
        
        myList.sort();
        System.out.println("Lista após HeapSort:");
        myList.display();
        System.out.println("---------------------------------");
    }
}
