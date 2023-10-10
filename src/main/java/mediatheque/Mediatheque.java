package mediatheque;

import java.util.LinkedList;
import java.util.List;


public class Mediatheque {
	private final List<Item> items = new LinkedList<>();
	public void addItem(Item i) {
		items.add(i);
	}
	
	public void printCatalog() {
		for (Item i : items){
			System.out.println(i);
		}
	}
	
	public void printOnlyBooks() {
		BookPrinter bookprinter = new BookPrinter();
		for (Item i : items){
			i.accept(bookprinter);
		}
	}

	public void printOnlyCDs() {
		CDPrinter cdprinter = new CDPrinter();
		for (Item i : items){
			i.accept(cdprinter);
		}
	}

}
