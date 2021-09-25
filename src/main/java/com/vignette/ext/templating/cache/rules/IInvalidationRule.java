package com.vignette.ext.templating.cache.rules;

import com.vignette.as.server.event.AsDeploymentEvent;
import com.vignette.ext.templating.cache.rules.popsets.IPopulationSet;
import com.vignette.ext.templating.cache.rules.typefilter.ITypeFilter;
import java.util.ArrayList;
import java.util.HashSet;

public interface IInvalidationRule {
  public static final String EVENT_CATEGORY_CREATE = "";
  
  public static final String EVENT_CATEGORY_UPDATE = "";
  
  public static final String EVENT_CATEGORY_DELETE = "";
  
  public static final String EVENT_CATEGORY_EXISTENCE = "";
  
  public static final String[] EVENT_CATEGORIES = new String[] { "" };
  
  public static final String RULE_ID_SEP = "";
  
  String getEventCategory();
  
  IPopulationSet getPopulationSet();
  
  ITypeFilter getTypeFilter();
  
  String getDescription();
  
  boolean isValidRule();
  
  boolean isValidForType(String paramString);
  
  String getDependency(String paramString1, String paramString2);
  
  int isMatch(String paramString1, ArrayList paramArrayList, String paramString2);
  
  void clear();
  
  void processEvent(AsDeploymentEvent paramAsDeploymentEvent, String paramString, HashSet paramHashSet);
}
