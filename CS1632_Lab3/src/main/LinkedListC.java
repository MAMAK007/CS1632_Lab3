package main;

public class LinkedListC<T> {
    protected LLDataItem<T> first;
    
    public LinkedListC() {
    	first = null;
    }
    
    public LLDataItem<T> getFirst() { 
       return first; 
    }
    
    public void addItem(T d) { 
      first = new LLDataItem<T>(d,first); 
    }
    
    void addItemAtEnd(T d) {
        if (first == null) {
            first = new LLDataItem<T>(d,first);
        } else {
            LLDataItem<T> curr = first;
            while (curr.getNext() != null) {
                curr = curr.getNext();
            }
            curr.setNext(new LLDataItem<T>(d, curr.getNext()));
        }
    }

}
