package com.sample;

import java.util.EmptyStackException;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple Stack.
 */
public class StackTest extends TestCase
{
	/**
	 * Create the test case
	 *
	 * @param testName name of the test case
	 */
	public StackTest( String testName )
	{
		super( testName );
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite()
	{
		return new TestSuite( StackTest.class );
	}

	/**
	 * Rigorous Test :-)
	 */
	Stack stack;

	public void setUp()
	{
		stack = new Stack();
	}

	public void testCreate()
	{
		assertTrue( stack.isEmpty() );
	}

	public void testEmptyPop()
	{
		try {
			stack.pop();
			fail();
		}
		catch (EmptyStackException expected) {
		}
	}

	public void testEmptyTop()
	{
		try {
			stack.top();
			fail();
		}
		catch (EmptyStackException expected) {
		}
	}

	public void testPushAndTop()
	{
		stack.push(1);
		assertFalse(stack.isEmpty());
		assertEquals(1, stack.top());
	}

	public void testPushAndSize()
	{
		stack.push(1);
		assertEquals(1, stack.size());
		stack.push(2);
		assertEquals(2, stack.size());
	}

	public void testPushAndPop()
	{
		stack.push(1);
		stack.pop();
		assertEquals(0, stack.size());
	}

	public void testPushPushPopTop()
	{
		stack.push(1);
		stack.push(2);
		assertEquals(2, stack.size());
		stack.pop();
		assertEquals(1, stack.top());
	}
}
