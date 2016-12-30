public class MySet<T>{
	MyLinkedList<T> op = new MyLinkedList<T>();
	private T t;
	private int size = 0;
	
	public void addelement(T t1){ 
	        op.insertAthead(t);
			size++;
			}
	
	public T get(){
		return t;
	} 
	
	public boolean isMember(T o){
		return op.member(o);
	}
	
	public int getsize(){
		return size;
	}

	public void delete(T o){
		op.Delete(o);
	}

 
	
	public MySet<T> intersection(MySet<T> oSet){
		MySet<T> ms = new MySet<T>();
        for(int y = 0;y<this.getsize();y++){
			T elem = op.givT(y);
			if(oSet.isMember(elem)){
				ms.addelement(elem);
			}
		}
		return ms;
	}
	
	
	public MySet<T> union(MySet<T> oSet){
	    MyLinkedList<T> li = op;
		while(size!=0)
		{if(!oSet.isMember(li.head.getData()))
		    {oSet.addelement(li.head.getData());}
		li.head = li.head.getLink();
		size--;
		}
    return oSet;
}
}