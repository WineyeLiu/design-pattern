package cn.wineyeliu.learnning.designpattern.iterator;
/**
 * Book entity
 * @author LiuWenai
 * Create on 2018/9/17 11:58
 */
public class Book implements Readable {
    private String bookName;

    private double price;

    private String pressName;

    public Book (String bookName, double price, String pressName) {
        this.bookName = bookName;
        this.price = price;
        this.pressName = pressName;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getPressName() {
        return pressName;
    }

    public void setPressName(String pressName) {
        this.pressName = pressName;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", price=" + price +
                ", pressName='" + pressName + '\'' +
                '}';
    }
}
