import java.util.*;
public class Main {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Ingrese un arreglo de strings ordenado alfabéticamente separados por un espacio: ");
            String names = scanner.nextLine();
            String[] array = names.split(" ");

            ArrayToBST.Nodo root = ArrayToBST.sortedArrayToBST(array, 0, array.length - 1);
            System.out.print("Árbol binario de búsqueda: ");
            ArrayToBST.printInorder(root);

            System.out.println();
            System.out.print("Impresión inversa: ");
            ArrayToBST.printInorderReverse(root);

            System.out.println();
            System.out.println("La máxima profundidad del árbol es: " + ArrayToBST.maxDepth(root));

            System.out.println();
            System.out.println("Árbol por ramas:");
            ArrayToBST.printByLevel(root, 1);

    }
}