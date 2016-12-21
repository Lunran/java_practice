package com.sample;

import java.util.EmptyStackException;

/**
 * Simple Implementation of Stack
 *
 */
public class Stack 
{
	private int[] value = new int[10];
	private int size = 0;

	public static void main( String[] args )
	{
		System.out.println( "Hello World!" );
	}

	public int size()
	{
		return size;
	}

	public boolean isEmpty()
	{
		return size == 0;
	}

	public void push(int value)
	{
		this.value[size] = value;
		size++;
	}

	public void pop()
	{
		checkEmpty();
		size--;
	}

	public int top()
	{
		checkEmpty();
		return value[size-1];
	}

	private void checkEmpty() {
		if (isEmpty()) {
			throw new EmptyStackException();
		}
	}
}
