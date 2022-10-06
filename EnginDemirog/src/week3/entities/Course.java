package week3.entities;

public class Course {
	private String egitmen;
	private String kategori;
	private String kursismi;
	private int kursfiyatı;
	public Course(String egitmen, String kategori, String kursismi, int kursfiyatı) {
		
		this.egitmen = egitmen;
		this.kategori = kategori;
		this.kursismi = kursismi;
		this.kursfiyatı = kursfiyatı;
	}
	public String getEgitmen() {
		return egitmen;
	}
	public void setEgitmen(String egitmen) {
		this.egitmen = egitmen;
	}
	public String getKategori() {
		return kategori;
	}
	public void setKategori(String kategori) {
		this.kategori = kategori;
	}
	public String getKursismi() {
		return kursismi;
	}
	public void setKursismi(String kursismi) {
		this.kursismi = kursismi;
	}
	public int getKursfiyatı() {
		return kursfiyatı;
	}
	public void setKursfiyatı(int kursfiyatı) {
		this.kursfiyatı = kursfiyatı;
	}

}
