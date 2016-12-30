class Position{
	public PageEntry pagentry;
	
	private int wordindex;
    
	private String page ;
	

	
	public Position(PageEntry p,int wordIndex){
		pagentry = p;
		wordindex = wordIndex;
	}
	
	public PageEntry getPageEntry(){
		return pagentry;
	}
	
	public int getWordIndex(){
		return wordindex;
	}
}