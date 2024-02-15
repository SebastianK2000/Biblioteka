package ui;

import service.Library;
import model.Book;
import model.Publication;
import exception.LibraryException;

import java.util.Scanner;

public class LibraryApp {
    private Library library;
    private Scanner scanner;

    public LibraryApp() {
        this.library = new Library();
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        while (true) {
            displayMenu();
            handleUserInput();
        }
    }

    private void displayMenu() {
        System.out.println("Wybierz opcję:");
        System.out.println("1. Dodaj książkę, usuń bądź zaktualizuj");
//        System.out.println("1. Dodaj publikację");
//        System.out.println("2. Usuń publikację");
//        System.out.println("3. Aktualizuj publikację");
        System.out.println("2. Wyszukaj publikację");
        System.out.println("3. Wyświetl wszystkie publikacje");
        System.out.println("0. Wyjście");
    }

    private void handleUserInput() {
        int option = scanner.nextInt();
        scanner.nextLine();

        switch (option) {
//            case 1:
//                addPublication();
//                break;
//            case 2:
//                removePublication();
//                break;
//            case 3:
//                updatePublication();
//                break;
            case 1:
                container();
                break;
            case 2:
                searchPublication();
                break;
            case 3:
                displayAllPublications();
                break;
            case 0:
                System.out.println("Życzymy miłej reszty dnia! Do widzenia!");
                System.exit(0);
                break;
            default:
                System.out.println("Nieprawidłowa opcja. Spróbuj ponownie.");
        }
    }


    private void container() {
        System.out.println("Wybierz opcję:");
        System.out.println("1. Dodaj publikację");
        System.out.println("2. Usuń publikację");
        System.out.println("3. Aktualizuj publikację");
        System.out.println("0. Wróć do menu głównego");

        int option = scanner.nextInt();
        scanner.nextLine();

        switch (option) {
            case 1:
                addPublication();
                break;
            case 2:
                removePublication();
                break;
            case 3:
                updatePublication();
                break;
            case 0:
                start();
                break;
            default:
                System.out.println("Nieprawidłowa opcja. Spróbuj ponownie.");
        }
    }


    private void addPublication() {

        System.out.println("Podaj tytuł: ");
        String title = scanner.nextLine();

        System.out.println("Podaj autora: ");
        String author = scanner.nextLine();

        System.out.println("Podaj rok wydania: ");
        int yearPublication = scanner.nextInt();
        scanner.nextLine();

        try {
            if (yearPublication < 0) {
                throw new LibraryException("Rok wydania nie może być ujemny.");
            }

            if (library.searchPublication(title) != null) {
                throw new LibraryException("Nie znaleziono publikacji o podanym tytule.");
            }
            library.addPublication(new Book(title, author, yearPublication));
            System.out.println("Dodano pomyślnie! " + title + " " + author + " " + yearPublication);
        } catch (LibraryException e) {
            System.out.println("Błąd: " + e.getMessage());
        }
    }

    private void removePublication() {
        System.out.println("Podaj tytuł do usunięcia: ");
        String title = scanner.nextLine();

        try {
            if (library.searchPublication(title) == null) {
                throw new LibraryException("Nie znaleziono publikacji o podanym tytule.");
            }
            library.removePublication(title);
            System.out.println("Usunięto pomyślnie! " + title);
        } catch (LibraryException e) {
            System.out.println("Błąd: " + e.getMessage());
        }
    }

    private void updatePublication() {

        System.out.println("Podaj tytuł do aktualizacji: ");
        String title = scanner.nextLine();

        try {
            // Zmiana warunku na sprawdzenie, czy publikacja ISTNIEJE
            if (library.searchPublication(title) == null) {
                throw new LibraryException("Nie znaleziono publikacji o podanym tytule.");
            }

            System.out.println("Podaj nowy tytuł: ");
            String newTitle = scanner.nextLine();

            System.out.println("Podaj nowego autora: ");
            String newAuthor = scanner.nextLine();

            System.out.println("Podaj nowy rok wydania: ");
            int newYearPublication = scanner.nextInt();
            scanner.nextLine();

            library.updatePublication(title, new Book(newTitle, newAuthor, newYearPublication));
            System.out.println("Publikacja zaktualizowana.");
        } catch (LibraryException e) {
            System.out.println("Błąd: " + e.getMessage());
        }
    }

    private void searchPublication() {
        System.out.println("Podaj tytuł publikacji w celu wyszukania: ");
        String title = scanner.nextLine();

        Publication foundPublication = library.searchPublication(title);

        if (foundPublication != null) {
            System.out.println("Znaleziono publikację: ");
            System.out.println("Tytuł: " + foundPublication.getTitle());
            System.out.println("Autor: " + foundPublication.getAuthor());
            System.out.println("Rok wydania: " + foundPublication.getYearPublication());
        } else {
            System.out.println("Nie znaleziono publikacji o podanym tytule.");
        }
    }

    private void displayAllPublications() {
        System.out.println("Wszystkie publikacje w bibliotece:");
        library.displayPublications();
    }
}
