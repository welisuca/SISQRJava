package guisisqr;

import java.awt.EventQueue;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.*;// IMPORTO EL PAQUETE TODO LO QUE NECESITO DE SWING PARA LOS GRAFICOS
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Button;
import java.awt.Dimension;
import java.awt.TextArea;
import java.awt.Label;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.ComponentOrientation;
import java.awt.Panel;
import java.awt.TextField;
import javax.swing.border.LineBorder;
import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDayChooser;
import com.toedter.calendar.JDateChooser;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.MatteBorder;

public class Transacciones extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentTranscSisQr;
	private JTable tablaMovimientos;
	//private Jcalendar fecha;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Transacciones frame = new Transacciones();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Transacciones() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//setBounds(100, 100, 450, 300);
		Toolkit mipantalla=Toolkit.getDefaultToolkit(); // USO METODO TOOLKTI �RA DETECTAR LA RESOLUCION DE PANTALLA PRINCIPAL
		Dimension tamanoPantalla=mipantalla.getScreenSize();// REVISO EN MI DISPOSITIVO QUE DIMENSION DE PANTALLA TENGO
		int altoPantalla=tamanoPantalla.height;//BUSCO VALOR DEL ALTO GRABADO EN tama�oPantalla Y GUARDO EN LA VBLE
		int anchoPantalla=tamanoPantalla.width;//BUSCO VALOR DEL ANCHO GRABADO EN tama�oPantalla Y GUARDO EN LA VBLE
		setSize(836, 683);// MARCO A MITAD DE LA DIMENSION REAL DEL DISPOSITIVO
		setLocation(altoPantalla/2, anchoPantalla/20);// UBICO MARCO AL CUARTO DE LA DIMENSION REAL DEL DISPOSITIVO
		setTitle("SISQR");//COLOCARLE UN NOMBRE AL MARCO
		Image miIcono=mipantalla.getImage("src/img/Logo_1.png");// VBLE CON EL LOGO DE SISQR GIF, JPEG O PNG
		setIconImage(miIcono);// CONFIGURO LOGO SISQR EN EL MARCO
		contentTranscSisQr = new JPanel();
		contentTranscSisQr.setForeground(new Color(0, 0, 0));
		contentTranscSisQr.setBackground(new Color(253, 233, 213));
		contentTranscSisQr.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentTranscSisQr);
		contentTranscSisQr.setLayout(null);
		
		JLabel ICONOWASAP = new JLabel("");
		ICONOWASAP.setIcon(new ImageIcon(Transacciones.class.getResource("/img/whatsapp64.png")));
		ICONOWASAP.setBounds(50, 545, 64, 64);
		contentTranscSisQr.add(ICONOWASAP);
		
		Panel panel_superior = new Panel();
		panel_superior.setBackground(new Color(249, 203, 156));
		panel_superior.setBounds(0, 0, 820, 64);
		contentTranscSisQr.add(panel_superior);
		panel_superior.setLayout(null);
		
		JLabel ICONOSISQR = new JLabel("");
		ICONOSISQR.setIcon(new ImageIcon(Transacciones.class.getResource("/img/Logo1.png")));
		ICONOSISQR.setBounds(25, 0, 78, 64);
		panel_superior.add(ICONOSISQR);
		
		JLabel ICONOCASA = new JLabel("");
		ICONOCASA.setBounds(650, 0, 60, 64);
		panel_superior.add(ICONOCASA);
		ICONOCASA.setHorizontalTextPosition(SwingConstants.CENTER);
		ICONOCASA.setIcon(new ImageIcon(SisQr.class.getResource("/img/hogar64.png")));
		
		JLabel ICONOCERRAR = new JLabel("New label");
		ICONOCERRAR.setIcon(new ImageIcon(Transacciones.class.getResource("/img/CerrarSesión.png")));
		ICONOCERRAR.setBounds(730, 0, 64, 64);
		panel_superior.add(ICONOCERRAR);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setViewportBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		scrollPane.setBounds(237, 190, 360, 280);
		contentTranscSisQr.add(scrollPane);
		
		tablaMovimientos = new JTable();
		tablaMovimientos.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
			},
			new String[] {
				"Fecha", "Transacci\u00F3n", "Valor"
			}
		));
		scrollPane.setViewportView(tablaMovimientos);
		
		JLabel Nombre_Tabla = new JLabel("Últimos movimientos");
		Nombre_Tabla.setFont(new Font("Tahoma", Font.BOLD, 20));
		Nombre_Tabla.setBounds(240, 130, 215, 50);
		contentTranscSisQr.add(Nombre_Tabla);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBackground(new Color(249, 203, 156));
		panel.setBounds(185, 110, 450, 450);
		contentTranscSisQr.add(panel);
		
		
		
		

		
	}
}
