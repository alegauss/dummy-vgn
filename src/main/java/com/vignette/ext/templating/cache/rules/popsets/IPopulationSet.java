package com.vignette.ext.templating.cache.rules.popsets;

import com.vignette.as.server.event.AsDeploymentEvent;
import java.util.ArrayList;

public interface IPopulationSet {
  String getName();
  
  String getFullName(String paramString);
  
  ArrayList getInvalidatedGroups(AsDeploymentEvent paramAsDeploymentEvent);
  
  boolean isValidForType(String paramString);
  
  void clear();
}
