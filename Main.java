import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import src.Person;

public class Main {
    public static void main(String[] args) {
        Queue<Person> queue = new LinkedList<>(generateClients());

        while (!queue.isEmpty()) {
            Person person = queue.poll();

            System.out.println(person + " прокатился на аттракционе.");

            person.decreaseTickets();

            if (person.getTickets() > 0) {
                queue.offer(person);
            }
        }
    }

    public static List<Person> generateClients() {
        List<Person> people = new ArrayList<>();

        people.add(new Person("Иван", "Иванов", 3));
        people.add(new Person("Петр", "Петров", 2));
        people.add(new Person("Алексей", "Сидоров", 1));
        people.add(new Person("Анна", "Каренина", 4));
        people.add(new Person("Мария", "Медведева", 2));

        return people;
    }
}