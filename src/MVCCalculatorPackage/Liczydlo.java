package MVCCalculatorPackage;

public class Liczydlo {
	
	private double wartoscPola, pierwszaLiczba, drugaLiczba;
	private boolean dodawanie, odejmowanie, mnozenie, dzielenie, wartosc1, wartosc2;
	
		public void ustawPierwszaLiczba(double pierwszaLiczba, boolean wartosc1){
			this.pierwszaLiczba = pierwszaLiczba;
			this.wartosc1 = wartosc1;
		}
		
		public double pobierzPierwszaliczba(){
			return pierwszaLiczba;
		}
		
		public void ustawDrugaLiczba(double drugaLiczba, boolean wartosc2){
			this.drugaLiczba = drugaLiczba;
			this.wartosc2 = wartosc2;
		}
		
		public double pobierzDrugaLiczba(){
			return drugaLiczba;
		}
		
		public boolean pobierzWartosc1(){
			return wartosc1;
		}
		
		public boolean pobierzWartosc2(){
			return wartosc2;
		}
		
		public double pobierzWartoscPola(){
			return wartoscPola;
		}
		
		public void ustawDodawanie(boolean dodawanie){
			this.dodawanie = dodawanie;
		}
		
		public boolean pobierzDodawanie(){
			return dodawanie;
		}
		
		public void ustawOdejmowanie(boolean odejmowanie){
			this.odejmowanie = odejmowanie;
		}
		
		public boolean pobierzOdejmowanie(){
			return odejmowanie;
		}
		
		public void ustawMnozenie(boolean mnozenie){
			this.mnozenie = mnozenie;
		}
		
		public boolean pobierzMnozenie(){
			return mnozenie;
		}
		
		public void ustawDzielenie(boolean dzielenie){
			this.dzielenie = dzielenie;
		}
		
		public boolean pobierzDzielenie(){
			return dzielenie;
		}
		
		public double dodawanie(){
			return wartoscPola = pierwszaLiczba + drugaLiczba;
		}
		
		public double odejmowanie(){
			return wartoscPola = pierwszaLiczba - drugaLiczba;
		}
		
		public double mnozenie(){
			return wartoscPola = pierwszaLiczba * drugaLiczba;
		}
		
		public double dzielenie(){
			return wartoscPola = pierwszaLiczba / drugaLiczba;
		}
}
