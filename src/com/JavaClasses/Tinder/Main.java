package com.JavaClasses.Tinder;

public class Main {
    public static void main(String[] args) {
        TinderApp tinderApp = new TinderApp(10, 10);

        User user1 = new User("sita", "Sita Sharma", 25, "Female");
        User user2 = new User("geeta", "Geeta Kapoor", 22, "Female");
        User user3 = new User("preeti", "Preeti Verma", 30, "Female");
        User user4 = new User("virat", "Virat Kohli", 34, "Male");

        tinderApp.addUser(user1);
        tinderApp.addUser(user2);
        tinderApp.addUser(user3);
        tinderApp.addUser(user4);

        tinderApp.listUsers();

        Match match1 = new Match(user1, user2);
        Match match2 = new Match(user2, user3);

        tinderApp.addMatch(match1);
        tinderApp.addMatch(match2);

        tinderApp.listMatches();

        User fetchedUser = tinderApp.getUser("sita");
        System.out.println("Fetched User: " + fetchedUser);

        User updatedUser = new User("sita", "Sita Sharma", 26, "Female");
        tinderApp.updateUser("sita", updatedUser);

        tinderApp.listUsers();

        tinderApp.deleteUser("preeti");

        tinderApp.listUsers();

        tinderApp.deleteMatch(user1, user2);

        tinderApp.listMatches();
    }
}

