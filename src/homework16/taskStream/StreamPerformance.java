package homework16.taskStream;

import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Collectors;

public class StreamPerformance {
    public static void main(String[] args) {
        List<Integer> sp = randomList(1, 20, 20);
        //убрать дубликаты
        sp.stream()
                // .distinct()
                .forEach(sps -> System.out.print(sps + " "));
        System.out.println();
        //Выбрать только четные элементы в диапазоне от 7 до 17 (включительно)
        sp.stream()
                .filter(x -> x >= 7 && x <= 17)
                .filter(x -> x % 2 == 0)
                .forEach(s -> System.out.print(s + " "));
        System.out.println();
        //Каждый элемент умножить на 2
        sp.stream()
                .map(x -> x * 2)
                .forEach(s -> System.out.print(s + " "));
        System.out.println();
        //Отсортировать
        sp.stream()
                .sorted()
                .forEach(s -> System.out.print(s + " "));
        System.out.println();
        //Вывести на экран первых 4 элемента
        sp.stream()
                .limit(4)
                .forEach(s -> System.out.print(s + " "));
        System.out.println();
        //Найти сумму элементов
        Optional<Integer> result = sp.stream().reduce((x, y) -> x * y);
        System.out.println(result.get());
    }

    public static List<Integer> randomList(int min, int max, int count) {
        return new Random()
                .ints(min, max)
                .limit(count)
                .distinct()
                .boxed()
                .collect(Collectors.toList());
    }

}
