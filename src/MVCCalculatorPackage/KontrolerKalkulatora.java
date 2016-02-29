package MVCCalculatorPackage;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class KontrolerKalkulatora {
	
	private PanelKalkulatora panelKalkulatora;
	private Liczydlo liczydlo;
	
	public KontrolerKalkulatora(PanelKalkulatora panelKalkulatora, Liczydlo liczydlo){
		
		this.panelKalkulatora = panelKalkulatora;
		this.liczydlo = liczydlo;
		
		this.panelKalkulatora.dodanieSluchaczaDoPrzyciskow(new SluchaczPrzyciskow());
	}
	
	class SluchaczPrzyciskow implements ActionListener{
		
		double pierwszaLiczba, drugaLiczba, wartoscPola;
		String aktualnaWartoscPola;
		
		@Override
		public void actionPerformed(ActionEvent e) {
			try{
				aktualnaWartoscPola = panelKalkulatora.pobierzString();
				
				if(e.getSource().equals(panelKalkulatora.zwrocZero())){
					
					panelKalkulatora.ustawString(aktualnaWartoscPola + "0");
				}
				
				else if(e.getSource().equals(panelKalkulatora.zwrocJeden())){
					panelKalkulatora.ustawString(aktualnaWartoscPola + "1");
				}
				
				else if(e.getSource().equals(panelKalkulatora.zwrocDwa())){
					panelKalkulatora.ustawString(aktualnaWartoscPola + "2");
				}
				
				else if(e.getSource().equals(panelKalkulatora.zwrocTrzy())){
					panelKalkulatora.ustawString(aktualnaWartoscPola + "3");
				}
				
				else if(e.getSource().equals(panelKalkulatora.zwrocCztery())){
					panelKalkulatora.ustawString(aktualnaWartoscPola + "4");
				}
				
				else if(e.getSource().equals(panelKalkulatora.zwrocPiec())){
					panelKalkulatora.ustawString(aktualnaWartoscPola + "5");
				}
				
				else if(e.getSource().equals(panelKalkulatora.zwrocSzesc())){
					panelKalkulatora.ustawString(aktualnaWartoscPola + "6");
				}
				
				else if(e.getSource().equals(panelKalkulatora.zwrocSiedem())){
					panelKalkulatora.ustawString(aktualnaWartoscPola + "7");
				}
				
				else if(e.getSource().equals(panelKalkulatora.zwrocOsiem())){
					panelKalkulatora.ustawString(aktualnaWartoscPola + "8");
				}
				
				else if(e.getSource().equals(panelKalkulatora.zwrocDziewiec())){
					panelKalkulatora.ustawString(aktualnaWartoscPola + "9");
				}
				
				else if(e.getSource().equals(panelKalkulatora.zwrocPrzecinek())){
					panelKalkulatora.ustawString(aktualnaWartoscPola + ".");
				}
				
				else if(e.getSource().equals(panelKalkulatora.zwrocKasownik())){
					panelKalkulatora.ustawString("");
					liczydlo.ustawPierwszaLiczba(0, false);
					liczydlo.ustawDrugaLiczba(0, false);
					liczydlo.ustawDodawanie(false);
					liczydlo.ustawOdejmowanie(false);
					liczydlo.ustawMnozenie(false);
					liczydlo.ustawDzielenie(false);
				}
				
				else if(e.getSource().equals(panelKalkulatora.zwrocDodawanie())){
					
					if(liczydlo.pobierzWartosc1() == false){
						dzialaniaNaLiczbachPierwsza();
						}
					
					else if(liczydlo.pobierzWartosc1() == true){
						dzialaniaNaLiczbachDruga();	
					}
					
					liczydlo.ustawDodawanie(true);
				}
				
				else if(e.getSource().equals(panelKalkulatora.zwrocOdejmowanie())){
					
					if(liczydlo.pobierzWartosc1() == false){
						dzialaniaNaLiczbachPierwsza();
						}
					
					else if(liczydlo.pobierzWartosc1() == true){
						dzialaniaNaLiczbachDruga();
					}
					
					liczydlo.ustawOdejmowanie(true);
				}
				
				else if(e.getSource().equals(panelKalkulatora.zwrocMnozenie())){
					
					if(liczydlo.pobierzWartosc1() == false){
						dzialaniaNaLiczbachPierwsza();
						}
					
					else if(liczydlo.pobierzWartosc1() == true){
						dzialaniaNaLiczbachDruga();
					}
					
					liczydlo.ustawMnozenie(true);
				}
				
				else if(e.getSource().equals(panelKalkulatora.zwrocDzielenie())){
					
					if(liczydlo.pobierzWartosc1() == false){
						dzialaniaNaLiczbachPierwsza();
						}
					
					else if(liczydlo.pobierzWartosc1() == true){
						dzialaniaNaLiczbachDruga();
					}
					
					liczydlo.ustawDzielenie(true);
				}
				
				else if(e.getSource().equals(panelKalkulatora.zwrocWynik())){
						dzialaniaNaLiczbachDruga();
				}
			}
			catch(NumberFormatException ex){
				panelKalkulatora.pokazOknoBledu("Wprowadz poprawne dane.");
			}
		}
		
					public void dzialaniaNaLiczbachPierwsza(){
						this.pierwszaLiczba = panelKalkulatora.pobierzPoleDzialan();
						liczydlo.ustawPierwszaLiczba(pierwszaLiczba, true);
						panelKalkulatora.ustawString("");
					}
					
					public void dzialaniaNaLiczbachDruga(){
						this.drugaLiczba = panelKalkulatora.pobierzPoleDzialan();
						liczydlo.ustawDrugaLiczba(drugaLiczba, true);
						dzialaniaNaOperatorach();
					}
					
						public void dzialaniaNaOperatorach(){
							
							if(liczydlo.pobierzDodawanie() == true){
								liczydlo.dodawanie();
								liczydlo.ustawDodawanie(false);
							}
							
							else if(liczydlo.pobierzOdejmowanie() == true){
								liczydlo.odejmowanie();
								liczydlo.ustawOdejmowanie(false);
							}
							
							else if(liczydlo.pobierzMnozenie() == true){
								liczydlo.mnozenie();
								liczydlo.ustawMnozenie(false);
							}
							
							else if(liczydlo.pobierzDzielenie() == true){
								liczydlo.dzielenie();
								liczydlo.ustawDzielenie(false);
							}
							
							liczydlo.ustawPierwszaLiczba(0, false);
							liczydlo.ustawDrugaLiczba(0, false);
							
							this.wartoscPola = liczydlo.pobierzWartoscPola();
							this.wartoscPola = wartoscPola * 10000;
							this.wartoscPola = Math.round(wartoscPola);
							this.wartoscPola = wartoscPola/10000;
							panelKalkulatora.ustawPoleDzialan(this.wartoscPola);
							}
		}
}
