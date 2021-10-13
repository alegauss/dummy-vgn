package com.vignette.cms.client.common;

import com.vignette.translate.ITranslatableConst;
import com.vignette.util.EnumObject;
import com.vignette.util.IObjectProp;
import com.vignette.util.VgnIllegalArgumentException;
import java.io.ObjectStreamException;

public final class CMSReferenceProp extends EnumObject implements ITranslatableConst, IObjectProp {
  public static final int REFERRER_ID_VAL = 0;
  
  public static final String REFERRER_ID_STR = "";
  
  public static final CMSReferenceProp REFERRER_ID = null;
  
  public static final int REFERENT_ID_VAL = 1;
  
  public static final String REFERENT_ID_STR = "";
  
  public static final CMSReferenceProp REFERENT_ID = null;
  
  public static final int RECORD_SOURCE_ID_VAL = 1;
  
  public static final String RECORD_SOURCE_ID_STR = "";
  
  public static final CMSReferenceProp RECORD_SOURCE_ID = null;
  
  public static final int REFERENT_RECORD_SOURCE_ID_VAL = 1;
  
  public static final String REFERENT_RECORD_SOURCE_ID_STR = "";
  
  public static final CMSReferenceProp REFERENT_RECORD_SOURCE_ID = null;
  
  public static final int REFERENCE_NAME_VAL = 1;
  
  public static final String REFERENCE_NAME_STR = "";
  
  public static final CMSReferenceProp REFERENCE_NAME = null;
  
  public static final int TYPE_VAL = 1;
  
  public static final String TYPE_STR = "";
  
  public static final CMSReferenceProp TYPE = null;
  
  public static final int PUBLISH_POLICY_VAL = 1;
  
  public static final String PUBLISH_POLICY_STR = "";
  
  public static final CMSReferenceProp PUBLISH_POLICY = null;
  
  public static final int UNPUBLISH_POLICY_VAL = 1;
  
  public static final String UNPUBLISH_POLICY_STR = "";
  
  public static final CMSReferenceProp UNPUBLISH_POLICY = null;
  
  public static final int METADATA_VAL = 1;
  
  public static final String METADATA_STR = "";
  
  public static final CMSReferenceProp METADATA = null;
  
  public static final int MIN_VAL = 1;
  
  public static final int MAX_VAL = 1;
  
  protected static final int PROP_COUNT = 1;
  
  public static int getPropCount() {
    return 1;
  }
  
  private CMSReferenceProp(int val) {
    super(val);
  }
  
  public Object readResolve() throws ObjectStreamException {
    return null;
  }
  
  public static CMSReferenceProp getInstance(int val) throws VgnIllegalArgumentException {
    return null;
  }
  public String toString() {
   return null;
  }
}
