import java.util.*;
//Word.java
//Word array class
public class Word {
	public Word()
	{
		article = new String[]{"the","a","one","some","any"};
		articleCap = new String[]{"The","A","One","Some","Any"};
		noun = new String[]{"boy","girl","dog","town","car"};
		verb = new String[]{"drove","jumped","ran","walked","skipped"};
		preposition = new String[]{"to","from","over","under","on"};
	}
	
	Random rand = new Random();
	int k = rand.nextInt(5);
	//arrays
	String[] article;
	String[] articleCap;
	String[] noun;
	String[] verb;
	String[] preposition;
	String[] caparticle;
	
	public String getCapArticle()
	{
		return articleCap[k];
	}
	public String getArticle()
	{
		return article[k];
	}
	public String getNoun()
	{
		return noun[k];
	}
	public String getVerb()
	{
		return verb[k];
	}
	public String getPreposition()
	{
		return preposition[k];
	}	
}

