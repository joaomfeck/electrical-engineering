package interfaces;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.Format;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

import protecao.protecoes;
import protecao.ajustes.AjustesProtecoes;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JTabbedPane;
import javax.swing.AbstractAction;
import javax.swing.AbstractButton;
import javax.swing.Action;

public class Main {

	List<double[]> ajustes = new ArrayList<double[]>();
	private static JFrame frame;
	private JTextField txtMotorPotencia;
	private JTextField txtMotorVnom;
	private JTextField txtMotorVpartida;
	private JTextField txtMotorTpartida;
	private JTextField txtMotorTrbf;
	private JTextField txtMotorRendimento;
	private JTextField txtMotorFP;
	private JTextField txtMotorInom;
	private JTextField txtMotorIpartida;
	private JTextField txtMotorConstTempTerm;
	private JTextField txtMotorIvazio;
	private JTextField txtMotorIoperacao;
	private JTextField txtCircuitoIcc;
	private JTextField txtANSI46prot2;
	private JTextField txtANSI46prot1;
	private JTextField txtANSI49prot1;
	private JTextField txtANSI49prot2;
	private JTextField txtANSI51LBprot1;
	private JTextField txtANSI51LBprot2;
	private JTextField txtANSI46prot4;
	private JTextField txtANSI46prot3;
	private JTextField txtANSI27prot1;
	private JTextField txtANSI27prot2;
	private JTextField txtANSI37prot1;
	private JTextField txtANSI37prot2;
	private JTextField txtANSI47prot1;
	private JTextField txtANSI47prot2;
	private JTextField txtANSI50prot1;
	private JTextField txtANSI51prot1;
	private JTextField txtANSI51prot2;
	private JTextField txtANSI59prot1;
	private JTextField txtANSI59prot2;
	private JTextField txtANSI66prot1;
	private JTextField txtCircuitoRTC;
	private JTextField txt27id0;
	private JTextField txt27id1;
	private JTextField txt50id0;
	private JTextField txtMotorRelacaoI;
	private JTextField txtMotorZn;
	private JTextField txt37id0;
	private JTextField txt37id1;
	private JTextField txt40id0;
	private JTextField txt40id1;
	private JTextField txt46id0;
	private JTextField txt46id1;
	private JTextField txt47id0;
	private JTextField txt47id1;
	private JTextField txt48id0;
	private JTextField txt48id1;
	private JTextField txt49id0;
	private JTextField txt51id0;
	private JTextField txt51id1;
	private JTextField txt51Gid0;
	private JTextField txt51Gid1;
	private JTextField txt51LBid0;
	private JTextField txt51LBid1;
	private JTextField txt51Nid0;
	private JTextField txt51Nid1;
	private JTextField txt59id0;
	private JTextField txt59id1;
	private JTextField txt59Nid0;
	private JTextField txt59Nid1;
	private JTextField txt66id0;
	private JTextField txt78PSid0;
	public static JTextField txtOutrosid0;
	public static JTextField txtOutrosid1;
	public static JCheckBox checkBoxOutros;
	private JTextField txt40id2;
	private JTextField txt40id3;
	private JTextField txtANSI50GSprot1;
	private JTextField txtANSI81prot1;
	private JTextField txt50GSid0;
	private JTextField txt81id0;
	private JTextField txt81id1;
	public static JTextField txtConstTempFrio;
	public static JTextField txtConstTempQuente;
	private JTextField txtMotorTrbq;



	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frame.setVisible(true);
					window.frame.setLocationRelativeTo(null);
					UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
					SwingUtilities.updateComponentTreeUI(frame);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		Format ScienceFormatAjustes = new DecimalFormat( "########0.00" );
		
		Format ScienceFormat = new DecimalFormat( "########0.00" );
		
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 800, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setTitle("Calculadora de Proteção de Motores Elétricos 1.0");
		
		//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
		JPanel panelDadosMaq = new JPanel();
		panelDadosMaq.setBorder(new TitledBorder(null, "Dados da M\u00E1quina", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelDadosMaq.setBounds(10, 11, 354, 478);
		frame.getContentPane().add(panelDadosMaq);
		panelDadosMaq.setLayout(null);

		JComboBox comboBoxPotencia = new JComboBox();
		comboBoxPotencia.setModel(new DefaultComboBoxModel(new String[] {"HP", "CV", "kVA", "kW"}));
		comboBoxPotencia.setBounds(272, 43, 56, 20);
		panelDadosMaq.add(comboBoxPotencia);
		
		JComboBox comboBoxVnom = new JComboBox();
		comboBoxVnom.setModel(new DefaultComboBoxModel(new String[] {"V", "kV"}));
		comboBoxVnom.setBounds(272, 68, 56, 20);
		panelDadosMaq.add(comboBoxVnom);
		
		JComboBox comboBoxVprimaria = new JComboBox();
		comboBoxVprimaria.setEnabled(false);
		comboBoxVprimaria.setModel(new DefaultComboBoxModel(new String[] {"V", "kV"}));
		comboBoxVprimaria.setBounds(272, 93, 56, 20);
		panelDadosMaq.add(comboBoxVprimaria);
		
		JComboBox comboBoxTpartida = new JComboBox();
		comboBoxTpartida.setModel(new DefaultComboBoxModel(new String[] {"sec", "min", "hor"}));
		comboBoxTpartida.setBounds(272, 168, 56, 20);
		panelDadosMaq.add(comboBoxTpartida);
		
		JComboBox comboBoxTrbf = new JComboBox();
		comboBoxTrbf.setEnabled(false);
		comboBoxTrbf.setModel(new DefaultComboBoxModel(new String[] {"sec", "min", "hor"}));
		comboBoxTrbf.setBounds(272, 193, 56, 20);
		panelDadosMaq.add(comboBoxTrbf);
		
		JComboBox comboBoxRendimento = new JComboBox();
		comboBoxRendimento.setModel(new DefaultComboBoxModel(new String[] {"Norm", "%"}));
		comboBoxRendimento.setBounds(272, 243, 56, 20);
		panelDadosMaq.add(comboBoxRendimento);
		
		JComboBox comboBoxConstTempTerm = new JComboBox();
		comboBoxConstTempTerm.setEnabled(false);
		comboBoxConstTempTerm.setModel(new DefaultComboBoxModel(new String[] {"sec", "min", "hor"}));
		comboBoxConstTempTerm.setBounds(272, 293, 56, 20);
		panelDadosMaq.add(comboBoxConstTempTerm);
		
		txtMotorPotencia = new JTextField();
		txtMotorPotencia.setBounds(177, 43, 86, 20);
		panelDadosMaq.add(txtMotorPotencia);
		txtMotorPotencia.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Pot\u00EAncia:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setBounds(10, 46, 156, 14);
		panelDadosMaq.add(lblNewLabel);
		
		JLabel lblVnom = new JLabel("Vnom:");
		lblVnom.setHorizontalAlignment(SwingConstants.RIGHT);
		lblVnom.setBounds(10, 71, 156, 14);
		panelDadosMaq.add(lblVnom);
		
		txtMotorVnom = new JTextField();
		txtMotorVnom.setColumns(10);
		txtMotorVnom.setBounds(177, 68, 86, 20);
		panelDadosMaq.add(txtMotorVnom);
		
		JLabel lblVnompartida = new JLabel("Vnom (Prim\u00E1ria):");
		lblVnompartida.setEnabled(false);
		lblVnompartida.setHorizontalAlignment(SwingConstants.RIGHT);
		lblVnompartida.setBounds(10, 96, 156, 14);
		panelDadosMaq.add(lblVnompartida);
		
		txtMotorVpartida = new JTextField();
		txtMotorVpartida.setEnabled(false);
		txtMotorVpartida.setColumns(10);
		txtMotorVpartida.setBounds(177, 93, 86, 20);
		panelDadosMaq.add(txtMotorVpartida);
		
		JLabel lblTempoDePartida = new JLabel("T (Partida):");
		lblTempoDePartida.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTempoDePartida.setBounds(10, 171, 156, 14);
		panelDadosMaq.add(lblTempoDePartida);
		
		txtMotorTpartida = new JTextField();
		txtMotorTpartida.setColumns(10);
		txtMotorTpartida.setBounds(177, 168, 86, 20);
		panelDadosMaq.add(txtMotorTpartida);
		
		JLabel lblTempoRotBlocFrio = new JLabel("T (Rotor Bloqueado a Frio):");
		lblTempoRotBlocFrio.setEnabled(false);
		lblTempoRotBlocFrio.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTempoRotBlocFrio.setBounds(10, 196, 156, 14);
		panelDadosMaq.add(lblTempoRotBlocFrio);
		
		txtMotorTrbf = new JTextField();
		txtMotorTrbf.setEnabled(false);
		txtMotorTrbf.setColumns(10);
		txtMotorTrbf.setText("0");
		txtMotorTrbf.setBounds(177, 193, 86, 20);
		panelDadosMaq.add(txtMotorTrbf);
		
		JLabel lblRendimento = new JLabel("Rendimento:");
		lblRendimento.setHorizontalAlignment(SwingConstants.RIGHT);
		lblRendimento.setBounds(10, 246, 156, 14);
		panelDadosMaq.add(lblRendimento);
		
		txtMotorRendimento = new JTextField();
		txtMotorRendimento.setColumns(10);
		txtMotorRendimento.setBounds(177, 243, 86, 20);
		panelDadosMaq.add(txtMotorRendimento);
		
		JLabel lblFp = new JLabel("FP:");
		lblFp.setHorizontalAlignment(SwingConstants.RIGHT);
		lblFp.setBounds(10, 271, 156, 14);
		panelDadosMaq.add(lblFp);
		
		txtMotorFP = new JTextField();
		txtMotorFP.setColumns(10);
		txtMotorFP.setBounds(177, 268, 86, 20);
		panelDadosMaq.add(txtMotorFP);
		
		JLabel label = new JLabel("Inom:");
		label.setHorizontalAlignment(SwingConstants.RIGHT);
		label.setBounds(10, 121, 156, 14);
		panelDadosMaq.add(label);
		
		txtMotorInom = new JTextField();
		txtMotorInom.setEditable(false);
		txtMotorInom.setColumns(10);
		txtMotorInom.setBounds(177, 118, 86, 20);
		panelDadosMaq.add(txtMotorInom);
		
		JLabel lblIpartida = new JLabel("I (Partida)");
		lblIpartida.setHorizontalAlignment(SwingConstants.RIGHT);
		lblIpartida.setBounds(10, 146, 156, 14);
		panelDadosMaq.add(lblIpartida);
		
		txtMotorIpartida = new JTextField();
		txtMotorIpartida.setEditable(false);
		txtMotorIpartida.setColumns(10);
		txtMotorIpartida.setBounds(177, 143, 86, 20);
		panelDadosMaq.add(txtMotorIpartida);
		
		JLabel lblConstDeTempo = new JLabel("Const. de Tempo T\u00E9rmica:");
		lblConstDeTempo.setEnabled(false);
		lblConstDeTempo.setHorizontalAlignment(SwingConstants.RIGHT);
		lblConstDeTempo.setBounds(10, 296, 156, 14);
		panelDadosMaq.add(lblConstDeTempo);
		
		txtMotorConstTempTerm = new JTextField();
		txtMotorConstTempTerm.setEnabled(false);
		txtMotorConstTempTerm.setColumns(10);
		txtMotorConstTempTerm.setBounds(177, 293, 86, 20);
		panelDadosMaq.add(txtMotorConstTempTerm);
		
		JLabel lblCorrenteVazio = new JLabel("Corrente \u00E0 Vazio:");
		lblCorrenteVazio.setEnabled(false);
		lblCorrenteVazio.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCorrenteVazio.setBounds(10, 321, 156, 14);
		panelDadosMaq.add(lblCorrenteVazio);
		
		txtMotorIvazio = new JTextField();
		txtMotorIvazio.setEnabled(false);
		txtMotorIvazio.setColumns(10);
		txtMotorIvazio.setBounds(177, 318, 86, 20);
		panelDadosMaq.add(txtMotorIvazio);
		
		JLabel lblCorrenteDeOperao = new JLabel("Corrente de Opera\u00E7\u00E3o:");
		lblCorrenteDeOperao.setEnabled(false);
		lblCorrenteDeOperao.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCorrenteDeOperao.setBounds(10, 346, 156, 14);
		panelDadosMaq.add(lblCorrenteDeOperao);
		
		txtMotorIoperacao = new JTextField();
		txtMotorIoperacao.setEnabled(false);
		txtMotorIoperacao.setColumns(10);
		txtMotorIoperacao.setBounds(177, 343, 86, 20);
		panelDadosMaq.add(txtMotorIoperacao);
		
		JLabel lblNewLabel_1 = new JLabel("A");
		lblNewLabel_1.setBounds(273, 121, 46, 14);
		panelDadosMaq.add(lblNewLabel_1);
		
		JLabel label_1 = new JLabel("A");
		label_1.setBounds(273, 146, 46, 14);
		panelDadosMaq.add(label_1);
		
		JLabel label_4 = new JLabel("A");
		label_4.setEnabled(false);
		label_4.setBounds(273, 321, 46, 14);
		panelDadosMaq.add(label_4);
		
		JLabel label_5 = new JLabel("A");
		label_5.setEnabled(false);
		label_5.setBounds(273, 346, 46, 14);
		panelDadosMaq.add(label_5);
		
		JLabel label_3 = new JLabel("Ip/Inom: ");
		label_3.setHorizontalAlignment(SwingConstants.RIGHT);
		label_3.setBounds(10, 371, 156, 14);
		panelDadosMaq.add(label_3);
		
		txtMotorRelacaoI = new JTextField();
		txtMotorRelacaoI.setColumns(10);
		txtMotorRelacaoI.setBounds(177, 368, 86, 20);
		panelDadosMaq.add(txtMotorRelacaoI);
		
		JLabel lblZn = new JLabel("Zn: ");
		lblZn.setEnabled(false);
		lblZn.setHorizontalAlignment(SwingConstants.RIGHT);
		lblZn.setBounds(10, 396, 156, 14);
		panelDadosMaq.add(lblZn);
		
		txtMotorZn = new JTextField();
		txtMotorZn.setEnabled(false);
		txtMotorZn.setColumns(10);
		txtMotorZn.setBounds(177, 393, 86, 20);
		panelDadosMaq.add(txtMotorZn);
		
		JLabel label_8 = new JLabel("A");
		label_8.setEnabled(false);
		label_8.setBounds(273, 396, 46, 14);
		panelDadosMaq.add(label_8);
		
		txtConstTempFrio = new JTextField();
		txtConstTempFrio.setColumns(10);
		txtConstTempFrio.setBounds(177, 418, 86, 20);
		panelDadosMaq.add(txtConstTempFrio);
		
		JLabel lblConstTempFrio = new JLabel("Const. de Tempo a Frio:");
		lblConstTempFrio.setHorizontalAlignment(SwingConstants.RIGHT);
		lblConstTempFrio.setBounds(10, 421, 156, 14);
		panelDadosMaq.add(lblConstTempFrio);
		
		JComboBox comboBoxConstTempFrio = new JComboBox();
		comboBoxConstTempFrio.setModel(new DefaultComboBoxModel(new String[] {"sec", "min", "hor"}));
		comboBoxConstTempFrio.setBounds(272, 418, 56, 20);
		panelDadosMaq.add(comboBoxConstTempFrio);
		
		txtConstTempQuente = new JTextField();
		txtConstTempQuente.setColumns(10);
		txtConstTempQuente.setBounds(177, 443, 86, 20);
		panelDadosMaq.add(txtConstTempQuente);
		
		JLabel lblConstTempQuente = new JLabel("Const. de Tempo a Quente");
		lblConstTempQuente.setHorizontalAlignment(SwingConstants.RIGHT);
		lblConstTempQuente.setBounds(10, 446, 156, 14);
		panelDadosMaq.add(lblConstTempQuente);
		
		JComboBox comboBoxConstTempQuente = new JComboBox();
		comboBoxConstTempQuente.setModel(new DefaultComboBoxModel(new String[] {"sec", "min", "hor"}));
		comboBoxConstTempQuente.setBounds(272, 443, 56, 20);
		panelDadosMaq.add(comboBoxConstTempQuente);
		
		JLabel lblTrotorBloqueadoQuente = new JLabel("T (Rotor Bloqueado a Quente):");
		lblTrotorBloqueadoQuente.setEnabled(false);
		lblTrotorBloqueadoQuente.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTrotorBloqueadoQuente.setBounds(10, 221, 156, 14);
		panelDadosMaq.add(lblTrotorBloqueadoQuente);
		
		txtMotorTrbq = new JTextField();
		txtMotorTrbq.setEnabled(false);
		txtMotorTrbq.setText("0");
		txtMotorTrbq.setColumns(10);
		txtMotorTrbq.setBounds(177, 218, 86, 20);
		panelDadosMaq.add(txtMotorTrbq);
		
		JComboBox comboBoxTrbq = new JComboBox();
		comboBoxTrbq.setEnabled(false);
		comboBoxTrbq.setBounds(272, 218, 56, 20);
		comboBoxTrbq.setModel(new DefaultComboBoxModel(new String[] {"sec", "min", "hor"}));
		panelDadosMaq.add(comboBoxTrbq);
		//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
		
		//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
		JPanel panelDadosSistema = new JPanel();
		panelDadosSistema.setBorder(new TitledBorder(null, "Dados do Sistema", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelDadosSistema.setBounds(10, 491, 354, 108);
		frame.getContentPane().add(panelDadosSistema);
		panelDadosSistema.setLayout(null);
		
		JLabel lblIcurtocircuito = new JLabel("I (Curto-circuito):");
		lblIcurtocircuito.setHorizontalAlignment(SwingConstants.RIGHT);
		lblIcurtocircuito.setBounds(10, 42, 156, 14);
		panelDadosSistema.add(lblIcurtocircuito);
		
		txtCircuitoIcc = new JTextField();
		txtCircuitoIcc.setColumns(10);
		txtCircuitoIcc.setBounds(177, 39, 86, 20);
		panelDadosSistema.add(txtCircuitoIcc);
		
		JLabel label_6 = new JLabel("A");
		label_6.setBounds(273, 42, 46, 14);
		panelDadosSistema.add(label_6);
		
		txtCircuitoRTC = new JTextField();
		txtCircuitoRTC.setColumns(10);
		txtCircuitoRTC.setBounds(177, 67, 86, 20);
		panelDadosSistema.add(txtCircuitoRTC);
		
		JLabel lblRtc = new JLabel("RTC: ");
		lblRtc.setHorizontalAlignment(SwingConstants.RIGHT);
		lblRtc.setBounds(10, 70, 156, 14);
		panelDadosSistema.add(lblRtc);
		
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(374, 11, 400, 640);
		frame.getContentPane().add(tabbedPane);
		
		
		
		JPanel panelMenu = new JPanel();
		tabbedPane.addTab("Menu", null, panelMenu, null);
		panelMenu.setLayout(null);
		
		JPanel panelAjustes = new JPanel();
		tabbedPane.addTab("Ajustes", null, panelAjustes, null);
		panelAjustes.setLayout(null);
		
		JPanel panel_14 = new JPanel();
		panel_14.setBounds(18, 58, 358, 543);
		panelAjustes.add(panel_14);
		panel_14.setLayout(null);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(188, 11, 160, 531);
		panel_14.add(panel_4);
		panel_4.setLayout(null);
		
		JButton btnSalvaAjustePersonalizado = new JButton("Salva Ajustes");
		btnSalvaAjustePersonalizado.setEnabled(false);
		btnSalvaAjustePersonalizado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnSalvaAjustePersonalizado.setEnabled(false);
			}
		});
		btnSalvaAjustePersonalizado.setBounds(0, 446, 160, 35);
		panel_4.add(btnSalvaAjustePersonalizado);
		

		JButton btnImportaAjustePersonalizado = new JButton("Importar Ajustes");
		btnImportaAjustePersonalizado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnImportaAjustePersonalizado.setEnabled(false);
		btnImportaAjustePersonalizado.setBounds(0, 484, 160, 35);
		panel_4.add(btnImportaAjustePersonalizado);
		
		//CheckBoxes
				//1
				JCheckBox checkBoxANSI26 = new JCheckBox("ANSI 26");
				checkBoxANSI26.setEnabled(false);
				checkBoxANSI26.setBounds(18, 40, 97, 23);
				panelMenu.add(checkBoxANSI26);
				
				//2
				JCheckBox checkBoxANSI27 = new JCheckBox("ANSI 27");
				checkBoxANSI27.setEnabled(false);
				checkBoxANSI27.setBounds(18, 65, 97, 23);
				panelMenu.add(checkBoxANSI27);
				
				//3
				JCheckBox checkBoxANSI37 = new JCheckBox("ANSI 37");
				checkBoxANSI37.setEnabled(false);
				checkBoxANSI37.setBounds(18, 90, 97, 23);
				panelMenu.add(checkBoxANSI37);
				
				//4
				JCheckBox checkBoxANSI40 = new JCheckBox("ANSI 40");
				checkBoxANSI40.setEnabled(false);
				checkBoxANSI40.setBounds(18, 115, 97, 23);
				panelMenu.add(checkBoxANSI40);
				
				//5
				JCheckBox checkBoxANSI46 = new JCheckBox("ANSI 46");
				checkBoxANSI46.setEnabled(false);
				checkBoxANSI46.setBounds(18, 140, 97, 23);
				panelMenu.add(checkBoxANSI46);
				
				//6
				JCheckBox checkBoxANSI50 = new JCheckBox("ANSI 50");
				checkBoxANSI50.setEnabled(false);
				checkBoxANSI50.setBounds(18, 240, 97, 23);
				panelMenu.add(checkBoxANSI50);
				
				//7
				JCheckBox checkBoxANSI49 = new JCheckBox("ANSI 49");
				checkBoxANSI49.setEnabled(false);
				checkBoxANSI49.setBounds(18, 215, 97, 23);
				panelMenu.add(checkBoxANSI49);
				
				//8
				JCheckBox checkBoxANSI48 = new JCheckBox("ANSI 48");
				checkBoxANSI48.setEnabled(false);
				checkBoxANSI48.setBounds(18, 190, 97, 23);
				panelMenu.add(checkBoxANSI48);
				
				//9
				JCheckBox checkBoxANSI47 = new JCheckBox("ANSI 47");
				checkBoxANSI47.setEnabled(false);
				checkBoxANSI47.setBounds(18, 165, 97, 23);
				panelMenu.add(checkBoxANSI47);
				
				//10
				JCheckBox checkBoxANSI51 = new JCheckBox("ANSI 51");
				checkBoxANSI51.setEnabled(false);
				checkBoxANSI51.setBounds(117, 40, 97, 23);
				panelMenu.add(checkBoxANSI51);
				
				//11
				JCheckBox checkBoxANSI51G = new JCheckBox("ANSI 51G");
				checkBoxANSI51G.setEnabled(false);
				checkBoxANSI51G.setBounds(117, 65, 97, 23);
				panelMenu.add(checkBoxANSI51G);
				
				//12
				JCheckBox checkBoxANSI51LB = new JCheckBox("ANSI 51LB");
				checkBoxANSI51LB.setEnabled(false);
				checkBoxANSI51LB.setBounds(117, 90, 97, 23);
				panelMenu.add(checkBoxANSI51LB);
				
				//13
				JCheckBox checkBoxANSI51N = new JCheckBox("ANSI 51N");
				checkBoxANSI51N.setEnabled(false);
				checkBoxANSI51N.setBounds(117, 115, 97, 23);
				panelMenu.add(checkBoxANSI51N);
				
				//14
				JCheckBox checkBoxANSI59 = new JCheckBox("ANSI 59");
				checkBoxANSI59.setEnabled(false);
				checkBoxANSI59.setBounds(117, 140, 97, 23);
				panelMenu.add(checkBoxANSI59);
				
				//15
				JCheckBox checkBoxANSI59N = new JCheckBox("ANSI 59N");
				checkBoxANSI59N.setEnabled(false);
				checkBoxANSI59N.setBounds(117, 165, 97, 23);
				panelMenu.add(checkBoxANSI59N);
				
				//16
				JCheckBox checkBoxANSI66 = new JCheckBox("ANSI 66");
				checkBoxANSI66.setEnabled(false);
				checkBoxANSI66.setBounds(117, 190, 97, 23);
				panelMenu.add(checkBoxANSI66);
				
				//17
				JCheckBox checkBoxANSI78PS = new JCheckBox("ANSI 78PS");
				checkBoxANSI78PS.setEnabled(false);
				checkBoxANSI78PS.setBounds(117, 215, 97, 23);
				panelMenu.add(checkBoxANSI78PS);
				
				//18
				JCheckBox checkBoxANSI87M = new JCheckBox("ANSI 87M");
				checkBoxANSI87M.setEnabled(false);
				checkBoxANSI87M.setBounds(117, 265, 97, 23);
				panelMenu.add(checkBoxANSI87M);
				
				//19
				checkBoxOutros = new JCheckBox("Constantes T\u00E9rmicas");
				checkBoxOutros.setEnabled(false);
				checkBoxOutros.setBounds(117, 290, 192, 23);
				panelMenu.add(checkBoxOutros);
				checkBoxOutros.addActionListener(new ActionListener() {
				      public void actionPerformed(ActionEvent actionEvent) {
					        AbstractButton abstractButton = (AbstractButton) actionEvent.getSource();
					        boolean selected = abstractButton.getModel().isSelected();
					        
					        txtConstTempFrio.setEnabled(!selected);
					        txtConstTempQuente.setEnabled(!selected);
					        
					        comboBoxTrbf.setEnabled(selected);
					        comboBoxTrbq.setEnabled(selected);
					        lblTempoRotBlocFrio.setEnabled(selected);
					        lblTrotorBloqueadoQuente.setEnabled(selected);
					        
					        txtMotorTrbf.setEnabled(selected);
					        txtMotorTrbq.setEnabled(selected);
					        txtMotorTrbf.setText("0");
					        txtMotorTrbq.setText("0");
					        
					        comboBoxConstTempFrio.setEnabled(!selected);
					        comboBoxConstTempQuente.setEnabled(!selected);
					        lblConstTempFrio.setEnabled(!selected);
					        lblConstTempQuente.setEnabled(!selected);
					        
					      }
					    });
				
				
				JCheckBox checkBoxANSI50GS = new JCheckBox("ANSI 50GS");
				checkBoxANSI50GS.setEnabled(false);
				checkBoxANSI50GS.setBounds(18, 265, 97, 23);
				panelMenu.add(checkBoxANSI50GS);
				
				JCheckBox checkBoxANSI81 = new JCheckBox("ANSI 81");
				checkBoxANSI81.setEnabled(false);
				checkBoxANSI81.setBounds(117, 240, 97, 23);
				panelMenu.add(checkBoxANSI81);
								
				
				JComboBox comboBoxAjuste = new JComboBox();
				comboBoxAjuste.setModel(new DefaultComboBoxModel(new String[] { "ENGIE" ,"Mamede", "Schneider"}));
				comboBoxAjuste.setBounds(142, 27, 110, 20);
				
				
				//comboBoxAjuste.getModel().setSelectedItem("Schneider");
				comboBoxAjuste.setSelectedIndex(0);
				comboBoxAjuste.updateUI();
				comboBoxAjuste.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						
						JComboBox cb = (JComboBox)arg0.getSource();
						Object selected = cb.getSelectedItem();
						switch (selected.toString()){
						case "Mamede":
							
							btnSalvaAjustePersonalizado.setEnabled(false);
							btnImportaAjustePersonalizado.setEnabled(false);

							checkBoxANSI26.setEnabled(false);
							checkBoxANSI27.setEnabled(true);
							checkBoxANSI37.setEnabled(true);
							checkBoxANSI40.setEnabled(false);
							checkBoxANSI46.setEnabled(true);
							checkBoxANSI47.setEnabled(true);
							checkBoxANSI48.setEnabled(true);
							
							checkBoxANSI49.setEnabled(false);
							checkBoxANSI50.setEnabled(true);
							checkBoxANSI50GS.setEnabled(false);
							checkBoxANSI51.setEnabled(true);
							checkBoxANSI51G.setEnabled(true);
							checkBoxANSI51LB.setEnabled(true);
							checkBoxANSI51N.setEnabled(true);
							checkBoxANSI59.setEnabled(true);
							checkBoxANSI59N.setEnabled(false);
							checkBoxANSI66.setEnabled(false);
							checkBoxANSI78PS.setEnabled(false);
							checkBoxANSI81.setEnabled(false);
							checkBoxANSI87M.setEnabled(false);
							
							ajustes.clear();
							ajustes=AjustesProtecoes.ajustesMamede();
							
							txtANSI27prot1.setText(String.valueOf(ScienceFormatAjustes.format(ajustes.get(1)[0])));
							txtANSI27prot2.setText(String.valueOf(ScienceFormatAjustes.format(ajustes.get(1)[1])));

							txtANSI37prot1.setText(String.valueOf(ScienceFormatAjustes.format(ajustes.get(2)[0])));
							txtANSI37prot2.setText(String.valueOf(ScienceFormatAjustes.format(ajustes.get(2)[1])));

							txtANSI46prot1.setText(String.valueOf(ScienceFormatAjustes.format(ajustes.get(4)[0])));
							txtANSI46prot2.setText(String.valueOf(ScienceFormatAjustes.format(ajustes.get(4)[1])));
							txtANSI46prot3.setText(String.valueOf(ScienceFormatAjustes.format(ajustes.get(4)[2])));
							txtANSI46prot4.setText(String.valueOf(ScienceFormatAjustes.format(ajustes.get(4)[3])));

							txtANSI47prot1.setText(String.valueOf(ScienceFormatAjustes.format(ajustes.get(5)[0])));
							txtANSI47prot2.setText(String.valueOf(ScienceFormatAjustes.format(ajustes.get(5)[1])));

							txtANSI49prot1.setText(String.valueOf(ScienceFormatAjustes.format(ajustes.get(7)[0])));
							txtANSI49prot2.setText(String.valueOf(ScienceFormatAjustes.format(ajustes.get(7)[1])));

							txtANSI50prot1.setText(String.valueOf(ScienceFormatAjustes.format(ajustes.get(8)[0])));
							
							txtANSI50GSprot1.setText(String.valueOf(ScienceFormatAjustes.format(ajustes.get(18)[0])));

							txtANSI51prot1.setText(String.valueOf(ScienceFormatAjustes.format(ajustes.get(9)[0])));
							txtANSI51prot2.setText(String.valueOf(ScienceFormatAjustes.format(ajustes.get(9)[1])));

							txtANSI51LBprot1.setText(String.valueOf(ScienceFormatAjustes.format(ajustes.get(11)[0])));
							txtANSI51LBprot2.setText(String.valueOf(ScienceFormatAjustes.format(ajustes.get(11)[1])));

							txtANSI59prot1.setText(String.valueOf(ScienceFormatAjustes.format(ajustes.get(13)[0])));
							txtANSI59prot2.setText(String.valueOf(ScienceFormatAjustes.format(ajustes.get(13)[1])));

							txtANSI66prot1.setText(String.valueOf(ScienceFormatAjustes.format(ajustes.get(15)[0])));
							
							txtANSI81prot1.setText(String.valueOf(ScienceFormatAjustes.format(ajustes.get(19)[0])));
							break;
						
						case "Schneider":
							
							btnSalvaAjustePersonalizado.setEnabled(false);
							btnImportaAjustePersonalizado.setEnabled(false);

							checkBoxANSI26.setEnabled(false);
							checkBoxANSI27.setEnabled(false);
							checkBoxANSI37.setEnabled(true);
							checkBoxANSI40.setEnabled(false);
							checkBoxANSI46.setEnabled(true);
							checkBoxANSI47.setEnabled(false);
							checkBoxANSI48.setEnabled(true);
							checkBoxANSI49.setEnabled(true);
							checkBoxANSI50.setEnabled(true);
							checkBoxANSI51.setEnabled(false);
							checkBoxANSI51G.setEnabled(false);
							checkBoxANSI51LB.setEnabled(true);
							checkBoxANSI51N.setEnabled(false);
							checkBoxANSI59.setEnabled(false);
							checkBoxANSI59N.setEnabled(false);
							checkBoxANSI66.setEnabled(true);
							checkBoxANSI78PS.setEnabled(false);
							checkBoxANSI87M.setEnabled(false);
							
							checkBoxANSI50GS.setEnabled(false);
							checkBoxANSI81.setEnabled(false);
							
							
							ajustes.clear();
							ajustes=AjustesProtecoes.ajustesSchneider();
							
							txtANSI27prot1.setText(String.valueOf(ScienceFormatAjustes.format(ajustes.get(1)[0])));
							txtANSI27prot2.setText(String.valueOf(ScienceFormatAjustes.format(ajustes.get(1)[1])));

							txtANSI37prot1.setText(String.valueOf(ScienceFormatAjustes.format(ajustes.get(2)[0])));
							txtANSI37prot2.setText(String.valueOf(ScienceFormatAjustes.format(ajustes.get(2)[1])));

							txtANSI46prot1.setText(String.valueOf(ScienceFormatAjustes.format(ajustes.get(4)[0])));
							txtANSI46prot2.setText(String.valueOf(ScienceFormatAjustes.format(ajustes.get(4)[1])));
							txtANSI46prot3.setText(String.valueOf(ScienceFormatAjustes.format(ajustes.get(4)[2])));
							txtANSI46prot4.setText(String.valueOf(ScienceFormatAjustes.format(ajustes.get(4)[3])));

							txtANSI47prot1.setText(String.valueOf(ScienceFormatAjustes.format(ajustes.get(5)[0])));
							txtANSI47prot2.setText(String.valueOf(ScienceFormatAjustes.format(ajustes.get(5)[1])));

							txtANSI49prot1.setText(String.valueOf(ScienceFormatAjustes.format(ajustes.get(7)[0])));
							txtANSI49prot2.setText(String.valueOf(ScienceFormatAjustes.format(ajustes.get(7)[1])));

							txtANSI50prot1.setText(String.valueOf(ScienceFormatAjustes.format(ajustes.get(8)[0])));
							
							txtANSI50GSprot1.setText(String.valueOf(ScienceFormatAjustes.format(ajustes.get(18)[0])));

							txtANSI51prot1.setText(String.valueOf(ScienceFormatAjustes.format(ajustes.get(9)[0])));
							txtANSI51prot2.setText(String.valueOf(ScienceFormatAjustes.format(ajustes.get(9)[1])));

							txtANSI51LBprot1.setText(String.valueOf(ScienceFormatAjustes.format(ajustes.get(11)[0])));
							txtANSI51LBprot2.setText(String.valueOf(ScienceFormatAjustes.format(ajustes.get(11)[1])));

							txtANSI59prot1.setText(String.valueOf(ScienceFormatAjustes.format(ajustes.get(13)[0])));
							txtANSI59prot2.setText(String.valueOf(ScienceFormatAjustes.format(ajustes.get(13)[1])));

							txtANSI66prot1.setText(String.valueOf(ScienceFormatAjustes.format(ajustes.get(15)[0])));
							
							txtANSI81prot1.setText(String.valueOf(ScienceFormatAjustes.format(ajustes.get(19)[0])));
							
							break;		
							
						case "Personalizado":
							
							btnSalvaAjustePersonalizado.setEnabled(true);
							btnImportaAjustePersonalizado.setEnabled(true);

							checkBoxANSI26.setEnabled(true);
							checkBoxANSI27.setEnabled(true);
							checkBoxANSI37.setEnabled(true);
							checkBoxANSI40.setEnabled(true);
							checkBoxANSI46.setEnabled(true);
							checkBoxANSI47.setEnabled(true);
							checkBoxANSI48.setEnabled(true);
							checkBoxANSI49.setEnabled(true);
							checkBoxANSI50.setEnabled(true);
							checkBoxANSI51.setEnabled(true);
							checkBoxANSI51G.setEnabled(true);
							checkBoxANSI51LB.setEnabled(true);
							checkBoxANSI51N.setEnabled(true);
							checkBoxANSI59.setEnabled(true);
							checkBoxANSI59N.setEnabled(true);
							checkBoxANSI66.setEnabled(true);
							checkBoxANSI78PS.setEnabled(true);
							checkBoxANSI87M.setEnabled(true);
							checkBoxANSI50GS.setEnabled(false);
							checkBoxANSI81.setEnabled(false);
							break;
						
							case "ENGIE":
							
							btnSalvaAjustePersonalizado.setEnabled(false);
							btnImportaAjustePersonalizado.setEnabled(false);

							checkBoxANSI26.setEnabled(false);
							checkBoxANSI26.setSelected(false);
							
							checkBoxANSI27.setEnabled(true);
							
							checkBoxANSI37.setEnabled(true);
							
							checkBoxANSI40.setEnabled(false);
							checkBoxANSI40.setSelected(false);
							
							checkBoxANSI46.setEnabled(true);
							
							checkBoxANSI47.setEnabled(true);
							
							checkBoxANSI48.setEnabled(false);
							checkBoxANSI48.setSelected(false);
							
							checkBoxANSI49.setEnabled(true);
														
							checkBoxANSI50.setEnabled(true);
							
							checkBoxANSI51.setEnabled(true);
							
							checkBoxANSI51G.setEnabled(false);
							checkBoxANSI51G.setSelected(false);
							
							checkBoxANSI51LB.setEnabled(true);
							
							checkBoxANSI51N.setEnabled(false);
							checkBoxANSI51N.setSelected(false);
							
							checkBoxANSI59.setEnabled(true);
							
							checkBoxANSI59N.setEnabled(false);
							checkBoxANSI59N.setSelected(false);

							checkBoxANSI66.setEnabled(true);
													
							checkBoxANSI78PS.setEnabled(false);
							checkBoxANSI78PS.setSelected(false);
							
							checkBoxANSI87M.setEnabled(false);
							checkBoxANSI87M.setSelected(false);
							
							checkBoxANSI50GS.setEnabled(true);
							
							checkBoxANSI81.setEnabled(true);
							
							checkBoxOutros.setEnabled(true);
							
							ajustes.clear();
							ajustes=AjustesProtecoes.ajustesENGIE();
							
							txtANSI27prot1.setText(String.valueOf(ScienceFormatAjustes.format(ajustes.get(1)[0])));
							txtANSI27prot2.setText(String.valueOf(ScienceFormatAjustes.format(ajustes.get(1)[1])));

							txtANSI37prot1.setText(String.valueOf(ScienceFormatAjustes.format(ajustes.get(2)[0])));
							txtANSI37prot2.setText(String.valueOf(ScienceFormatAjustes.format(ajustes.get(2)[1])));

							txtANSI46prot1.setText(String.valueOf(ScienceFormatAjustes.format(ajustes.get(4)[0])));
							txtANSI46prot2.setText(String.valueOf(ScienceFormatAjustes.format(ajustes.get(4)[1])));
							txtANSI46prot3.setText(String.valueOf(ScienceFormatAjustes.format(ajustes.get(4)[2])));
							txtANSI46prot4.setText(String.valueOf(ScienceFormatAjustes.format(ajustes.get(4)[3])));

							txtANSI47prot1.setText(String.valueOf(ScienceFormatAjustes.format(ajustes.get(5)[0])));
							txtANSI47prot2.setText(String.valueOf(ScienceFormatAjustes.format(ajustes.get(5)[1])));

							txtANSI49prot1.setText(String.valueOf(ScienceFormatAjustes.format(ajustes.get(7)[0])));
							txtANSI49prot2.setText(String.valueOf(ScienceFormatAjustes.format(ajustes.get(7)[1])));

							txtANSI50prot1.setText(String.valueOf(ScienceFormatAjustes.format(ajustes.get(8)[0])));
							
							txtANSI50GSprot1.setText(String.valueOf(ScienceFormatAjustes.format(ajustes.get(18)[0])));

							txtANSI51prot1.setText(String.valueOf(ScienceFormatAjustes.format(ajustes.get(9)[0])));
							txtANSI51prot2.setText(String.valueOf(ScienceFormatAjustes.format(ajustes.get(9)[1])));

							txtANSI51LBprot1.setText(String.valueOf(ScienceFormatAjustes.format(ajustes.get(11)[0])));
							txtANSI51LBprot2.setText(String.valueOf(ScienceFormatAjustes.format(ajustes.get(11)[1])));

							txtANSI59prot1.setText(String.valueOf(ScienceFormatAjustes.format(ajustes.get(13)[0])));
							txtANSI59prot2.setText(String.valueOf(ScienceFormatAjustes.format(ajustes.get(13)[1])));

							txtANSI66prot1.setText(String.valueOf(ScienceFormatAjustes.format(ajustes.get(15)[0])));
							
							txtANSI81prot1.setText(String.valueOf(ScienceFormatAjustes.format(ajustes.get(19)[0])));
							break;
						}
		                
		                
					}
				});
				
				panelAjustes.add(comboBoxAjuste);
				
				
				
				JPanel panel_3 = new JPanel();
				panel_3.setBounds(10, 11, 160, 531);
				panel_14.add(panel_3);
				panel_3.setLayout(null);
				
				JPanel panelAjuste46 = new JPanel();
				panelAjuste46.setBounds(0, 166, 160, 198);
				panel_3.add(panelAjuste46);
				panelAjuste46.setLayout(null);
				panelAjuste46.setBorder(new TitledBorder(null, "ANSI 46", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
				
				JPanel panel = new JPanel();
				panel.setBorder(new TitledBorder(null, "Temp. Definido", TitledBorder.LEADING, TitledBorder.TOP, null, null));
				panel.setBounds(10, 29, 140, 74);
				panelAjuste46.add(panel);
				panel.setLayout(null);
				
				JLabel lblTemp = new JLabel("Temp:");
				lblTemp.setHorizontalAlignment(SwingConstants.RIGHT);
				lblTemp.setBounds(19, 49, 42, 14);
				panel.add(lblTemp);
				
				txtANSI46prot2 = new JTextField();
				txtANSI46prot2.setEditable(false);
				txtANSI46prot2.setColumns(10);
				txtANSI46prot2.setBounds(71, 46, 41, 20);
				panel.add(txtANSI46prot2);
				
				JLabel lblS = new JLabel("s");
				lblS.setBounds(122, 49, 18, 14);
				panel.add(lblS);
				
				JLabel label_19 = new JLabel("%");
				label_19.setBounds(122, 24, 18, 14);
				panel.add(label_19);
				
				txtANSI46prot1 = new JTextField();
				txtANSI46prot1.setEditable(false);
				txtANSI46prot1.setColumns(10);
				txtANSI46prot1.setBounds(71, 21, 41, 20);
				panel.add(txtANSI46prot1);
				
				JLabel lblDesequlibrioNasFases = new JLabel("Des. I:");
				lblDesequlibrioNasFases.setHorizontalAlignment(SwingConstants.RIGHT);
				lblDesequlibrioNasFases.setBounds(19, 24, 42, 14);
				panel.add(lblDesequlibrioNasFases);
				
				JPanel panel_1 = new JPanel();
				panel_1.setLayout(null);
				panel_1.setEnabled(false);
				panel_1.setBorder(new TitledBorder(null, "Temp. Inverso", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
				panel_1.setBounds(10, 113, 140, 74);
				panelAjuste46.add(panel_1);
				
				JLabel label_2 = new JLabel("Temp:");
				label_2.setEnabled(false);
				label_2.setHorizontalAlignment(SwingConstants.RIGHT);
				label_2.setBounds(19, 49, 42, 14);
				panel_1.add(label_2);
				
				txtANSI46prot4 = new JTextField();
				txtANSI46prot4.setEnabled(false);
				txtANSI46prot4.setEditable(false);
				txtANSI46prot4.setColumns(10);
				txtANSI46prot4.setBounds(71, 46, 41, 20);
				panel_1.add(txtANSI46prot4);
				
				JLabel label_7 = new JLabel("s");
				label_7.setEnabled(false);
				label_7.setBounds(122, 49, 18, 14);
				panel_1.add(label_7);
				
				JLabel label_9 = new JLabel("%");
				label_9.setEnabled(false);
				label_9.setBounds(122, 24, 18, 14);
				panel_1.add(label_9);
				
				txtANSI46prot3 = new JTextField();
				txtANSI46prot3.setEnabled(false);
				txtANSI46prot3.setEditable(false);
				txtANSI46prot3.setColumns(10);
				txtANSI46prot3.setBounds(71, 21, 41, 20);
				panel_1.add(txtANSI46prot3);
				
				JLabel label_11 = new JLabel("Des. I:");
				label_11.setEnabled(false);
				label_11.setHorizontalAlignment(SwingConstants.RIGHT);
				label_11.setBounds(19, 24, 42, 14);
				panel_1.add(label_11);
				
				JPanel panel_2 = new JPanel();
				panel_2.setLayout(null);
				panel_2.setBorder(new TitledBorder(null, "ANSI 27", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
				panel_2.setBounds(0, 6, 160, 74);
				panel_3.add(panel_2);
				
				JLabel lblVn = new JLabel("Vn%:");
				lblVn.setHorizontalAlignment(SwingConstants.RIGHT);
				lblVn.setBounds(10, 24, 61, 14);
				panel_2.add(lblVn);
				
				txtANSI27prot1 = new JTextField();
				txtANSI27prot1.setEditable(false);
				txtANSI27prot1.setColumns(10);
				txtANSI27prot1.setBounds(81, 21, 41, 20);
				panel_2.add(txtANSI27prot1);
				
				JLabel label_14 = new JLabel("%");
				label_14.setBounds(132, 24, 18, 14);
				panel_2.add(label_14);
				
				JLabel label_15 = new JLabel("T:");
				label_15.setHorizontalAlignment(SwingConstants.RIGHT);
				label_15.setBounds(10, 49, 61, 14);
				panel_2.add(label_15);
				
				txtANSI27prot2 = new JTextField();
				txtANSI27prot2.setEditable(false);
				txtANSI27prot2.setColumns(10);
				txtANSI27prot2.setBounds(81, 46, 41, 20);
				panel_2.add(txtANSI27prot2);
				
				JLabel lblS_1 = new JLabel("s");
				lblS_1.setBounds(132, 49, 18, 14);
				panel_2.add(lblS_1);
				
				JPanel panel_10 = new JPanel();
				panel_10.setLayout(null);
				panel_10.setBorder(new TitledBorder(null, "ANSI 37", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
				panel_10.setBounds(0, 86, 160, 74);
				panel_3.add(panel_10);
				
				JLabel label_17 = new JLabel("<In%:");
				label_17.setHorizontalAlignment(SwingConstants.RIGHT);
				label_17.setBounds(10, 24, 61, 14);
				panel_10.add(label_17);
				
				txtANSI37prot1 = new JTextField();
				txtANSI37prot1.setEditable(false);
				txtANSI37prot1.setColumns(10);
				txtANSI37prot1.setBounds(81, 21, 41, 20);
				panel_10.add(txtANSI37prot1);
				
				JLabel label_18 = new JLabel("%");
				label_18.setBounds(132, 24, 18, 14);
				panel_10.add(label_18);
				
				JLabel label_21 = new JLabel("T:");
				label_21.setHorizontalAlignment(SwingConstants.RIGHT);
				label_21.setBounds(10, 49, 61, 14);
				panel_10.add(label_21);
				
				txtANSI37prot2 = new JTextField();
				txtANSI37prot2.setEditable(false);
				txtANSI37prot2.setColumns(10);
				txtANSI37prot2.setBounds(81, 46, 41, 20);
				panel_10.add(txtANSI37prot2);
				
				JLabel lblS_6 = new JLabel("s");
				lblS_6.setBounds(132, 49, 18, 14);
				panel_10.add(lblS_6);
				
				JPanel panel_11 = new JPanel();
				panel_11.setLayout(null);
				panel_11.setBorder(new TitledBorder(null, "ANSI 47", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
				panel_11.setBounds(0, 370, 160, 74);
				panel_3.add(panel_11);
				
				JLabel lblV = new JLabel("<%Vn:");
				lblV.setHorizontalAlignment(SwingConstants.RIGHT);
				lblV.setBounds(10, 24, 61, 14);
				panel_11.add(lblV);
				
				txtANSI47prot1 = new JTextField();
				txtANSI47prot1.setEditable(false);
				txtANSI47prot1.setColumns(10);
				txtANSI47prot1.setBounds(81, 21, 41, 20);
				panel_11.add(txtANSI47prot1);
				
				JLabel label_12 = new JLabel("%");
				label_12.setBounds(132, 24, 18, 14);
				panel_11.add(label_12);
				
				JLabel label_37 = new JLabel("T:");
				label_37.setHorizontalAlignment(SwingConstants.RIGHT);
				label_37.setBounds(10, 49, 61, 14);
				panel_11.add(label_37);
				
				txtANSI47prot2 = new JTextField();
				txtANSI47prot2.setEditable(false);
				txtANSI47prot2.setColumns(10);
				txtANSI47prot2.setBounds(81, 46, 41, 20);
				panel_11.add(txtANSI47prot2);
				
				JLabel lblS_5 = new JLabel("s");
				lblS_5.setBounds(132, 49, 18, 14);
				panel_11.add(lblS_5);
				
				JPanel panel_5 = new JPanel();
				panel_5.setBounds(0, 450, 160, 74);
				panel_3.add(panel_5);
				panel_5.setLayout(null);
				panel_5.setBorder(new TitledBorder(null, "ANSI 49", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
				
				JLabel label_20 = new JLabel("I<%:");
				label_20.setHorizontalAlignment(SwingConstants.RIGHT);
				label_20.setBounds(10, 24, 61, 14);
				panel_5.add(label_20);
				
				txtANSI49prot1 = new JTextField();
				txtANSI49prot1.setEditable(false);
				txtANSI49prot1.setColumns(10);
				txtANSI49prot1.setBounds(81, 21, 41, 20);
				panel_5.add(txtANSI49prot1);
				
				JLabel label_23 = new JLabel("A");
				label_23.setBounds(132, 24, 18, 14);
				panel_5.add(label_23);
				
				JLabel label_24 = new JLabel("T:");
				label_24.setHorizontalAlignment(SwingConstants.RIGHT);
				label_24.setBounds(10, 49, 61, 14);
				panel_5.add(label_24);
				
				txtANSI49prot2 = new JTextField();
				txtANSI49prot2.setEditable(false);
				txtANSI49prot2.setColumns(10);
				txtANSI49prot2.setBounds(81, 46, 41, 20);
				panel_5.add(txtANSI49prot2);
				
				JLabel lblS_4 = new JLabel("s");
				lblS_4.setBounds(132, 49, 18, 14);
				panel_5.add(lblS_4);
				
				
				
				JPanel panel_8 = new JPanel();
				panel_8.setLayout(null);
				panel_8.setBorder(new TitledBorder(null, "ANSI 51LB", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
				panel_8.setBounds(0, 186, 160, 74);
				panel_4.add(panel_8);
				
				JLabel lblIcft = new JLabel("IN%:");
				lblIcft.setHorizontalAlignment(SwingConstants.RIGHT);
				lblIcft.setBounds(10, 24, 61, 14);
				panel_8.add(lblIcft);
				
				txtANSI51LBprot1 = new JTextField();
				txtANSI51LBprot1.setEditable(false);
				txtANSI51LBprot1.setColumns(10);
				txtANSI51LBprot1.setBounds(81, 21, 41, 20);
				panel_8.add(txtANSI51LBprot1);
				
				JLabel label_35 = new JLabel("%");
				label_35.setBounds(132, 24, 18, 14);
				panel_8.add(label_35);
				
				JLabel label_36 = new JLabel("T:");
				label_36.setHorizontalAlignment(SwingConstants.RIGHT);
				label_36.setBounds(10, 49, 61, 14);
				panel_8.add(label_36);
				
				txtANSI51LBprot2 = new JTextField();
				txtANSI51LBprot2.setEditable(false);
				txtANSI51LBprot2.setColumns(10);
				txtANSI51LBprot2.setBounds(81, 46, 41, 20);
				panel_8.add(txtANSI51LBprot2);
				
				JLabel lblS_2 = new JLabel("s");
				lblS_2.setBounds(132, 49, 18, 14);
				panel_8.add(lblS_2);
				
				JPanel panel_6 = new JPanel();
				panel_6.setLayout(null);
				panel_6.setBorder(new TitledBorder(null, "ANSI 50", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
				panel_6.setBounds(0, 3, 160, 50);
				panel_4.add(panel_6);
				
				JLabel lblFa = new JLabel("%Ip:");
				lblFa.setHorizontalAlignment(SwingConstants.RIGHT);
				lblFa.setBounds(10, 24, 61, 14);
				panel_6.add(lblFa);
				
				txtANSI50prot1 = new JTextField();
				txtANSI50prot1.setEditable(false);
				txtANSI50prot1.setColumns(10);
				txtANSI50prot1.setBounds(81, 21, 41, 20);
				panel_6.add(txtANSI50prot1);
				
				JLabel label_13 = new JLabel("%");
				label_13.setBounds(132, 24, 18, 14);
				panel_6.add(label_13);
				
				JPanel panel_7 = new JPanel();
				panel_7.setLayout(null);
				panel_7.setBorder(new TitledBorder(null, "ANSI 51", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
				panel_7.setBounds(0, 109, 160, 74);
				panel_4.add(panel_7);
				
				JLabel lblI = new JLabel("In%:");
				lblI.setHorizontalAlignment(SwingConstants.RIGHT);
				lblI.setBounds(10, 24, 61, 14);
				panel_7.add(lblI);
				
				txtANSI51prot1 = new JTextField();
				txtANSI51prot1.setEditable(false);
				txtANSI51prot1.setColumns(10);
				txtANSI51prot1.setBounds(81, 21, 41, 20);
				panel_7.add(txtANSI51prot1);
				
				JLabel label_28 = new JLabel("%");
				label_28.setBounds(132, 24, 18, 14);
				panel_7.add(label_28);
				
				JLabel label_29 = new JLabel("T:");
				label_29.setHorizontalAlignment(SwingConstants.RIGHT);
				label_29.setBounds(10, 49, 61, 14);
				panel_7.add(label_29);
				
				txtANSI51prot2 = new JTextField();
				txtANSI51prot2.setEditable(false);
				txtANSI51prot2.setColumns(10);
				txtANSI51prot2.setBounds(81, 46, 41, 20);
				panel_7.add(txtANSI51prot2);
				
				JLabel lblS_3 = new JLabel("s");
				lblS_3.setBounds(132, 49, 18, 14);
				panel_7.add(lblS_3);
				
				JPanel panel_12 = new JPanel();
				panel_12.setLayout(null);
				panel_12.setBorder(new TitledBorder(null, "ANSI 59", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
				panel_12.setBounds(0, 263, 160, 74);
				panel_4.add(panel_12);
				
				JLabel lblVnom_1 = new JLabel("Vnom%:");
				lblVnom_1.setHorizontalAlignment(SwingConstants.RIGHT);
				lblVnom_1.setBounds(10, 24, 61, 14);
				panel_12.add(lblVnom_1);
				
				txtANSI59prot1 = new JTextField();
				txtANSI59prot1.setEditable(false);
				txtANSI59prot1.setColumns(10);
				txtANSI59prot1.setBounds(81, 21, 41, 20);
				panel_12.add(txtANSI59prot1);
				
				JLabel label_16 = new JLabel("%");
				label_16.setBounds(132, 24, 18, 14);
				panel_12.add(label_16);
				
				JLabel label_25 = new JLabel("T:");
				label_25.setHorizontalAlignment(SwingConstants.RIGHT);
				label_25.setBounds(10, 49, 61, 14);
				panel_12.add(label_25);
				
				txtANSI59prot2 = new JTextField();
				txtANSI59prot2.setEditable(false);
				txtANSI59prot2.setColumns(10);
				txtANSI59prot2.setBounds(81, 46, 41, 20);
				panel_12.add(txtANSI59prot2);
				
				JLabel label_26 = new JLabel("s");
				label_26.setBounds(132, 49, 18, 14);
				panel_12.add(label_26);
				
				JPanel panel_13 = new JPanel();
				panel_13.setLayout(null);
				panel_13.setBorder(new TitledBorder(null, "ANSI 66", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
				panel_13.setBounds(0, 340, 160, 50);
				panel_4.add(panel_13);
				
				JLabel lblNPart = new JLabel("n\u00BA Part:");
				lblNPart.setHorizontalAlignment(SwingConstants.RIGHT);
				lblNPart.setBounds(10, 24, 61, 14);
				panel_13.add(lblNPart);
				
				txtANSI66prot1 = new JTextField();
				txtANSI66prot1.setEditable(false);
				txtANSI66prot1.setColumns(10);
				txtANSI66prot1.setBounds(81, 21, 41, 20);
				panel_13.add(txtANSI66prot1);
				
				JPanel panel_9 = new JPanel();
				panel_9.setLayout(null);
				panel_9.setBorder(new TitledBorder(null, "ANSI 50GS", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
				panel_9.setBounds(0, 56, 160, 50);
				panel_4.add(panel_9);
				
				JLabel label_10 = new JLabel("In%:");
				label_10.setHorizontalAlignment(SwingConstants.RIGHT);
				label_10.setBounds(10, 24, 61, 14);
				panel_9.add(label_10);
				
				txtANSI50GSprot1 = new JTextField();
				txtANSI50GSprot1.setEditable(false);
				txtANSI50GSprot1.setColumns(10);
				txtANSI50GSprot1.setBounds(81, 21, 41, 20);
				panel_9.add(txtANSI50GSprot1);
				
				JLabel label_27 = new JLabel("%");
				label_27.setBounds(132, 24, 18, 14);
				panel_9.add(label_27);
				
				JPanel panel_33 = new JPanel();
				panel_33.setLayout(null);
				panel_33.setBorder(new TitledBorder(null, "ANSI 81", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
				panel_33.setBounds(0, 393, 160, 50);
				panel_4.add(panel_33);
				
				JLabel lblFreq = new JLabel("freq %:");
				lblFreq.setHorizontalAlignment(SwingConstants.RIGHT);
				lblFreq.setBounds(10, 24, 61, 14);
				panel_33.add(lblFreq);
				
				txtANSI81prot1 = new JTextField();
				txtANSI81prot1.setEditable(false);
				txtANSI81prot1.setColumns(10);
				txtANSI81prot1.setBounds(81, 21, 41, 20);
				panel_33.add(txtANSI81prot1);
				
				JLabel label_34 = new JLabel("%");
				label_34.setBounds(132, 24, 18, 14);
				panel_33.add(label_34);
				
				
				
				
				JPanel panelResultadosProtecoes = new JPanel();
				tabbedPane.addTab("Resultados", null, panelResultadosProtecoes, null);
				panelResultadosProtecoes.setLayout(null);
				
				tabbedPane.removeTabAt(2);
				
				JTabbedPane tabbedPaneResultadosProts = new JTabbedPane(JTabbedPane.TOP);
				tabbedPaneResultadosProts.setBorder(null);
				tabbedPaneResultadosProts.setBounds(0, 0, 395, 612);
				panelResultadosProtecoes.add(tabbedPaneResultadosProts);
				
				JPanel panelResult26 = new JPanel();
				//tabbedPaneResultadosProts.addTab("ANSI 26", null, panelResult26, null);
				panelResult26.setLayout(null);
				
				JPanel panelResult27 = new JPanel();
				tabbedPaneResultadosProts.addTab("ANSI 27", null, panelResult27, null);
				panelResult27.setLayout(null);
								
				JPanel panel_15 = new JPanel();
				panel_15.setLayout(null);
				panel_15.setBorder(new TitledBorder(null, "ANSI 27", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
				panel_15.setBounds(103, 47, 183, 74);
				panelResult27.add(panel_15);
				
				JLabel lblV_1 = new JLabel("V (pick-up):");
				lblV_1.setHorizontalAlignment(SwingConstants.RIGHT);
				lblV_1.setBounds(0, 21, 104, 14);
				panel_15.add(lblV_1);
				
				txt27id0 = new JTextField();
				txt27id0.setEditable(false);
				txt27id0.setColumns(10);
				txt27id0.setBounds(114, 18, 41, 20);
				panel_15.add(txt27id0);
				
				JLabel lblV_2 = new JLabel("V");
				lblV_2.setBounds(165, 21, 18, 14);
				panel_15.add(lblV_2);
				
				JLabel lblTemporizao = new JLabel("Temporiza\u00E7\u00E3o:");
				lblTemporizao.setHorizontalAlignment(SwingConstants.RIGHT);
				lblTemporizao.setBounds(0, 46, 104, 14);
				panel_15.add(lblTemporizao);
				
				txt27id1 = new JTextField();
				txt27id1.setEditable(false);
				txt27id1.setColumns(10);
				txt27id1.setBounds(114, 43, 41, 20);
				panel_15.add(txt27id1);
				
				JLabel label_22 = new JLabel("s");
				label_22.setBounds(165, 46, 18, 14);
				panel_15.add(label_22);
								
				JPanel panelResult37 = new JPanel();
				tabbedPaneResultadosProts.addTab("ANSI 37", null, panelResult37, null);
				panelResult37.setLayout(null);
				
				JPanel panel_17 = new JPanel();
				panel_17.setLayout(null);
				panel_17.setBorder(new TitledBorder(null, "ANSI 37", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
				panel_17.setBounds(103, 47, 183, 74);
				panelResult37.add(panel_17);
				
				JLabel lblGmin = new JLabel("I (pick-up):");
				lblGmin.setHorizontalAlignment(SwingConstants.RIGHT);
				lblGmin.setBounds(0, 21, 104, 14);
				panel_17.add(lblGmin);
				
				txt37id0 = new JTextField();
				txt37id0.setEditable(false);
				txt37id0.setColumns(10);
				txt37id0.setBounds(114, 18, 41, 20);
				panel_17.add(txt37id0);
				
				JLabel lblGmx = new JLabel("Temporiza\u00E7\u00E3o:");
				lblGmx.setHorizontalAlignment(SwingConstants.RIGHT);
				lblGmx.setBounds(0, 46, 104, 14);
				panel_17.add(lblGmx);
				
				txt37id1 = new JTextField();
				txt37id1.setEditable(false);
				txt37id1.setColumns(10);
				txt37id1.setBounds(114, 43, 41, 20);
				panel_17.add(txt37id1);
				
				JPanel panelResult40 = new JPanel();
				tabbedPaneResultadosProts.addTab("ANSI 40", null, panelResult40, null);
				panelResult40.setLayout(null);
				
				JPanel panel_18 = new JPanel();
				panel_18.setLayout(null);
				panel_18.setBorder(new TitledBorder(null, "ANSI 40", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
				panel_18.setBounds(92, 47, 206, 132);
				panelResult40.add(panel_18);
				
				JLabel lblXa = new JLabel("Xa:");
				lblXa.setHorizontalAlignment(SwingConstants.RIGHT);
				lblXa.setBounds(0, 21, 104, 14);
				panel_18.add(lblXa);
				
				txt40id0 = new JTextField();
				txt40id0.setEditable(false);
				txt40id0.setColumns(10);
				txt40id0.setBounds(114, 18, 41, 20);
				panel_18.add(txt40id0);
				
				JLabel lblOhm = new JLabel("Ohm");
				lblOhm.setBounds(165, 21, 31, 14);
				panel_18.add(lblOhm);
				
				JLabel lblXb = new JLabel("Xb:");
				lblXb.setHorizontalAlignment(SwingConstants.RIGHT);
				lblXb.setBounds(0, 46, 104, 14);
				panel_18.add(lblXb);
				
				txt40id1 = new JTextField();
				txt40id1.setEditable(false);
				txt40id1.setColumns(10);
				txt40id1.setBounds(114, 43, 41, 20);
				panel_18.add(txt40id1);
				
				JLabel lblOhm_1 = new JLabel("Ohm");
				lblOhm_1.setBounds(165, 46, 31, 14);
				panel_18.add(lblOhm_1);
				
				JLabel lblXc = new JLabel("Xc:");
				lblXc.setHorizontalAlignment(SwingConstants.RIGHT);
				lblXc.setBounds(0, 71, 104, 14);
				panel_18.add(lblXc);
				
				txt40id2 = new JTextField();
				txt40id2.setEditable(false);
				txt40id2.setColumns(10);
				txt40id2.setBounds(114, 68, 41, 20);
				panel_18.add(txt40id2);
				
				JLabel lblOhm_2 = new JLabel("Ohm");
				lblOhm_2.setBounds(165, 71, 31, 14);
				panel_18.add(lblOhm_2);
				
				txt40id3 = new JTextField();
				txt40id3.setEditable(false);
				txt40id3.setColumns(10);
				txt40id3.setBounds(114, 93, 41, 20);
				panel_18.add(txt40id3);
				
				JLabel label_31 = new JLabel("s");
				label_31.setBounds(165, 96, 31, 14);
				panel_18.add(label_31);
				
				JLabel label_32 = new JLabel("Temporiza\u00E7\u00E3o:");
				label_32.setHorizontalAlignment(SwingConstants.RIGHT);
				label_32.setBounds(0, 96, 104, 14);
				panel_18.add(label_32);
				
				JPanel panelResult46 = new JPanel();
				tabbedPaneResultadosProts.addTab("ANSI 46", null, panelResult46, null);
				panelResult46.setLayout(null);
				
				JPanel panel_19 = new JPanel();
				panel_19.setLayout(null);
				panel_19.setBorder(new TitledBorder(null, "ANSI 46", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
				panel_19.setBounds(103, 47, 183, 74);
				panelResult46.add(panel_19);
				
				JLabel lblIdes = new JLabel("Ides:");
				lblIdes.setHorizontalAlignment(SwingConstants.RIGHT);
				lblIdes.setBounds(0, 21, 104, 14);
				panel_19.add(lblIdes);
				
				txt46id0 = new JTextField();
				txt46id0.setToolTipText("Corrente de desequ\u00EDlibro");
				txt46id0.setEditable(false);
				txt46id0.setColumns(10);
				txt46id0.setBounds(114, 18, 41, 20);
				panel_19.add(txt46id0);
				
				JLabel lblA_1 = new JLabel("A");
				lblA_1.setBounds(165, 21, 18, 14);
				panel_19.add(lblA_1);
				
				JLabel label_45 = new JLabel("Temporiza\u00E7\u00E3o:");
				label_45.setHorizontalAlignment(SwingConstants.RIGHT);
				label_45.setBounds(0, 46, 104, 14);
				panel_19.add(label_45);
				
				txt46id1 = new JTextField();
				txt46id1.setEditable(false);
				txt46id1.setColumns(10);
				txt46id1.setBounds(114, 43, 41, 20);
				panel_19.add(txt46id1);
				
				JLabel label_46 = new JLabel("s");
				label_46.setBounds(165, 46, 18, 14);
				panel_19.add(label_46);
				
				JPanel panelResult47 = new JPanel();
				tabbedPaneResultadosProts.addTab("ANSI 47", null, panelResult47, null);
				panelResult47.setLayout(null);
				
				JPanel panel_20 = new JPanel();
				panel_20.setLayout(null);
				panel_20.setBorder(new TitledBorder(null, "ANSI 47", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
				panel_20.setBounds(103, 47, 183, 74);
				panelResult47.add(panel_20);
				
				JLabel label_47 = new JLabel("V (pick-up):");
				label_47.setHorizontalAlignment(SwingConstants.RIGHT);
				label_47.setBounds(0, 21, 104, 14);
				panel_20.add(label_47);
				
				txt47id0 = new JTextField();
				txt47id0.setEditable(false);
				txt47id0.setColumns(10);
				txt47id0.setBounds(114, 18, 41, 20);
				panel_20.add(txt47id0);
				
				JLabel label_48 = new JLabel("V");
				label_48.setBounds(165, 21, 18, 14);
				panel_20.add(label_48);
				
				JLabel label_49 = new JLabel("Temporiza\u00E7\u00E3o:");
				label_49.setHorizontalAlignment(SwingConstants.RIGHT);
				label_49.setBounds(0, 46, 104, 14);
				panel_20.add(label_49);
				
				txt47id1 = new JTextField();
				txt47id1.setEditable(false);
				txt47id1.setColumns(10);
				txt47id1.setBounds(114, 43, 41, 20);
				panel_20.add(txt47id1);
				
				JLabel label_50 = new JLabel("s");
				label_50.setBounds(165, 46, 18, 14);
				panel_20.add(label_50);
				
				JPanel panelResult48 = new JPanel();
				tabbedPaneResultadosProts.addTab("ANSI 48", null, panelResult48, null);
				panelResult48.setLayout(null);
				
				JPanel panel_21 = new JPanel();
				panel_21.setLayout(null);
				panel_21.setBorder(new TitledBorder(null, "ANSI 48", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
				panel_21.setBounds(103, 47, 183, 74);
				panelResult48.add(panel_21);
				
				JLabel lblIset = new JLabel("I (pick-up):");
				lblIset.setHorizontalAlignment(SwingConstants.RIGHT);
				lblIset.setBounds(0, 21, 104, 14);
				panel_21.add(lblIset);
				
				txt48id0 = new JTextField();
				txt48id0.setEditable(false);
				txt48id0.setColumns(10);
				txt48id0.setBounds(114, 18, 41, 20);
				panel_21.add(txt48id0);
				
				JLabel lblA_6 = new JLabel("A");
				lblA_6.setBounds(165, 21, 18, 14);
				panel_21.add(lblA_6);
				
				JLabel label_53 = new JLabel("Temporiza\u00E7\u00E3o:");
				label_53.setHorizontalAlignment(SwingConstants.RIGHT);
				label_53.setBounds(0, 46, 104, 14);
				panel_21.add(label_53);
				
				txt48id1 = new JTextField();
				txt48id1.setEditable(false);
				txt48id1.setColumns(10);
				txt48id1.setBounds(114, 43, 41, 20);
				panel_21.add(txt48id1);
				
				JLabel label_54 = new JLabel("s");
				label_54.setBounds(165, 46, 18, 14);
				panel_21.add(label_54);
				
				JPanel panelResult49 = new JPanel();
				tabbedPaneResultadosProts.addTab("ANSI 49", null, panelResult49, null);
				panelResult49.setLayout(null);
				
				JPanel panel_22 = new JPanel();
				panel_22.setLayout(null);
				panel_22.setBorder(new TitledBorder(null, "ANSI 49", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
				panel_22.setBounds(103, 47, 183, 52);
				panelResult49.add(panel_22);
				
				JLabel lblIpickup = new JLabel("I (pick-up):");
				lblIpickup.setHorizontalAlignment(SwingConstants.RIGHT);
				lblIpickup.setBounds(0, 21, 104, 14);
				panel_22.add(lblIpickup);
				
				txt49id0 = new JTextField();
				txt49id0.setEditable(false);
				txt49id0.setColumns(10);
				txt49id0.setBounds(114, 18, 41, 20);
				panel_22.add(txt49id0);
				
				JLabel label_56 = new JLabel("V");
				label_56.setBounds(165, 21, 18, 14);
				panel_22.add(label_56);
				
				JButton btnGerarGrtico = new JButton("Gerar Gráfico");
				btnGerarGrtico.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						InterfaceGraficos telaGrafico49=new InterfaceGraficos();
						telaGrafico49.show();
						telaGrafico49.setLocationRelativeTo(null);
					}
				});
				btnGerarGrtico.setBounds(162, 99, 124, 23);
				panelResult49.add(btnGerarGrtico);
				
				JPanel panelResult50 = new JPanel();
				tabbedPaneResultadosProts.addTab("ANSI 50", null, panelResult50, null);
				panelResult50.setLayout(null);
				
				JPanel panel_16 = new JPanel();
				panel_16.setLayout(null);
				panel_16.setBorder(new TitledBorder(null, "ANSI 50", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
				panel_16.setBounds(103, 47, 183, 110);
				panelResult50.add(panel_16);
				
				JLabel lblIacionamento = new JLabel("I (Pick-up):");
				lblIacionamento.setHorizontalAlignment(SwingConstants.RIGHT);
				lblIacionamento.setBounds(0, 21, 104, 14);
				panel_16.add(lblIacionamento);
				
				txt50id0 = new JTextField();
				txt50id0.setEditable(false);
				txt50id0.setColumns(10);
				txt50id0.setBounds(114, 18, 41, 20);
				panel_16.add(txt50id0);
				
				JLabel lblA = new JLabel("A");
				lblA.setBounds(165, 21, 18, 14);
				panel_16.add(lblA);
				
				JPanel panelResult50GS = new JPanel();
				tabbedPaneResultadosProts.addTab("ANSI 50GS", null, panelResult50GS, null);
				panelResult50GS.setLayout(null);
				
				JPanel panel_34 = new JPanel();
				panel_34.setLayout(null);
				panel_34.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "ANSI 50GS", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
				panel_34.setBounds(103, 47, 183, 110);
				panelResult50GS.add(panel_34);
				
				JLabel label_30 = new JLabel("I (Pick-up):");
				label_30.setHorizontalAlignment(SwingConstants.RIGHT);
				label_30.setBounds(0, 21, 104, 14);
				panel_34.add(label_30);
				
				txt50GSid0 = new JTextField();
				txt50GSid0.setEditable(false);
				txt50GSid0.setColumns(10);
				txt50GSid0.setBounds(114, 18, 41, 20);
				panel_34.add(txt50GSid0);
				
				JLabel label_33 = new JLabel("A");
				label_33.setBounds(165, 21, 18, 14);
				panel_34.add(label_33);
				
				JPanel panelResult51 = new JPanel();
				tabbedPaneResultadosProts.addTab("ANSI 51", null, panelResult51, null);
				panelResult51.setLayout(null);
				
				JPanel panel_23 = new JPanel();
				panel_23.setLayout(null);
				panel_23.setBorder(new TitledBorder(null, "ANSI 51", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
				panel_23.setBounds(103, 47, 183, 74);
				panelResult51.add(panel_23);
				
				JLabel lblIac = new JLabel("I (pick-up):");
				lblIac.setHorizontalAlignment(SwingConstants.RIGHT);
				lblIac.setBounds(0, 21, 104, 14);
				panel_23.add(lblIac);
				
				txt51id0 = new JTextField();
				txt51id0.setEditable(false);
				txt51id0.setColumns(10);
				txt51id0.setBounds(114, 18, 41, 20);
				panel_23.add(txt51id0);
				
				JLabel lblA_2 = new JLabel("A");
				lblA_2.setBounds(165, 21, 18, 14);
				panel_23.add(lblA_2);
				
				JLabel label_61 = new JLabel("Temporiza\u00E7\u00E3o:");
				label_61.setEnabled(false);
				label_61.setHorizontalAlignment(SwingConstants.RIGHT);
				label_61.setBounds(0, 46, 104, 14);
				panel_23.add(label_61);
				
				txt51id1 = new JTextField();
				txt51id1.setEnabled(false);
				txt51id1.setEditable(false);
				txt51id1.setColumns(10);
				txt51id1.setBounds(114, 43, 41, 20);
				panel_23.add(txt51id1);
				
				JLabel label_62 = new JLabel("s");
				label_62.setEnabled(false);
				label_62.setBounds(165, 46, 18, 14);
				panel_23.add(label_62);
				
				JPanel panelResult51G = new JPanel();
				tabbedPaneResultadosProts.addTab("ANSI 51G", null, panelResult51G, null);
				panelResult51G.setLayout(null);
				
				JPanel panel_24 = new JPanel();
				panel_24.setLayout(null);
				panel_24.setBorder(new TitledBorder(null, "ANSI 51G", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
				panel_24.setBounds(103, 47, 183, 74);
				panelResult51G.add(panel_24);
				
				JLabel lblIset_1 = new JLabel("I (pick-up):");
				lblIset_1.setHorizontalAlignment(SwingConstants.RIGHT);
				lblIset_1.setBounds(0, 21, 104, 14);
				panel_24.add(lblIset_1);
				
				txt51Gid0 = new JTextField();
				txt51Gid0.setEditable(false);
				txt51Gid0.setColumns(10);
				txt51Gid0.setBounds(114, 18, 41, 20);
				panel_24.add(txt51Gid0);
				
				JLabel lblA_3 = new JLabel("A");
				lblA_3.setBounds(165, 21, 18, 14);
				panel_24.add(lblA_3);
				
				JLabel label_65 = new JLabel("Temporiza\u00E7\u00E3o:");
				label_65.setHorizontalAlignment(SwingConstants.RIGHT);
				label_65.setBounds(0, 46, 104, 14);
				panel_24.add(label_65);
				
				txt51Gid1 = new JTextField();
				txt51Gid1.setEditable(false);
				txt51Gid1.setColumns(10);
				txt51Gid1.setBounds(114, 43, 41, 20);
				panel_24.add(txt51Gid1);
				
				JLabel label_66 = new JLabel("s");
				label_66.setBounds(165, 46, 18, 14);
				panel_24.add(label_66);
				
				JPanel panelResult51LB = new JPanel();
				tabbedPaneResultadosProts.addTab("ANSI 51LB", null, panelResult51LB, null);
				panelResult51LB.setLayout(null);
				
				JPanel panel_25 = new JPanel();
				panel_25.setLayout(null);
				panel_25.setBorder(new TitledBorder(null, "ANSI 51LB", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
				panel_25.setBounds(103, 47, 183, 74);
				panelResult51LB.add(panel_25);
				
				JLabel lblIset_2 = new JLabel("I (pick-up):");
				lblIset_2.setHorizontalAlignment(SwingConstants.RIGHT);
				lblIset_2.setBounds(0, 21, 104, 14);
				panel_25.add(lblIset_2);
				
				txt51LBid0 = new JTextField();
				txt51LBid0.setEditable(false);
				txt51LBid0.setColumns(10);
				txt51LBid0.setBounds(114, 18, 41, 20);
				panel_25.add(txt51LBid0);
				
				JLabel lblA_4 = new JLabel("A");
				lblA_4.setBounds(165, 21, 18, 14);
				panel_25.add(lblA_4);
				
				JLabel label_69 = new JLabel("Temporiza\u00E7\u00E3o:");
				label_69.setHorizontalAlignment(SwingConstants.RIGHT);
				label_69.setBounds(0, 46, 104, 14);
				panel_25.add(label_69);
				
				txt51LBid1 = new JTextField();
				txt51LBid1.setEditable(false);
				txt51LBid1.setColumns(10);
				txt51LBid1.setBounds(114, 43, 41, 20);
				panel_25.add(txt51LBid1);
				
				JLabel label_70 = new JLabel("s");
				label_70.setBounds(165, 46, 18, 14);
				panel_25.add(label_70);
				
				JPanel panelResult51N = new JPanel();
				tabbedPaneResultadosProts.addTab("ANSI 51N", null, panelResult51N, null);
				panelResult51N.setLayout(null);
				
				JPanel panel_26 = new JPanel();
				panel_26.setLayout(null);
				panel_26.setBorder(new TitledBorder(null, "ANSI 51N", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
				panel_26.setBounds(103, 47, 183, 74);
				panelResult51N.add(panel_26);
				
				JLabel lblIset_3 = new JLabel("I (pick-up):");
				lblIset_3.setHorizontalAlignment(SwingConstants.RIGHT);
				lblIset_3.setBounds(0, 21, 104, 14);
				panel_26.add(lblIset_3);
				
				txt51Nid0 = new JTextField();
				txt51Nid0.setEditable(false);
				txt51Nid0.setColumns(10);
				txt51Nid0.setBounds(114, 18, 41, 20);
				panel_26.add(txt51Nid0);
				
				JLabel lblA_5 = new JLabel("A");
				lblA_5.setBounds(165, 21, 18, 14);
				panel_26.add(lblA_5);
				
				JLabel label_73 = new JLabel("Temporiza\u00E7\u00E3o:");
				label_73.setHorizontalAlignment(SwingConstants.RIGHT);
				label_73.setBounds(0, 46, 104, 14);
				panel_26.add(label_73);
				
				txt51Nid1 = new JTextField();
				txt51Nid1.setEditable(false);
				txt51Nid1.setColumns(10);
				txt51Nid1.setBounds(114, 43, 41, 20);
				panel_26.add(txt51Nid1);
				
				JLabel label_74 = new JLabel("s");
				label_74.setBounds(165, 46, 18, 14);
				panel_26.add(label_74);
				
				JPanel panelResult59 = new JPanel();
				tabbedPaneResultadosProts.addTab("ANSI 59", null, panelResult59, null);
				panelResult59.setLayout(null);
				
				JPanel panel_27 = new JPanel();
				panel_27.setLayout(null);
				panel_27.setBorder(new TitledBorder(null, "ANSI 59", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
				panel_27.setBounds(103, 47, 183, 74);
				panelResult59.add(panel_27);
				
				JLabel label_75 = new JLabel("V (pick-up):");
				label_75.setHorizontalAlignment(SwingConstants.RIGHT);
				label_75.setBounds(0, 21, 104, 14);
				panel_27.add(label_75);
				
				txt59id0 = new JTextField();
				txt59id0.setEditable(false);
				txt59id0.setColumns(10);
				txt59id0.setBounds(114, 18, 41, 20);
				panel_27.add(txt59id0);
				
				JLabel label_76 = new JLabel("V");
				label_76.setBounds(165, 21, 18, 14);
				panel_27.add(label_76);
				
				JLabel label_77 = new JLabel("Temporiza\u00E7\u00E3o:");
				label_77.setHorizontalAlignment(SwingConstants.RIGHT);
				label_77.setBounds(0, 46, 104, 14);
				panel_27.add(label_77);
				
				txt59id1 = new JTextField();
				txt59id1.setEditable(false);
				txt59id1.setColumns(10);
				txt59id1.setBounds(114, 43, 41, 20);
				panel_27.add(txt59id1);
				
				JLabel label_78 = new JLabel("s");
				label_78.setBounds(165, 46, 18, 14);
				panel_27.add(label_78);
				
				JPanel panelResult59N = new JPanel();
				tabbedPaneResultadosProts.addTab("ANSI 59N", null, panelResult59N, null);
				panelResult59N.setLayout(null);
				
				JPanel panelResult66 = new JPanel();
				tabbedPaneResultadosProts.addTab("ANSI 66", null, panelResult66, null);
				panelResult66.setLayout(null);
				
				JPanel panel_29 = new JPanel();
				panel_29.setLayout(null);
				panel_29.setBorder(new TitledBorder(null, "ANSI 66", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
				panel_29.setBounds(103, 47, 183, 52);
				panelResult66.add(panel_29);
				
				JLabel lblN = new JLabel("N\u00BA de Partidas:");
				lblN.setHorizontalAlignment(SwingConstants.RIGHT);
				lblN.setBounds(0, 21, 104, 14);
				panel_29.add(lblN);
				
				txt66id0 = new JTextField();
				txt66id0.setEditable(false);
				txt66id0.setColumns(10);
				txt66id0.setBounds(114, 18, 41, 20);
				panel_29.add(txt66id0);
				panelResult59N.setLayout(null);
				
				JPanel panel_28 = new JPanel();
				panel_28.setLayout(null);
				panel_28.setBorder(new TitledBorder(null, "ANSI 59N", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
				panel_28.setBounds(103, 47, 183, 74);
				panelResult59N.add(panel_28);
				
				JLabel label_79 = new JLabel("V (pick-up):");
				label_79.setHorizontalAlignment(SwingConstants.RIGHT);
				label_79.setBounds(0, 21, 104, 14);
				panel_28.add(label_79);
				
				txt59Nid0 = new JTextField();
				txt59Nid0.setEditable(false);
				txt59Nid0.setColumns(10);
				txt59Nid0.setBounds(114, 18, 41, 20);
				panel_28.add(txt59Nid0);
				
				JLabel label_80 = new JLabel("V");
				label_80.setBounds(165, 21, 18, 14);
				panel_28.add(label_80);
				
				JLabel label_81 = new JLabel("Temporiza\u00E7\u00E3o:");
				label_81.setHorizontalAlignment(SwingConstants.RIGHT);
				label_81.setBounds(0, 46, 104, 14);
				panel_28.add(label_81);
				
				txt59Nid1 = new JTextField();
				txt59Nid1.setEditable(false);
				txt59Nid1.setColumns(10);
				txt59Nid1.setBounds(114, 43, 41, 20);
				panel_28.add(txt59Nid1);
				
				JLabel label_82 = new JLabel("s");
				label_82.setBounds(165, 46, 18, 14);
				panel_28.add(label_82);
				
				JPanel panelResult78PS = new JPanel();
				tabbedPaneResultadosProts.addTab("ANSI 78PS", null, panelResult78PS, null);
				panelResult78PS.setLayout(null);
				
				JPanel panel_30 = new JPanel();
				panel_30.setLayout(null);
				panel_30.setBorder(new TitledBorder(null, "ANSI 78PS", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
				panel_30.setBounds(103, 47, 183, 74);
				panelResult78PS.add(panel_30);
				
				JLabel label_89 = new JLabel("Temporiza\u00E7\u00E3o:");
				label_89.setHorizontalAlignment(SwingConstants.RIGHT);
				label_89.setBounds(0, 46, 104, 14);
				panel_30.add(label_89);
				
				txt78PSid0 = new JTextField();
				txt78PSid0.setEditable(false);
				txt78PSid0.setColumns(10);
				txt78PSid0.setBounds(114, 43, 41, 20);
				panel_30.add(txt78PSid0);
				
				JLabel label_90 = new JLabel("s");
				label_90.setBounds(165, 46, 18, 14);
				panel_30.add(label_90);
				
				JPanel panelResult81 = new JPanel();
				panelResult81.setLayout(null);
				tabbedPaneResultadosProts.addTab("ANSI 81", null, panelResult81, null);
				
				JPanel panel_36 = new JPanel();
				panel_36.setLayout(null);
				panel_36.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "ANSI 81", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
				panel_36.setBounds(103, 47, 189, 71);
				panelResult81.add(panel_36);
				
				JLabel lblFreq_1 = new JLabel("f(max):");
				lblFreq_1.setHorizontalAlignment(SwingConstants.RIGHT);
				lblFreq_1.setBounds(0, 21, 104, 14);
				panel_36.add(lblFreq_1);
				
				txt81id0 = new JTextField();
				txt81id0.setEditable(false);
				txt81id0.setColumns(10);
				txt81id0.setBounds(114, 18, 41, 20);
				panel_36.add(txt81id0);
				
				JLabel lblHz = new JLabel("Hz");
				lblHz.setBounds(165, 21, 18, 14);
				panel_36.add(lblHz);
				
				JLabel lblFmin = new JLabel("f(min):");
				lblFmin.setHorizontalAlignment(SwingConstants.RIGHT);
				lblFmin.setBounds(0, 43, 104, 14);
				panel_36.add(lblFmin);
				
				txt81id1 = new JTextField();
				txt81id1.setEditable(false);
				txt81id1.setColumns(10);
				txt81id1.setBounds(114, 40, 41, 20);
				panel_36.add(txt81id1);
				
				JLabel label_39 = new JLabel("Hz");
				label_39.setBounds(165, 43, 18, 14);
				panel_36.add(label_39);
				
				JPanel panelResult87M = new JPanel();
				tabbedPaneResultadosProts.addTab("ANSI 87M", null, panelResult87M, null);
				panelResult87M.setLayout(null);
				
				JPanel panel_31 = new JPanel();
				panel_31.setLayout(null);
				panel_31.setBorder(new TitledBorder(null, "ANSI 87M", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
				panel_31.setBounds(103, 47, 183, 74);
				panelResult87M.add(panel_31);
				
				JPanel panelResultOutros = new JPanel();
				tabbedPaneResultadosProts.addTab("Outros", null, panelResultOutros, null);
				panelResultOutros.setLayout(null);
				
				JPanel panel_32 = new JPanel();
				panel_32.setLayout(null);
				panel_32.setBorder(new TitledBorder(null, "Outros", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
				panel_32.setBounds(90, 47, 210, 74);
				panelResultOutros.add(panel_32);
				
				JLabel lblCnstTermQuente = new JLabel("Cnst. Term. Quente:");
				lblCnstTermQuente.setHorizontalAlignment(SwingConstants.RIGHT);
				lblCnstTermQuente.setBounds(10, 21, 110, 14);
				panel_32.add(lblCnstTermQuente);
				
				txtOutrosid0 = new JTextField();
				txtOutrosid0.setEditable(false);
				txtOutrosid0.setColumns(10);
				txtOutrosid0.setBounds(130, 18, 41, 20);
				panel_32.add(txtOutrosid0);
				
				JLabel lblMin = new JLabel("min");
				lblMin.setBounds(181, 21, 18, 14);
				panel_32.add(lblMin);
				
				JLabel lblCnstTermFrio = new JLabel("Cnst. Term. Frio:");
				lblCnstTermFrio.setHorizontalAlignment(SwingConstants.RIGHT);
				lblCnstTermFrio.setBounds(0, 46, 120, 14);
				panel_32.add(lblCnstTermFrio);
				
				txtOutrosid1 = new JTextField();
				txtOutrosid1.setEditable(false);
				txtOutrosid1.setColumns(10);
				txtOutrosid1.setBounds(130, 43, 41, 20);
				panel_32.add(txtOutrosid1);
				
				JLabel lblMin_1 = new JLabel("min");
				lblMin_1.setBounds(181, 46, 18, 14);
				panel_32.add(lblMin_1);
				
				JButton button = new JButton("Calcular");
				button.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						
						
						try{
						double KpartidaVsNominal=Double.parseDouble(txtMotorRelacaoI.getText());
						
						double Icc=Double.parseDouble(txtCircuitoIcc.getText());
						double RTC=Double.parseDouble(txtCircuitoRTC.getText());
						
						double Pmotor = Double.parseDouble(txtMotorPotencia.getText());
						String tipoPmotor=comboBoxPotencia.getSelectedItem().toString();
						
						double FPmotor = Double.parseDouble(txtMotorFP.getText());;
						
						/*
						double VnomPrimaria = Double.parseDouble(txtMotorVpartida.getText());
						String tipoVnomPrimaria=comboBoxVprimaria.getSelectedItem().toString();
						*/
						
						double VnomMotor = Double.parseDouble(txtMotorVnom.getText());
						String tipoVnomMotor=comboBoxVnom.getSelectedItem().toString();
						
						double TempPartida = Double.parseDouble(txtMotorTpartida.getText());
						String tipoTempPartida=comboBoxTpartida.getSelectedItem().toString();
						
						
						double TempRotBloqFrio = Double.parseDouble(txtMotorTrbf.getText());
						String tipoTempRotBloqFrio=comboBoxTrbf.getSelectedItem().toString();
						
						double TempRotBloqQuente = Double.parseDouble(txtMotorTrbq.getText());
						String tipoTempRotBloqQuente=comboBoxTrbq.getSelectedItem().toString();
						
						
						double nmotor = Double.parseDouble(txtMotorRendimento.getText());
						String tiponmotor=comboBoxRendimento.getSelectedItem().toString();
						
						//double ConstTempTerm = Double.parseDouble(txtMotorConstTempTerm.getText());
						//String tipoConstTempTerm=comboBoxConstTempTerm.getSelectedItem().toString();

						//double Ivazio = Double.parseDouble(txtMotorIvazio.getText());
						
						//double Iopr = Double.parseDouble(txtMotorIoperacao.getText());
						
						/*
						double Zn=Double.parseDouble(txtMotorZn.getText());
						*/
						double ConsTermMotorQuente=0;
						double ConsTermMotorFrio=0;
						String tipoConsTermMotorQuente="";
						String tipoConsTermMotorFrio="";
						if(!checkBoxOutros.isSelected()){
							ConsTermMotorQuente=Double.parseDouble(txtConstTempQuente.getText());
							ConsTermMotorFrio=Double.parseDouble(txtConstTempFrio.getText());
							tipoConsTermMotorQuente=comboBoxConstTempQuente.getSelectedItem().toString();
							tipoConsTermMotorFrio=comboBoxConstTempFrio.getSelectedItem().toString();
							
						}
						
							
						

						tabbedPaneResultadosProts.removeAll(); //remove todas as abas de resultados
						tabbedPane.addTab("Resultados", null, tabbedPaneResultadosProts, null);
						
						
						//Pmotor
						switch (tipoPmotor) {
				        case "HP":
				        	Pmotor=Pmotor*746;
				            break;
				        case "CV":
				        	Pmotor=Pmotor*746*0.98632;
				            break;
				        case "kVA":
				        	Pmotor=Pmotor*1000*FPmotor;
				            break;
				        case "kW":
				        	Pmotor=Pmotor*1000;
				            break;
				     }
					/*	
						//VnomPrimaria
						switch (tipoVnomPrimaria) {
				        case "V":
				        	VnomPrimaria=VnomPrimaria;
				            break;
				        case "kV":
				        	VnomPrimaria=VnomPrimaria*1000;
				            break;
				        default:
				             System.out.println("deu zica na conversao de VnomPrim");
				     }
					*/	
						//VnomMotor
						switch (tipoVnomMotor) {
				        case "kV":
				        	VnomMotor=VnomMotor*1000;
				            break;
				     }
						
						//TempPartida
						switch (tipoTempPartida) {
				        case "min":
				        	TempPartida=TempPartida*60;
				            break;
				        case "hor":
				        	VnomMotor=VnomMotor*3600;
				            break;

				     }
						
						//tipoTempRotBloq
						switch (tipoTempRotBloqFrio) {
				        case "min":
				        	TempRotBloqFrio=TempRotBloqFrio*60;
				            break;
				        case "hor":
				        	TempRotBloqFrio=TempRotBloqFrio*3600;
				            break;
				     }
						
						//tipoTempRotBloq
						switch (tipoTempRotBloqQuente) {
				        case "min":
				        	TempRotBloqQuente=TempRotBloqQuente*60;
				            break;
				        case "hor":
				        	TempRotBloqQuente=TempRotBloqQuente*3600;
				            break;
				        default:
				             System.out.println("deu zica na conversao de TempRotBloq");
				     }
						if(!checkBoxOutros.isSelected()){
							switch (tipoConsTermMotorFrio) {
					        case "min":
					        	ConsTermMotorFrio=ConsTermMotorFrio*60;
					            break;
					        case "hor":
					        	ConsTermMotorFrio=ConsTermMotorFrio*3600;
					            break;
					        default:
					             System.out.println("deu zica na conversao de tipoConsTermMotorFrio");
						}
							
							switch (tipoConsTermMotorQuente) {
					        case "min":
					        	ConsTermMotorQuente=ConsTermMotorQuente*60;
					            break;
					        case "hor":
					        	ConsTermMotorQuente=ConsTermMotorQuente*3600;
					            break;
					        default:
					             System.out.println("deu zica na conversao de tipoConsTermMotorFrio");
						}
							
						
				     }
						System.out.println(TempRotBloqFrio);
						System.out.println(TempRotBloqQuente);
						
						//tiponmotor
						if(tiponmotor.equals("%")) {
				        	nmotor=nmotor/100;
						}
						
						/*	
						//tipoConstTempTerm
						switch (tipoConstTempTerm) {
				        case "sec":
				        	ConstTempTerm=ConstTempTerm;
				            break;
				        case "min":
				        	ConstTempTerm=ConstTempTerm*60;
				            break;
				        case "hor":
				        	ConstTempTerm=ConstTempTerm*3600;
				            break;
				        default:
				             System.out.println("deu zica na conversao de ConstTempTerm");
				     }
					*/
						
						double Inom=Pmotor/(Math.sqrt(3)*VnomMotor*FPmotor*nmotor);
						double Ipartida = KpartidaVsNominal*Inom;
						txtMotorInom.setText(String.valueOf(ScienceFormat.format(Inom)));
						txtMotorIpartida.setText(String.valueOf(ScienceFormat.format(Ipartida)));
						

						double input27[] = new double[2];
						input27[0] = ajustes.get(1)[0]/100;
						input27[1] = ajustes.get(1)[1];
						
						double input37[] = new double[2];
						input37[0] = ajustes.get(2)[0]/100;
						input37[1] = ajustes.get(2)[1];
						
						double input46[] = new double[4];
						input46[0] = ajustes.get(4)[0]/100;
						input46[1] = ajustes.get(4)[1];
						input46[2] = ajustes.get(4)[2]/100;
						input46[3] = ajustes.get(4)[3];
						
						double input47[] = new double[2];
						input47[0] = ajustes.get(5)[0]/100;
						input47[1] = ajustes.get(5)[1];
						
						double input49[] = new double[2];
						input49[0] = ajustes.get(7)[0]/100;
						input49[1] = ajustes.get(7)[1];

						double input50[] = new double[1];
						input50[0] = ajustes.get(8)[0]/100;

						double input51[] = new double[2];
						input51[0] = ajustes.get(9)[0]/100;
						input51[1] = ajustes.get(9)[1];

						double input51LB[] = new double[2];
						input51LB[0] = ajustes.get(11)[0]/100;
						input51LB[1] = ajustes.get(11)[1];

						double input50GS[] = new double[1];
						input50GS[0] = ajustes.get(18)[0]/100;

						double input59[] = new double[2];
						input59[0] = ajustes.get(13)[0]/100;
						input59[1] = ajustes.get(13)[1];

						double input66[] = new double[1];
						input66[0] = ajustes.get(15)[0];

						double input81[] = new double[1];
						input81[0] = ajustes.get(19)[0];
						
						//if (checkBoxANSI26.isSelected()){
						//	double[] result26=protecoes.
						//	tabbedPaneResultadosProts.addTab("ANSI 26", null, panelResult26, null);
						//	txt27id0.setText(String.valueOf(ScienceFormat.format(result27[0])));
						//	txt27id1.setText(String.valueOf(ScienceFormat.format(result27[1])));
						//}
						
						if (checkBoxANSI27.isSelected()){
							double[] result27=protecoes.protecao27(VnomMotor, input27[0], input27[1]);
							tabbedPaneResultadosProts.addTab("ANSI 27", null, panelResult27, null);
							txt27id0.setText(String.valueOf(ScienceFormat.format(result27[0])));
							txt27id1.setText(String.valueOf(ScienceFormat.format(result27[1])));
						}
						
						
						if (checkBoxANSI37.isSelected()){
							double[] result37=protecoes.protecao37(Inom, input37[0], input37[1]);
							tabbedPaneResultadosProts.addTab("ANSI 37", null, panelResult37, null);
							txt37id0.setText(String.valueOf(ScienceFormat.format(result37[0])));
							txt37id1.setText(String.valueOf(ScienceFormat.format(result37[1])));
						}
						
						//if (checkBoxANSI37.isSelected()){
						//	double[] result37=protecoes.protecao37(Inom, Ivazio, Iopr);
						//	tabbedPaneResultadosProts.addTab("ANSI 37", null, panelResult37, null);
						//	txt37id0.setText(String.valueOf(ScienceFormat.format(result37[0])));
						//	txt37id1.setText(String.valueOf(ScienceFormat.format(result37[1])));
						//}
						
						//if (checkBoxANSI40.isSelected()){
						//	double[] result40=protecoes.protecao40(Zn, input40[0], input40[1], input40[2], input40[3]);
						//	tabbedPaneResultadosProts.addTab("ANSI ", null, panelResult, null);
						//	txt40id0.setText(String.valueOf(ScienceFormat.format(result40[0])));
						//	txt40id1.setText(String.valueOf(ScienceFormat.format(result40[1])));
						//	txt40id2.setText(String.valueOf(ScienceFormat.format(result40[2])));
						//	txt40id3.setText(String.valueOf(ScienceFormat.format(result40[3])));
						//}
						
						if (checkBoxANSI46.isSelected()){
							double[] result46=protecoes.protecao46(input46[0], Inom, input46[1]);
							tabbedPaneResultadosProts.addTab("ANSI 46", null, panelResult46, null);
							txt46id0.setText(String.valueOf(ScienceFormat.format(result46[0])));
							txt46id1.setText(String.valueOf(ScienceFormat.format(result46[1])));
						}
						
						if (checkBoxANSI47.isSelected()){							
							double[] result47=protecoes.protecao47(VnomMotor, input47[0], input47[1]);
							tabbedPaneResultadosProts.addTab("ANSI 47", null, panelResult47, null);
							txt47id0.setText(String.valueOf(ScienceFormat.format(result47[0])));
							txt47id1.setText(String.valueOf(ScienceFormat.format(result47[1])));
						}
						
						if (checkBoxANSI48.isSelected()){
							double[] result48=protecoes.protecao48(Inom, 0.025, 2, TempPartida); //Atencao, coloquei arbitrario
							tabbedPaneResultadosProts.addTab("ANSI 48", null, panelResult48, null);
							txt48id0.setText(String.valueOf(ScienceFormat.format(result48[0])));
							txt48id1.setText(String.valueOf(ScienceFormat.format(result48[1])));
						}
						
						if (checkBoxANSI49.isSelected()){
							double[] result49=protecoes.protecao49(Inom, input49[0], input49[1]);
							tabbedPaneResultadosProts.addTab("ANSI 49", null, panelResult49, null);
							txt49id0.setText(String.valueOf(ScienceFormat.format(result49[0])));
						}
						
						if (checkBoxANSI50.isSelected()){
							double[] result50=protecoes.protecao50(Ipartida, input50[0]);
							tabbedPaneResultadosProts.addTab("ANSI 50", null, panelResult50, null);
							txt50id0.setText(String.valueOf(ScienceFormat.format(result50[0])));
							//txt50id1.setText(String.valueOf(ScienceFormat.format(result50[1])));
						}
						
						
						if (checkBoxANSI51.isSelected()){
							double[] result51=protecoes.protecao51(Inom, input51[0], input51[1]);		
							tabbedPaneResultadosProts.addTab("ANSI 51", null, panelResult51, null);
							txt51id0.setText(String.valueOf(ScienceFormat.format(result51[0])));
							txt51id1.setText(String.valueOf(ScienceFormat.format(result51[1])));
						}
						
						//if (checkBoxANSI51G.isSelected()){
						//	double[] result51G=protecoes.protecao51G(input51G[0], Inom, RTC, input51G[1]);
						//	tabbedPaneResultadosProts.addTab("ANSI ", null, panelResult, null);
						//	txt27id0.setText(String.valueOf(ScienceFormat.format(result27[0])));
						//	txt27id1.setText(String.valueOf(ScienceFormat.format(result27[1])));
						//}
						
						if (checkBoxANSI51LB.isSelected()){
							double[] result51LB=protecoes.protecao51LB(Inom, input51LB[0], input51LB[1]);
							tabbedPaneResultadosProts.addTab("ANSI 51LB", null, panelResult51LB, null);
							txt51LBid0.setText(String.valueOf(ScienceFormat.format(result51LB[0])));
							txt51LBid1.setText(String.valueOf(ScienceFormat.format(result51LB[1])));
						}
						
						/*if (checkBoxANSI51N.isSelected()){
							double[] result51N=protecoes.protecao51N(Inom, input51N[0], input51N[1]);	
							tabbedPaneResultadosProts.addTab("ANSI 51N", null, panelResult51N, null);
							txt51Nid0.setText(String.valueOf(ScienceFormat.format(result51N[0])));
							txt51Nid1.setText(String.valueOf(ScienceFormat.format(result51N[1])));
						}*/
						
						if (checkBoxANSI59.isSelected()){
							double[] result59=protecoes.protecao59(VnomMotor, input59[0], input59[1]);		
							tabbedPaneResultadosProts.addTab("ANSI 59", null, panelResult59, null);
							txt59id0.setText(String.valueOf(ScienceFormat.format(result59[0])));
							txt59id1.setText(String.valueOf(ScienceFormat.format(result59[1])));
						}
						
						//if (checkBoxANSI59N.isSelected()){
						//	double[] result59N=protecoes.protecao59N(VnomMotor, input59N[0], input59N[1]);
						//	tabbedPaneResultadosProts.addTab("ANSI ", null, panelResult, null);
						//	txt27id0.setText(String.valueOf(ScienceFormat.format(result27[0])));
						//	txt27id1.setText(String.valueOf(ScienceFormat.format(result27[1])));
						//}
						
						if (checkBoxANSI66.isSelected()){
							double[] result66=protecoes.protecao66(input66[0]);	
							tabbedPaneResultadosProts.addTab("ANSI 66", null, panelResult66, null);
							txt66id0.setText(String.valueOf(ScienceFormat.format(result66[0])));
							
						}
					
						if (checkBoxANSI81.isSelected()){
							double[] result81=protecoes.protecao81(input81[0]);	
							tabbedPaneResultadosProts.addTab("ANSI 81", null, panelResult81, null);
							txt81id0.setText(String.valueOf(ScienceFormat.format(result81[0])));
							txt81id1.setText(String.valueOf(ScienceFormat.format(result81[1])));
						}
						
						//if (checkBoxANSI78PS.isSelected()){
						//	double[] result27=protecoes.prot
						//	tabbedPaneResultadosProts.addTab("ANSI ", null, panelResult, null);
						//	txt27id0.setText(String.valueOf(ScienceFormat.format(result27[0])));
						//	txt27id1.setText(String.valueOf(ScienceFormat.format(result27[1])));
						//}
						
						//if (checkBoxANSI87M.isSelected()){
						//	double[] result27=protecoes.protecao
						// 	tabbedPaneResultadosProts.addTab("ANSI ", null, panelResult, null);
						//	txt27id0.setText(String.valueOf(ScienceFormat.format(result27[0])));
						//	txt27id1.setText(String.valueOf(ScienceFormat.format(result27[1])));
						//}
						
						if (checkBoxOutros.isSelected()){
							ConsTermMotorQuente=protecoes.CalculoConsTermMotorQuente(TempRotBloqQuente, Inom, Ipartida)*60;
							ConsTermMotorFrio=protecoes.CalculoConsTermMotorFrio(TempRotBloqFrio, Inom, Ipartida)*60;
							tabbedPaneResultadosProts.addTab("Outros", null, panelResultOutros, null);
							txtOutrosid0.setText(String.valueOf(ConsTermMotorQuente));
							txtOutrosid1.setText(String.valueOf(ConsTermMotorFrio));
						}
						else{
							tabbedPaneResultadosProts.addTab("Outros", null, panelResultOutros, null);
							txtOutrosid0.setText(String.valueOf(ConsTermMotorQuente/60));
							txtOutrosid1.setText(String.valueOf(ConsTermMotorFrio/60));
						}
						
						
						
						SwingUtilities.updateComponentTreeUI(tabbedPane);
						}
						
						catch (NumberFormatException ex)
						{
						ex.printStackTrace();
						JOptionPane.showMessageDialog(frame,
							    "Você deve inserir os dados corretamente!\n",
							    "Atenção",
							    JOptionPane.WARNING_MESSAGE);
						}
						
						
					}
				});
				button.setBounds(10, 604, 354, 47);
				frame.getContentPane().add(button);
				
				JButton btnCarregaDados = new JButton("Carrega Dados");
				btnCarregaDados.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						txtMotorRelacaoI.setText("6");
						
						txtCircuitoIcc.setText("19000");
						txtCircuitoRTC.setText("60");
						
						txtMotorPotencia.setText("165");
						comboBoxPotencia.setSelectedIndex(2);
						
						txtMotorFP.setText("0.9");
						
						/*
						double VnomPrimaria = Double.parseDouble(txtMotorVpartida.getText());
						String tipoVnomPrimaria=comboBoxVprimaria.getSelectedItem().toString();
						*/
						
						txtMotorVnom.setText("480");
						comboBoxVnom.setSelectedIndex(1);
						
						txtMotorTpartida.setText("5");
						comboBoxTpartida.setSelectedIndex(0);
						
						
						txtMotorTrbf.setText("15");
						comboBoxTrbf.setSelectedItem("0");
						
						
						txtMotorRendimento.setText("0.8");
						comboBoxRendimento.setSelectedIndex(0);
					}
				});
				btnCarregaDados.setBounds(275, 549, 89, 23);
				//frame.getContentPane().add(btnCarregaDados);
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
