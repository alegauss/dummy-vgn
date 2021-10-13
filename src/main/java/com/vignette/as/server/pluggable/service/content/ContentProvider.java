package com.vignette.as.server.pluggable.service.content;

import com.vignette.as.server.pluggable.service.Code;
import com.vignette.as.server.pluggable.service.Provider;
import com.vignette.as.server.pluggable.service.ProviderBean;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public interface ContentProvider<T extends ContentProvider.Properties> extends Provider<T> {
  <O extends Options> O getOptions();
  
  List<String> getTypes();
  
  <N extends Node> Results<N> getRootNodes(Options paramOptions);
  
  <I extends Item> I getItem(ItemId paramItemId);
  
  Code.Codec<String> getTypeCodec();
  
  List<Locale> getSupportedLocales();
  
  public static interface Results<I extends Item> {
    List<I> getItems();
    
    int getTotalResultsSize();
  }
  
  public static interface Options {
    public static final int DEFAULT_PAGE_SIZE = 20;
    
    int getPageSize();
    
    void setPageSize(int param1Int);
    
    int getPageStart();
    
    void setPageStart(int param1Int);
  }
  
  public static interface Node extends Item {
    Node getSuperNode();
    
    <N extends Node> ContentProvider.Results<N> getSubNodes(ContentProvider.Options param1Options);
    
    <I extends ContentProvider.Item> ContentProvider.Results<I> getItems(ContentProvider.Options param1Options);
  }
  
  public static interface Item extends ProviderBean {
    ItemId getItemId();
    
    String getName();
    
    String getType();
    
    Locale getLocale();
    
    Map<String, String> getData();
    
    boolean isNode();
  }
  
  public static interface Properties extends Provider.Properties {
    public static final String DEFAULT_LOCALE_PROPERTY = "";
    
    public static final String DEFAULT_LOCALE_DEFAULT = "";
    
    Locale getDefaultLocale();
  }
}
