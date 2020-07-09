/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dequemain;

import doublylinkedlist.DNode;

/**
 *
 * @author username
 */
public class DequeMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        DNode<String> node1 = new DNode<>(null, "Ryo", null);
        DNode<String> node2 = new DNode<>(null, "Yuri", null);
        DNode<String> node3 = new DNode<>(null, "Yuto", null);
        DNode<String> node4 = new DNode<>(null, "Kei", null);
        DNode<String> node5 = new DNode<>(null, "Ryu", null);

        DequeList<DNode> list = new DequeList<>();
        list.addFirst(node1);
        list.addFirst(node2);
        list.addFirst(node3);
        list.addFirst(node4);
        list.addLast(node5);

        try {
            System.out.println("Before Remove: ");
            list.showDeque();

            System.out.println();
            System.out.println("Remove First: " + list.removeFirst().getElement());
            System.out.print("After Remove: ");
            list.showDeque();

            System.out.println();
            System.out.println("Remove Last: " + list.removeLast().getElement());
            System.out.print("After Remove: ");
            list.showDeque();

            System.out.println();
            System.out.println("Remove Last: " + list.removeLast().getElement());
            System.out.print("After Remove: ");
            list.showDeque();

            System.out.println();
            System.out.println("Remove Last: " + list.removeLast().getElement());
            System.out.print("After Remove: ");
            list.showDeque();

            System.out.println();
            System.out.println("Remove Last: " + list.removeLast().getElement());
            System.out.print("After Remove: ");
            list.showDeque();

            System.out.println();
            System.out.println("Remove Last: " + list.removeLast().getElement());
            System.out.print("After Remove: ");
            list.showDeque();
        } catch (EmptyDequeException ex) {
            System.out.println(ex.getMessage());
        }
    } 
}
