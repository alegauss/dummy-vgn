package com.vignette.as.client.javabean;

import com.vignette.as.client.common.AttributeData;
import com.vignette.as.client.common.ManagedObjectStatus;
import com.vignette.as.client.common.ref.AsLocaleRef;
import com.vignette.as.client.common.ref.ContentTypeRef;
import com.vignette.as.client.common.ref.ManagedObjectVCMRef;
import com.vignette.as.client.exception.ApplicationException;
import com.vignette.as.client.exception.AuthorizationException;
import com.vignette.as.client.exception.ValidationException;
import com.vignette.cms.client.common.ObjectId;
import com.vignette.ext.templating.client.javabean.PresentationFormat;
import com.vignette.ext.templating.util.RequestContext;
import com.vignette.logging.LoggingManager;
import com.vignette.logging.context.ContextLogger;
import com.vignette.util.VgnIllegalArgumentException;
import java.io.Serializable;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TargetingRule extends ContentInstance {
  protected static final ContextLogger log = LoggingManager.getContextLogger(TargetingRule.class);
  
  private static final String appObjID = "";
  
  public static final String CONTENT_TYPE_NAME = "";
  
  public static final String RELATION_TARGETINGRULE_CONDITION = "";
  
  public static final String RELATION_TARGETINGRULE_TERM = "";
  
  public static final String RELATION_TARGETINGRULE_PARAMETERS = "";
  
  public static final String ATTR_RULE_ID = "";
  
  public static final String ATTR_RULE_NAME = "";
  
  public static final String ATTR_RULE_DESCRIPTION = "";
  
  public static final String ATTR_CONDITION_RULE_ID = "";
  
  public static final String ATTR_CONDITION_ID = "";
  
  public static final String ATTR_CONDITION_ORDER = "";
  
  public static final String ATTR_CONDITION_DISPLAY = "";
  
  public static final String ATTR_CONDITION_DISPLAY_ID = "";
  
  public static final String ATTR_TERM_CONDITION_ID = "";
  
  public static final String ATTR_TERM_ID = "";
  
  public static final String ATTR_TERM_ORDER = "";
  
  public static final String ATTR_TERM_PARAM_TYPE = "";
  
  public static final String ATTR_TERM_PARAM_EQUALS = "";
  
  public static final String ATTR_PARAM_TERM_ID = "";
  
  public static final String ATTR_PARAM_ORDER = "";
  
  public static final String ATTR_PARAM_VALUE_ID = "";
  
  public static final String DEFAULT_LOGICAL_PATH = "";
  
  public static final String DEFAULT_LOGICAL_PATH_ID = "";
  
  public static ContentTypeRef getContentTypeRef() {
   return null;
  }
  
  public static String getDefaultLogicalPath() throws ApplicationException {
    return null;
  }
  
  public static ObjectId getDefaultLogicalPathId() throws ApplicationException {
    return null;
  }
  
  public void init() {
  
  }
  
  public void manageStatus() {
   
  }
  
  private Rule rule = null;
  
  public Rule getRule() throws AuthorizationException, ValidationException, ApplicationException {
    return null;
  }
  
  public Result evaluate(RequestContext context) throws AuthorizationException, ValidationException, ApplicationException {
    return null;
  }
  
  private AsLocale getEffectiveLocale(RequestContext context) throws AuthorizationException, ValidationException, ApplicationException {
    return null;
  }
  
  private PresentationFormat getEffectiveFormat(RequestContext context) throws AuthorizationException, ValidationException, ApplicationException {
    return null;
  }
  
  public Set<ManagedObjectVCMRef> getReferredSegmentIds() throws AuthorizationException, ValidationException, ApplicationException {
    return null;
  }
  
  private static boolean getBoolean(Object value) {
    return true;
  }
  
  public static class Result implements Serializable {
    private static final long serialVersionUID = 4602688524923114892L;
    
    private boolean display;
    
    private String displayId;
    
    private String conditionId;
    
    public boolean isDisplay() {
        return true;
    }
    
    protected void setDisplay(boolean display) {
      
    }
    
    public String getDisplayId() {
        return null;
    }
    
    protected void setDisplayId(String displayId) {
      
    }
    
    public String getConditionId() {
        return null;
    }
    
    protected void setConditionId(String conditionId) {
      
    }
    
    public String toString() {
        return null;
    }
  }
  
  public static class Rule implements Serializable {
    private static final long serialVersionUID = 2004733323959710253L;
    
    private String id;
    
    public String getId() {
        return null;
    }
    
    protected void setId(String id) {
      
    }
    
    private List<TargetingRule.Condition> conditions = new ArrayList<TargetingRule.Condition>();
    
    public List<TargetingRule.Condition> getConditions() {
        return null;
    }
    
    private Set<ManagedObjectVCMRef> segments = new HashSet<ManagedObjectVCMRef>();
    
    public Set<ManagedObjectVCMRef> getSegments() {
        return null;
    }
    
    private Rule(TargetingRule targetingRule) throws ValidationException, ApplicationException {
      
    }
    
    private TargetingRule.Result evaluate(Map<TargetingRule.Term.Type, Set<String>> actualsMap) {
        return null;
    }
    
    public String toString() {
        return null;
    }
  }
  
  public static class Condition implements Serializable {
    private static final long serialVersionUID = -3053252501887130657L;
    
    private String id;
    
    private TargetingRule.Result result;
    
    public String getId() {
        return null;
    }
    
    protected void setId(String id) {
      
    }
    
    public TargetingRule.Result getResult() {
        return null;
    }
    
    protected void setResult(TargetingRule.Result result) {
      
    }
    
    List<TargetingRule.Term> terms = new ArrayList<TargetingRule.Term>();
    
    public List<TargetingRule.Term> getTerms() {
        return null;
    }
    
    private Condition(AttributedObject conditionObject) throws ValidationException, ApplicationException {
      
    }
    
    public TargetingRule.Result evaluate(Map<TargetingRule.Term.Type, Set<String>> actualsMap) {
        return null;
    }
    
    public String toString() {
        return null;
    }
  }
  
  public static class Term implements Serializable {
    private static final long serialVersionUID = -307102234805808848L;
    
    private String id;
    
    private boolean equals;
    
    private Type type;
    
    public enum Type {
      Locale(""),
      Format(""),
      Segment("");
      
      private String paramType;
      
      public String toString() {
        return null;
      }
      
      Type(String paramType) {
      }
      
      public static Type getInstance(String val) throws VgnIllegalArgumentException {
        return null;
      }
    }
    
    public String getId() {
        return null;
    }
    
    protected void setId(String id) {
     
    }
    
    public boolean isEquals() {
      return true;
    }
    
    protected void setEquals(boolean equals) {
      
    }
    
    public Type getType() {
        return null;
    }
    
    protected void setType(Type type) {
      
    }
    
    private List<String> parameters = new ArrayList<String>();
    
    public List<String> getParameters() {
        return null;
    }
    
    private Term(AttributedObject termObject) throws ValidationException, ApplicationException {
     
    }
    
    public boolean evaluate(Map<Type, Set<String>> actualsMap) {
        return true;
    }
    
    public String toString() {
        return null;
    }
  }
  
  public enum Type {
    Locale(""),
    Format(""),
    Segment("");
    
    private String paramType;
    
    public String toString() {
        return null;
    }
    
    Type(String paramType) {
     
    }
    
    public static Type getInstance(String val) throws VgnIllegalArgumentException {
        return null;
    }
  }
}
