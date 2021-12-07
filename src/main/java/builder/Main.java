package builder;

public class Main {
    public static void main(String[] args) {
        User user = User.builder()
                .firstName("Khrystyna")
                .age(18)
                .occupation("UCU")
                .lastName("Kovalchuk")
                .build();
        System.out.println(user);
    }
}
