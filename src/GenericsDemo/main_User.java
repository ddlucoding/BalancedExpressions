package GenericsDemo;

public class main_User {
    public static void main(String[]args){
        User user1 = new User(2);
        User user2 = new User(2);

        System.out.println(compare(user1, user2));

    }
    public static String compare(User user1, User user2){
        if (user1.aime_score>user2.aime_score){
            return "User 1 scored higher than User 2";
        }
        if (user1.aime_score==user2.aime_score)
            return "User1 and User 2 scored the same.";
        return "User 2 scored higher than User 1";
    }
}
