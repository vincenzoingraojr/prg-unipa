public class Persona implements Comparable<Persona>{
	private String nome, cognome;
	
	public Persona(String nome, String cognome){
		this.nome = nome;
		this.cognome = cognome;
	}
	
	public String getNome(){
		return nome;
	}
	
	@Override
	public String toString(){
		return nome + " " + cognome.toUpperCase();
	}
	
	@Override
	public boolean equals(Object o){
		if(o instanceof Persona){
			Persona p = (Persona)o;
			return p.nome.equals(this.nome) && p.cognome.equals(this.cognome);
		}
		return false;
	}
	
	@Override
	public int hashCode(){
		return nome.hashCode()+cognome.hashCode();
	}
	
	@Override
	public int compareTo(Persona altro){
		return this.cognome.compareTo(altro.cognome);
	}
}