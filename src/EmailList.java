import java.util.HashSet;
import java.util.Set;


public class EmailList {

    public static void main(String[] args) {
        Set<String> emails = new HashSet<>();
        emails.add("customer1@example.com");
        emails.add("customer2@example.com");
        emails.add("customer3@example.com");
        System.out.println("Danh sach email");
        for (String email : emails) {
            System.out.println(email);
        }

    }

}
