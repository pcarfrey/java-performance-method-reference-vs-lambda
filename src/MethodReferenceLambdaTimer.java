import java.util.ArrayList;
import java.util.List;

public class MethodReferenceLambdaTimer {

    private List<String> summary = new ArrayList<>();

    public <T> void arrayListPrintln(T element, int numberOfElements) {
        List<T> list = new ArrayList<>();

        for (int i = 0; i < numberOfElements; i++) {
            list.add(element);
        }

        long startTime = System.nanoTime();
        list.stream().forEach((x) -> System.out.println(x));
        long lambdaEstimatedTime = System.nanoTime() - startTime;

        startTime = System.nanoTime();
        list.stream().forEach(System.out::println);
        long methodReferenceEstimatedTime = System.nanoTime() - startTime;

        summary.add("Test: arrayListPrintln, Type: " + element.getClass() + ", Number of Element: " + numberOfElements +
                "\nLambda Estimated Time:           " + lambdaEstimatedTime +
                "\nMethod Reference Estimated Time: " + methodReferenceEstimatedTime);
    }

    public <T> void arrayListValueOf(T element, int numberOfElements) {
        List<T> list = new ArrayList<>();

        for (int i = 0; i < numberOfElements; i++) {
            list.add(element);
        }

        long startTime = System.nanoTime();
        list.stream().forEach((x) -> String.valueOf(x));
        long lambdaEstimatedTime = System.nanoTime() - startTime;

        startTime = System.nanoTime();
        list.stream().forEach(String::valueOf);
        long methodReferenceEstimatedTime = System.nanoTime() - startTime;

        summary.add("Test: arrayListValueOf, Type: " + element.getClass() + ", Number of Element: " + numberOfElements +
                "\nLambda Estimated Time:           " + lambdaEstimatedTime +
                "\nMethod Reference Estimated Time: " + methodReferenceEstimatedTime);
    }

    public void printSummary() {
        summary.stream().forEach(System.out::println);
    }
}