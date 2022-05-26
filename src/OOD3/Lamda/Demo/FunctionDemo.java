package OOD3.Lamda.Demo;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.*;

public class FunctionDemo {
	public static void main(String[] args) {
		
		System.out.println("Function take 1 param and 1 return");
		
		Function<Trainee, String> getFullName = trainee -> trainee.getFirstName() + " " + trainee.getLastName();
		
		Trainee trainee1 = new Trainee("Rohollah", "Moosavi", 40, "net");
		String fullname = getFullName.apply(trainee1);
		System.out.println(fullname);
		
		System.out.println("BiFunction takes two param and 1 return");
		BiFunction<Trainee, String, String> getTraineeNameWithTitle = (trainee, title) -> title + " " + trainee.getFirstName();
		Trainee trainee2 = new Trainee("Dellis", "NG", 85, "Java");
		
		String fullNameWithTitle = getTraineeNameWithTitle.apply(trainee2, "title1");
		System.out.println(fullNameWithTitle);
		
		System.out.println("Predicate takes a param and return boolean");
		Predicate<Trainee> isGradeA = (trainee) -> trainee.getMark() > 50;
		
		Trainee trainee3 = new Trainee("eric", "Astras", 89, "Java");
		boolean isGradeAorNot = isGradeA.test(trainee3);
		System.out.println(isGradeAorNot);
		
		System.out.println("BinaryPredicate takes two arguments and return boolean");
		BiPredicate<Trainee, Trainee> compareMarks = (t1, t2) -> t1.getMark() > t2.getMark();
		
		System.out.println(compareMarks.test(trainee2, trainee3));

		System.out.println("BinaryOperator takes two arguments and return an argument");
		//both arguments and the return type should be same datatype
		BinaryOperator<Trainee> returnGreater = (t1,t2) -> t1.getMark() >t2.getMark() ? t1 : t2;
		System.out.println(returnGreater.apply(trainee2, trainee3).getFirstName());
		
		System.out.println("Consumer take argument and return nothing");
		Consumer<Trainee> printFullName = t1 -> System.out.println(t1.getFirstName() + "  " + t1.getLastName());
		printFullName.accept(trainee2);
		
		System.out.println();
		List<Trainee> trainees = new ArrayList<>();
		trainees.add(trainee1);
		trainees.add(trainee2);
		trainees.add(trainee3);
		
		trainees.forEach(trainee -> System.out.println(trainee.getFirstName() + " " + trainee.getLastName()));
		System.out.println(" After removeIf");
		trainees.removeIf(trainee -> trainee.getMark() < 50);
		trainees.forEach(trainee -> System.out.println(trainee.getFirstName() + " " + trainee.getLastName()));
		
		trainees.add(trainee1);

		System.out.println();
		System.out.println("Before using Comparator");
		trainees.forEach(trainee -> System.out.println(trainee.getFirstName() + " " + trainee.getLastName()));
		System.out.println();
		System.out.println("After using Comparator");
		
		Comparator<Trainee> traineeStreamComparator = (firstTrainee, secondTrainee) -> firstTrainee.getStream().compareTo(secondTrainee.getStream());
		Collections.sort(trainees, traineeStreamComparator);
		trainees.forEach(trainee -> System.out.println(trainee.getFirstName() + " " + trainee.getLastName() + " " + trainee.getStream()));
		
		System.out.println();
		Comparator<Trainee> traineeLastNameComparator = (firstTrainee, secondTrainee) -> firstTrainee.getLastName().compareTo(secondTrainee.getLastName());
		Collections.sort(trainees, traineeLastNameComparator);
		trainees.forEach(trainee -> System.out.println(trainee.getFirstName() + " " + trainee.getLastName() + " " + trainee.getStream()));
		
		System.out.println();
		System.out.println("Having two comparators");
		Comparator<Trainee> compareStreamFirstAndThenName = traineeStreamComparator.thenComparing(traineeLastNameComparator);
		Collections.sort(trainees, compareStreamFirstAndThenName);
		trainees.forEach(trainee -> System.out.println(trainee.getFirstName() + " " + trainee.getLastName() + " " + trainee.getStream()));

		System.out.println();
		System.out.println("HashMap");
		Map<String, Integer> traineesPerStreamHM = new HashMap<>();
		
		for(Trainee trainee : trainees) {
			String stream = trainee.getStream();
			traineesPerStreamHM.merge(stream, 1, (currentcount, one) -> currentcount + one);
		}
		
		for (HashMap.Entry<String, Integer> e : traineesPerStreamHM.entrySet()) {
			System.out.println(e.getKey() + " " + e.getValue());
		}
	}
}
