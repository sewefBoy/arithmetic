package com.hyx.arithmetic;
/**
 * 模拟ArrayList 
 * @author sewef
 *
 */
public class ArrayList {
	private Object[] obj = new Object[4];
	private int size = 0;

	public int size() {
		return size;
	}

	public void add(Object value) {
		if (obj.length == size) {
			Object[] temp = new Object[size * 3 / 2 + 1];
			for (int i = 0; i < obj.length; i++) {
				temp[i] = obj[i];
			}
			obj = temp;
		}
		obj[size++] = value;
	}

	public Object get(int index) {
		if (index >= size || index == -1) {
			throw new RuntimeException("越界");
		}
		return obj[index];
	}

	public void set(int index, Object value) {
		if (index >= size || index == -1) {
			throw new RuntimeException("越界");
		}
		obj[index] = value;
	}

	public void clear() {
		for(int i=0;i<size;i++) {
			obj[i] = null;
		}
		size = 0;
	}

	public void remove(int index) {
		if (index >= size || index == -1) {
			throw new RuntimeException("越界");
		}
		for (int i = index; i < size; i++) {
			obj[i] = obj[i + 1];
		}
		size--;
	}
}
