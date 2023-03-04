public class ArrayToBST {

    static class Nodo {
        String data;
        Nodo left, right;

        Nodo(String data) {
            this.data = data;
            left = null;
            right = null;

        }
    }

    static Nodo sortedArrayToBST(String arr[], int start, int end) {
        if (start > end) {
            return null;
        }

        int mid = (start + end) / 2;
        Nodo node = new Nodo(arr[mid]);

        node.left = sortedArrayToBST(arr, start, mid - 1);
        node.right = sortedArrayToBST(arr, mid + 1, end);

        return node;
    }

    static void printInorder(Nodo node) {
        if (node == null) {
            return;
        }

        printInorder(node.left);
        System.out.print(node.data + " ");
        printInorder(node.right);
    }

    static void printInorderReverse(Nodo node) {
        if (node == null) {
            return;
        }

        printInorderReverse(node.right);
        System.out.print(node.data + " ");
        printInorderReverse(node.left);
    }

    static int maxDepth(Nodo node) {
        if (node == null) {
            return 0;
        }

        int leftDepth = maxDepth(node.left);
        int rightDepth = maxDepth(node.right);

        return Math.max(leftDepth, rightDepth) + 1;
    }

    static void printByLevel(Nodo node, int level) {
        if (node == null) {
            System.out.println();
            return;
        }

        System.out.print("Nivel " + level + ": " + node.data);

        if (node.right != null) {
            System.out.println();
            System.out.print(" (R: ");
            printByLevel(node.right, level + 1);
            System.out.print(")");
        }

        if (node.left != null) {
            System.out.println();
            System.out.print(" (L: ");
            printByLevel(node.left, level + 1);
            System.out.print(")");
        }

    }
}
