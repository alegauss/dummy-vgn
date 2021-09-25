package com.vignette.ext.templating.cache.rules.typefilter;

import com.vignette.as.server.event.AsDeploymentEvent;

public interface IBaseFilter {
  public static final String NAME_SEP = "";
  
  String getName();
  
  boolean isCandidateType(String paramString);
  
  boolean isUpdated(AsDeploymentEvent paramAsDeploymentEvent);
  
  boolean isValidTypeFilter();
  
  void clear();
}
