package protecao.motoreletrico;

import java.util.Scanner;

import protecao.protecoes;

public class MamedeCap6Ex2 {
	 public static void main(String[] args) {
		 
		 Scanner keyboard = new Scanner(System.in);
		 
	        //Caracteristicas Motor
		 double Pmotor=735.499*2200;
		 double VnomPrimaria=13.8e3;
		 double VnomMotor=4.16e3;
		 double TempPartida=1.2;
		 double TempRotBloq=12;
		 //double Ipartida=3.8*Inom;
		 double nmotor=0.91;
		 double FPmotor=0.95;
		 double ConstTempTerm=20;
		 double Imin=55;
		 double Ioperacao=248;
		 
		 //Caracteristicas do Circuito
		 double Icc=3800;
		 
		 //TC
		 double RTC = 80; //Rela��o de transforma��o
		 
		// double a = keyboard.nextDouble();
		 
		 System.out.println("a) Corrente nominal do motor");
		 double Inom=Pmotor/(Math.sqrt(3)*VnomMotor*FPmotor*nmotor);
		 System.out.println("Inm: "+Inom+" [A]");
		 
		 System.out.println("b) Transformador de corrente relativo ao disjuntor 52.5");
		 double Iptc=Icc/20; //Ficar atento nesse fator 20 - garante a nao satura��o do TC
		 double Istc=Inom/RTC;
		 double Is=Icc/RTC;
		 System.out.println("Iptc: "+Iptc+" [A]");
		 System.out.println("Istc: "+Istc+" [A]");
		 System.out.println("Is: "+Is+" [A]");
		 
		 System.out.println("c) Ajuste da prote��o contra sobrecarga (51)");
		 double Kf=1.1;
		 double Ipartida = 3.8*Inom;
		 double TreleSup=0.8;
		 double Tcoord=0.3;
		// double T51 = protecoes.protecao51(Kf, Inom, Ipartida, RTC, Icc, TreleSup, Tcoord);
		// System.out.println("T51: "+T51+" [s]");
		 
		 
		 System.out.println("d) Ajuste da prote��o instant�nea da fase (50)");
		 double Fa=1.15;
		 double Iac=protecoes.protecao50(Kf, Inom, Ipartida, RTC, Icc, Fa);
		 System.out.println("Iac: "+Iac+" [A]");
		 
		 System.out.println("e) Ajustes da prote��o de fuga � terra (51G)");
		 double Iaj=protecoes.protecao51G(0.1, Inom, RTC);
		 System.out.println("Iaj: "+Iaj+" [A]");
		 
		 System.out.println("f) Ajuste de prote��o contra corrente de desequil�brio (46)");
		 double Idr=protecoes.protecao46(0.1, Inom, RTC);
		 System.out.println("Idr: "+Idr+" [A]");
		 
		 System.out.println("g) Determin��o do tempo de ajuste para a partida prolongada");
		 double Taj=protecoes.protecaoPartidaProlongada(TempRotBloq, TempPartida);
		 System.out.println("Taj: "+Taj+" [s]");
		 
		 System.out.println("h) Prote��o por perda de carga ou opera��o em subcorrente (37)");
		 double[] GAMA=protecoes.protecao37(Inom, Imin, Ioperacao);
		 System.out.println("gama: "+GAMA[0]);
		 System.out.println("gami: "+GAMA[1]);
		 
		 System.out.println("i) Calculo da contante t�rmica de aquecimento do motor para o motor a quente");
		 double SIGMAaq=protecoes.CalculoConsTermMotorQuente(TempRotBloq, Inom, Ipartida)/60;
		 System.out.println("SIGMAaq: "+SIGMAaq+" [min]");
		 
		 System.out.println("j) Calculo da constante t�rmica de resfriamento");
		 double SIGMAr=protecoes.CalculoConstTermResfriamento(SIGMAaq);
		 System.out.println("SIGMAr: "+SIGMAr+" [min]");
		 
		 
		 
		 
	        
	        
	    }
}
