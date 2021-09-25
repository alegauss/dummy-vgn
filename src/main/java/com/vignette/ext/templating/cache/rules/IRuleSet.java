package com.vignette.ext.templating.cache.rules;

import java.util.ArrayList;

public interface IRuleSet {
  String getName();
  
  String getDescription();
  
  String getUpdateAttrFilterName();
  
  ArrayList getRulesByCategory(String paramString);
  
  IInvalidationRule findMatchingRule(String paramString1, String paramString2, ArrayList paramArrayList, String paramString3);
}
