package com.suganthan.stackoverflow;

import java.time.LocalDateTime;
import java.time.YearMonth;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by msuganthan on 27/7/19.
 */
public class GroupByTest {
    public static void main(String[] args) {
        Person person = new Person(0, LocalDateTime.now());
        Person person1 = new Person(1, LocalDateTime.now().plusDays(1));
        Person person2 = new Person(2, LocalDateTime.now().plusDays(1).plusSeconds(200));
        Person person3 = new Person(3, LocalDateTime.now().minusYears(10));
        Person person4 = new Person(4, LocalDateTime.now().plusDays(1).plusMinutes(100));
        Person person5 = new Person(5, LocalDateTime.now().minusYears(10));
        Person person6 = new Person(6, LocalDateTime.now().plusDays(1));
        Person person7 = new Person(7, LocalDateTime.now().minusYears(10).minusMonths(1));
        Person person8 = new Person(8, LocalDateTime.now().plusDays(1).plusMinutes(100));
        Person person9 = new Person(9, LocalDateTime.now().plusDays(1));
        Person person10 = new Person(10, LocalDateTime.now().plusDays(1).plusMinutes(100).plusSeconds(200));

        List<Person> personList = new ArrayList<>();
        personList.add(person);
        personList.add(person1);
        personList.add(person2);
        personList.add(person3);
        personList.add(person4);
        personList.add(person5);
        personList.add(person6);
        personList.add(person7);
        personList.add(person8);
        personList.add(person9);
        personList.add(person10);

        Map<YearMonth, List<Person>> collect = personList.stream()
                .collect(Collectors.groupingBy(p -> YearMonth.from(p.getJoinedDateTime())));

        collect.entrySet()
                .stream()
                .forEach(System.out::println);

    }

    static class Person {
        int id;
        LocalDateTime joinedDateTime;
        Person(int id, LocalDateTime joinedDateTime) {
            this.id = id;
            this.joinedDateTime = joinedDateTime;
        }

        public LocalDateTime getJoinedDateTime() {
            return joinedDateTime;
        }

        public int getId() {
            return id;
        }

        @Override
        public String toString() {
            return String.valueOf(this.id);
        }
    }
}
