package mediatheque;

public interface ItemVisitor {
    public void visitCD(CD item);
    public void visitBook(Book item);
}
