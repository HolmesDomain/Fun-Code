//Sentence.java
//Sentence builder
public class Sentence {
	public Sentence(){}
	
	Word wrd = new Word();
	StringBuilder build = new StringBuilder();
	
	public String getSentence()
	{
		return String.format("%s %s %s %s %s %s. %n", 
				wrd.getCapArticle(),wrd.getNoun(),wrd.getVerb(),
				wrd.getPreposition(),wrd.getArticle(),
				wrd.getNoun());
	}
}
