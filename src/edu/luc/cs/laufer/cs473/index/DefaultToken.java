package edu.luc.cs.laufer.cs473.index;

/**
 * A simple immutable token.
 * 
 * @author laufer
 */
public class DefaultToken implements Token {

	/**
	 * Constructs a token from a word and line number.
	 * 
	 * @param word
	 *            the word
	 * @param line
	 *            the line number
	 */
	public DefaultToken(final String word, final int line) {
		if (word == null)
			throw new IllegalArgumentException("word == null");
		if (line <= 0)
			throw new IllegalArgumentException("line <= 0");
		// TODO your job; also add any necessary fields
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see edu.luc.cs.laufer.index.Token#getLine()
	 */
	@Override
	public int getLine() {
		// TODO your job
		return -1;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see edu.luc.cs.laufer.index.Token#getWord()
	 */
	@Override
	public String getWord() {
		// TODO your job
		return null;
	}

	private static final long serialVersionUID = 5320093356413218994L;
}
