package com.vignette.as.client.javabean;

import com.vignette.as.client.common.AppObjectId;
import com.vignette.as.client.common.ApplicationObjectData;

public interface IApplicationObject extends IPersistable {
  ApplicationObjectData getBaseData();
  
  AppObjectId getId();
}
