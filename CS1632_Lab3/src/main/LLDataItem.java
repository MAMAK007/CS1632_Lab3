package main;

public class LLDataItem<T> {
    protected T data;
    protected LLDataItem<T> next;
    
    // Constructors
    private LLDataItem() {}
    public LLDataItem(T d) { 
    	data = d; next = null;
    }
    public LLDataItem(T d, LLDataItem<T> n) {
    	data = d; next = n; 
    }
    
    // Gets and Sets
    T getData() {
    	return data;
    }
    
    public LLDataItem<T> getNext() { 
    	return next;
    }
    
    public void setData(T d) {
    	data = d;
    }
    
    public void setNext(LLDataItem<T> n) {
    	next = n;
    }
}

