package MVCCalculatorPackage;

public class MainClass {

	public static void main(String[] args) {
		
		PanelKalkulatora panelKalkulatora = new PanelKalkulatora();
		Liczydlo liczydlo = new Liczydlo();
		KontrolerKalkulatora kontroler = new KontrolerKalkulatora(panelKalkulatora,liczydlo);
		
		panelKalkulatora.setVisible(true);

	}

}
