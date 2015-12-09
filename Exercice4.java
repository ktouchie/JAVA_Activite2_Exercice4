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
        String string1 = ((num1>min) && (num1<max)) : "Le premier nombre saisi appartient a l'intervalle donne par le plus petit et le plus grand des deux autres (bornes exclues)." : "Le premier nombre saisi n'appartient pas a l'intervalle donne par le plus petit et le plus grand des deux autres (bornes exclues).";
        String string2 = ((num1>=min) && (num1<=max)) : "Le premier nombre saisi appartient a l'intervalle donne par le plus petit et le plus grand des deux autres (bornes inclues)." : "Le premier nombre saisi n'appartient pas a l'intervalle donne par le plus petit et le plus grand des deux autres (bornes inclues).";
        System.out.println(string1);
        System.out.println("Inclure les bornes? Y/N");
        char a = sc.nextChar();
        switch (a)
        {
            case 'Y':
                System.out.println(string2);
                break;
            case 'N':
                System.out.println("Ok, a plus tard!");
                break;
            default:
                System.out.println("Veuillez saisir 'Y' ou 'N' la prochaine fois!");
        }
	}

}