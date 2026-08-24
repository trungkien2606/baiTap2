package murach.data;

import murach.business.User;

public class UserDB {

    public static void insert(User user) {
        // Code lưu User vào database sẽ được viết ở đây
        System.out.println("User added:");
        System.out.println("First Name: " + user.getFirstName());
        System.out.println("Last Name: " + user.getLastName());
        System.out.println("Email: " + user.getEmail());
    }
}