package OOD4.Stream.Walkthrough;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.stream.Collectors;

public class StreamExamples {
    public static void main(String[] args) {
        Trainee trainee1 = new Trainee("John", "Java", 25, 75.0);
        Trainee trainee2 = new Trainee("Jane", "BA", 25, 82.0);
        List<Trainee> trainees = new ArrayList<>(
                Arrays.asList(
                        trainee1, trainee2
                )
        );
        trainees.stream().filter(t -> t.getStream().equals("BA"));
        System.out.println(trainees.stream().filter(t -> t.getStream().equals("BA")).count());
        System.out.println(trainees.stream().filter(t -> t.getStream().equals("BA")).collect(Collectors.toList()));
        trainees.stream().max((t1, t2) -> t1.getAge() - t2.getAge()).ifPresent(x -> System.out.println(x.getClass()));

        trainees.stream().mapToInt(t -> t.getAge()).average().ifPresent(age -> System.out.println(age));
        OptionalDouble optionalDouble = trainees.stream().mapToInt(t -> t.getAge()).average();
        //average() returns OptionalDouble type
        if(optionalDouble.isPresent()) {
            System.out.println(optionalDouble.getAsDouble());
        }

        trainees.stream().max((t1, t2) -> Double.compare(t1.getAverageGrade(), t2.getAverageGrade())).ifPresent(x -> System.out.println(x.getAverageGrade()));
        trainees.stream().reduce((t1, t2) -> t1.getAge() > t2.getAge() ? t1 : t2).ifPresent(t -> System.out.println(t));
        trainees.stream().reduce((t1, t2) -> t1.getAge() > t2.getAge() ? t1 : t2).orElse(new Trainee("Dumy", "Dummy", 22, 22.0));

        Trainee[] traineesArray = {trainee1, trainee2};

        List<Trainee> list = Arrays.stream(traineesArray).filter(t -> t.getStream().equals("BA")).collect(Collectors.toList());
        IntFunction<Trainee[]> generator = new IntFunction<Trainee[]>() {
            @Override
            public Trainee[] apply(int value) {
                return new Trainee[value];
            };
        };

        Trainee[] trainees1 = Arrays.stream(traineesArray).filter(t -> t.getStream().equals("BA")).toArray(generator);
        for (Trainee trainee : trainees1) {
            System.out.println(trainee);
        }
    }
}
