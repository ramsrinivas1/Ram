package Tree;

public class BinaryTrees {
	
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

	    static class BinaryTree {
	        static int index = -1;

	        public static Node buildTree(int nodes[]) {
	            index++;
	            if (nodes[index] == -1) {
	                return null;

	            }
	            Node newNode = new Node(nodes[index]);
	            newNode.left = buildTree(nodes);
	            newNode.right = buildTree(nodes);
	            return newNode;

	        }
	    }

	    // preorder[root,left,right]
	    public static void preorder(Node root) {
	        if (root == null) {
	            return;
	        }
	        System.out.print(root.data + " ");
	        preorder(root.left);
	        preorder(root.right);
	    }

	    // Inordr[left,root,right]
	    public static void inorder(Node root) {
	        if (root == null) {
	            return;
	        }

	        inorder(root.left);
	        System.out.print(root.data + " ");
	        inorder(root.right);
	    }

	    // postorder[left,right,root]
	    public static void postorder(Node root) {
	        if (root == null) {
	            return;
	        }

	        postorder(root.left);

	        postorder(root.right);
	        System.out.print(root.data + " ");
	    }

	    

	    // counting of nodes
	    public static int countOfNodes(Node root) {
	        if (root == null) {
	            return 0;
	        }
	        int leftNodes = countOfNodes(root.left);
	        int rightNodes = countOfNodes(root.right);
	        return leftNodes + rightNodes + 1;
	    }

	    // sum of nodes
	    public static int sumOfNodes(Node root) {
	        if (root == null) {
	            return 0;
	        }
	        int leftsum = sumOfNodes(root.left);
	        int rightsum = sumOfNodes(root.right);
	        return leftsum + rightsum + root.data;
	    }

	    // Height of the tree
	    public static int height(Node root) {
	        if (root == null) {
	            return 0;
	        }
	        int leftheight = height(root.left);
	        int rightheight = height(root.right);
	        int myHeight = Math.max(leftheight, rightheight) + 1;
	        return myHeight;
	    }

	    // Diameter of tree
	    public static int diameter(Node root) {
	        if (root == null) {
	            return 0;
	        }
	        int dia1 = diameter(root.left);
	        int dia2 = diameter(root.right);
	        int dia3 = height(root.left) + height(root.right) + 1;
	        return Math.max(dia3, Math.max(dia1, dia2));
	    }

	    static class TreeInfo {
	        int ht;
	        int dia;

	        TreeInfo(int ht, int dia) {
	            this.dia = dia;
	            this.ht = ht;
	        }
	    }

	    public static TreeInfo diameter2(Node root) {
	        if (root == null) {
	            return new TreeInfo(0, 0);
	        }
	        TreeInfo left = diameter2(root.left);
	        TreeInfo right = diameter2(root.right);
	        int myHeight = Math.max(left.ht, right.ht) + 1;
	        int dia1 = left.dia;
	        int dia2 = right.dia;
	        int dia3 = left.ht + right.ht + 1;
	        int mydia = Math.max(Math.max(dia1, dia2), dia3);
	        TreeInfo myInfo = new TreeInfo(myHeight, mydia);
	        return myInfo;

	    }

	    public static void main(String[] args) {
	        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
	        BinaryTree tree = new BinaryTree();
	        Node root = tree.buildTree(nodes);
	        System.out.println(root.data);
	        preorder(root);// 1 2 4 5 3 6
	        System.out.println();
	        inorder(root);// 4 2 5 1 3 6
	        System.out.println();
	        postorder(root);// 4 5 2 6 3 1
	        // levelOrder(root);
	        System.out.println();
	        System.out.println("number of nodes  : " + countOfNodes(root));// 6
	        System.out.println("sum of nodes  : " + sumOfNodes(root));// 21
	        System.out.println(height(root));// 3
	        System.out.println(diameter(root));// 5
	        System.out.println(diameter2(root).dia);// 5

	    }

	}

