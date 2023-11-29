package lb8;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

// Generic-класс для работы с группами объектов
class Group<T> {
    private List<T> elements = new ArrayList<>();

    // Метод для добавления объекта в группу
    public void add(T element) {
        elements.add(element);
    }

    // Метод для удаления объекта из группы
    public void remove(T element) {
        elements.remove(element);
    }

    // Метод для добавления коллекции объектов в группу
    public void addAll(Collection<? extends T> collection) {
        elements.addAll(collection);
    }

    // Метод для вывода элементов группы
    public void display() {
        for (T element : elements) {
            System.out.println(element);
        }
    }

    // Статический generic-метод для удаления четных элементов из группы
    public static <E> void removeEven(Group<E> group) {
        Iterator<E> iterator = group.elements.iterator();
        while (iterator.hasNext()) {
            iterator.next();
            iterator.remove();
            if (iterator.hasNext()) {
                iterator.next();
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Пример использования Generic-класса
        Group<Integer> integerGroup = new Group<>();
        integerGroup.add(1);
        integerGroup.add(2);
        integerGroup.add(3);

        System.out.println("Original Integer Group:");
        integerGroup.display();

        // Пример использования метода для добавления коллекции
        Collection<Integer> integerCollection = List.of(4, 5, 6);
        integerGroup.addAll(integerCollection);

        System.out.println("\nInteger Group after adding collection:");
        integerGroup.display();

        // Пример использования статического generic-метода для удаления четных элементов
        Group.removeEven(integerGroup);

        System.out.println("\nInteger Group after removing even elements:");
        integerGroup.display();
    }
}


