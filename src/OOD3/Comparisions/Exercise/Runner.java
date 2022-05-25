package OOD3.Comparisions.Exercise;

import java.util.*;

public class Runner {
    public static void main(String[] args) {
        ArrayList<Book> arrayList = new ArrayList<> (
                Arrays.asList(
                        new Book("Learn Java", 45678, 19.99, 500, 4.3),
                        new Book("Learn UNIX", 65432, 17.5, 650, 3.9),
                        new Book("Learn SQL", 87956, 9.75, 220, 4.4),
                        new Book("Learn Agile", 35367, 25.5, 500, 4.4),
                        new Book("Learn React", 55676, 28.75, 490, 4.8),
                        new Book("Learn JavaScript", 34343, 14.99, 300, 4.4),
                        new Book("Learn Python", 65767, 27.25, 500, 4.1)
                )
        );

        /*
        1.Write a comparator class which sorts Books by their number of pages in ascending order.
         */
        Comparator<Book> comparator = (b1, b2) -> b1.getNumberOfPages() - b2.getNumberOfPages();
        arrayList.sort(comparator);

        arrayList.forEach(x -> System.out.println("each book has page number:" + x.getNumberOfPages()));
        System.out.println();

        //  2.Write a comparator class which sorts Books by their name in ascending order.
        Comparator<Book> comparator2 = (b1, b2) -> b1.getTitle().compareTo(b2.getTitle());
        arrayList.sort(comparator2);

        arrayList.forEach(x -> System.out.println("each book has title:" + x.getTitle()));
        System.out.println();

        //   3.Write a comparator class which sorts Books by their price in descending order.
        Comparator<Book> comparator3 = (b1, b2) -> b2.getPrice().compareTo(b1.getPrice());
        arrayList.sort(comparator3);

        arrayList.forEach(x -> System.out.println("each book has pice:" + x.getPrice()));
        System.out.println();


        //         4.Write a comparator which sorts Books on 2 attributes. It should sort first on number of pages in ascending order
        //        and then by isbn in descending order.


        Comparator<Book> comparator4 = comparator.thenComparing((b1, b2) -> Integer.compare(b2.getIsbn(), b1.getIsbn()));
        arrayList.sort(comparator4);

        arrayList.forEach(x -> System.out.println("each book has page number:" + x.getNumberOfPages() + " the isbn : " + x.getIsbn()));
        System.out.println();

        //         5.Write a comparator which sorts Books on 2 attributes. It should sort first on rating in descending order and
        //        then by price in ascending order.

        Comparator<Book> rateDescendingComparator = (b1, b2) -> Double.compare(b2.getRating(), b1.getRating());
        Comparator<Book> comparator5 = rateDescendingComparator.thenComparing((b1, b2) -> (b1.getPrice().compareTo(b2.getPrice())));

        arrayList.sort(comparator5);

        arrayList.forEach(x -> System.out.println("each book has rate:" + x.getRating() + " the price : " + x.getPrice()));
        System.out.println();


        //1.4
        List<Book> list = Arrays.asList(
                new Book("Learn Java", 45678, 19.99, 500, 4.3),
                new Book("Learn UNIX", 65432, 17.5, 650, 3.9),
                new Book("Learn SQL", 87956, 9.75, 220, 4.4),
                new Book("Learn Agile", 35367, 25.5, 500, 4.4),
                new Book("Learn React", 55676, 28.75, 490, 4.8),
                new Book("Learn JavaScript", 34343, 14.99, 300, 4.4),
                new Book("Learn Python", 65767, 27.25, 500, 4.1)
        );
        TreeSet<Book> treeSet = new TreeSet<>(comparator5);
        treeSet.addAll(list);
        treeSet.forEach(x -> System.out.println("each book has rate:" + x.getRating() + " the price : " + x.getPrice()));

        func(-3.0, 2.23, 24.2, 5.3);

    }

    static void func(Double... doubles) {
        Comparator<Double> comparator = (d1, d2) -> Double.compare(d2, d1);
        PriorityQueue<Double> priorityQueue = new PriorityQueue<>(comparator);
        priorityQueue.addAll(Arrays.asList(doubles));
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());

    }
}
