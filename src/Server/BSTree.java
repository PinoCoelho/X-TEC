package Server;

import Server.ServerApp;

public class BSTree {

    static class Node {
        ServerApp.Info value;
        Node leftChild;
        Node rightChild;

        public Node(ServerApp.Info value) {
            this.value = value;
            this.leftChild = null;
            this.rightChild = null;
        }
    }

    static class BinarySearchTree {
        Node root;
        int size;

        public BinarySearchTree() {
            this.size = 0;
            this.root = null;
        }

        public void insert(ServerApp.Info value) {
            Node newNode = new Node(value);

            if (root == null) {
                root = newNode;
                this.size++;
                return;
            }

            Node currentNode = root;
            while (true) {
                if (value.id < currentNode.value.id) {
                    if (currentNode.leftChild == null) {
                        currentNode.leftChild = newNode;
                        this.size++;
                        return;
                    }
                    currentNode = currentNode.leftChild;
                } else {
                    if (currentNode.rightChild == null) {
                        currentNode.rightChild = newNode;
                        this.size++;
                        return;
                    }
                    currentNode = currentNode.rightChild;
                }
            }
        }

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

        public void delete(int id) {
            root = deleteNode(root, id);
        }

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
                    this.size--;
                    return root.rightChild;
                }
                else if (root.rightChild == null) {
                    this.size--;
                    return root.leftChild;
                }

                Node temp = findMinNode(root.rightChild);
                root.value = temp.value;
                root.rightChild = deleteNode(root.rightChild, temp.value.id);
            }
            return root;
        }

        private Node findMinNode(Node node) {
            while (node.leftChild != null) {
                node = node.leftChild;
            }
            return node;
        }
    }

}
