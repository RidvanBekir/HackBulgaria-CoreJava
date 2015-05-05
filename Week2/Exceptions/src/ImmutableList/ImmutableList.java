package ImmutableList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

@SuppressWarnings("serial")
final public class ImmutableList<E> extends ArrayList<E> {
    
    public ImmutableList(){
    }
    
    public ImmutableList(Collection<? extends E> collection){
        Iterator<? extends E> iterator = collection.iterator();
        while (iterator.hasNext()) {
            super.add(iterator.next());
        }
    }
    
    @SafeVarargs
    public static <T> List<T> asList(T... arguments){
        final List<T> list = new ArrayList<T>(arguments.length);
        for (final T l : arguments) {
          list.add(l);
        }
        return (list);
    }
    
    @Override
    public boolean add(E e) throws RuntimeException {
        throw new RuntimeException("Tried to add element to immutable list !");
    }
    
    @Override
    public void add(int arg0, E arg1) throws RuntimeException {
        throw new RuntimeException("Tried to add element to immutable list !");
    }

    @Override
    public boolean addAll(Collection<? extends E> arg0) throws RuntimeException {        
        throw new RuntimeException("Tried to add element to immutable list !");
    }

    @Override
    public boolean addAll(int arg0, Collection<? extends E> arg1) throws RuntimeException {
        throw new RuntimeException("Tried to add element to immutable list !");
    }
    
    @Override
    public E set(int index,E element){
        throw new RuntimeException("Tried to set in immutable list !");
    }

    @Override
    public void clear() throws RuntimeException {
        throw new RuntimeException("Tried to clear from immutable list !");
    }
    
    @Override
    public boolean remove(Object arg0) throws RuntimeException{
        throw new RuntimeException("Tried to remove from immutable list !");
    }

    @Override
    public E remove(int arg0) throws RuntimeException {
        throw new RuntimeException("Tried to remove from immutable list !");
    }

    @Override
    public boolean removeAll(Collection<?> arg0) throws RuntimeException {
        throw new RuntimeException("Tried to remove from immutable list !");
    }
    
    @Override
    protected void removeRange(int fromIndex,
            int toIndex) throws RuntimeException{
        throw new RuntimeException("Tried to remove from immutable list !");
    }
    
    @Override
    public E get(int index){
        E e = super.get(index);
        return e;
    }
}

