package ImplementOnOffCollection;

public class OnOffCollection {

    public static void main(String[] args) {

        MyCollection<Object> collection = new MyCollection<Object>();
        collection.add(10);
        collection.add(15);
        collection.add(10);
        collection.add(15);
        collection.add(23);
        System.out.println(collection.toString());
    }
}
