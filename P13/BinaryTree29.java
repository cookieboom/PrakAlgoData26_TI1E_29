package P13;

public class BinaryTree29 {
    Node29 root;

    public BinaryTree29() {
        root = null;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void add(Mahasiswa29 mahasiswa) {
        Node29 newNode = new Node29(mahasiswa);
        if (isEmpty()) {
            root = newNode;
        } else {
            Node29 current = root;
            Node29 parent = null;
            while (true) {
                parent = current;
                if (mahasiswa.ipk < current.mahasiswa.ipk) {
                    current = current.left;
                    if (current == null) {
                        parent.left = newNode;
                        return;
                    }
                } else {
                    current = current.right;
                    if (current == null) {
                        parent.right = newNode;
                        return;
                    }
                }
            }
        }
    }

    boolean find(double ipk) {
        boolean result = false;
        Node29 current = root;
        while (current != null) {
            if (current.mahasiswa.ipk == ipk) {
                result = true;
                break;
            } else if (ipk > current.mahasiswa.ipk) {
                current = current.right;
            } else {
                current = current.left;
            }
        }
        return result;
    }

    void traversePreOrder(Node29 node) {
        if (node != null) {
            node.mahasiswa.tampilInformasi();
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    void traverseInOrder(Node29 node) {
        if (node != null) {
            traverseInOrder(node.left);
            node.mahasiswa.tampilInformasi();
            traverseInOrder(node.right);
        }
    }

    void traversePostOrder(Node29 node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            node.mahasiswa.tampilInformasi();
        }
    }

    Node29 getSuccessor(Node29 del) {
        Node29 successor = del.right;
        Node29 successorParent = del;
        while (successor.left != null) {
            successorParent = successor;
            successor = successor.left;
        }
        if (successor != del.right) {
            successorParent.left = successor.right;
            successor.right = del.right;
        }
        return successor;
    }

    void delete(double ipk) {
        if (isEmpty()) {
            System.out.println("Binary tree kosong");
            return;
        }

        //cari node (current) yang akan dihapus
        Node29 parent = root;
        Node29 current = root;
        boolean isLeftChild = false;
        while (current != null) {
            if (current.mahasiswa.ipk == ipk) {
                break;
            } else if (ipk < current.mahasiswa.ipk) {
                parent = current;
                current = current.left;
                isLeftChild = true;
            } else if (ipk > current.mahasiswa.ipk) {
                parent = current;
                current = current.left;
                isLeftChild =false;
            }
        }

        //penghapusan
        if (current == null) {
            System.out.println("Data tidak ditemukan");
            return;
        } else {
            //jika tidak ada anak (leaf), maka node dihapus
            if (current.left == null && current.right == null) {
                if (current == root) {
                    root = null;
                } else {
                    if (isLeftChild) {
                        parent.left = null;
                    } else {
                        parent.right = null;
                    }
                }
            } else if (current.left == null) {//jika hanya punya 1 anak (kanan)
                if (current == root) {
                    root = current.right;
                } else {
                    if (isLeftChild) {
                        parent.right = current.right;
                    } else {
                        parent.right = current.right;
                    }
                }                
            } else if (current.right == null) {//jika hanya punya 1 anak (kiri)
                if (current == root) {
                    root = current.left;
                } else {
                    if (isLeftChild) {
                        parent.left = current.left;
                    } else {
                        parent.right = current.left;
                    }
                }
            } else {//jika punya 2 anak
                Node29 successor = getSuccessor(current);
                System.out.println("Jika 2 anak, current = ");
                successor.mahasiswa.tampilInformasi();
                if (current == root) {
                    root = successor;
                } else {
                    if (isLeftChild) {
                        parent.left = successor;
                    } else {
                        parent.right = successor;
                    }
                }
                successor.left = current.left;
            }
        }
    }

    void addRekursif(Mahasiswa29 mahasiswa) {
        root = addRekursifHelper(root, mahasiswa);
    }

    private Node29 addRekursifHelper(Node29 node, Mahasiswa29 mahasiswa) {
        if (node == null) {
            return new Node29(mahasiswa);
        }
        
        if (mahasiswa.ipk < node.mahasiswa.ipk) {
            node.left = addRekursifHelper(node.left, mahasiswa);
        } else {
            node.right = addRekursifHelper(node.right, mahasiswa);
        }
        
        return node;
    }

    Mahasiswa29 cariMinIPK() {
        if (isEmpty()) {
            return null;
        }
        Node29 current = root;
        while (current.left != null) {
            current = current.left;
        }
        return current.mahasiswa;
    }

    Mahasiswa29 cariMaxIPK() {
        if (isEmpty()) {
            return null;
        }
        Node29 current = root;
        while (current.right != null) {
            current = current.right;
        }
        return current.mahasiswa;
    }

    void tampilMahasiswaIPKdiAtas(double ipkBatas) {
        System.out.println("Mahasiswa dengan IPK di atas " + ipkBatas + ":");
        tampilIPKdiAtasHelper(root, ipkBatas);
    }

    private void tampilIPKdiAtasHelper(Node29 node, double ipkBatas) {
        if (node != null) {
            tampilIPKdiAtasHelper(node.left, ipkBatas);
            if (node.mahasiswa.ipk >= ipkBatas) {
                node.mahasiswa.tampilInformasi();
            }
            tampilIPKdiAtasHelper(node.right, ipkBatas);
        }
    }
}