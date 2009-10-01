package edu.luc.cs.laufer.cs473.index;

import java.util.Iterator;

/**
 * An index builder that populates an index from a source represented by an
 * iterator over tokens.
 * 
 * @author laufer
 */
public class TokenIteratorIndexBuilder implements IndexBuilder {

	/**
	 * Constructs a builder for the given iterator over tokens.
	 * 
	 * @param source
	 *            the iterator representing the source
	 */
	public TokenIteratorIndexBuilder(final Iterator<Token> source) {
		if (source == null)
			throw new IllegalArgumentException("source == null");
		// TODO your job; also add any necessary fields
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see edu.luc.cs.laufer.index.IndexBuilder#build(edu.luc.cs.laufer.index.Index)
	 */
	@Override
	public void build(final Index index) {
		// TODO your job
	}
}
