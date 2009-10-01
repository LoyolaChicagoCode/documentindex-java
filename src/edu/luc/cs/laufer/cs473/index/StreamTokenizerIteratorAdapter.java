package edu.luc.cs.laufer.cs473.index;

import java.io.IOException;
import java.io.StreamTokenizer;
import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * An adapter that makes a StreamTokenizer look like an Iterator.
 * 
 * @author laufer
 */
public class StreamTokenizerIteratorAdapter implements Iterator<Token> {

	/**
	 * Constructs an adapter for the given StreamTokenizer.
	 * 
	 * @param source
	 *            the StreamTokenizer
	 */
	public StreamTokenizerIteratorAdapter(final StreamTokenizer source) {
		if (source == null)
			throw new IllegalArgumentException("source == null");
		// TODO your job; also add any necessary fields
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.Iterator#hasNext()
	 */
	@Override
	public boolean hasNext() {
		// TODO your job
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.Iterator#next()
	 */
	@Override
	public Token next() {
		// TODO your job
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.Iterator#remove()
	 */
	@Override
	public void remove() {
		throw new UnsupportedOperationException();
	}
}
