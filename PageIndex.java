class PageIndex{
	public String document;
    public WordEntry we; 
	 public MyLinkedList<WordEntry> wel = new MyLinkedList<WordEntry>();
	 
	 public void addPositionForWord(String str,Position p){
      Node<WordEntry> w = wel.head;
	  WordEntry z ;
      	  int k=0;
		try{  for(int f=0;f<wel.getSize();f++){
			   
			  if(w.getData().wordg().equals(str.toLowerCase()))
			  { w.getData().addPosition(p);
		  w=w.getLink();}
			else	
			{if(w.getLink()!=null)
					w = w.getLink();				
			else
				k=5;
			} 
		  }
		  
		 
		  if(k==5)
			   we=new WordEntry(str);
		       we.addPosition(p);
		        wel.insertAttail(we);
		}
catch(Exception e){
	System.out.print("can't find file");
}		
	 }
	
	
	public MyLinkedList<WordEntry> getWordEntries(){
	return wel;
	}
}
    