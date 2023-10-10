package mediatheque;

public class Main {
    public static void main(String[] args) {
        Mediatheque mediatheque = new Mediatheque();

        mediatheque.addItem( new Book("J.R.R. Tolkien", "Le seigneur des anneaux"));
        mediatheque.addItem( new Book("Philip K. Dick", "Le Maître du haut chateau"));
        mediatheque.addItem(new Book("J.K. Rowling","Harry Potter à l'école des sorciers"));

        mediatheque.addItem( new CD(12, "Sergeant Peppers"));
        mediatheque.addItem(new CD(14, "The Police"));

        System.out.println("Voici le catalogue de la médiathèque : ");
        mediatheque.printCatalog();

        System.out.println("Voici tous les livres : ");
        mediatheque.printOnlyBooks();

        System.out.println("Voici tous les CDs : ");
        mediatheque.printOnlyCDs();
    }
}
