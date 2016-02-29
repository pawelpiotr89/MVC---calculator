package MVCCalculatorPackage;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelKalkulatora extends JFrame {
	
	private JTextField poleDzialan = new JTextField();
	private JButton przecinek = new JButton(",");
	private JButton kasownik = new JButton("C");
	private JButton wynik = new JButton("=");
	private JButton dodawanie = new JButton("+");
	private JButton odejmowanie = new JButton("-");
	private JButton mnozenie = new JButton("*");
	private JButton dzielenie = new JButton("/");
	private JButton zero = new JButton("0");
	private JButton jeden = new JButton("1");
	private JButton dwa = new JButton("2");
	private JButton trzy = new JButton("3");
	private JButton cztery = new JButton("4");
	private JButton piec = new JButton("5");
	private JButton szesc = new JButton("6");
	private JButton siedem = new JButton("7");
	private JButton osiem = new JButton("8");
	private JButton dziewiec = new JButton("9");
	private List<JButton> przyciski = new ArrayList<JButton>();
	
	PanelKalkulatora(){
		
		JPanel panelKalkulatora = new JPanel();
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(300, 400);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		
		panelKalkulatora.setLayout(new GridLayout(6, 3, 5, 5));
		poleDzialan.setHorizontalAlignment(JTextField.RIGHT);
		poleDzialan.setFont(new Font("Verdana", Font.BOLD, 15));
		
		przyciski.add(wynik);
		przyciski.add(kasownik);
		przyciski.add(jeden);
		przyciski.add(dwa);
		przyciski.add(trzy);
		przyciski.add(cztery);
		przyciski.add(piec);
		przyciski.add(szesc);
		przyciski.add(siedem);
		przyciski.add(osiem);
		przyciski.add(dziewiec);
		przyciski.add(dodawanie);
		przyciski.add(zero);
		przyciski.add(odejmowanie);
		przyciski.add(mnozenie);
		przyciski.add(dzielenie);
		przyciski.add(przecinek);
		
		panelKalkulatora.add(poleDzialan);
		
		for(JButton i : przyciski){
			panelKalkulatora.add(i);
		}
		
		this.add(panelKalkulatora);
		
	}
	
	public double pobierzPoleDzialan(){
		
		return Double.parseDouble(pobierzString());
	}
	
	public void ustawPoleDzialan(double wynikDzialan){
		
		poleDzialan.setText(Double.toString(wynikDzialan));
	}
	
	public String pobierzString(){
		
		return poleDzialan.getText();
	}
	
	public void ustawString(String atktualnaWartoscPola){
		poleDzialan.setText(atktualnaWartoscPola);
	}
	
	void dodanieSluchaczaDoPrzyciskow(ActionListener sluchaczPrzyciskow){
		
		for(JButton i : przyciski){
			i.addActionListener(sluchaczPrzyciskow);
		}
	}
	
	void pokazOknoBledu(String wiadomoscBledu){
		
		JOptionPane.showMessageDialog(this, wiadomoscBledu);
	}
	
	public JButton zwrocZero(){
		return zero;
	}
	
	public JButton zwrocJeden(){
		return jeden;
	}
	
	public JButton zwrocDwa(){
		return dwa;
	}
	
	public JButton zwrocTrzy(){
		return trzy;
	}
	
	public JButton zwrocCztery(){
		return cztery;
	}
	
	public JButton zwrocPiec(){
		return piec;
	}
	
	public JButton zwrocSzesc(){
		return szesc;
	}
	
	public JButton zwrocSiedem(){
		return siedem;
	}
	
	public JButton zwrocOsiem(){
		return osiem;
	}
	
	public JButton zwrocDziewiec(){
		return dziewiec;
	}
	
	public JButton zwrocDodawanie(){
		return dodawanie;
	}
	
	public JButton zwrocOdejmowanie(){
		return odejmowanie;
	}
	
	public JButton zwrocMnozenie(){
		return mnozenie;
	}
	
	public JButton zwrocDzielenie(){
		return dzielenie;
	}
	
	public JButton zwrocPrzecinek(){
		return przecinek;
	}
	
	public JButton zwrocKasownik(){
		return kasownik;
	}
	
	public JButton zwrocWynik(){
		return wynik;
	}
}
