package interfaces.action;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;

import protecao.protecoes;
import protecao.ajustes.AjustesProtecoes;
import interfaces.Main;

public class ActionButtons {
	
	public static void CalculaProtecoes(){
		try{
		double KpartidaVsNominal=Double.parseDouble(Main.txtMotorRelacaoI.getText());
		
		double Icc=Double.parseDouble(Main.txtCircuitoIcc.getText());
		double RTC=Double.parseDouble(Main.txtCircuitoRTC.getText());
		
		double Pmotor = Double.parseDouble(Main.txtMotorPotencia.getText());
		String tipoPmotor=Main.comboBoxPotencia.getSelectedItem().toString();
		
		double FPmotor = Double.parseDouble(Main.txtMotorFP.getText());;
		
		double VnomPrimaria = Double.parseDouble(Main.txtMotorVpartida.getText());
		String tipoVnomPrimaria=Main.comboBoxVprimaria.getSelectedItem().toString();
		
		double VnomMotor = Double.parseDouble(Main.txtMotorVnom.getText());
		String tipoVnomMotor=Main.comboBoxVnom.getSelectedItem().toString();
		
		double TempPartida = Double.parseDouble(Main.txtMotorTpartida.getText());
		String tipoTempPartida=Main.comboBoxTpartida.getSelectedItem().toString();
		
		double TempRotBloq = Double.parseDouble(Main.txtMotorTrb.getText());
		String tipoTempRotBloq=Main.comboBoxTrb.getSelectedItem().toString();;
		
		double nmotor = Double.parseDouble(Main.txtMotorRendimento.getText());
		String tiponmotor=Main.comboBoxRendimento.getSelectedItem().toString();;
		
		double ConstTempTerm = Double.parseDouble(Main.txtMotorConstTempTerm.getText());
		String tipoConstTempTerm=Main.comboBoxConstTempTerm.getSelectedItem().toString();;

		double Ivazio = Double.parseDouble(Main.txtMotorIvazio.getText());
		
		double Iopr = Double.parseDouble(Main.txtMotorIoperacao.getText());
		
		double Zn=Double.parseDouble(Main.txtMotorZn.getText());
		
		

		Main.tabbedPaneResultadosProts.removeAll(); //remove todas as abas de resultados
		Main.tabbedPane.addTab("Resultados", null, Main.tabbedPaneResultadosProts, null);
		
		
		//Pmotor
		switch (tipoPmotor) {
        case "HP":
        	Pmotor=Pmotor*746;
            break;
        case "kVA":
        	Pmotor=Pmotor*1000*FPmotor;
            break;
        case "kW":
        	Pmotor=Pmotor*1000;
            break;
        default:
             System.out.println("deu zica na conversao de Pmotor");
     }
		
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
		
		//VnomMotor
		switch (tipoVnomMotor) {
        case "V":
        	VnomMotor=VnomMotor;
            break;
        case "kV":
        	VnomMotor=VnomMotor*1000;
            break;
        default:
             System.out.println("deu zica na conversao de VnomMotor");
     }
		
		//TempPartida
		switch (tipoTempPartida) {
        case "sec":
        	TempPartida=TempPartida;
            break;
        case "min":
        	TempPartida=TempPartida*60;
            break;
        case "hor":
        	VnomMotor=VnomMotor*3600;
            break;
        default:
             System.out.println("deu zica na conversao de TempPartida");
     }
		
		//tipoTempRotBloq
		switch (tipoTempRotBloq) {
        case "sec":
        	TempRotBloq=TempRotBloq;
            break;
        case "min":
        	TempRotBloq=TempRotBloq*60;
            break;
        case "hor":
        	TempRotBloq=TempRotBloq*3600;
            break;
        default:
             System.out.println("deu zica na conversao de TempRotBloq");
     }
		
		//tiponmotor
		switch (tiponmotor) {
        case "Norm":
        	nmotor=nmotor;
            break;
        case "%":
        	nmotor=nmotor/100;
            break;
        default:
             System.out.println("deu zica na conversao de nmotor");
     }
		
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
		
		double Inom=Pmotor/(Math.sqrt(3)*VnomMotor*FPmotor*nmotor);
		double Ipartida = KpartidaVsNominal*Inom;
		Main.txtMotorInom.setText(String.valueOf(Inom));
		Main.txtMotorIpartida.setText(String.valueOf(Ipartida));
		
		double input27[] = new double[2];
		input27[0] = Double.parseDouble(Main.txtANSI27prot1.getText())/100;
		input27[1] = Double.parseDouble(Main.txtANSI27prot2.getText());
		
		double input37[] = new double[2];
		input37[0] = Double.parseDouble(Main.txtANSI37prot1.getText())/100;
		input37[1] = Double.parseDouble(Main.txtANSI37prot2.getText());
		
		double input46[] = new double[4];
		input46[0] = Double.parseDouble(Main.txtANSI46prot1.getText())/100;
		input46[1] = Double.parseDouble(Main.txtANSI46prot2.getText());
		input46[2] = Double.parseDouble(Main.txtANSI46prot3.getText())/100;
		input46[3] = Double.parseDouble(Main.txtANSI46prot4.getText());
		
		double input47[] = new double[2];
		input47[0] = Double.parseDouble(Main.txtANSI47prot1.getText())/100;
		input47[1] = Double.parseDouble(Main.txtANSI47prot2.getText());
		
		double input49[] = new double[2];
		input49[0] = Double.parseDouble(Main.txtANSI49prot1.getText())/100;
		input49[1] = Double.parseDouble(Main.txtANSI49prot2.getText());

		double input50[] = new double[1];
		input50[0] = Double.parseDouble(Main.txtANSI50prot1.getText())/100;

		double input51[] = new double[2];
		input51[0] = Double.parseDouble(Main.txtANSI51prot1.getText())/100;
		input51[1] = Double.parseDouble(Main.txtANSI51prot2.getText());

		double input51LB[] = new double[2];
		input51LB[0] = Double.parseDouble(Main.txtANSI51LBprot1.getText())/100;
		input51LB[1] = Double.parseDouble(Main.txtANSI51LBprot2.getText());

		double input51N[] = new double[2];
		input51N[0] = Double.parseDouble(Main.txtANSI51Nprot1.getText())/100;
		input51N[1] = Double.parseDouble(Main.txtANSI51Nprot2.getText());

		double input59[] = new double[2];
		input59[0] = Double.parseDouble(Main.txtANSI59prot1.getText())/100;
		input59[1] = Double.parseDouble(Main.txtANSI59prot2.getText());

		double input66[] = new double[1];
		input66[0] = Double.parseDouble(Main.txtANSI66prot1.getText());

		//if (checkBoxANSI26.isSelected()){
		//	double[] result26=protecoes.
		//	tabbedPaneResultadosProts.addTab("ANSI 26", null, panelResult26, null);
		//	Main.txt27id0.setText(String.valueOf(result27[0]));
		//	Main.txt27id1.setText(String.valueOf(result27[1]));
		//}
		
		if (Main.checkBoxANSI27.isSelected()){
			double[] result27=protecoes.protecao27(VnomMotor, input27[0], input27[1]);
			tabbedPaneResultadosProts.addTab("ANSI 27", null, Main.panelResult27, null);
			Main.txt27id0.setText(String.valueOf(result27[0]));
			Main.txt27id1.setText(String.valueOf(result27[1]));
		}
		
		if (checkBoxANSI37.isSelected()){
			double[] result37=protecoes.protecao37(Inom, Ivazio, Iopr);
			tabbedPaneResultadosProts.addTab("ANSI 37", null, panelResult37, null);
			Main.txt37id0.setText(String.valueOf(result37[0]));
			Main.txt37id1.setText(String.valueOf(result37[1]));
		}
		
		//if (checkBoxANSI40.isSelected()){
		//	double[] result40=protecoes.protecao40(Zn, input40[0], input40[1], input40[2], input40[3]);
		//	tabbedPaneResultadosProts.addTab("ANSI ", null, panelResult, null);
		//	Main.txt40id0.setText(String.valueOf(result40[0]));
		//	Main.txt40id1.setText(String.valueOf(result40[1]));
		//	Main.txt40id2.setText(String.valueOf(result40[2]));
		//	Main.txt40id3.setText(String.valueOf(result40[3]));
		//}
		
		if (checkBoxANSI46.isSelected()){
			double[] result46=protecoes.protecao46(input46[2], Inom, RTC, TempRotBloq);
			tabbedPaneResultadosProts.addTab("ANSI 46", null, panelResult46, null);
			Main.txt46id0.setText(String.valueOf(result46[0]));
			Main.txt46id1.setText(String.valueOf(result46[1]));
		}
		
		if (checkBoxANSI47.isSelected()){							
			double[] result47=protecoes.protecao47(VnomMotor, input47[0], input47[1]);
			tabbedPaneResultadosProts.addTab("ANSI 47", null, panelResult47, null);
			Main.txt47id0.setText(String.valueOf(result47[0]));
			Main.txt47id1.setText(String.valueOf(result47[1]));
		}
		
		if (checkBoxANSI48.isSelected()){
			double[] result48=protecoes.protecao48(Inom, 0.025, 2, TempPartida); //Atencao, coloquei arbitrario
			tabbedPaneResultadosProts.addTab("ANSI 48", null, panelResult48, null);
			Main.txt48id0.setText(String.valueOf(result48[0]));
			Main.txt48id1.setText(String.valueOf(result48[1]));
		}
		
		//if (checkBoxANSI49.isSelected()){
		//	double[] result27=protecoes.protecao49;
		//	tabbedPaneResultadosProts.addTab("ANSI ", null, panelResult, null);
		//}
		
		if (checkBoxANSI50.isSelected()){
			double[] result50=protecoes.protecao50(input51[0], Inom, Ipartida, RTC, Icc, input50[0]);
			tabbedPaneResultadosProts.addTab("ANSI 50", null, panelResult50, null);
			Main.txt50id0.setText(String.valueOf(result50[0]));
			//Main.txt50id1.setText(String.valueOf(result50[1]));
		}
		
		if (checkBoxANSI51.isSelected()){
			double[] result51=protecoes.protecao51(input51[0], Inom, Ipartida, RTC, Icc);		
			tabbedPaneResultadosProts.addTab("ANSI 51", null, panelResult51, null);
			Main.txt51id0.setText(String.valueOf(result51[0]));
			//Main.txt51id1.setText(String.valueOf(result51[1]));
		}
		
		//if (checkBoxANSI51G.isSelected()){
		//	double[] result51G=protecoes.protecao51G(input51G[0], Inom, RTC, input51G[1]);
		//	tabbedPaneResultadosProts.addTab("ANSI ", null, panelResult, null);
		//	Main.txt27id0.setText(String.valueOf(result27[0]));
		//	Main.txt27id1.setText(String.valueOf(result27[1]));
		//}
		
		if (checkBoxANSI51LB.isSelected()){
			double[] result51LB=protecoes.protecao51LB(Inom, input51LB[0], input51LB[1]);
			tabbedPaneResultadosProts.addTab("ANSI 51LB", null, panelResult51LB, null);
			Main.txt51LBid0.setText(String.valueOf(result51LB[0]));
			Main.txt51LBid1.setText(String.valueOf(result51LB[1]));
		}
		
		if (checkBoxANSI51N.isSelected()){
			double[] result51N=protecoes.protecao51N(Inom, input51N[0], input51N[1]);	
			tabbedPaneResultadosProts.addTab("ANSI 51N", null, panelResult51N, null);
			Main.txt51Nid0.setText(String.valueOf(result51N[0]));
			Main.txt51Nid1.setText(String.valueOf(result51N[1]));
		}
		if (checkBoxANSI59.isSelected()){
			double[] result59=protecoes.protecao59(VnomMotor, input59[0], input59[1]);		
			tabbedPaneResultadosProts.addTab("ANSI 59", null, panelResult59, null);
			Main.txt59id0.setText(String.valueOf(result59[0]));
			Main.txt59id1.setText(String.valueOf(result59[1]));
		}
		
		//if (checkBoxANSI59N.isSelected()){
		//	double[] result59N=protecoes.protecao59N(VnomMotor, input59N[0], input59N[1]);
		//	tabbedPaneResultadosProts.addTab("ANSI ", null, panelResult, null);
		//	Main.txt27id0.setText(String.valueOf(result27[0]));
		//	Main.txt27id1.setText(String.valueOf(result27[1]));
		//}
		
		//if (checkBoxANSI66.isSelected()){
		//	double[] result66=protecoes.protecao66(partidaPorHora);	
		//	tabbedPaneResultadosProts.addTab("ANSI ", null, panelResult, null);
		//	Main.txt27id0.setText(String.valueOf(result27[0]));
		//	Main.txt27id1.setText(String.valueOf(result27[1]));
		//}
	
		
		//if (checkBoxANSI78PS.isSelected()){
		//	double[] result27=protecoes.prot
		//	tabbedPaneResultadosProts.addTab("ANSI ", null, panelResult, null);
		//	Main.txt27id0.setText(String.valueOf(result27[0]));
		//	Main.txt27id1.setText(String.valueOf(result27[1]));
		//}
		
		//if (checkBoxANSI87M.isSelected()){
		//	double[] result27=protecoes.protecao
		// 	tabbedPaneResultadosProts.addTab("ANSI ", null, panelResult, null);
		//	Main.txt27id0.setText(String.valueOf(result27[0]));
		//	Main.txt27id1.setText(String.valueOf(result27[1]));
		//}
		
		if (checkBoxOutros.isSelected()){
			double ConsTermMotorQuente=protecoes.CalculoConsTermMotorQuente(TempRotBloq, Inom, Ipartida);
			double ConsTermMotorFrio=protecoes.CalculoConstTermResfriamento(ConsTermMotorQuente);
			tabbedPaneResultadosProts.addTab("Outros", null, panelResultOutros, null);
			Main.txtOutrosid0.setText(String.valueOf(ConsTermMotorQuente));
			Main.txtOutrosid1.setText(String.valueOf(ConsTermMotorFrio));
		}
		}
		
		catch (NumberFormatException ex)
		{
		ex.printStackTrace();
		JOptionPane.showMessageDialog(frame,
			    "Você deve inserir os dados corretamente!",
			    "Atenção",
			    JOptionPane.WARNING_MESSAGE);
		}
		
		
	
	}

}
