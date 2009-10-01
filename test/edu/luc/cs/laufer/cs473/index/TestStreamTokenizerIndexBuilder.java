package edu.luc.cs.laufer.cs473.index;

import static edu.luc.cs.laufer.cs473.index.Constants.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.io.StreamTokenizer;
import java.io.StringReader;

import org.junit.Test;

/**
 * @author laufer
 * 
 */
public class TestStreamTokenizerIndexBuilder {

	/**
	 * Test method for
	 * {@link edu.luc.cs.laufer.cs473.index.StreamTokenizerIndexBuilder#StreamTokenizerIndexBuilder(java.io.StreamTokenizer)}.
	 */
	@Test
	public void testStreamTokenizerIndexBuilder() {
		try {
			new StreamTokenizerIndexBuilder(null);
			fail("expected assertion != null");
		} catch (IllegalArgumentException e) {
		}
	}

	/**
	 * Test method for
	 * {@link edu.luc.cs.laufer.cs473.index.StreamTokenizerIndexBuilder#build(edu.luc.cs.laufer.cs473.index.Index)}.
	 */
	@Test
	public void testBuild() {
		StreamTokenizerIndexBuilder builder = new StreamTokenizerIndexBuilder(
				new StreamTokenizer(new StringReader(s7)));
		Index index = new DefaultIndexImpl();
		builder.build(index);
		assertEquals(s7index, index);
	}

	/**
	 * Test method for
	 * {@link edu.luc.cs.laufer.cs473.index.StreamTokenizerIndexBuilder#build(edu.luc.cs.laufer.cs473.index.Index)}.
	 */
	@Test
	public void testBuild2() {
		StreamTokenizerIndexBuilder builder = new StreamTokenizerIndexBuilder(
				new StreamTokenizer(new StringReader(s8)));
		Index index = new DefaultIndexImpl();
		builder.build(index);
		assertEquals(s8index, index);
	}

}
