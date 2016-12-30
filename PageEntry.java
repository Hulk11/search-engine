import java.util.*;
import java.io.*;

class PageEntry{
	PageIndex npi = new PageIndex();
	public String docName;
	Position asd;
	
	
	public PageEntry(String pageName){   
		docName = pageName.toLowerCase();
	    String[] lp = change(docName);
		int i=0;
		try{
	             FileInputStream newfire=new FileInputStream(pageName);
                 Scanner s = new Scanner(newfire);
                                
			   while(s.hasNext())
                {
	               String start=s.next();
	               i++;
	               if(!istop(start))
                     {
                       	npi.addPositionForWord(start,new Position(this,i));
                     } 
                }
				s.close();
             }
       catch(Exception e){
        	System.out.println("no such file");
       }
		   
	   		
	}
	
	
	public boolean istop(String srt){
		String[] po = new String[15];
		po[0]="a";
po[1]="an";
po[2]="the";
po[3]="they";
po[4]="these";
po[5]="for";
po[6]="is";
po[7]="are";
po[8]="of";
po[9]="or";
po[10]="and";
po[11]="does";
po[12]="will";
po[13]="whose";
po[14]="was";
            boolean b = false; 
              for(int i=0;i<15;i++)
	             {if(srt==po[i])
	            	b = b||true;
	              else
                     b = b||false;
	             }
                  return b;
}
	
   public PageEntry(){}

    public static String[] change(String page){
	String[] words = page.split("\\s+");
      for (int i = 0; i < words.length; i++) {
             words[i] = words[i].replaceAll("[^\\w]", "");
	    }
		return words;
    }

   public String nameg(){
	return docName;
}
	
	public PageIndex getPageIndex(){
		return npi;
	}
}

