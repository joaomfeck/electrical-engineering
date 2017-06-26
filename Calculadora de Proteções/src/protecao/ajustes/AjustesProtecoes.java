package protecao.ajustes;

import java.util.ArrayList;
import java.util.List;

public class AjustesProtecoes {

	
	

	
	/*
	public static final double[][] = new double[18][2];
	private static double  ANSI26[]	=	{};
	private static double  ANSI27[]	=	{};
	private static double  ANSI37[]	=	{};
	private static double  ANSI40[]	=	{};
	private static double  ANSI46[]	=	{};
	private static double  ANSI47[]	=	{};
	private static double  ANSI48[]	=	{};
	private static double  ANSI49[]	=	{};
	private static double  ANSI50[]	=	{};
	private static double  ANSI51[]	=	{};
	private static double  ANSI51G[]=	{};
	private static double  ANSI51LB[]=	{};
	private static double  ANSI51N[]=	{};
	private static double  ANSI59[]	=	{};
	private static double  ANSI59N[]=	{};
	private static double  ANSI66[]	=	{};
	private static double  ANSI78PS[]=	{};
	private static double  ANSI87M[]=	{};
	*/
	
	public static List<double[]> ajustesMamede(){
		
		List<double[]> ajustes = new ArrayList<double[]>();
		
		double  ANSI26[]	=	{0,0};					///////////////////				1
	    double  ANSI27[]	=	{80, 1}; 				// 	%, sec						2
	    double  ANSI37[]	=	{70, 1}; 				// 	%, sec						3
		double  ANSI40[]	=	{0.15,1.15,2.35,0.1}; 	// 	Norm, Norm, Norm, sec		4
		double  ANSI46[]	=	{20,1.5,10,0.3}; 		// 	%, sec, %, sec				5	
		double  ANSI47[]	=	{20,0.15}; 				//	%, sec						6
		double  ANSI48[]	=	{2.5,2};  				//	%, sec						7
		double  ANSI49[]	=	{0,0};    				///////////////////				8
		double  ANSI50[]	=	{115};   				//	Fa							9
		double  ANSI51[]	=	{115,0.15};				// 	%, sec						10
		double  ANSI51G[]	=	{10,0.10};				// 	%, sec						11
		double  ANSI51LB[]	=	{250,0.5};				//	%, sec						12
		double  ANSI51N[]	=	{20,0.15};				// 	%, sec						13
		double  ANSI59[]	=	{110,1};				// 	%, sec						14
		double  ANSI59N[]	=	{30,0.25};				// 	%, sec						15
		double  ANSI66[]	=	{2};					// 	nº partidas					16
		double  ANSI78PS[]	=	{0.3};					//sec							17
		double  ANSI87M[]	=	{0,0};					///////////////////
		double  ANSI50GS[]	=	{0, 0};					// 	%, sec						19
		double  ANSI81[]	=	{0, 0};					// 	%max&min freq,  sec			20
		
		ajustes.add(ANSI26);
		ajustes.add(ANSI27);
		ajustes.add(ANSI37);
		ajustes.add(ANSI40);
		ajustes.add(ANSI46);
		ajustes.add(ANSI47);
		ajustes.add(ANSI48);
		ajustes.add(ANSI49);
		ajustes.add(ANSI50);
		ajustes.add(ANSI51);
		ajustes.add(ANSI51G);
		ajustes.add(ANSI51LB);
		ajustes.add(ANSI51N);
		ajustes.add(ANSI59);
		ajustes.add(ANSI59N);
		ajustes.add(ANSI66);
		ajustes.add(ANSI78PS);
		ajustes.add(ANSI87M);
		ajustes.add(ANSI50GS); 	//19
		ajustes.add(ANSI81); 	//20
		return ajustes;
	}
	
public static List<double[]> ajustesSchneider(){
		
		List<double[]> ajustes = new ArrayList<double[]>();
		
		double  ANSI26[]	=	{0,0};					///////////////////				1
	    double  ANSI27[]	=	{0,0}; 					// 	%, sec						2
	    double  ANSI37[]	=	{10, 3.5}; 				// 	%, sec						3
		double  ANSI40[]	=	{0,0,0,0}; 				// 	Norm, Norm, Norm, sec		4
		double  ANSI46[]	=	{15,2,0,0}; 				// 	%, sec, %, sec			5	
		double  ANSI47[]	=	{0,0}; 					//	%, sec						6
		double  ANSI48[]	=	{200,1.1};  			//	%, sec						7
		double  ANSI49[]	=	{105,0};    			///////////////////				8
		double  ANSI50[]	=	{176,0.050};   			//	Fa							9
		double  ANSI51[]	=	{0,0};					// 	%, sec						10
		double  ANSI51G[]	=	{0,0};					// 	%, sec						11
		double  ANSI51LB[]	=	{200,2};				//	%, sec						12
		double  ANSI51N[]	=	{0,0};					// 	%, sec						13
		double  ANSI59[]	=	{0,0};					// 	%, sec						14
		double  ANSI59N[]	=	{0,0};					// 	%, sec						15
		double  ANSI66[]	=	{2};					// 	nº partidas					16
		double  ANSI78PS[]	=	{0};					//sec							17
		double  ANSI87M[]	=	{0,0};					///////////////////				18
		double  ANSI50GS[]	=	{0, 0};					// 	%, sec						19
		double  ANSI81[]	=	{0, 0};					// 	%max&min freq,  sec			20
		
		ajustes.add(ANSI26);	//1
		ajustes.add(ANSI27); 	//2
		ajustes.add(ANSI37); 	//3
		ajustes.add(ANSI40); 	//4
		ajustes.add(ANSI46); 	//5
		ajustes.add(ANSI47); 	//6
		ajustes.add(ANSI48); 	//7
		ajustes.add(ANSI49);	//8
		ajustes.add(ANSI50); 	//9
		ajustes.add(ANSI51); 	//10
		ajustes.add(ANSI51G); 	//11
		ajustes.add(ANSI51LB); 	//12
		ajustes.add(ANSI51N); 	//13
		ajustes.add(ANSI59); 	//14
		ajustes.add(ANSI59N); 	//15
		ajustes.add(ANSI66); 	//16
		ajustes.add(ANSI78PS); 	//17
		ajustes.add(ANSI87M); 	//18
		ajustes.add(ANSI50GS); 	//19
		ajustes.add(ANSI81); 	//20
		
		return ajustes;
	}

public static List<double[]> ajustesENGIE(){
	
	List<double[]> ajustes = new ArrayList<double[]>();
	
	double  ANSI26[]	=	{0,0};					///////////////////				1
    double  ANSI27[]	=	{80,1}; 				// 	%, sec						2
    double  ANSI37[]	=	{70, 2}; 				// 	%, sec						3
	double  ANSI40[]	=	{0,0,0,0}; 				// 	Norm, Norm, Norm, sec		4
	double  ANSI46[]	=	{15,2,0,0}; 			// 	%, sec, %					5	
	double  ANSI47[]	=	{25,0.15}; 				//	%, sec						6
	double  ANSI48[]	=	{0,0};  				//	%, sec						7
	double  ANSI49[]	=	{105,0};    			//	%, sec						8
	double  ANSI50[]	=	{130};   				//	Fa							9
	double  ANSI51[]	=	{125,0.2};				// 	%, sec						10 //51 GERALMENTE USADA EM CARGAS ESTÁTICAS
	double  ANSI51G[]	=	{0,0};					// 	%, sec						11
	double  ANSI51LB[]	=	{200,2};				//	%, sec						12
	double  ANSI51N[]	=	{0,0};					// 	%, sec						13
	double  ANSI59[]	=	{120,2};				// 	%, sec						14
	double  ANSI59N[]	=	{0,0};					// 	%, sec						15
	double  ANSI66[]	=	{2};					// 	nº partidas					16
	double  ANSI78PS[]	=	{0};					//sec							17
	double  ANSI87M[]	=	{0,0};					///////////////////				18
	double  ANSI50GS[]	=	{20,0};					// 	%, sec						19
	//double  ANSI25[]	=	{20,0};					// 	%, sec						20
	double  ANSI81[]	=	{5, 2};					// 	%max&min freq,  sec			20
	
	ajustes.add(ANSI26);	//0
	ajustes.add(ANSI27); 	//1
	ajustes.add(ANSI37); 	//2
	ajustes.add(ANSI40); 	//3
	ajustes.add(ANSI46); 	//4
	ajustes.add(ANSI47); 	//5
	ajustes.add(ANSI48); 	//6
	ajustes.add(ANSI49);	//7
	ajustes.add(ANSI50); 	//8
	ajustes.add(ANSI51); 	//9
	ajustes.add(ANSI51G); 	//10
	ajustes.add(ANSI51LB); 	//11
	ajustes.add(ANSI51N); 	//12
	ajustes.add(ANSI59); 	//13
	ajustes.add(ANSI59N); 	//14
	ajustes.add(ANSI66); 	//15
	ajustes.add(ANSI78PS); 	//16
	ajustes.add(ANSI87M); 	//17
	ajustes.add(ANSI50GS); 	//18
	ajustes.add(ANSI81); 	//29
	return ajustes;
}
}
