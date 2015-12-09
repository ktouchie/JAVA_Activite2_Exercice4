import java.util.Scanner;
class Exercice3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez saisir un nombre:");
        int num = sc.nextInt();
        String signe = (num == 0) ? "null" : ((num > 0) ? "positif" : "negatif");

        System.out.println("Le nombre est " + signe);
        
	}

}