package com.vignette.util;

public abstract class MsgCat {
  public static final int VGN_TEST_PRODUCT_ID = 1;
  
  public static final int VGN_UTIL_PRODUCT_ID = 1;
  
  public static final int VGN_LOGGING_PRODUCT_ID = 1;
  
  public static final int VGN_AUTH_PRODUCT_ID = 1;
  
  public static final int VGN_MONITOR_PRODUCT_ID = 1;
  
  public static final int VGN_TRANSLATOR_PRODUCT_ID = 1;
  
  public static final int VGN_SOAP_PRODUCT_ID = 1;
  
  public static final int VGN_KERNEL_PRODUCT_ID = 1;
  
  public static final int VGN_CONFIG_PRODUCT_ID = 1;
  
  public static final int VGN_RPS_PRODUCT_ID = 1;
  
  public static final int VGN_RMS_RAPP_PRODUCT_ID = 1;
  
  public static final int VGN_PACK_INF_PRODUCT_ID = 1;
  
  public static final int VGN_CMG_PRODUCT_ID = 1;
  
  public static final int VGN_PWS_PRODUCT_ID = 1;
  
  public static final int VGN_EXPLORER_PRODUCT_ID = 1;
  
  public static final int VGN_CMG_CMA_PRODUCT_ID = 1;
  
  public static final int VGN_CMG_CMS_PRODUCT_ID = 1;
  
  public static final int VGN_RMS_TOOLS_PRODUCT_ID = 1;
  
  public static final int VGN_RMS_COMMON_PRODUCT_ID = 1;
  
  public static final int VGN_RMS_CONFIG_PRODUCT_ID = 1;
  
  public static final int VGN_RMS_COLLECTOR_PRODUCT_ID = 1;
  
  public static final int VGN_RMS_SESSIONIZER_PRODUCT_ID = 1;
  
  public static final int VGN_RMS_ANALYSIS_PRODUCT_ID = 1;
  
  public static final int VGN_WEBUTIL_PRODUCT_ID = 1;
  
  public static final int VGN_ROLEMGR_PRODUCT_ID = 1;
  
  public static final int VGN_EXPLORER_WORKFLOW_PRODUCT_ID = 1;
  
  public static final int VGN_VEAP_PRODUCT_ID = 1;
  
  public static final int VGN_COD_PRODUCT_ID = 1;
  
  public static final int VGN_MIGRATION_PRODUCT_ID = 1;
  
  public static final int VGN_HTTPS_PRODUCT_ID = 1;
  
  public static final int VGN_HTTP_CLIENT_PRODUCT_ID = 1;
  
  public static final int VGN_ABSTRACT_PREFERENCES_ID = 1;
  
  public static final int VGN_PREFERENCES_ID = 1;
  
  public static final int VGN_APPSERVERSPECIFICS_ID = 1;
  
  public static final int VGN_SEARCH_ID = 1;
  
  public static final int VGN_CUSTOMER_PRODUCT_ID = 1;
  
  public static final int VGN_CUSTOMER_PACKAGE_ID = 1;
  
  protected MsgCat(int productId, String bundleName, int packageId) {

  }
  
  protected MsgObject getMO(ClassLoader loader, String key, Object[] args) {
    return null;
  }
  
  protected MsgObject getMO(ClassLoader loader, String bundleName, String key, Object[] args) {
    return null;
  }
}
