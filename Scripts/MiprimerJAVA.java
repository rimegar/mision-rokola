import java.util.Scanner;

public class MiprimerJAVA {
    public static void main(String args[])
    {
		int n = 5;
		float x = 3.141597f;
		String nombre = "Giovanny";
		
        System.out.println("Biemvenido a la Programación en Java");
		System.out.println();
		System.out.print("Los números ingresados por "+nombre+" son: "+n+" y "+x+". Su porducto es "+ n*x);
		System.out.println();
		System.out.println();
		System.out.printf("Los Números Ingresados por %s son: %d y %f. Su porducto es %f",nombre, n, x, n*x);
		System.out.println();
		System.out.println();
				
    }
}
