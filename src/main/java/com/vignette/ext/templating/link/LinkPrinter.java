package com.vignette.ext.templating.link;

import com.vignette.as.client.exception.ApplicationException;
import com.vignette.ext.templating.util.RequestContext;

public interface LinkPrinter {
  String printLink(LinkSpec paramLinkSpec, RequestContext paramRequestContext, boolean paramBoolean) throws ApplicationException;
  
  String printLink(LinkSpec paramLinkSpec, boolean paramBoolean) throws ApplicationException;
}
