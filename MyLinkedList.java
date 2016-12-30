import java.util.Scanner;
class Node<T>
{
    public T data;
    public Node<T> link;
 
 
    public Node()
    {   
        link = null;
        data = null;
    }    
     public Node(T d,Node<T> n)
    {
        data = d;
        link = n;
    }    
    
    public void setLink(Node<T> n)
    {
        link = n;
    }    

    public void setData(T d)
    {
        data = d;
    }    
  
    public Node<T> getLink()
    {
        return link;
    }    
    public T getData()
    {
        return data;
    }
}
 
class MyLinkedList<T>
{
    public Node<T> head;
    public Node<T> tail ;
    private int size ;
 
    public MyLinkedList()
    {
        head = null;
        tail = null;
        size = 0;
    }
    public boolean isEmpty()
    {
        return head == null;
    }
    public int getSize()
    {
        return size;
    }    
    public void insertAthead(T val)
    {
        Node<T> n1 = new Node<T>(val, null);    
        size++ ;    
        if(head == null) 
        {
            head = n1;
            tail = head;
        }
        else 
        {
            n1.setLink(head);
            head = n1;
        }
    }
    public void insertAttail(T val)
    {
        Node<T> n1 = new Node<T>(val,null);    
        size++ ;    
        if(head == null) 
        {
            head = n1;
            tail = head;
        }
        else 
        {
            tail.setLink(n1);
            tail = n1;
        }
    }
   
    public void Delete(T o) {
		
		
		
		if (posn(o) == 1) 
        {
            head = head.getLink();
            size--; 
            return ;
        }
        if (posn(o) == size) 
        {
            Node<T> s = head;
            Node<T> t = head;
            while (s != tail)
            {
                t = s;
                s = s.getLink();
            }
            tail = t;
            tail.setLink(null);
            size --;
            return;
        }
        Node<T> ptr = head;
        
        for (int i = 1; i < size - 1; i++) 
        {
            if (i == posn(o)) 
            {
                Node<T> tmp = ptr.getLink();
                tmp = tmp.getLink();
                ptr.setLink(tmp);
                break;
            }
            ptr = ptr.getLink();
        }
        size-- ;
	}
   

   public int posn(T o){

	int h = size;
		int k = 1;
     if(member(o))
	         
			 {	while(h!=0){
	            	if(o!=head.getData())
		                {k++;
		                 h--;
			             head = head.getLink();}
			 
	              	else 
			             h=0;
		        }	
			 }
	               
			 return k;  
}
	

	
	public boolean member(T o){
		
		boolean b = false;
		int p = size;
		T u;
    if(isEmpty())
        return false;
	else
		while(p != 0)
		{u = head.getData();
			if(p==1){
				if(u==o)
					b = true;
				else
					b=false;
			}
			
			else
			
			{
			if (u==o)
			     b = true;
		    
		
			else
				 head=head.getLink();
		
				p--;
			}	
		}
		return false||b;
	 
	    
	}

	public T givT(int i){
		Node<T> ol = head;
		for(int u=1;u<i;u++)
		{
			ol = ol.getLink();
		}
		
		return ol.getData();
      	
 	}
	
}



