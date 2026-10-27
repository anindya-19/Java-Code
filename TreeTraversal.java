public class TreeTraversal {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static void inOrderTraversal(Node root) {
        if (root != null) {
            inOrderTraversal(root.left);
            System.out.print(root.data + " ");
            inOrderTraversal(root.right);
        }
    }

    static void preOrderTraversal(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preOrderTraversal(root.left);
            preOrderTraversal(root.right);
        }
    }

    static void postOrderTraversal(Node root) {
        if (root != null) {
            postOrderTraversal(root.left);
            postOrderTraversal(root.right);
            System.out.print(root.data + " ");
        }
    }

    public static void main(String[] args) {
        Node p = new Node(4);
        Node p1 = new Node(1);
        Node p2 = new Node(6);
        Node p3 = new Node(5);
        Node p4 = new Node(2);

        p.left = p1;
        p.right = p2;

        p1.left = p3;
        p1.right = p4;

        System.out.print("Inorder: ");
        inOrderTraversal(p);
        System.out.println();

        System.out.print("Preorder: ");
        preOrderTraversal(p);
        System.out.println();

        System.out.print("Postorder: ");
        postOrderTraversal(p);
        System.out.println();
    }
}
