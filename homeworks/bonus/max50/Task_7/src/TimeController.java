import java.util.*;

public final class TimeController {

    public static int getActionWithMaxTime(ArrayList<String> lessons, ArrayList<Integer> timePerLesson) {
        Map<String, Integer> mappedLessons = new HashMap<>();

        for (int i = 0; i < lessons.size(); i++) {
            final int atomicI = i;
            mappedLessons.putIfAbsent(lessons.get(i), 0);
            mappedLessons.computeIfPresent(lessons.get(i), (key, oldValue) -> oldValue + timePerLesson.get(atomicI) );
        }

        return Collections.max(mappedLessons.entrySet(), Map.Entry.comparingByValue() ).getValue();
    }
}
//Сортировка здесь не поможет, т.к. индексы элементов в первом списке соотносятся с индексами во втором списке,
//Нужно учитывать, что в списке lessons могут содержаться дубликаты названия занятий, поэтому нужно занести их в Map