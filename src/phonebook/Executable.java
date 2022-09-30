package phonebook;

import phonebooktests.PhoneBookTests;

public class Executable {
    public static void main(String[] args) {
        try {
            boolean ok = true;
            PhoneBookTests phoneBookTester = new PhoneBookTests();
            ok = ok && phoneBookTester.testGetPhoneNumbers();
            ok = ok && phoneBookTester.testGetNames();
            System.out.println(ok ? "All tests OK" : "At least one test KO");
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
