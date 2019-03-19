package question1;

/**
 * Décrivez votre classe FahrenheitCelsius ici.
 * 3
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
import java.text.DecimalFormat;
public class FahrenheitCelsius {

	/** 
	 * le point d'entrée de cette application, dont le commentaire est à
	 * compléter
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
					
																
																
																
		}																// imposés
																				
	}

	/**
	 * la méthode à compléter.
	 * 
	 * @param f
	 *            la valeur en degré Fahrenheit
	 * @return la conversion en degré Celsius
	 */
	public static float fahrenheitEnCelsius(int f) {
	  float celsius=5/9f * (f-32);
                 float resultat=(int)(celsius*10)/10.0f;
		return resultat;        // compléter  la fonction
					
	}

}
