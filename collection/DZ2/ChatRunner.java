package com.kda.collection.DZ2;

import java.util.*;

public class ChatRunner {

    public static void main(String[] args) {

        User userOne = new User("Dima", 27);
        User userTwo = new User("Pety", 15);
        User userThree = new User("Pasha", 26);
        User userFour = new User("Sergey", 20);

        Chat chatOne = new Chat("chatOne", Arrays.asList(userOne, userTwo));
        Chat chatTwo = new Chat("chatTwo", Arrays.asList(userThree, userFour));

        List<Chat> listChat = Arrays.asList(chatOne, chatTwo);

        List<User> listUser = new ArrayList<>();
        int summaAge = 0;
        int count = 0;

        for (Iterator<Chat> iterator = listChat.iterator(); iterator.hasNext(); ) {
            Chat chatSample = iterator.next();
            List<User> userSample = chatSample.getUser();
            for (Iterator<User> iteratorTwo = userSample.iterator(); iteratorTwo.hasNext(); ) {
                User user = iteratorTwo.next();
                if (user.getAge() >= 18) {
                    listUser.add(user);
                    summaAge += user.getAge();
                    count++;
                }

            }
        }
        System.out.println(listUser);
        System.out.println("Средний возраст оставшихся пользователей: " + (double) summaAge / (double) count);


    }

}
