/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dequemain;

import doublylinkedlist.DList;
import doublylinkedlist.DNode;

/**
 *
 * @author username
 * @param <E>
 */
public class DequeList<E> implements Deque<E> {
    
    private DList<E> deque;
    
    public DequeList() {
        deque = new DList<>();
    }
    
    public void addFirst(E e){
        deque.addFirst((DNode) e);
    }

    public void addLast(E e) {
        deque.addLast((DNode) e);
    }

    public E removeFirst() throws EmptyDequeException{
        if(deque.size() == 0){
            throw new EmptyDequeException();
        }
        return (E) deque.removeFirst();
    }

    public E removeLast() throws EmptyDequeException{
        if(deque.size() == 0){
            throw new EmptyDequeException();
        }
        return (E) deque.removeLast();
    }

    public E first() throws EmptyDequeException{
        if(deque.size() == 0){
            throw new EmptyDequeException();
        }
        return (E) deque.getHeader();
    }

    public E last() throws EmptyDequeException{
        if(deque.size() == 0){
            throw new EmptyDequeException();
        }
        return (E) deque.getTrailer();
    }

    public int size() {
        return deque.size();
    }

    public boolean isEmpty() {
        return deque.isEmpty();
    }
    
    public void showDeque(){
        deque.showList();
    }
}
