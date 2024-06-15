package com.JavaClasses.Tinder;

import com.JavaClasses.Tinder.Match;
import com.JavaClasses.Tinder.User;

import java.util.Arrays;

public class TinderApp {
    private User[] users;
    private Match[] matches;
    private int userCount;
    private int matchCount;

    public TinderApp(int userCapacity, int matchCapacity) {
        users = new User[userCapacity];
        matches = new Match[matchCapacity];
        userCount = 0;
        matchCount = 0;
    }

    public void addUser(User user) {
        if (userCount < users.length) {
            users[userCount++] = user;
        } else {
            System.out.println("User capacity reached.");
        }
    }

    public User getUser(String userName) {
        for (int i = 0; i < userCount; i++) {
            if (users[i].getUserName().equals(userName)) {
                return users[i];
            }
        }
        return null;
    }

    public void updateUser(String userName, User updatedUser) {
        for (int i = 0; i < userCount; i++) {
            if (users[i].getUserName().equals(userName)) {
                users[i] = updatedUser;
                return;
            }
        }
        System.out.println("User not found.");
    }

    public void deleteUser(String userName) {
        for (int i = 0; i < userCount; i++) {
            if (users[i].getUserName().equals(userName)) {
                for (int j = i; j < userCount - 1; j++) {
                    users[j] = users[j + 1];
                }
                users[--userCount] = null;
                return;
            }
        }
        System.out.println("User not found.");
    }

    public void addMatch(Match match) {
        if (matchCount < matches.length) {
            matches[matchCount++] = match;
        } else {
            System.out.println("Match capacity reached.");
        }
    }

    public Match[] getUserMatches(String userName) {
        Match[] userMatches = new Match[matchCount];
        int count = 0;
        for (int i = 0; i < matchCount; i++) {
            if (matches[i].getUser1().getUserName().equals(userName) || matches[i].getUser2().getUserName().equals(userName)) {
                userMatches[count++] = matches[i];
            }
        }
        return Arrays.copyOf(userMatches, count);
    }

    public void updateMatch(User user1, User user2, Match updatedMatch) {
        for (int i = 0; i < matchCount; i++) {
            if ((matches[i].getUser1().equals(user1) && matches[i].getUser2().equals(user2)) ||
                (matches[i].getUser1().equals(user2) && matches[i].getUser2().equals(user1))) {
                matches[i] = updatedMatch;
                return;
            }
        }
        System.out.println("Match not found.");
    }

    public void deleteMatch(User user1, User user2) {
        for (int i = 0; i < matchCount; i++) {
            if ((matches[i].getUser1().equals(user1) && matches[i].getUser2().equals(user2)) ||
                (matches[i].getUser1().equals(user2) && matches[i].getUser2().equals(user1))) {
                for (int j = i; j < matchCount - 1; j++) {
                    matches[j] = matches[j + 1];
                }
                matches[--matchCount] = null;
                return;
            }
        }
        System.out.println("Match not found.");
    }

    public void listUsers() {
        for (int i = 0; i < userCount; i++) {
            System.out.println(users[i]);
        }
    }

    public void listMatches() {
        for (int i = 0; i < matchCount; i++) {
            System.out.println(matches[i]);
        }
    }
}

