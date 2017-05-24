package com.theironyard.charlotte;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        List<User> users =
                Stream.generate(User::createUser).limit(500).collect(Collectors.toList());
        List<String> age = users
            .stream()
            .filter(u -> u.getAge() > 65)
            .map(u -> u.getName())
            .collect(Collectors.toList());

        System.out.println(age);


        List<String> aboveTen = users
            .stream()
            .filter(u -> u.getName().length()>10)
            .map(u -> u.getName())
            .collect(Collectors.toList());

        System.out.println(aboveTen);

        List<String> ext = users
                .stream()
                .filter(u -> u.getPhoneNumber().contains("x"))
                .map(u -> u.getName())
                .collect(Collectors.toList());

        System.out.println(ext);

        List states = users
                .stream()
                .map(u -> u.getState())
                .distinct().collect(Collectors.toList());

        System.out.println(states);
        System.out.println(states.size());

        Integer totalAge = users
                .stream()
                .mapToInt(User::getAge)
                .sum();

        System.out.println(totalAge);

        // given "users" as defined above, print each of the following using Streams:
        // 1: An ordered list of every user's age, filtered by whether they're older than 65

        // 2: A list of all the users whose names are longer than 10 characters

        // 3: A list of all users that have extensions in their phone numbers (e.g. x5209)

        // 4: An alphabetical list of all the distinct states available in the list of users (at most 50)

        // 5: The sum of all the ages of the users in the list.

        // HARD MODE:
        // 6: Convert the list into a HashMap, where the Key is the state the User is from,
        // and the value is a list of users from said state.
    }
}
