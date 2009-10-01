package edu.luc.cs.laufer.cs473.index;

import static org.junit.Assert.fail;

import org.junit.Test;

/**
 * @author laufer
 * 
 */
public class TestStreamTokenizerIteratorAdapter {

	/**
	 * Test method for
	 * {@link edu.luc.cs.laufer.cs473.index.StreamTokenizerIteratorAdapter#StreamTokenizerIteratorAdapter(java.io.StreamTokenizer)}.
	 */
	@Test
	public void testStreamTokenizerIteratorAdapter() {
		try {
			new StreamTokenizerIteratorAdapter(null);
			fail("expected assertion != null");
		} catch (IllegalArgumentException e) {

		}
	}

	/**
	 * Test method for
	 * {@link edu.luc.cs.laufer.cs473.index.StreamTokenizerIteratorAdapter}.
	 */
	@Test
	public void testBuild() {
		// TODO your job: create a STIA, then wrap a TIIB around it and build
		// index
		fail("not yet implemented");
	}

	/**
	 * Test method for
	 * {@link edu.luc.cs.laufer.cs473.index.StreamTokenizerIteratorAdapter}.
	 */
	@Test
	public void testBuild2() {
		// TODO your job: see testBuild()
		fail("not yet implemented");
	}

}
