package com.vignette.as.client.javabean;

import com.vignette.as.client.exception.ApplicationException;

import java.util.Iterator;
import java.util.List;

public interface IPagingList {

	public List<Object> asList();

	public int size();

	public Iterator pageIterator(int pageSize) throws ApplicationException;
}
