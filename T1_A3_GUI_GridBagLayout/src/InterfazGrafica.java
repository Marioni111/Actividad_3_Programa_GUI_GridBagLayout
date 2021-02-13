import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class InterfazGrafica extends JFrame{

	GridBagLayout gbl = new GridBagLayout();
	GridBagConstraints configuracion = new GridBagConstraints();
	
	public InterfazGrafica() {
		crearComponentes();
	}
	
	public void crearComponentes() {
		getContentPane().setLayout(gbl);
		setTitle("GridBagLayout");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(800, 540);
		setLocationRelativeTo(null);
		setVisible(true);
		
		JLabel label1 = new JLabel("The classic Form includes all visible fields for");
		acomodaComponentes(label1, 0, 0, 1, 1, 1);
		
		JLabel label2 = new JLabel("this list");
		acomodaComponentes(label2, 0, 1, 1, 1, 1);
		
		JLabel vacio1 = new JLabel("");
		acomodaComponentes(vacio1, 0, 2, 1, 1, 1);
		
		JLabel label3 = new JLabel("Form options");
		acomodaComponentes(label3, 0, 3, 1, 1, 1);
		
		JLabel label4 = new JLabel("Include the following:");
		acomodaComponentes(label4, 0, 4, 1, 1, 1);
		
		JCheckBox checkBox1 = new JCheckBox("a title for you form");
		acomodaComponentes(checkBox1, 0, 5, 1, 1, 1);
		
		JTextField textField1 = new JTextField("Subscribe to our mailing list");
		acomodaComponentes(textField1, 0, 6, 1, 1, 1);
		
		JLabel vacio2 = new JLabel(" ");
		acomodaComponentes(vacio2, 0, 7, 1, 1, 1);
		JLabel vacio3 = new JLabel(" ");
		acomodaComponentes(vacio3, 0, 8, 1, 1, 1);
		
		ButtonGroup bg = new ButtonGroup();
		JRadioButton radioButton1 = new JRadioButton("only required fields");
		bg.add(radioButton1);
		acomodaComponentes(radioButton1, 0, 9, 1, 1, 1);
		JRadioButton radioButton2 = new JRadioButton("all fields");
		bg.add(radioButton2);
		acomodaComponentes(radioButton2, 0, 10, 1, 1, 1);
		
		JLabel label5 = new JLabel("(edit required fields in the form builder)");
		acomodaComponentes(label5, 0, 11, 1, 1, 1);
		
		JLabel vacio4 = new JLabel(" ");
		acomodaComponentes(vacio4, 0, 12, 1, 1, 1);
		JLabel vacio5 = new JLabel(" ");
		acomodaComponentes(vacio5, 0, 13, 1, 1, 1);
		
		JCheckBox checkBox2 = new JCheckBox("interest group fields");
		acomodaComponentes(checkBox2, 0, 12, 1, 1, 1);
		
		JCheckBox checkBox3 = new JCheckBox("required field indicators");
		acomodaComponentes(checkBox3, 0, 15, 1, 1, 1);
		
		JLabel vacio6 = new JLabel(" ");
		acomodaComponentes(vacio6, 0, 16, 1, 1, 1);
		
		JLabel label6 = new JLabel("Set form width");
		acomodaComponentes(label6, 0, 17, 1, 1, 1);
		
		JTextField textFile1 = new JTextField(" ");
		acomodaComponentes(textFile1, 0, 18, 1, 1, 1);
		
		JLabel vacio7 = new JLabel(" ");
		acomodaComponentes(vacio7, 0, 19, 1, 1, 1);
		
		JLabel label7 = new JLabel("Enhance your form enable");
		acomodaComponentes(label7, 0, 20, 1, 1, 1);
		
		JCheckBox checkBox4 = new JCheckBox("enable evil popup mode");
		acomodaComponentes(checkBox4, 0, 21, 1, 1, 1);
		
		JCheckBox checkBox5 = new JCheckBox("disable all JavaScript");
		acomodaComponentes(checkBox5, 0, 22, 1, 1, 1);
		
		JCheckBox checkBox6 = new JCheckBox("include archive link");
		acomodaComponentes(checkBox6, 0, 23, 1, 1, 1);
		
		JCheckBox checkBox7 = new JCheckBox("include MonkeyRewards link"); 
		acomodaComponentes(checkBox7, 0, 24, 1, 1, 1);
		
		//--------------------------------------------------

		JLabel vacio8 = new JLabel("  ");
		acomodaComponentes(vacio8, 1, 0, 1, 1, 1);
		
		JLabel label8 = new JLabel("Preview                                                                                                                            ");
		acomodaComponentes(label8, 2, 0, 1, 1, 1);
		
		Color c1 = new Color(255, 255, 255);//inicio del panel
		JPanel panel1 = new JPanel();
			panel1.setLayout(null);
			panel1.setBackground(c1);
			
			JLabel asterisco = new JLabel("*");
			asterisco.setFont(new Font("Arial", Font.BOLD, 14));
			asterisco.setForeground(Color.ORANGE);
			asterisco.setBounds(323, 3, 200, 20);
			panel1.add(asterisco);
			JLabel indicatesRequired = new JLabel("indicates required");
			indicatesRequired.setFont(new Font("Arial", Font.BOLD, 8));
			indicatesRequired.setBounds(328, 5, 200, 20);
			panel1.add(indicatesRequired);
			
			JLabel emailAddress = new JLabel("Email Address");
			emailAddress.setBounds(5, 10, 200, 20);
			panel1.add(emailAddress);
			JFormattedTextField cajaEmailAddress = new JFormattedTextField();
			cajaEmailAddress.setBounds(5, 30, 390, 20);
			panel1.add(cajaEmailAddress);
			
			JLabel firstName = new JLabel("First Name");
			firstName.setBounds(5, 60, 200, 20);
			panel1.add(firstName);
			JTextField cajaTextoVacia3 = new JTextField(35);
			cajaTextoVacia3.setBounds(5, 80, 390, 20);
			panel1.add(cajaTextoVacia3);
			
			JLabel lastName = new JLabel("Last Name");
			lastName.setBounds(5, 115, 390, 20);
			panel1.add(lastName);
			JTextField cajaTextoVacia4 = new JTextField(35);
			cajaTextoVacia4.setBounds(5, 135, 390, 20);
			panel1.add(cajaTextoVacia4);
			
			JButton btnSubscribe = new JButton("Subscribe", new ImageIcon("imagenes/índice.jpg"));
			btnSubscribe.setEnabled(true);
			btnSubscribe.setBounds(5, 175, 100, 20);
			panel1.add(btnSubscribe);
			
		acomodaComponentes(panel1, 2, 1, 1, 12, 1);
		
		JLabel vacio9 = new JLabel(" ");
		acomodaComponentes(vacio9, 2, 13, 1, 1, 1);
		JLabel vacio10 = new JLabel(" ");
		acomodaComponentes(vacio10, 2, 14, 1, 1, 1);
		
		JLabel leabel9 = new JLabel("Copy/paste onto your site");
		acomodaComponentes(leabel9, 2, 15, 1, 1, 1);
		
		JTextArea areaTexto = new JTextArea();
		areaTexto.setLineWrap(true);
		areaTexto.setWrapStyleWord(true);
		JScrollPane scroll = new JScrollPane(areaTexto);
		scroll.setBounds(350, 300, 400, 150);
		acomodaComponentes(scroll, 2, 16, 1, 7, 1);
		
		pack();
	}
	
	public void acomodaComponentes(JComponent componente, int gx, int gy, int gw, int gh, int f){
		
		configuracion.gridx = gx;
		configuracion.gridy = gy;
		configuracion.gridwidth = gw;
		configuracion.gridheight = gh;
		configuracion.fill = f;
		gbl.setConstraints(componente, configuracion);
		add(componente);		
	
	}//metodo acomodaComponentes
	
	public static void main(String[] args) {
		
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}
		
		SwingUtilities.invokeLater(new Runnable(){
			@Override
			public void run() {
				new InterfazGrafica();
			}
		});
	}
		
}