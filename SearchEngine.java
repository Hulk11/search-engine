class SearchEngine{
	public InvertedPageIndex ipi=new InvertedPageIndex();
	
	public void newPage(String x){
	System.out.println("54");
	PageEntry p=new PageEntry(x);
	System.out.print("hulk");
	ipi.addPage(p);
	System.out.println("96");
	}
	
	public void queryFindPagesWhichContainWord(String x){
		int q=0;
		if(ipi.ntable.an[ipi.ntable.getHashIndex(x)]==null)
	    { 
	 	  System.out.println("No such word");
	    }
	    else{
	    Node<WordEntry> n1=ipi.ntable.an[ipi.ntable.getHashIndex(x)].head;
	while(n1!=null)
	{
		q++;
		if(n1.getData().wordg().equals(x)){
			MyLinkedList<Position> gh=n1.getData().getAllPositionsForThisWord();
		Node<Position> n2=gh.head;
		while(n2!=null)
		{
			System.out.println(n2.getData().getPageEntry().nameg()+ ",  ");
			n2=n2.getLink();
		}
		break;
		}
		else
		{
			n1=n1.getLink();
			}
		}
	}
}


     public void queryFindPositionsOfWordInAPage(String word1,String page1){
		 String word = word1.toLowerCase();
		 String page = page1.toLowerCase();
		 PageEntry pen = new PageEntry(page);
		 if(ipi.getPagesWhichContainWord(word).isMember(pen)){
		
		Node<WordEntry> n1=ipi.ntable.an[ipi.ntable.getHashIndex(word)].head;
		while(n1!=null)
		{
			if(n1.getData().wordg().equals(word))
			{
				MyLinkedList<Position> nmylis=n1.getData().getAllPositionsForThisWord();
				Node<Position> n2=nmylis.head;
				while(n2!=null)
				{
					if(n2.getData().getPageEntry().nameg().equals(pen))
					{
						System.out.print(n2.getData().getWordIndex()+"  ," );
						n2=n2.getLink();
					}
					else{
						n2=n2.getLink();
					}
					System.out.println();
				 }
				 n1=n1.getLink();
			}
				else{
					n1=n1.getLink();
				}
			}
		}
		else
		{
			System.out.println("Error");
		}
		 
	 }
	 
	public void performAction(String actionMessage){
	if (actionMessage.charAt(10) == 'o') {
		
		queryFindPositionsOfWordInAPage(
				
						actionMessage.substring(actionMessage.indexOf(" ") + 1, actionMessage.lastIndexOf(" ")),
				
						actionMessage.substring(actionMessage.lastIndexOf(" ") + 1, actionMessage.length()));
	}
	
	if (actionMessage.charAt(10) == 'a') {
		queryFindPagesWhichContainWord(actionMessage.substring(actionMessage.lastIndexOf(" ") + 1, actionMessage.length()));
	}
	if (actionMessage.charAt(0) == 'a') {
		newPage(actionMessage.substring(actionMessage.lastIndexOf(" ") + 1, actionMessage.length()));
	}	
	}
	
	
	
}