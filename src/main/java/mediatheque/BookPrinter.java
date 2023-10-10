package mediatheque;

public class BookPrinter implements ItemVisitor {

    @Override
    public void visitCD(CD item) {

    }

    @Override
    public void visitBook(Book item) {
        item.print();

    }
}
