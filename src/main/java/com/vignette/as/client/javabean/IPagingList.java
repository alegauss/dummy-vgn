package com.vignette.as.client.javabean;

import com.vignette.as.client.common.RequestParameters;
import com.vignette.as.client.exception.ApplicationException;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;

public interface IPagingList extends Serializable {
  List asList() throws ApplicationException;
  
  List subList(int paramInt1, int paramInt2) throws ApplicationException;
  
  List subList(RequestParameters paramRequestParameters) throws ApplicationException;
  
  Object get(int paramInt) throws ApplicationException;
  
  int size() throws ApplicationException;
  
  Iterator pageIterator(int paramInt) throws ApplicationException;
}
