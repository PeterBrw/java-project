package uoradea;

public class Persoana {
	private String nume;
	private String prenume;
	private Integer varsta;
	private String adresa;
	private String CNP;
	public Persoana() {
		
	}
	public Persoana(String nume, String prenume, Integer varsta, String adresa, String CNP) {
		this.nume=nume;
		this.prenume=prenume;
		this.varsta=varsta;
		this.adresa=adresa;
		this.CNP=CNP;
	}
	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	public String getPrenume() {
		return prenume;
	}
	public void setPrenume(String prenume) {
		this.prenume = prenume;
	}
	public Integer getVarsta() {
		return varsta;
	}
	public void setVarsta(Integer varsta) {
		this.varsta = varsta;
	}
	public String getAdresa() {
		return adresa;
	}
	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}
	public String getCNP() {
		return CNP;
	}
	public void setCNP(String CNP) {
		this.CNP = CNP;
	}
	@Override
	 public String toString() {
        return nume;
    }
}
