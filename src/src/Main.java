import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] Args) throws FileNotFoundException {
        ///////////////Homework Lists////////////////////
        /*
        // TODO main

        //////// Question 1 ////////////
//        DynamicList myList1 = new DynamicList();
//        DynamicList myList2 = new DynamicList();
//
//        myList1.insertFirst(3);
//        myList1.insertFirst(5);
//        myList1.insertFirst(8);
//        myList1.insertFirst(7);
//
//
//        myList2.insertFirst(2);
//        myList2.insertFirst(6);
//        myList2.insertFirst(9);
//        myList2.insertFirst(4);


//        myList1.appendList(myList2);
//        myList1.printList();


        //////// Question 2 ////////////

        DynamicList myList3 = new DynamicList();
        myList3.insertFirst(1);

        myList3.searchInsert(1);
        myList3.printList();

//        DynamicList myList4 = new DynamicList();
//        DynamicList myList5 = new DynamicList();
//        DynamicList myList6 = new DynamicList();
//        DynamicList myList7 = new DynamicList();
//        DynamicList myList8 = new DynamicList();
//        DynamicList myList9 = new DynamicList();
//
//        myList4.insertLast(1);
//        myList4.insertLast(2);
//        myList4.insertLast(3);
//        myList4.insertLast(4);
//
//
//        myList5.insertLast(1);
//        myList5.insertLast(2);
//        myList5.insertLast(3);
//        myList5.insertLast(4);
//        myList5.insertLast(5);
//
//        myList6.insertLast(1);
//        myList6.insertLast(2);
//        myList6.insertLast(3);
//        myList6.insertLast(4);
//        myList6.insertLast(5);
//        myList6.insertLast(6);
//
//        myList7.insertLast(1);
//        myList7.insertLast(2);
//        myList7.insertLast(3);
//
//        myList8.insertLast(1);
//        myList8.insertLast(2);
//
//        myList9.insertLast(1);
//
//
//
//        myList4.mystery();
//        myList5.mystery();
//        myList6.mystery();
//        myList7.mystery();
//        myList8.mystery();
//        myList9.mystery();
//
//
//        myList9.printList();
//        myList8.printList();
//        myList7.printList();
//        myList4.printList();
//        myList5.printList();
//        myList6.printList();
*/

        ////////////////Homework queues//////////////////////////

        /*
        DynamicQueue[] queues = new DynamicQueue[4];
        queues[0] = new DynamicQueue();
        queues[1] = new DynamicQueue();
        queues[2] = new DynamicQueue();
        queues[3] = new DynamicQueue();

        File text = new File("C:\\Users\\xavier1120\\OneDrive - Florida Gulf Coast University\\COP 3530\\lists\\src\\src\\data.txt");

        Scanner textInput = new Scanner(text);

        // traverse the txt line by line
        while (textInput.hasNextLine()) {

            String line = textInput.nextLine();
            char key = line.charAt(0);
            int index = Integer.parseInt(line.substring(2));

            if (index == 0) {
                if (queues[index].search(key) == null) {
                    queues[index].insert(key);
                    check_size(queues[index],key,index);
                }else
                    move_if_in_Queue(queues[index],key);
                System.out.println("Queue 0:");
                queues[index].printQueue();
                System.out.println(" "); //just to make some space in output
            }
            if (index == 1) {
                if (queues[index].search(key) == null) {
                    queues[index].insert(key);
                    check_size(queues[index],key,index);
                }else
                    move_if_in_Queue(queues[index],key);
                System.out.println("Queue 1:");
                queues[1].printQueue();
                System.out.println(); //just to make some space in output
            }
            if (index == 2) {
                if (queues[index].search(key) == null) {
                    queues[index].insert(key);
                    check_size(queues[index],key,index);
                }else
                    move_if_in_Queue(queues[index],key);
                System.out.println("Queue 2:");
                queues[index].printQueue();
                System.out.println(); //just to make some space in output
            }
            if (index == 3) {
                if (queues[index].search(key) == null) {
                    queues[index].insert(key);
                    check_size(queues[index], key, index);
                }
                else {
                    move_if_in_Queue(queues[index],key);
                }
                System.out.println("Queue 3:");
                queues[index].printQueue();
                System.out.println(); //just to make some space in output
            }
        }
        */

        /////////////////Lists Practice//////////////////
        /*
        DynamicList dynamicList = new DynamicList();

        dynamicList.insertFirst(1);
        dynamicList.insertLast(3);
        dynamicList.insertLast(5);
        dynamicList.insertLast(2);
        dynamicList.insertLast(2);
        dynamicList.insertLast(2);


        dynamicList.recursivePrint(dynamicList.search(1));

        dynamicList.printList();

        dynamicList.reverse();

        dynamicList.printList();
*/

        ////////////////Homework Tress////////////////////
        /*
        // build a tree out of nodes (use the jGRASP debugger to see its
        // structure)
        IntTreeNode root = new IntTreeNode('x');
        root.left = new IntTreeNode('a');
        root.left.left = new IntTreeNode('v');
        root.left.right = new IntTreeNode('i');
        root.right = new IntTreeNode('e');
        root.right.right = new IntTreeNode('N');
        root.right.left = new IntTreeNode('r');

        // set the tree's overall root as the root of the tree we just built
        IntTree tree = new IntTree(root);

        // use the jGRASP debugger to see the different traversal orders
        tree.printPreOrder();
        tree.printInOrder();
        tree.printPostOrder();
         */

        ////////////////Trees Lab////////////////////
        /*
        BinSearchTree st = new BinSearchTree();
        //example tree is taken from the slides Lecture 7-8
        st.insert(8);  //the root
        st.insert(3);
        //st.insert(1); st.insert(5); st.insert(6); st.insert(7);
        st.insert(11);
        st.insert(9);
        st.insert(10);
        st.insert(14);
        st.insert(12);
        st.insert(15);
        st.insert(13);
        System.out.println("\nTree: " + st.toString());

        //now delete different nodes
        int d = 11;
        System.out.println("\nDeleting " + d + " with replacement " + st.delete(d));
        System.out.println("Tree: " + st.toString());
        d = 8;
        System.out.println("\nDeleting " + d + " with replacement " + st.delete(d));
        System.out.println("Tree: " + st.toString());
        d = 3;
        System.out.println("\nDeleting " + d + " with replacement " + st.delete(3));
        System.out.println("Tree: " + st.toString());
*/

        ////////////////More Trees with recursion///////////
        /*
        int[] input = {4, 9, 15, 20, 22, 24, 35, 87};

        //1 - create the binary search tree given the sorted input
        SortedTree st = new SortedTree(input);

        //2 - print the tree node values inorder, see earlier practice etc.
        st.printInOrder();
        */

        /*
        int[] x = {31,7,74,19,68,22,87,35};
        BinSearchTree t = new BinSearchTree();
        t.quicksort(x,0,x.length - 1);
        printArray(x, x.length);
        */

        /*
        int[] x = {15,27,65,92,11,7,46,98,3,16,43,2,65,78,76,534,23,73,4,45,6};
        SortedTree st = new SortedTree(x);

        System.out.println("Number of Nodes in Tree: " + st.nodeCount(st.root));

        System.out.println("Number of Levels in Tree: " + st.height(st.root));

        System.out.println("Sum of Nodes in Tree: " + st.sumAll(st.root));
        */

        /*
        int[] x = {5, 7, 8, 3, 8, 10, 9, 17, 88, 44, 33, 22};

        SortedTree st = new SortedTree(x);

        st.buildTree(x, 0, x.length - 1);
        System.out.println(st.nodeCount(st.root));
        System.out.println(st.height(st.root));

        System.out.println();

        st.leafDelete(st.root);
        System.out.println(st.nodeCount(st.root));
        System.out.println(st.height(st.root));

        System.out.println();

        st.leafDelete(st.root);
        System.out.println(st.nodeCount(st.root));
        System.out.println(st.height(st.root));

        System.out.println();

        st.leafDelete(st.root);
        System.out.println(st.nodeCount(st.root));
        System.out.println(st.height(st.root));
        */

        /*
        int[] x = {3, 5, 7, 8, 9, 10, 17, 22, 33, 44, 88};

        SortedTree st = new SortedTree(x);
        st.buildTree(x,0,x.length-1);

        st.printInOrder();

        st.deleteRec(st.root,88);
        st.printInOrder();
         */




    }


    // Function to print an array
    public static void printArray(int[] arr, int size){
        for(int i = 0; i < size; i++)
            System.out.print(arr[i] + " ");

        System.out.println();
    }

    /*
    //check the size of the queue to make sure it doesnt go over the max size which is 4
    public static void check_size(DynamicQueue queue, char key, int index) {
        if (queue.queueSize >= queue.maxSize) {
            System.out.print("Read key " + key + " for queue " + index + ". " + "Q is full, " +
                    "removing front. Inserting " + key + " in rear.\n");
            queue.remove();
        } else
            System.out.print("Read key " + key + " for queue " + index + ". " + "Inserting " +
                    "" + key + " to the rear.\n");
    }

    // moves the node that is the same as the new node and holds it in a temporary value and then removes
    // the duplicate and places the temp at the rear
    public static void move_if_in_Queue(DynamicQueue queue, char key) {
        if (queue.search(key) != null) {
            queue.move(key);
            System.out.print("moving key " + key + " to rear.\n");
        } else
            System.out.println(key + " is already in rear");
    }
    */


}