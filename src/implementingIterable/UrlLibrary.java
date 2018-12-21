package implementingIterable;

import java.util.Iterator;
import java.util.LinkedList;

public class UrlLibrary implements Iterable<String> {// implement Iterable interface
    private LinkedList<String> urls = new LinkedList<String>();

    public UrlLibrary(){
        urls.add("http://www.facebook.com");
        urls.add("http://www.youtube.com");
        urls.add("http://www.Instagram.com");
    }

    @Override
    public Iterator<String> iterator() {
        return urls.iterator();

    }
}
