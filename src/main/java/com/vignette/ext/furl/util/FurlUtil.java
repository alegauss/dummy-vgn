package com.vignette.ext.furl.util;

import com.vignette.as.client.exception.ApplicationException;
import com.vignette.as.client.exception.ValidationException;
import com.vignette.as.client.javabean.Site;
import com.vignette.ext.furl.IFurlConstants;
import com.vignette.ext.furl.cache.IFriendlyURLLinkPrinterCache;
import com.vignette.ext.furl.cache.IURLMappingCache;
import com.vignette.ext.furl.javabean.UrlMapping;
import com.vignette.ext.templating.client.javabean.URLScheme;
import com.vignette.ext.templating.link.LinkPrinter;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;

public class FurlUtil implements IFurlConstants {
    
  public static List getMappers() {
    return null;
  }
  
  public static IURLMappingCache getURLMappingCache() {
    return null;
  }
  
  public static List getFurlSites() throws ApplicationException {
    return null;
  }
  
  public static void reset() {
   
  }
  
  public static String getRelativePath(String source) throws ApplicationException {
    return null;
  }
  
  public static boolean isAbsoluteUrl(String url) {
   
    return true;
  }
  
  public static String encodeSpaces(String uri) {
    return null;
  }
  
  public static void initFURLMappers(Map context) {
    
  }
  
  public static void initMappers(Map context) {
    
  }
  
  public static boolean isSiteEnabled(String siteName) {
    return true;
  }
  
  public static boolean isLegacyFurlSite(Site site) throws ApplicationException {
    return true;
  }
  
  public static boolean isSiteEnabled(Site site) throws ApplicationException {
    return true;
  }
  
  public static IFriendlyURLLinkPrinterCache getLinkPrinterCache() {
    return null;
  }
  
  public static String getUTF8EncodedSpaceValue() {
    return null;
  }
  
  public static LinkedHashMap<String, String> getUTF8EncodedValues() {
    return null;
  }
  
  public static UrlMapping invokeFURLMappers(String url, HttpServletRequest httpServletRequest, List mappers) {
    return null;
  }
  
  public static URLScheme getDefaultLegacyURLScheme() throws ApplicationException, ValidationException {
    return null;
  }
  
  public static URLScheme findDefaultLegacyURLScheme() throws ApplicationException, ValidationException {
    return null;
  }
  
  public static URLScheme getDefaultCanonicalURLScheme() throws ApplicationException, ValidationException {
    return null;
  }
  
  public static URLScheme findDefaultCanonicalUrlScheme() throws ApplicationException, ValidationException {
    return null;
  }
  
  public static boolean isSiteNameIncluded(Site site) throws ApplicationException {
    return true;
  }
  
  public static boolean isSiteNameIncluded(String siteName) throws ApplicationException {
    return true;
  }
  
  public static URLScheme getURLScheme(Site site) throws ApplicationException {
    return null;
  }
  
  public static URLScheme.ResolutionStyle getResolutionStyle(String siteName) throws ApplicationException {
    return null;
  }
  
  public static URLScheme.ResolutionStyle getResolutionStyle(Site site) throws ApplicationException {
    return null;
  }
  
  public static LinkPrinter getCustomLinkPrinter(String siteName) throws ApplicationException {
    return null;
  }
  
  public static boolean isActiveFormat(String formatName, String siteName) throws ApplicationException {
    return true;
  }
  
  public static boolean isActiveFormat(String formatName, Site site) throws ApplicationException {
    return true;
  }
  
  public static String getDefaultFormatName(String siteName) throws ApplicationException {
    return null;
  }
  
  public static String getDefaultFormatName(Site site) throws ApplicationException {
    return null;
  }
  
  public static String getSiteNameFromRequest(HttpServletRequest request) {
    return null;
  }
  
  public static String getFormatNameFromRequest(HttpServletRequest request) {
    return null;
  }
  
  public static String getLocaleNameFromRequest(HttpServletRequest request) {
    return null;
  }
  
  public static boolean isFormatIncluded(Site site) throws ApplicationException {
    return true;
  }
  
  public static boolean isFormatIncluded(String siteName) throws ApplicationException {
    return true;
  }
  
  public static boolean isIncludeLocaleName(Site site) throws ApplicationException {
    return true;
  }
  
  public static boolean isIncludeLocaleName(String siteName) throws ApplicationException {
    return true;
  }
  
  public static boolean isIncludeContextName(Site site) throws ApplicationException {
    return true;
  }
  
  public static boolean isIncludeSiteName(Site site) throws ApplicationException {
    return true;
  }
  
  public static String getSiteFurlName(Site site, String localeCode) throws ApplicationException {
    return null;
  }
  
  public static String getSiteFurlName(Site site, Locale locale) throws ApplicationException {
   return null;
  }
}
