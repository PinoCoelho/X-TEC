public class AVLTree {
    static class AVLNode {
        ServerApp.Platillo data;
        AVLNode left;
        AVLNode right;
        int height;

        AVLNode(ServerApp.Platillo data) {
            this.data = data;
            this.left = null;
            this.right = null;
            this.height = 1;
        }
    }

    static class AVLtree {
        AVLNode root;

        // get height of a node
        static int height(AVLNode node) {
            if (node == null) {
                return 0;
            }
            return node.height;
        }

        // get the balance factor of a node
        static int getBalance(AVLNode node) {
            if (node == null) {
                return 0;
            }
            return height(node.left) - height(node.right);
        }

        // right rotate subtree rooted with y
        static AVLNode rightRotate(AVLNode y) {
            AVLNode x = y.left;
            AVLNode t2 = x.right;

            // perform rotation
            x.right = y;
            y.left = t2;

            // update heights
            y.height = Math.max(height(y.left), height(y.right)) + 1;
            x.height = Math.max(height(x.left), height(x.right)) + 1;

            // return new root
            return x;
        }

        // left rotate subtree rooted with x
        static AVLNode leftRotate(AVLNode x) {
            AVLNode y = x.right;
            AVLNode t2 = y.left;

            // perform rotation
            y.left = x;
            x.right = t2;

            // update heights
            x.height = Math.max(height(x.left), height(x.right)) + 1;
            y.height = Math.max(height(y.left), height(y.right)) + 1;

            // return new root
            return y;
        }

        // insert a node in the AVL tree
        public static AVLNode insert(AVLNode node, ServerApp.Platillo data) {
            // perform normal BST insertion
            if (node == null) {
                return new AVLNode(data);
            }

            if (data.id < node.data.id) {
                node.left = insert(node.left, data);
            } else if (data.id > node.data.id) {
                node.right = insert(node.right, data);
            } else {
                return node;
            }

            // update the height of the current node
            node.height = 1 + Math.max(height(node.left), height(node.right));

            // get the balance factor of the current node
            int balance = getBalance(node);

            // if the node is unbalanced, there are 4 cases
            // left left case
            if (balance > 1 && data.id < node.left.data.id) {
                return rightRotate(node);
            }

            // right right case
            if (balance < -1 && data.id > node.right.data.id) {
                return leftRotate(node);
            }

            // left right case
            if (balance > 1 && data.id > node.left.data.id) {
                node.left = leftRotate(node.left);
                return rightRotate(node);
            }

            // right left case
            if (balance < -1 && data.id < node.right.data.id) {
                node.right = rightRotate(node.right);
                return leftRotate(node);
            }

            return node;
        }

        static AVLNode minValueNode(AVLNode node)
        {
            AVLNode temp;
            for (temp = node; temp.left != null; temp = temp.left);

            return temp;
        }

        public static AVLNode delete (AVLNode root, int id)
        {
            if (root == null)
                return root;

            if (id < root.data.id)
                root.left = delete (root.left, id);

            else if (id > root.data.id)
                root.right = delete (root.right, id);

            else
            {

                if ((root.left == null) || (root.right == null))
                {
                    AVLNode temp = null;
                    if (temp == root.left)
                        temp = root.right;
                    else
                        temp = root.left;

                    if (temp == null)
                    {
                        temp = root;
                        root = null;
                    }
                    else
                        root = temp;
                }
                else
                {

                    AVLNode temp = minValueNode (root.right);

                    root.data = temp.data;

                    root.right = delete (root.right, temp.data.id);
                }
            }

            if (root == null)
                return root;

            root.height = Math.max (height (root.left), height (root.right)) + 1;
            int balance = getBalance (root);

            if (balance > 1 && getBalance (root.left) >= 0)
                return rightRotate (root);

            if (balance > 1 && getBalance (root.left) < 0)
            {
                root.left = leftRotate (root.left);
                return rightRotate (root);
            }

            if (balance < -1 && getBalance (root.right) <= 0)
                return leftRotate (root);

            if (balance < -1 && getBalance (root.right) > 0)
            {
                root.right = rightRotate (root.right);
                return leftRotate (root);
            }

            return root;
        }

        // search for a node in the AVL tree
        boolean contains(AVLNode node, int id) {
            if (node == null) {
                return false;
            }
            else if (node.data.id == id) {
                return true;
            }

            if (node.data.id < id) {
                return contains(node.right, id);
            }

            return contains(node.left, id);
        }

        ServerApp.Platillo getPlatillo(AVLNode node, int id) {
            if (node == null) {
                return null;
            }
            else if (node.data.id == id) {
                return node.data;
            }

            if (node.data.id < id) {
                return getPlatillo(node.right, id);
            }

            return getPlatillo(node.left, id);
        }

        String getNombre(AVLNode node, int id) {
            if (node == null) {
                return null;
            }
            else if (node.data.id == id) {
                return node.data.nombre;
            }

            if (node.data.id < id) {
                return getNombre(node.right, id);
            }

            return getNombre(node.left, id);
        }

        String getCalorias(AVLNode node, int id) {
            if (node == null) {
                return null;
            }
            else if (node.data.id == id) {
                return node.data.calorias;
            }

            if (node.data.id < id) {
                return getCalorias(node.right, id);
            }

            return getCalorias(node.left, id);
        }

        String getTiempo(AVLNode node, int id) {
            if (node == null) {
                return null;
            }
            else if (node.data.id == id) {
                return node.data.tiempo;
            }

            if (node.data.id < id) {
                return getTiempo(node.right, id);
            }

            return getTiempo(node.left, id);
        }

        String getPrecio(AVLNode node, int id) {
            if (node == null) {
                return null;
            }
            else if (node.data.id == id) {
                return node.data.precio;
            }

            if (node.data.id < id) {
                return getPrecio(node.right, id);
            }

            return getPrecio(node.left, id);
        }

        String editNombre(AVLNode node, int id, String newNombre, int newID) {
            if (node == null) {
                return null;
            }
            else if (node.data.id == id) {
                node.data.nombre = newNombre;
                node.data.id = newID;
                return node.data.nombre;
            }

            if (node.data.id < id) {
                return editNombre(node.right, id, newNombre, newID);
            }

            return editNombre(node.left, id, newNombre, newID);
        }

        String editCalorias(AVLNode node, int id, String newCalorias) {
            if (node == null) {
                return null;
            }
            else if (node.data.id == id) {
                node.data.calorias = newCalorias;
                return node.data.calorias;
            }

            if (node.data.id < id) {
                return editCalorias(node.right, id, newCalorias);
            }

            return editCalorias(node.left, id, newCalorias);
        }

        String editPrecio(AVLNode node, int id, String newPrecio) {
            if (node == null) {
                return null;
            }
            else if (node.data.id == id) {
                node.data.precio = newPrecio;
                return node.data.precio;
            }

            if (node.data.id < id) {
                return editPrecio(node.right, id, newPrecio);
            }

            return editPrecio(node.left, id, newPrecio);
        }

        String editTiempo(AVLNode node, int id, String newTiempo) {
            if (node == null) {
                return null;
            }
            else if (node.data.id == id) {
                node.data.tiempo = newTiempo;
                return node.data.tiempo;
            }

            if (node.data.id < id) {
                return editTiempo(node.right, id, newTiempo);
            }

            return editTiempo(node.left, id, newTiempo);
        }

    }
}
