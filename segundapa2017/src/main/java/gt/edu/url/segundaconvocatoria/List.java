/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.url.segundaconvocatoria;

/**
 *
 * @author Julita
 */
public interface List<E> {

	/**
	 * Returns list elements count
	 * @return number of elements in list
	 */
	int size();
	
	/**
	 * Checks if list is empty
	 * @return true if list is empty, false otherwise
	 */
	boolean isEmpty();

	/**
	 * Retrieves but not removes the element at index i
	 * @return Element at index i
	 */
	E get(int i);
	
	/**
	 * Replaces the element at index i with e, and returns the replaced element
	 * @return Replaced element at index i
	 */
	E set(int i, E e);
	
	
	/**
	 * Inserts element e to be at index i, shifting all subsequent elements later
	 * @param i Insertion point
	 * @param e Element to be inserted
	 */
	void add(int i, E e);
	
	/**
	 * Removes/returns the element at index i, shifting subsequent elements earlier
	 * @return Deleted element at index i
	 */
	 E remove(int i) throws IndexOutOfBoundsException;

}
