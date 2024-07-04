package classes;

public class UsoClasseAtributos {

	public static void main(String[] args) {

		AtributosClasses cliente1 = new AtributosClasses();
		System.out.println(cliente1.fnome);
		System.out.println(cliente1.lnome);
		System.out.println(cliente1.idade);
		/*
		%s for string
		%f for float 
		%d for real
		*/
		System.out.printf("O Aluno %s %s tem %d anos", cliente1.fnome, cliente1.lnome, cliente1.idade);
		
		
		
		
	}

}
