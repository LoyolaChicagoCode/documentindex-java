package edu.luc.cs.laufer.cs473.index;

import java.util.List;
import java.util.TreeMap;

/**
 * An efficient implementation of an index that keeps the index in alphabetical
 * order.
 * 
 * @author laufer
 * 
 */
public class DefaultIndexImpl extends TreeMap<String, List<Integer>> implements
		Index {

	/*
	 * (non-Javadoc)
	 * 
	 * @see edu.luc.cs.laufer.index.Index#add(java.lang.String, int)
	 */
	@Override
	public void add(final String word, final int line) {
		// TODO your job
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see edu.luc.cs.laufer.index.Index#frequency(java.lang.String)
	 */
	@Override
	public int frequency(final String word) {
		// TODO your job
		return -1;
	}

	private static final long serialVersionUID = 8119984256641351649L;
}
