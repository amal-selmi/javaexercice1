import java.util.Scanner;

public class ZooManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Instruction 1 : Déclaration des variables et affichage initial
        int nbrCages = 20; // Initialisation par défaut
        String zooName = "my zoo"; // Initialisation par défaut
        System.out.println(zooName + " comporte " + nbrCages + " cages");

        // Instruction 2 : Demander à l'utilisateur d'entrer le nombre de cages et le nom du zoo
        System.out.print("Entrez le nombre de cages : ");
        while (!scanner.hasNextInt()) {
            System.out.print("Veuillez entrer un nombre valide : ");
            scanner.next();
        }
        nbrCages = scanner.nextInt();

        scanner.nextLine(); // Lire la nouvelle ligne restante après le nombre
        System.out.print("Entrez le nom du zoo : ");
        zooName = scanner.nextLine();

        // Instruction 3 : Afficher les changements
        System.out.println(zooName + " comporte " + nbrCages + " cages");

        // Fermer le scanner
        scanner.close();
    }
}

