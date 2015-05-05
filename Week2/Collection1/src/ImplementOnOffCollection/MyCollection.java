package ImplementOnOffCollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class MyCollection<T> extends MyCollectionImpl<T> {

    protected List<T> list;

    public MyCollection() {
        list = new ArrayList<T>();
    }

    @Override
    public boolean add(T e) {

        if (list.isEmpty())
            list.add(e);
        else {
            for (Object obj : list) {
                if (e.hashCode() == obj.hashCode())
                    return false;
            }
            list.add(e);
        }
        return false;
    }

    @Override
    public void clear() {
        list.clear();
    }

    @Override
    public boolean contains(java.lang.Object o) {
        for (Object obj : list) {
            if (o.hashCode() == obj.hashCode())
                return true;
        }
        return false;
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public boolean remove(java.lang.Object o) {

        list.remove(o);
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        Iterator<?> iterator = c.iterator();
        for (Object obj : list) {
            while (iterator.hasNext()) {
                if (obj.hashCode() == iterator.next().hashCode()) {
                    list.remove(obj);
                }
            }
        }
        return false;
    }

    @Override
    public int size() {
        return list.size();
    }
    @Override
    public String toString(){
        String result = "";
        for(T t : list){
            result += t + " ";
        }
        return result;
        
    }
}
