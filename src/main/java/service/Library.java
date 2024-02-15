package service;

import model.Book;
import model.Publication;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Publication> publications;

    public Library() {
        this.publications = new ArrayList<>();
    }

    public void addPublication(Publication publication) {
        publications.add(publication);
    }

    public void removePublication(String title) {
        publications.removeIf(publication -> publication.getTitle().equals(title));
    }

    public void updatePublication(String title, Publication newPublication) {
        for (int i = 0; i < publications.size(); i++) {
            if (publications.get(i).getTitle().equals(title)) {
                publications.set(i, newPublication);
                break;
            }
        }
    }

    public Publication searchPublication(String title) {
        for (Publication publication : publications) {
            if (publication.getTitle().equals(title)) {
                return publication;
            }
        }
        return null;
    }

    public void displayPublications() {
        for (Publication publication : publications) {
            System.out.println("Title: " + publication.getTitle());
            System.out.println("Author: " + publication.getAuthor());
            System.out.println("Year: " + publication.getYearPublication());
            System.out.println("---------------");
        }
    }

}
