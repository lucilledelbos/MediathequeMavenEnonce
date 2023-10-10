package mediatheque;

public class CDPrinter implements ItemVisitor {


    @Override
    public void visitCD(CD item) {
        item.print();

    }

    @Override
    public void visitBook(Book item) {
    }
}
