import java.util.*;
import java.io.*;
class InvertedPageIndex{
	MySet<PageEntry> mspe = new MySet();
	MyHashTable ntable = new MyHashTable();
	
	public void addPage(PageEntry p){
		mspe.addelement(p);
	    MyLinkedList<WordEntry> lwe = p.getPageIndex().getWordEntries();
		lwe = p.getPageIndex().getWordEntries();
		Node<WordEntry> x = lwe.head;
		
		while(x!=null){
		   String start = x.getData().wordg().toLowerCase();
            
            
     if(start==""){
				 	int t = ntable.getHashIndex(start);
		if(ntable.an[t]!=null){
			   MyLinkedList<WordEntry> pirate=ntable.an[t];
		       Node<WordEntry> ryu = pirate.head;
		         while(ryu!=null){
			            if(ryu.getData().wordg().equals(x.getData().wordg())){
				            ntable.addPositionsForWord(x.getData());
				            break;
			              }
			            else{
			              	ryu=ryu.getLink();
			             }
		         }
	    }
		else{
			ntable.addPositionsForWord(x.getData());
		 }
	
       	ntable.an[t].insertAttail(x.getData());
		x=x.getLink();
     }	 
	 else{
				 x=x.getLink();
	}			 
			 }
	}
	
	
	
	public MySet<PageEntry> getPagesWhichContainWord(String str){
		
	MySet<PageEntry> moth=new MySet<PageEntry>();
	MySet<PageEntry> das=new MySet<PageEntry>();
	MySet<Float> flset=new MySet<Float>();
	Node<PageEntry> penode=mspe.op.head;
	 
    String str1 = str.toLowerCase();
	while(penode!=null)
	{
		int x=0;
	float rel=0;
	try{
		FileInputStream newfire=new FileInputStream(penode.getData().nameg());
		Scanner s=new Scanner(newfire);
		while(s.hasNext())
		{
			String star=s.next();
			if(star.equals(str1))
			{
				x++;
				rel+=(1/(x*x));
			}
			else{
				x++;
			}
		}s.close();
		flset.addelement(rel);
	}
	catch (Exception e){
		System.out.println("file not found");}
	penode=penode.getLink();
	}
	
	Node<Float> temp1=flset.op.head;
	float f1=0;
	while(temp1!=null)
	{
		int j=0;
		if (temp1.getData()>=f1)
		{
			f1=temp1.getData();
			j++;
			temp1=temp1.getLink();
		}
		else
		{
			temp1=temp1.getLink();
		}
		
		flset.delete(f1);
		Node<PageEntry> otemp=moth.op.head;
		while(j!=0)
		{
		if(j==1)
		{
			if(otemp!=null)
			{das.addelement(otemp.getData());
			moth.delete(otemp.getData());
			j=0;}
			else{
				}
		}
			
		else
		{
			j--;
			otemp=otemp.getLink();
		}
		}
		
		}System.out.println(das.op.getSize());
	return das;
	
}

       
}