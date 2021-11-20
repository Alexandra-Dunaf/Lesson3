import java.util.*;

public class TelephoneBook {
    private Map<String, List<String>> telephoneBook_hm = new HashMap<>();
    private List<String> phone_number_list;

    public void add(String surname, String phone_number) {
        if (telephoneBook_hm.containsKey(surname)) {
            phone_number_list = telephoneBook_hm.get(surname);
            phone_number_list.add(phone_number);
            telephoneBook_hm.put(surname, phone_number_list);
        } else {
            phone_number_list = new ArrayList<>();
            phone_number_list.add(phone_number);
            telephoneBook_hm.put(surname, phone_number_list);
        }
    }

    public List<String> get(String surname) {
        return telephoneBook_hm.get(surname);
    }

}
