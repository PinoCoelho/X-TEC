public class BSTree {
    /**
     * La clase Node establece la informacion que manejara
     */
    static class Node {
        ServerApp.Info value;
        Node leftChild;
        Node rightChild;

        /**
         * El metodo Node  indica el valor de la informacion
         * @param value
         */
        public Node(ServerApp.Info value) {
            this.value = value;
            this.leftChild = null;
            this.rightChild = null;
        }
    }

    /**
     * La clase BinarySearchTree apunta el nodo a la raiz
     */
    static class BinarySearchTree {
        Node root;

        /**
         * BinarySearchTree obtiene la raiz
         */
        public BinarySearchTree() {
            this.root = null;
        }

        /**
         * El metodo insert inserta un nodo en el arbol
         * @param value
         */
        public void insert(ServerApp.Info value) {
            Node newNode = new Node(value);

            if (root == null) {
                root = newNode;
                return;
            }

            Node currentNode = root;
            while (true) {
                if (value.id < currentNode.value.id) {
                    if (currentNode.leftChild == null) {
                        currentNode.leftChild = newNode;
                        return;
                    }
                    currentNode = currentNode.leftChild;
                } else {
                    if (currentNode.rightChild == null) {
                        currentNode.rightChild = newNode;
                        return;
                    }
                    currentNode = currentNode.rightChild;
                }
            }
        }

        /**
         * El metodo contains obtiene el id del usuario
         * @param id
         * @return booleano
         */
        public boolean contains(int id) {
            Node currentNode = root;

            while (currentNode != null) {
                if (id == currentNode.value.id) {
                    return true;
                } else if (id < currentNode.value.id) {
                    currentNode = currentNode.leftChild;
                } else {
                    currentNode = currentNode.rightChild;
                }
            }
            return false;
        }

        /**
         * El getUser obtiene el nombre de usuario
         * @param id
         * @return user
         */
        public String getUser(int id) {
            Node currentNode = root;

            while (currentNode != null) {
                if (id == currentNode.value.id) {
                    return currentNode.value.user;
                } else if (id < currentNode.value.id) {
                    currentNode = currentNode.leftChild;
                } else {
                    currentNode = currentNode.rightChild;
                }
            }
            return null;
        }

        /**
         * El getPassword obtiene la contraseña del usuario
         * @param id
         * @return
         */
        public String getPassword(int id) {
            Node currentNode = root;

            while (currentNode != null) {
                if (id == currentNode.value.id) {
                    return currentNode.value.contra;
                } else if (id < currentNode.value.id) {
                    currentNode = currentNode.leftChild;
                } else {
                    currentNode = currentNode.rightChild;
                }
            }
            return null;
        }

        /**
         * El editUser modifica el nombre de usuario
         * @param id
         * @param newID
         * @param newUser
         * @return newUser
         */
        public String editUser(int id, int newID, String newUser) {
            Node currentNode = root;

            while (currentNode != null) {
                if (id == currentNode.value.id) {
                    currentNode.value.id = newID;
                    currentNode.value.user = newUser;
                    return currentNode.value.user;
                } else if (id < currentNode.value.id) {
                    currentNode = currentNode.leftChild;
                } else {
                    currentNode = currentNode.rightChild;
                }
            }
            return null;
        }

        /**
         * El editPassword modifica la contraseña del usuario
         * @param id
         * @param newPassword
         * @return newPassword
         */
        public String editPassword(int id, String newPassword) {
            Node currentNode = root;

            while (currentNode != null) {
                if (id == currentNode.value.id) {
                    currentNode.value.contra = newPassword;
                    return currentNode.value.contra;
                } else if (id < currentNode.value.id) {
                    currentNode = currentNode.leftChild;
                } else {
                    currentNode = currentNode.rightChild;
                }
            }
            return null;
        }

        /**
         * El metodo delete elimina el id del ususario
         * @param id
         */
        public void delete(int id) {
            root = deleteNode(root, id);
        }

        /**
         * El metodo deleteNode borra el nodo que contiene la informacion del usuario
         * @param root
         * @param id
         * @return root
         */
        private Node deleteNode(Node root, int id) {
            if (root == null) {
                return null;
            }

            if (id < root.value.id) {
                root.leftChild = deleteNode(root.leftChild, id);
            }
            else if (id > root.value.id) {
                root.rightChild = deleteNode(root.rightChild, id);
            }
            else {
                if (root.leftChild == null) {
                    return root.rightChild;
                }
                else if (root.rightChild == null) {
                    return root.leftChild;
                }

                Node temp = findMinNode(root.rightChild);
                root.value = temp.value;
                root.rightChild = deleteNode(root.rightChild, temp.value.id);
            }
            return root;
        }

        /**
         * El metodo findMinNode obtiene el nodo con menor valor
         * @param node
         * @return
         */
        private Node findMinNode(Node node) {
            while (node.leftChild != null) {
                node = node.leftChild;
            }
            return node;
        }
    }

}
