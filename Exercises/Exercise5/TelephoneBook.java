import java.util.HashMap;

public class TelephoneBook {
    public static void main(String[] args) {
        HashMap<String, String> contacts = new HashMap<>();
        contacts.put("Sambuddha", "123456789");
        contacts.put("Abhishek", "210639899");
        contacts.put("Sourajit", "564211347");
        System.out.println("Abhishek's number: " + contacts.get("Abhishek"));
    }
}
