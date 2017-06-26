package protecao;

public class protecoes {

	public static double[] protecao27(double Vnom, double PercentualVnom, double TempSub){
		double Vset=PercentualVnom*Vnom;
		double[] Result27={Vset, TempSub};		//Resultados
		return Result27;
		}
	
	/*
	public static double[] protecao37(double Inom, double Imin, double Iopm){
	
	//PROTECAO POR PERDA DE CARGA OU OPERACAO EM SUBCORRENTE (ANSI 37) - RELÉ DE SUBCORRENTE OU SUBPOTENCIA
	
	double GAMAamin=Imin/Iopm;
	double GAMAamax=Iopm/Inom-0.2;
	double[] gmaxmin={GAMAamax,GAMAamin};
	return gmaxmin;
		//A PROTECAO ATUARA SE A CORRENTE FICAR COMPREENDIA ENTRE O VALOR MIN E O VALOR MAX AJUSTADO
	}
	*/
	
	public static double[] protecao37(double Inom, double PercentualInom, double Temp37){
		double[] Result37={Inom*PercentualInom, Temp37};		//Resultados
		return Result37;
	}
	
	public static double[] protecao40(double Zn, double Xa, double Xb, double Xc, double Temp40){
		double[] Result40={Zn*Xa, Zn*Xb, Zn*Xc, Temp40};		//Resultados
		return Result40;
	}
	
	public static double[] protecao46(double percentualDesequilibrioIfase, double Inom, double Temp46){
		
		//AJUSTE DE PROTEÇÃO DESEQUILÍBRIO (ANSI 46) - RELÉ DE REVERSÃO
		
		double Idp=percentualDesequilibrioIfase*Inom; 	//Corrente de desequilibrio entre fases permitidas
		double Id=Idp/Math.sqrt(3);						//Corrente de desequilibro
		double[] Result46={Id, Temp46};					//Resultados
		return Result46;
		
		//DEFINIR TEMPO DE PERMANENCIA DA CORRENTE DE DESEQUILIBRO, SENDO MENOS QUE O TEMPO DE ROTOR BLOQUEADO: T'=Trb-10%
	}
		
	public static double[] protecao47(double Vnom, double PercentualVnom, double Temp47){
		double[] Result47={Vnom*PercentualVnom, Temp47};		//Resultados
		return Result47;
	}
	
	public static double[] protecao48(double Inom, double PercentualInom, double Temp48, double Tpartida){
		double[] Result48={Inom*PercentualInom, Temp48+Tpartida};		//Resultados
		return Result48;
	}
	
	public static double[] protecao49(double Inom, double PercentualInom, double Temp49){
		double[] Result49={Inom*PercentualInom, Temp49};		//Resultados
		return Result49;
	}
	
	public static double[] protecao50(double Ipartida, double PercentualInom){
		double[] Result50={Ipartida*PercentualInom};		//Resultados
		return Result50;
	}
	
	public static double[] protecao50GS(double Inom, double PercentualInom){
		double[] Result50GS={Inom*PercentualInom};		//Resultados
		return Result50GS;
	}
	
	public static double[] protecao51(double Inom, double PercentualInom, double Temp51){
		double[] Result51={Inom*PercentualInom,Temp51};		//Resultados
		return Result51;
	}
	
	/*
	public static double[] protecao50(double Kf, double Inom, double Ipartida, double RTC, double Icc, double Fa){
		
		//AJUSTE DE PROTEÇÃO INSTANTANEA DE FASE (ANSI 50) - RELÉ DE SOBRECORRENTE INSTANEO
		
		//double Itf = Kf*Inom/RTC; 					//Corrente de ajuste da unidade temporizada de fase
		//double Iac = Itf*RTC;  						//Corrente de acionamento
		
		//double Ias = Fa*Ipartida; 						//
		//double F = Math.round(0.8*(Ias/Iac));  		//
		//double Iif=F*Itf;							//
		//double Iacionamento=Iif*RTC;				//
		
		boolean IacOkorNot=false;
		if (Iacionamento>Ipartida && Iacionamento<Ias){
			IacOkorNot=true;
		}
	/*	double[] Result50={Iacionamento, IacOkorNot};
	//	return Result50;						//
		
		//SE Iacionamento>IpartidaMotor ----> OK
	//}
	*/
	
	/*
	public static double[] protecao51(double Kf, double Inom, double Ipartida, double RTC, double Icc, double TreleSup, double Tcoord, double Tpartida){
		
		//AJUSTE DE PROTEÇÃO CONTRA SOBRECARGA (ANSI 50) - RELÉ DE SOBRECORRENTE TEMPORIZADO
		
	//	double Itf = Kf*Inom/RTC; 					//Corrente de ajuste da unidade temporizada de fase
	//	double Iac = Itf*RTC;  						//Corrente de acionamento
		//double M = 	 Icc/(RTC*Itf);					//Multiplo da corrente ajustada 
		
		//double T = 	 TreleSup-Tcoord;
		//double Tms = (M-1)*T/M;
		
		//double Mpartida=Ipartida/(RTC*Itf);			//Multiplo da corrente na partida
		//double Tatuacao=Tms*M/(Mpartida-1);			//Calcula o tempo de atuacao da protecao
		
		//boolean TempoOkorNot=false;					//Verifica se o tempo de atuação é maior que o tempo de partida do motor
		//if (Tatuacao>Tpartida){
			//	TempoOkorNot=true;
		//}
		
	//	double[] Result51={Iac , Tatuacao};
	//	return Result51;
		
		//SE Tatuacao>TpartidaMotor ----> OK
	//}
	 */

	public static double[] protecao51G(double percentual, double Inom, double RTC, double Tempo51Gretardo){
		
		//AJUSTE DE PROTEÇÃO DE FUGA A TERRA (ANSI 51G) - RELÉ DE SOBRECORRENTE TEMPORIZADO DE TERRA
		
		double Ift=percentual*Inom;
		double Iaj=Ift/RTC;
		double[] Result51G={Iaj, Tempo51Gretardo};
		return Result51G;
		
		//DEFINIR TEMPO DE RETARDO
	}
	
	public static double[] protecao51LB(double Inom, double PercentualInom, double Temp51LB){
		double[] Result51LB={Inom*PercentualInom, Temp51LB};		//Resultados
		return Result51LB;
	}

	public static double[] protecao51N(double In, double PercentualInom, double Temp51N){
		double[] Result51N={In*PercentualInom, Temp51N};		//Resultados
		return Result51N;
	}

	public static double[] protecao59(double Vnom, double PercentualVnom, double Temp59){
		double[] Result59={Vnom*PercentualVnom, Temp59};		//Resultados
		return Result59;
	}

	public static double[] protecao59N(double Vnom, double PercentualVnom, double Temp59N){
		double[] Result59N={Vnom*PercentualVnom, Temp59N};		//Resultados
		return Result59N;
	}

	public static double[] protecao66(double partidaPorHora){
		double[] Result66={partidaPorHora};		//Resultados
		return Result66;
	}
	
	/*

	public static double[] protecao78PS(double Vnom, double PercentualVnom, double Temp59){
		double[] Result78PS={Idr, Tidr};		//Resultados
		return Result78PS;
	}
	*/
	
	public static double[] protecao81(double PercentualFreq){
		double f=60;
		double[] Result81={(1+PercentualFreq/100)*f, (1-PercentualFreq/100)*f};		//Resultados
		return Result81;
	}
	
	/*
	public static double[] protecao87M(double Vnom, double PercentualVnom, double Temp59){
		double[] Result87M={Idr, Tidr};		//Resultados
		return Result87M;
	}
    */
	
	/*
	public static Object[] protecaoPartidaProlongada(double Trotorbloqueado, double Tpartida){
	
	//AJUSTE DE TEMPO PARA PARTIDA PROLONGADA
	
	double Taj=(Trotorbloqueado+Tpartida-0.2)/2; //Corrente de desequilibrio entre fases permitidas
	return Taj;
	
	}
	*/

	public static double CalculoConsTermMotorQuente(double Trbq, double Inom, double Irbq){
		
		//CALCULO DA CONSTANTE TERMICA DE AQUECIMENTO DO MOTOR PARA O MOTOR A QUENTE
		
		double div = Math.log((Math.pow(Irbq/Inom, 2)-1)/(Math.pow(Irbq/Inom, 2)-1.1));
		double SIGMAaq=Trbq/(div); //Corrente de desequilibrio entre fases permitidas
		return SIGMAaq;
		
		//RESULTADO EM SEC
	}
	
	public static double CalculoConsTermMotorFrio(double Trbf, double Inom, double Irbq){
		
		//CALCULO DA CONSTANTE TERMICA DE AQUECIMENTO DO MOTOR PARA O MOTOR A QUENTE
		
		double div = Math.log((Math.pow(Irbq/Inom, 2))/(Math.pow(Irbq/Inom, 2)-1.1));
		double SIGMAresfri=Trbf/(div); //Corrente de desequilibrio entre fases permitidas
		return SIGMAresfri;
		
		//RESULTADO EM SEC
	}
}
