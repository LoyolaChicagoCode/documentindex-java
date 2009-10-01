package edu.luc.cs.laufer.cs473.index;

import static edu.luc.cs.laufer.cs473.index.Constants.s7;
import static edu.luc.cs.laufer.cs473.index.Constants.s7index;
import static edu.luc.cs.laufer.cs473.index.Constants.s8;
import static edu.luc.cs.laufer.cs473.index.Constants.s8index;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.List;

import org.junit.Test;

/**
 * @author laufer
 * 
 */
public class TestTokenIteratorIndexBuilder {

	/**
	 * Test method for
	 * {@link edu.luc.cs.laufer.cs473.index.TokenIteratorIndexBuilder#TokenIteratorIndexBuilder(java.util.Iterator)}.
	 */
	@Test
	public void testTokenIteratorIndexBuilder() {
		try {
			new StreamTokenizerIndexBuilder(null);
			fail("expected assertion != null");
		} catch (IllegalArgumentException e) {
		}
	}

	/**
	 * Test method for
	 * {@link edu.luc.cs.laufer.cs473.index.TokenIteratorIndexBuilder#build(edu.luc.cs.laufer.cs473.index.Index)}.
	 */
	@Test
	public void testBuild() throws Exception {
		TokenIteratorIndexBuilder builder = new TokenIteratorIndexBuilder(
				stringToList(s7).iterator());
		Index index = new DefaultIndexImpl();
		builder.build(index);
		assertEquals(s7index, index);
	}

	/**
	 * Test method for
	 * {@link edu.luc.cs.laufer.cs473.index.TokenIteratorIndexBuilder#build(edu.luc.cs.laufer.cs473.index.Index)}.
	 */
	@Test
	public void testBuild2() throws Exception {
		TokenIteratorIndexBuilder builder = new TokenIteratorIndexBuilder(
				stringToList(s8).iterator());
		Index index = new DefaultIndexImpl();
		builder.build(index);
		assertEquals(s8index, index);
	}

	/**
	 * Converts a string to a list of tokens.
	 * 
	 * @param string
	 *            the input string
	 * @return the resulting list of tokens
	 */
	private List<Token> stringToList(final String string) {
		// TODO your job
		// follow Main.main but put the tokens into a suitable list
		return null;
	}
}
