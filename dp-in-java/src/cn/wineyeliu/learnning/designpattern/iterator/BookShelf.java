package cn.wineyeliu.learnning.designpattern.iterator;
/**
 * BookShelf is a container
 * @author LiuWenai
 * Create on 2018/9/13 12:51
 */
public class BookShelf  implements Aggregate<Book> {
    private int index;
    private Book[] books;

    public BookShelf (int size) {
        this.index = 0;
        this.books = new Book[size];
    }

    public void add(Book book) {
        books[index] = book;
        index ++;
    }

    public Book[] getBooks() {
        return this.books;
    }

    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}
