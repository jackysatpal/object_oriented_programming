public class Main {
    
    public static void main(String[] args) {
        Phonebook testPhoneBook = new Phonebook();
        
        testPhoneBook.add("Pekka Mikkola", "040-123123");
        testPhoneBook.add("Edsger Dijkstra", "045-456123");
        testPhoneBook.add("Donald Knuth", "050-222333");
        
        String number = testPhoneBook.searchNumber("Pekka Mikkola");
        System.out.println( number );

        number = testPhoneBook.searchNumber("Martti Tienari");
        System.out.println( number );
    }
}