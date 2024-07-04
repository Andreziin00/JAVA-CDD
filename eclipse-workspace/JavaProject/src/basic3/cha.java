package basic3;

public class cha {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "oi";String text = " Mundo";
		String frase = str + text;
		System.out.println(frase);
				
		String resultado = frase.substring(3);
		System.out.println(resultado);
		System.out.println(resultado.toLowerCase());
		System.out.println(resultado.toUpperCase());
		System.out.println(text.trim());
		System.out.println();
		
		String s1 = "Hello";
		//equipara o valor dos dados retornando true ou false
		String s2 = s1.toUpperCase();
		boolean b1 = s1.equals("Hello");
		boolean b2 = s1.equals("s2");
		//equipara o valor dos dados sem considerar se mausculo ou minusculo;
		boolean b3 = s1.equalsIgnoreCase(s2);
		boolean b4 = s1.equalsIgnoreCase("azul");
		
		System.out.println(b2);
		// return length of a string
		System.out.println(s1.length());
		
	}

}
