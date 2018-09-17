package cn.wineyeliu.learnning.designpattern.iterator;
/**
 * Book iterator
 * @author LiuWenai
 * Create on 2018/9/17 11:47
 */
public class BookShelfIterator implements Iterator<Book> {
    private int index = 0;

    private Book[] books;

    public BookShelfIterator(BookShelf bookShelf) {
        this.books = bookShelf.getBooks();
    }

    @Override
    public boolean hasNext() {
        return index < books.length;
    }

    @Override
    public Book next() {
        if (index < books.length){
            Book b = books[index];
            index++;
            return b;
        }
        return null;
    }
}
