package interfaces;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.NumberTickUnit;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYLine3DRenderer;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import javax.swing.JComboBox;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Date;

public class InterfaceGraficos extends JFrame{

	private JPanel contentPane;
	private JCheckBox checkBoxCurvaFrio;
	private JCheckBox checkBoxCurvaQuente;
	private ChartPanel panel;
	private JFreeChart chart=null;
	private XYLine3DRenderer renderer=new XYLine3DRenderer();
	private XYSeriesCollection dataset = new XYSeriesCollection();
	private ValueAxis x = new NumberAxis();
	private ValueAxis y = new NumberAxis();
	private XYPlot plot;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfaceGraficos frame = new InterfaceGraficos();
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
	public InterfaceGraficos() {
		
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 779, 591);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		AbstractAction exportaDados = new AbstractAction(){
			public void actionPerformed(ActionEvent arg0) {
				/*
				try {
					
					//exportaPlanilha.exportData("Financeiro.xls","Financeiro",backInterfaceFinanceiro.financeiroArray);
					
				} catch (IOException e) {
					e.printStackTrace();
				}*/
			}
			};
			
		JButton btnNewButton = new JButton("Exportar Dados");
		btnNewButton.addActionListener(exportaDados);
		btnNewButton.setBounds(10, 114, 123, 46);
		contentPane.add(btnNewButton);
		JButton montaGraficoProd = new JButton("Plotar Gr\u00E1fico");
		
		JPanel lineChart = new JPanel();
		lineChart.setBounds(143, 7, 615, 538);
		contentPane.add(lineChart);
		
			lineChart.setVisible(true);
			
			JLayeredPane layersGraficos = new JLayeredPane();
			lineChart.add(layersGraficos);
			layersGraficos.setLayer(lineChart, 0);
		
		///////////////////////////////////
		AbstractAction desenhaGrafico = new AbstractAction(){
			public void actionPerformed(ActionEvent arg0) {
				chart=null;
				renderer=new XYLine3DRenderer();
				dataset = new XYSeriesCollection();
				x = new NumberAxis();
				y = new NumberAxis();
				int validar=1;	
				XYSeries serie0 = new XYSeries("Curva a Frio");
				XYSeries serie1 = new XYSeries("Curva a Quente");

				lineChart.removeAll();
				double gamaFrio=0;
				double gamaQuente=0;
				try {
					gamaFrio=60*Double.parseDouble(Main.txtOutrosid0.getText());
					gamaQuente=60*Double.parseDouble(Main.txtOutrosid1.getText());
				} catch (NumberFormatException e) {
				    e.printStackTrace();
				    // handle the error
				}
				
				
						

				try{
					for(double linha=1.15;linha<=20;linha=linha+0.10)
					{
						//linha = M (relacao entre correntes, segundo MAMEDE)
						serie0.add(linha,60*gamaFrio*Math.log(Math.pow(linha, 2)/(Math.pow(linha, 2)-1.1)));
						serie1.add(linha,60*gamaQuente*Math.log((Math.pow(linha, 2)-1)/(Math.pow(linha, 2)-1.1)));
					}
				}
				catch(Exception ex){
					validar=0;
				}
				
				if(validar==1){
					if(checkBoxCurvaFrio.isSelected()){
						dataset.addSeries(serie0);	
					}
					if(checkBoxCurvaQuente.isSelected()){
						dataset.addSeries(serie1);	
					}



					x.setLabel("Multiplo da corrent nominal In"); //Nome do eixo X
					y.setLabel("Tempo de atuação (s)"); //Nome do eixo Y
					((NumberAxis) x).setTickUnit(new NumberTickUnit(1));
					x.setAutoRange(true);
					y.setAutoRange(true);
					plot=new XYPlot(dataset,x,y,renderer);
					chart = new JFreeChart(plot);


				}
				else{
					JOptionPane.showInputDialog("Erro no grafico");
				}

				panel = new ChartPanel(chart);
				panel.setBounds(0,0,615,528);
				lineChart.add(panel);
				lineChart.repaint();

			}
		};	
		
		addWindowListener(new WindowAdapter() {
			public void actionPerformed(ActionEvent arg0) {
				chart=null;
				renderer=new XYLine3DRenderer();
				dataset = new XYSeriesCollection();
				x = new NumberAxis();
				y = new NumberAxis();
				int validar=1;	
				XYSeries serie0 = new XYSeries("Curva a Frio");
				XYSeries serie1 = new XYSeries("Curva a Quente");

				lineChart.removeAll();
				double gamaFrio=0;
				double gamaQuente=0;
				try {
					gamaFrio=60*Double.parseDouble(Main.txtOutrosid0.getText());
					gamaQuente=60*Double.parseDouble(Main.txtOutrosid1.getText());
				} catch (NumberFormatException e) {
				    e.printStackTrace();
				    // handle the error
				}
				
				
						

				try{
					for(double linha=1.15;linha<=20;linha=linha+0.10)
					{
						//linha = M (relacao entre correntes, segundo MAMEDE)
						serie0.add(linha,60*gamaFrio*Math.log(Math.pow(linha, 2)/(Math.pow(linha, 2)-1.1)));
						serie1.add(linha,60*gamaQuente*Math.log((Math.pow(linha, 2)-1)/(Math.pow(linha, 2)-1.1)));
					}
				}
				catch(Exception ex){
					validar=0;
				}
				
				if(validar==1){
					if(checkBoxCurvaFrio.isSelected()){
						dataset.addSeries(serie0);	
					}
					if(checkBoxCurvaQuente.isSelected()){
						dataset.addSeries(serie1);	
					}



					x.setLabel("Multiplo da corrent nominal In"); //Nome do eixo X
					y.setLabel("Tempo de atuação (s)"); //Nome do eixo Y
					((NumberAxis) x).setTickUnit(new NumberTickUnit(1));
					x.setAutoRange(true);
					y.setAutoRange(true);
					plot=new XYPlot(dataset,x,y,renderer);
					chart = new JFreeChart(plot);


				}
				else{
					JOptionPane.showInputDialog("Erro no grafico");
				}

				panel = new ChartPanel(chart);
				panel.setBounds(0,0,615,528);
				lineChart.add(panel);
				lineChart.repaint();

			}
		});

		///////////////////////////////////
		montaGraficoProd.addActionListener(desenhaGrafico);	
		montaGraficoProd.setBounds(10, 57, 123, 46);
		contentPane.add(montaGraficoProd);
		
		checkBoxCurvaFrio = new JCheckBox("Curva a Frio");
		checkBoxCurvaFrio.setSelected(true);
		checkBoxCurvaFrio.setBounds(10, 7, 123, 20);
		contentPane.add(checkBoxCurvaFrio);

		
		checkBoxCurvaQuente = new JCheckBox("Curva a Quente");
		checkBoxCurvaQuente.setBounds(10, 30, 123, 20);
		contentPane.add(checkBoxCurvaQuente);
		
		

	}
	
	
}
