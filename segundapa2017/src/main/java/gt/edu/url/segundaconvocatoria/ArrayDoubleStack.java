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
public class ArrayDoubleStack<E> implements DoubleStack<E> {
    
    public static final int CAPACITY=1000;
    ArrayStack<E> datos = new ArrayStack();
	private E[] data;
	private int t=-1;
        int size = -1;
        int rojo = 0;
        int azul = 0;
	
	public ArrayDoubleStack() {
		this(CAPACITY);
	}

	public ArrayDoubleStack(int capacity) {
		data = (E[]) new Object[capacity];
	}

	public int redSize(){
		return rojo++;
	}
        public int blueSize(){
		return azul++;
	}

	public boolean isEmpty() {
		return (t == -1);
	}

	public void redPush(E e) {
            rojo++;
            datos.push(e);
	}
        public void bluePush(E e) {
            azul++;
            datos.push(e);
	}
        
        public E get(int i) {
		checkIndex(i, size);
		return data[i];
	}
        public E remove(int i) throws IndexOutOfBoundsException {
		checkIndex(i, size);
		E temp = data[i];
		for (int k=i; k < size-1; k++)
			data[k] = data[k+1];
		data[size-1] = null;
		size--;
		return temp;
	}

	public E redTop() {
            if (isEmpty()) return null;
            for (int i = datos.size(); 0 > i; i--){
                if (datos.get(i) == "red")
                    return datos.get(i);
            }
		return data[t];
	}
        
        public E blueTop() {
		if (isEmpty()) return null;
                for (int i = datos.size(); 0 > i; i--){
                if (datos.get(i) == "blue")
                    return datos.get(i);
            }
		return data[t];
	}

	public E redPop() {
		if (isEmpty()) return null;
		for (int i = datos.size(); 0 > i; i--){
                    if (datos.get(i) == "red")
                        E dato = datos.get(i);
                        datos.remove(i);
                        return dato;
                }
	}
        
        public E bluePop() {
		if (isEmpty()) return null;
		for (int i = datos.size(); 0 > i; i--){
                    if (datos.get(i) == "blue")
                        E dato = datos.get(i);
                        datos.remove(i);
                        return dato;
                }
	}
        
        protected void checkIndex(int i, int n) throws IndexOutOfBoundsException {
		if (i < 0 || i >= n)
		throw new IndexOutOfBoundsException("Illegal index: " + i);
	}
}
