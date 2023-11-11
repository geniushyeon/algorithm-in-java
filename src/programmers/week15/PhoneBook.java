package programmers.week15;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class PhoneBook {

    public static void main(String[] args) {
        String[] phone_book = new String[]{"123", "456", "789"};
        System.out.println(new PhoneBook().solution(phone_book));;
    }

    public boolean solution(String[] phone_book) {
        Arrays.sort(phone_book);

        for (int i = 0; i < phone_book.length; i++) {
            String number = phone_book[i];
            if (phone_book[i + 1].startsWith(number)) {
                return false;
            }
        }

        return true;
    }
}
