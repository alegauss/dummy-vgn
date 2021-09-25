package com.vignette.as.client.common.wrapper;

import com.vignette.as.client.common.AsObjectType;
import com.vignette.translate.ITranslatableConst;
import com.vignette.util.EnumObject;
import com.vignette.util.VgnIllegalArgumentException;
import java.io.ObjectStreamException;

public class ThumbnailClass extends EnumObject implements ITranslatableConst {
  public static final int SYSTEM_VAL = 0;
  
  public static final String SYSTEM_STR = "";
  
  public static final String SYSTEM_DEFAULT_FILE = "";
  
  public static final ThumbnailClass SYSTEM = null;
  
  public static final int PROJECT_VAL = 1;
  
  public static final String PROJECT_STR = "";
  
  public static final String PROJECT_DEFAULT_FILE = "";
  
  public static final ThumbnailClass PROJECT = null;
  
  public static final int CATEGORY_VAL = 2;
  
  public static final String CATEGORY_STR = "";
  
  public static final String CATEGORY_DEFAULT_FILE = "";
  
  public static final ThumbnailClass CATEGORY = null;
  
  public static final int OBJECTTYPE_VAL = 3;
  
  public static final String OBJECTTYPE_STR = "";
  
  public static final String OBJECTTYPE_DEFAULT_FILE = "";
  
  public static final ThumbnailClass OBJECTTYPE = null;
  
  public static final int SITE_VAL = 4;
  
  public static final String SITE_STR = "";
  
  public static final String SITE_DEFAULT_FILE = "";
  
  public static final ThumbnailClass SITE = null;
  
  public static final int CHANNEL_VAL = 5;
  
  public static final String CHANNEL_STR = "";
  
  public static final String CHANNEL_DEFAULT_FILE = "";
  
  public static final ThumbnailClass CHANNEL = null;
  
  public static final int CONTENTTYPE_VAL = 6;
  
  public static final String CONTENTTYPE_STR = "";
  
  public static final String CONTENTTYPE_DEFAULT_FILE = "";
  
  public static final ThumbnailClass CONTENTTYPE = null;
  
  public static final int CONTENTINSTANCE_VAL = 7;
  
  public static final String CONTENTINSTANCE_STR = "";
  
  public static final String CONTENTINSTANCE_DEFAULT_FILE = "";
  
  public static final ThumbnailClass CONTENTINSTANCE = null;
  
  public static final int STATICFILE_VAL = 8;
  
  public static final String STATICFILE_STR = "";
  
  public static final String STATICFILE_DEFAULT_FILE = "";
  
  public static final ThumbnailClass STATICFILE = null;

  private static final long serialVersionUID = 1L;
  
  public static ThumbnailClass getInstance(int val) throws VgnIllegalArgumentException {
    return null;
  }
  
  public static ThumbnailClass getInstance(String val) throws VgnIllegalArgumentException {
    return null;
  }
  
  public static ThumbnailClass getThumbnailClass(Class<?> thumbnailWrapperClass) {
    return null;
  }
  
  public static ThumbnailClass getInstance(AsObjectType asObjectType) {
    return null;
  }
  
  private ThumbnailClass(int val, String valString) {
    
  }
  
  public boolean isSystem() {
    return true;
  }
  
  public boolean isProject() {
    return true;
}
  
  public boolean isCategory() {
    return true;
}
  
  public boolean isObjectType() {
    return true;
}
  
  public boolean isSite() {
    return true;
}
  
  public boolean isChannel() {
    return true;
}
  
  public boolean isContentType() {
    return true;
}

  public boolean isContentInstance() {
    return true;
}
  
  public boolean isStaticFile() {
    return true;
}
  
  public boolean isFileContainer() {
    return true;
}
  
  public String toString() {
    return null;
  }
  
  public boolean equals(Object obj) {
    return true;
}
  
  public Object readResolve() throws ObjectStreamException {
    return null;
  }
  
  public static ThumbnailClass[] values() {
    return null;
  }
  
  public String getDefaultFile() {
    return null;
  }
}
