package com.vignette.util;

import javax.servlet.http.HttpServletRequest;

public interface IHttpRequestVar {
  String getValue(HttpServletRequest paramHttpServletRequest);
}
