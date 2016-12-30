class WordEntry{
	MyLinkedList<Position> pl = new  MyLinkedList();
	 Position newp;
	
	public String str1;
    PageEntry p1;
	private int wordindex;
	
	public WordEntry(String word){
		str1 = word.toLowerCase();
	}
	
	public void addPosition(Position position){
         pl.insertAttail(position);
	}
	
	public void addPositions(MyLinkedList<Position> positions){
		 for(int i=1;i<positions.getSize();i++)
		 {pl.insertAttail(positions.givT(i));}
	}
	
	public MyLinkedList<Position> getAllPositionsForThisWord(){
		return pl;
	}

    public String wordg(){
		return str1;
	}	
	
}