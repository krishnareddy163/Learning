package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Flatmap {

    public static void main(String[] args) {
        List<List<String>> names = Arrays.asList(
                Arrays.asList("A", "B"),
                Arrays.asList("C", "D")
        );

        List<String> result = names.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());

        System.out.println(result);

        List<String> words = Arrays.asList("java", "spring");

        List<String> chars = words.stream()
                .flatMap(word -> Arrays.stream(word.split("")))
                .collect(Collectors.toList());

        System.out.println(chars);
        List<String> words1 = Arrays.asList("javag", "springr");

        List<String> uniqueChars = words1.stream()
                .flatMap(word -> Arrays.stream(word.split("")))
                .distinct()
                .collect(Collectors.toList());

        System.out.println(uniqueChars);
        List<Student> students = Arrays.asList(
                new Student("A", Arrays.asList("Math", "Science")),
                new Student("B", Arrays.asList("English", "Math"))
        );

        List<String> subjects = students.stream()
                .flatMap(s -> s.getSubjects().stream())
                .distinct()
                .collect(Collectors.toList());

        System.out.println(subjects);


    }

    static class Student {
        String name;
        List<String> subjects;

        Student(String name, List<String> subjects) {
            this.name = name;
            this.subjects = subjects;
        }

        public List<String> getSubjects() {
            return subjects;
        }
    }

}
