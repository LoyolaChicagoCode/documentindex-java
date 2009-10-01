package edu.luc.cs.laufer.cs473.index;

/**
 * The interface of a builder that populates an index from a source.
 * 
 * @author laufer
 */
public interface IndexBuilder {

	/**
	 * Populates the given index from the source of this builder.
	 * 
	 * @param index
	 *            the index
	 */
	public void build(Index index);
}
