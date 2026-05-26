import java.util.SortedMap;
import java.util.TreeMap;

public class WordCount{
	public static void main(String args[]){
		String text = """
			Scrivete un programma che, utilizzando il metodo split su una stringa 
			contenente il testo di questo esercizio (lo potete incollare direttamente 
			nel codice quando create la stringa), determina il numero totale di parole
			presenti nel testo e la parola che compare con maggiore frequenza. Potreste 
			anche pensare di utilizzare una Map<String, Integer> per memorizzare la 
			frequenza di ciascuna parola utilizzando la parola stessa come chiave. 
			Stampate, infine, la frequenza di ciascuna parola mostrando le parole 
			in ordine alfabetico.""";
		text = text.strip();
		String[] words = text.split(" ");
		
		System.out.println("# di parole: " + words.length);
		
		SortedMap<String, Integer> freq = new TreeMap<>();
		
		for(String word : words){
			if(freq.containsKey(word))
				freq.put(word, freq.get(word)+1);
			else
				freq.put(word, 1);
		}
		
		for(String k : freq.keySet())
			System.out.println(k + ": " + freq.get(k));
	}
}