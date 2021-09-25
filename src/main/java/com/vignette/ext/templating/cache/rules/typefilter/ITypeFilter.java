package com.vignette.ext.templating.cache.rules.typefilter;

public interface ITypeFilter extends IBaseFilter {
  String getFullName(String paramString);
  
  boolean hasAttrFilter(String paramString);
}
