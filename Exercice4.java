import java.util.Scanner;
class Exercice4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez saisir un nombre:");
        int num1 = sc.nextInt();
        System.out.println("Veuillez saisir un autre nombre:");
        int num2 = sc.nextInt();
        System.out.println("Veuillez saisir encore un autre nombre:");
        int num3 = sc.nextInt();
        int max = (num2 >= num3) ? num2 : num3;
        int min = (num2 >= num3) ? num3 : num2;
        String string1 = "Le 1er nombre saisi appartient a l'intervalle donne par le plus petit et le plus grand des 2 autres (bornes exclues).";
        String string2 = "Le 1er nombre saisi n'appartient pas a l'intervalle donne par le plus petit et le plus grand des 2 autres (bornes exclues).";
        String string3 = "Le 1er nombre saisi appartient a l'intervalle donne par le plus petit et le plus grand des 2 autres (bornes inclues).";
        String string4 = "Le 1er nombre saisi n'appartient pas a l'intervalle donne par le plus petit et le plus grand des 2 autres (bornes inclues).";
        String string5 = ((num1>min) && (num1<max)) : string1 : string2;
        String string6 = ((num1>=min) && (num1<=max)) : string3 : string4;
        System.out.println(string5);
        System.out.println("Inclure les bornes? Y/N");
        char a = sc.nextChar();
        switch (a)
        {
            case 'Y':
                System.out.println(string6);
                break;
            case 'N':
                System.out.println("Ok, a plus tard!");
                break;
            default:
                System.out.println("Veuillez saisir 'Y' ou 'N' la prochaine fois!");
        }
	}

}