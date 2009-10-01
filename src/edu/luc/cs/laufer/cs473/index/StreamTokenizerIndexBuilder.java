package edu.luc.cs.laufer.cs473.index;

import java.io.IOException;
import java.io.StreamTokenizer;

/**
 * An index builder that populates an index from a source represented by a
 * StreamTokenizer.
 * 
 * @author laufer
 * 
 */
public class StreamTokenizerIndexBuilder implements IndexBuilder {

	/**
	 * Constructs a builder for the given StreamTokenizer.
	 * 
	 * @param source
	 *            the StreamTokenizer representing the source
	 */
	public StreamTokenizerIndexBuilder(final StreamTokenizer source) {
		if (source == null)
			throw new IllegalArgumentException("source == null");
		// TODO your job; also add any necessary fields
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see edu.luc.cs.laufer.index.IndexBuilder#build()
	 */
	@Override
	public void build(Index index) {
		try {
			// TODO your job
			if (false)
				throw new IOException(); // TODO get rid of this when done
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

}
