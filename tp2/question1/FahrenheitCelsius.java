package question1;

/**
 * D�crivez votre classe FahrenheitCelsius ici.
 * 3
 * @author (votre nom)
 * @version (un num�ro de version ou une date)
 */
import java.text.DecimalFormat;
public class FahrenheitCelsius {

	/** 
	 * le point d'entr�e de cette application, dont le commentaire est �
	 * compl�ter
	 * 
	 * @param args
	 *            ...
	 */
	
	public static void main(String[] args) {
	
int fahrenheit =0;
float celsius =0;
		for( int i =0; i<args.length;i++){

		

		    
		 fahrenheit = Integer.parseInt(args[i]) ;
		 celsius = fahrenheitEnCelsius(fahrenheit) ;
		
		System.out.println(fahrenheit + "\u00B0F -> " + celsius + "\u00B0C"); // ligne,
											// format
					
																
																
																
		}																// impos�s
																				
	}

	/**
	 * la m�thode � compl�ter.
	 * 
	 * @param f
	 *            la valeur en degr� Fahrenheit
	 * @return la conversion en degr� Celsius
	 */
	public static float fahrenheitEnCelsius(int f) {
	  float celsius=5/9f * (f-32);
                 float resultat=(int)(celsius*10)/10.0f;
		return resultat;        // compl�ter  la fonction
					
	}

}
