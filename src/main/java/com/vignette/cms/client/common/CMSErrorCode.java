package com.vignette.cms.client.common;

import com.vignette.translate.ITranslatableConst;
import com.vignette.util.EnumObject;
import com.vignette.util.IVgnErrorCode;
import java.io.ObjectStreamException;

public final class CMSErrorCode extends EnumObject implements ITranslatableConst, IVgnErrorCode {
  public static final int UNKNOWN_VAL = 0;
  
  public static final String UNKNOWN_STR = "";
  
  public static final CMSErrorCode UNKNOWN = null;
  
  public static final int DB_ERROR_VAL = 0;
  
  public static final String DB_ERROR_STR = "";
  
  public static final CMSErrorCode DB_ERROR = null;
  
  public static final int EJB_ERROR_VAL = 0;
  
  public static final String EJB_ERROR_STR = "";
  
  public static final CMSErrorCode EJB_ERROR = null;
  
  public static final int INVALID_STATE_VAL = 0;
  
  public static final String INVALID_STATE_STR = "";
  
  public static final CMSErrorCode INVALID_STATE = null;
  
  public static final int NOT_FOUND_VAL = 0;
  
  public static final String NOT_FOUND_STR = "";
  
  public static final CMSErrorCode NOT_FOUND = null;
  
  public static final int OS_ERROR_VAL = 0;
  
  public static final String OS_ERROR_STR = "";
  
  public static final CMSErrorCode OS_ERROR = null;
  
  public static final int IO_ERROR_VAL = 0;
  
  public static final String IO_ERROR_STR = "";
  
  public static final CMSErrorCode IO_ERROR = null;
  
  public static final int NAMING_ERROR_VAL = 0;
  
  public static final String NAMING_ERROR_STR = "";
  
  public static final CMSErrorCode NAMING_ERROR = null;
  
  public static final int REMOTE_ERROR_VAL = 0;
  
  public static final String REMOTE_ERROR_STR = "";
  
  public static final CMSErrorCode REMOTE_ERROR = null;
  
  public static final int CREATE_ERROR_VAL = 0;
  
  public static final String CREATE_ERROR_STR = "";
  
  public static final CMSErrorCode CREATE_ERROR = null;
  
  public static final int NOT_IMPLEMENTED_VAL = 0;
  
  public static final String NOT_IMPLEMENTED_STR = "";
  
  public static final CMSErrorCode NOT_IMPLEMENTED = null;
  
  public static final int INVALID_PARAMETER_VAL = 0;
  
  public static final String INVALID_PARAMETER_STR = "";
  
  public static final CMSErrorCode INVALID_PARAMETER = null;
  
  public static final int OP_IN_PROGRESS_VAL = 0;
  
  public static final String OP_IN_PROGRESS_STR = "";
  
  public static final CMSErrorCode OP_IN_PROGRESS = null;
  
  public static final int AUTHN_ERROR_VAL = 0;
  
  public static final String AUTHN_ERROR_STR = "";
  
  public static final CMSErrorCode AUTHN_ERROR = null;
  
  public static final int AUTHZ_ERROR_VAL = 0;
  
  public static final String AUTHZ_ERROR_STR = "";
  
  public static final CMSErrorCode AUTHZ_ERROR = null;
  
  public static final int DOWNLOAD_FILE_NOT_FOUND_ERROR_VAL = 0;
  
  public static final String DOWNLOAD_FILE_NOT_FOUND_ERROR_STR = "";
  
  public static final CMSErrorCode DOWNLOAD_FILE_NOT_FOUND_ERROR = null;
  
  public static final int LOCKING_ERROR_VAL = 0;
  
  public static final String LOCKING_ERROR_STR = "";
  
  public static final CMSErrorCode LOCKING_ERROR = null;
  
  public static final int NOT_SUPPORTED_VAL = 18;
  
  public static final String NOT_SUPPORTED_STR = "";
  
  public static final CMSErrorCode NOT_SUPPORTED = null;
  
  public static final int IN_USE_VAL = 0;
  
  public static final String IN_USE_STR = "";
  
  public static final CMSErrorCode IN_USE = null;
  
  public static final int MISSING_DATA_VAL = 20;
  
  public static final String MISSING_DATA_STR = "";
  
  public static final CMSErrorCode MISSING_DATA = null;
  
  public static final int WF_ERROR_VAL = 0;
  
  public static final String WF_ERROR_STR = "";
  
  public static final CMSErrorCode WF_ERROR = null;
  
  public static final int WF_DISABLED_VAL = 0;
  
  public static final String WF_DISABLED_STR = "";
  
  public static final CMSErrorCode WF_DISABLED = null;
  
  public static final int MANIFEST_STATUS_INVALID_VAL = 0;
  
  public static final String MANIFEST_STATUS_INVALID_STR = "";
  
  public static final CMSErrorCode MANIFEST_STATUS_INVALID = null;
  
  public static final int MANIFEST_ENTRY_NOT_FOUND_VAL = 0;
  
  public static final String MANIFEST_ENTRY_NOT_FOUND_STR = "";
  
  public static final CMSErrorCode MANIFEST_ENTRY_NOT_FOUND = null;
  
  public static final int MANIFEST_SNAPSHOT_NOT_FOUND_VAL = 0;
  
  public static final String MANIFEST_SNAPSHOT_NOT_FOUND_STR = "";
  
  public static final CMSErrorCode MANIFEST_SNAPSHOT_NOT_FOUND = null;
  
  public static final int MANIFEST_ENTRY_CORRUPT_VAL = 0;
  
  public static final String MANIFEST_ENTRY_CORRUPT_STR = "";
  
  public static final CMSErrorCode MANIFEST_ENTRY_CORRUPT = null;
  
  public static final int OBJECT_NOT_MEMBER_OF_DG_VAL = 0;
  
  public static final String OBJECT_NOT_MEMBER_OF_DG_STR = "";
  
  public static final CMSErrorCode OBJECT_NOT_MEMBER_OF_DG = null;
  
  public static final int MESSAGE_SERVICE_ERROR_VAL = 0;
  
  public static final String MESSAGE_SERVICE_ERROR_STR = "";
  
  public static final CMSErrorCode MESSAGE_SERVICE_ERROR = null;
  
  public static final int JOB_ENGINE_ERROR_VAL = 0;
  
  public static final String JOB_ENGINE_ERROR_STR = "";
  
  public static final CMSErrorCode JOB_ENGINE_ERROR = null;
  
  public static final int MONITOR_ERROR_VAL = 0;
  
  public static final String MONITOR_ERROR_STR = "";
  
  public static final CMSErrorCode MONITOR_ERROR = null;
  
  public static final int JOB_CREATION_SAFE_VIOLATION_VAL = 0;
  
  public static final String JOB_CREATION_SAFE_VIOLATION_STR = "";
  
  public static final CMSErrorCode JOB_CREATION_SAFE_VIOLATION = null;
  
  public static final int UNEXPECTED_OBJECT_UPDATE_VAL = 0;
  
  public static final String UNEXPECTED_OBJECT_UPDATE_STR = "";
  
  public static final CMSErrorCode UNEXPECTED_OBJECT_UPDATE = null;
  
  public static final int FILESOURCE_VAL = 0;
  
  public static final String FILESOURCE_STR = "";
  
  public static final CMSErrorCode FILESOURCE = null;
  
  public static CMSErrorCode getInstance(int val) throws IllegalArgumentException {
    return null;
  }
  
  public static CMSErrorCode getInstance(Throwable ex) {
    return null;
  }
  
  private CMSErrorCode(int val) {
    
  }
  
  public Object readResolve() throws ObjectStreamException {
    return null;
  }
  
  public String toString() {
    return null;
  }
  

}
