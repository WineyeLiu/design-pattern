package cn.wineyeliu.learnning.designpattern.iterator.test;

import cn.wineyeliu.learnning.designpattern.iterator.Book;
import cn.wineyeliu.learnning.designpattern.iterator.BookShelf;
import cn.wineyeliu.learnning.designpattern.iterator.Iterator;

public class Main {
    public static void main(String[] args) {
        BookShelf bs = new BookShelf(5);
        bs.add(new Book("A", 50, "press A"));
        bs.add(new Book("B", 50, "press A"));
        bs.add(new Book("C", 50, "press A"));
        bs.add(new Book("D", 50, "press A"));
        bs.add(new Book("E", 50, "press A"));

        Iterator<Book> bi = bs.iterator();
        while (bi.hasNext()) {
            System.out.println(bi.next());
        }
    }
}
