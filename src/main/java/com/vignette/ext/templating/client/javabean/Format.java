package com.vignette.ext.templating.client.javabean;

import com.vignette.ext.templating.cache.CachingDetail;
import java.io.Serializable;

public class Format implements Serializable {
  static final long serialVersionUID = 1L;

  public Format() {}
  
  public Format(String name, String templateId) {

  }
  
  public Format(String name, String templateId, CachingDetail cachingDetail) {
  }
  
  public Format(String name, String templateId, String pageFeatures) {
  }
  
  public Format(String name, String templateId, CachingDetail cachingDetail, String themeId, String pageLayoutId) {
  }
  
  public Format(String name, String templateId, CachingDetail cachingDetail, String themeId, String pageLayoutId, String pageFeatures) {
  }
  
  public CachingDetail getCachingDetail() {
    return null;
  }
  
  public void setCachingDetail(CachingDetail cachingDetail) {

  }
  
  public String getName() {
    return null;
  }
  
  public void setName(String name) {
  }
  
  public String getTemplateId() {
    return null;
  }
  
  public void setTemplateId(String templateId) {
  }
  
  public String getThemeId() {
    return null;
  }
  
  public void setThemeId(String themeId) {
  }
  
  public String getPageLayoutId() {
    return null;
  }
  
  public void setPageLayoutId(String pageLayoutId) {
   }
  
  public String getPageFeatures() {
    return null;
  }
  
  public void setPageFeatures(String pageFeatures) {
  }
}
