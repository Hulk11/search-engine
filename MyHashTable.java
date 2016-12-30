class MyHashTable{
      
	  private String strng;
      
	  private int ti;
	  
	  MyLinkedList<WordEntry> an[]=new MyLinkedList[20];
     
	 public static String[] change1(String page){
	String[] words = page.split("\\s+");
      for (int i = 0; i < words.length; i++) {
             words[i] = words[i].replaceAll("[^\\w]", "");
	    }
		return words;
    }
	  
	 public MyHashTable(){
	for(int i=0;i<20;i++){
		an[i]=new MyLinkedList();
	}
  }
	  
	  public int getHashIndex(String str){
		 return hashit(str);
		 
	  }                                                                                               
	  
	  public void addPositionsForWord(WordEntry w){
		  String star = w.wordg().toLowerCase();
		  int g=getHashIndex(star);
		  int count;
		  if(an[g]==null){
			  an[g].insertAttail(w);
		  }
		  else{
			  Node<WordEntry> pseudo = an[g].head;
			  while(pseudo!=null)
			  { if(pseudo.getData().wordg().equals(star)){
				  pseudo.getData().addPositions(w.getAllPositionsForThisWord());
				pseudo=pseudo.getLink();
			  }
			  else{
				  pseudo = pseudo.getLink();
			  }
		   }
		  }
	  }
	  
	  
	  public int hashit(String str){
		 int k=0;
		 int i = str.length();
	     for(int y=0;y<i;y++){
			  k = k+givint(str.charAt(y));
			  }
			  
		return k%20;	  
	  }
	  public int func(String x,int M)
{
		   char ch[];
		   ch = x.toCharArray();
		   int i, sum;
		   for (sum=0, i=0; i < x.length(); i++)
		     sum += ch[i];
		   return sum % M;
		 }
	  
	
    	public int[] hashon(String str){
		  String[] poi = change1(str);
		  int[] ans = new int[poi.length];
		  for(int o=0;o<poi.length;o++){
			  ans[o] = hashit(poi[o]);
              ans[o] = ans[o]%(poi.length);
		   }
		  return ans;
	  }
	 

	 public static int givint(char lk){
		int j=0; 
		{if(lk=='a')
			  j =  1;
		   
			  if(lk=='b')
				  j =  2;
		  
			  if(lk=='c')
				  j =  3;
  
			  if(lk=='d')
				  j =  4;
  
			  if(lk=='e')
				  j =  5;
  
			  if(lk=='f')
				  j =  6;
  
			  if(lk=='g')
				  j =  7;
  
			  if(lk=='h')
				  j =  8;
  
			  if(lk=='i')
				  j =  9;
  
			  if(lk=='j')
				  j =  10;
  
			  if(lk=='k')
				  j =  11;
  
			  if(lk=='l')
				  j =  12;
  
			  if(lk=='m')
				  j =  13;
  
			  if(lk=='n')
				  j =  14;
  
			  if(lk=='o')
				  j =  15;
  
			  if(lk=='p')
				  j =  16;
  
			  if(lk=='q')
				  j =  17;
  
			  if(lk=='r')
				  j =  18;
  
			  if(lk=='s')
				  j =  19;
  
			  if(lk=='t')
				  j =  20;
  
			  if(lk=='u')
				  j =  21;
 
		  if(lk=='v')
				  j =  22;
  		  if(lk=='w')
				  j =  23;
  
	  if(lk=='x')
				  j =  24;
  
			  if(lk=='y')
				  j =  25;
  
			  if(lk=='z')
				  j =  26;
	}

         return j;	}
	  
	

   
 
}