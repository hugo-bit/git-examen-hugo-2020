package app.presentacion;

public class CaracteresCadenas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String palabra="No Mates una Mozca de la cabeza de un Tigre";
		String palabra1="NO MATES UNA MOZCA EN LA CABEZA DE UN TIGRE";
		int ultima_letra;
		
		System.out.println("la frase es "+palabra);
		System.out.println("la frase tiene  " +palabra.length()+ "letras.");
		System.out.println("la primera palabra es "+palabra+"es la "+palabra.chars());
		System.out.println("la primera letra es " +palabra+"es la "+palabra.charAt(0));
		ultima_letra=palabra.length();
		System.out.println("la ultima letra es la "  +palabra.charAt(ultima_letra-1));
		System.out.println(palabra.equals(palabra1));
	}

}
