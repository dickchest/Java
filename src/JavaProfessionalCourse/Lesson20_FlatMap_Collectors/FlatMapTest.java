package JavaProfessionalCourse.Lesson20_FlatMap_Collectors;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FlatMapTest {
    public static void main(String[] args) {
        List<Student> students = List.of(
                new Student("Petya", List.of(new Book("test", 2014), new Book("test2", 2015))),
                new Student("Petya", List.of(new Book("test", 2015), new Book("test4", 2015))),
                new Student("Petya", List.of(new Book("Harry Poter", 2014), new Book("Programming", 2000))),
                new Student("Petya", List.of(new Book("Lor", 2014), new Book("JS for Dummers", 2010))),
                new Student("Petya", List.of(new Book("Marvel", 1990), new Book("Efficient Java", 2013)))
        );

//        for (Student student : students) {
//            for (Book book : books) {
//                if(book.publishYear() > 2010) {
//                    System.out.println(book);
//                }
//            }
//        }

        Map<String, List<Student>> universityStudents = new HashMap<>();
        universityStudents.values().stream().flatMap(list -> list.stream()).forEach(System.out::println);//List<Student -> Stream<Studenst>

        System.out.println(students.stream().flatMap(s -> s.books.stream()).filter(book -> book.publishYear() > 2010).collect(Collectors.toSet()));

//        System.out.println(students.stream()
//                .flatMap(s -> s.books.stream())
//                .filter(book -> book.publishYear() > 2010)
//                .collect(Collectors.toMap(Book::name, Book::publishYear, (f, s) -> {
//                    System.out.printf("dublicate detected!!!%d and %d%n", f, s);
//                    return f < s ? f : s;
//                }, TreeMap::new
//                ))
//        );

//        Map<Integer, Set<Book>> collect = students.stream()
//                .flatMap(s -> s.books.stream())
//                .filter(book -> book.publishYear() > 2010)
//                .collect(Collectors.groupingBy(Book::publishYear, Collectors.mapping(b->b.name(), Collectors.toSet())));

        String res = students.stream()
                .flatMap(s -> s.books.stream())
                .filter(book -> book.publishYear() > 2010)
                .map(Book::name)
                .collect(Collectors.joining(", ", "(", ")"));
        System.out.println(res);

        Map<Boolean, List<Book>> partitionByYear = students.stream().flatMap(s -> s.books.stream())
                .collect(Collectors.partitioningBy(book -> book.publishYear() > 2010));

        System.out.println(partitionByYear);

        String myResCollector = students.stream()
                .flatMap(s -> s.books.stream())
                .filter(book -> book.publishYear() > 2010)
                .map(Book::name)
                .collect(new MyStringCollector<>(" "));

        System.out.println(myResCollector);

    }
}
