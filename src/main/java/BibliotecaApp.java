import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class BibliotecaApp {



    public static void main(String[] args) {
        List<Book> listOfBooks = new ArrayList<>();
        addBooksToList(listOfBooks);
        Library biblioteca = new Library(listOfBooks);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap <String,Command> menuItems = new HashMap<>();
        menuItems.put("1", new ListBooksCommand(biblioteca,System.out));
        Console console = new Console(biblioteca, System.out, reader, menuItems);
        
        console.runLibrary();
    }

    public static void addBooksToList(List<Book> listOfBooks) {
        listOfBooks.add(new Book("Catch-22","Joseph Heller", 1961));
        listOfBooks.add(new Book("Harry Potter and the Sorcerer's Stone", "JK Rowling", 1997));
        listOfBooks.add(new Book("Notes from the Underground", "Fyodor Dostoevsky", 1864));
        listOfBooks.add(new Book("Head First Java", "Bert Bates and Kathy Sierra", 2003));
    }
}
