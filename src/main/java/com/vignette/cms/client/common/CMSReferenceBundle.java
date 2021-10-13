package com.vignette.cms.client.common;

import com.vignette.translate.ITranslatableBundle;
import com.vignette.util.Bundle;
import com.vignette.util.IObjectProp;
import java.io.Serializable;

public class CMSReferenceBundle extends Bundle implements Serializable, ITranslatableBundle {

  
  public CMSReferenceBundle() {
    super(null);
  }
  
  public CMSReferenceBundle(CMSReferenceBundleFlags flags) {
    super(flags);
  }
  
  public Object get(IObjectProp prop) {
    return null;
  }
  
  public void set(IObjectProp prop, Object val) {
    
  }
  
  public void remove(IObjectProp prop) {
    
  }
  
  protected IObjectProp getPropInstance(int val) {
    return null;
  }
  
  public boolean hasReferrerId() {
    return true;
  }
  
  public ObjectId getReferrerId() {
    return null;
  }
  
  public void setReferrerId(ObjectId val) {

  }
  
  public void removeReferrerId() {

  }
  
  public boolean hasReferentId() {
    return true;
  }
  
  public ObjectId getReferentId() {
    return null;
  }
  
  public void setReferentId(ObjectId val) {

  }
  
  public void removeReferentId() {

  }
  
  public boolean hasRecordSourceId() {
    return true;
  }
  
  public ObjectId getRecordSourceId() {
    return null;
  }
  
  public void setRecordSourceId(ObjectId val) {

  }
  
  public void removeRecordSourceId() {

  }
  
  public boolean hasReferentRecordSourceId() {
    return true;
  }
  
  public ObjectId getReferentRecordSourceId() {
    return null;
  }
  
  public void setReferentRecordSourceId(ObjectId val) {

  }
  
  public void removeReferentRecordSourceId() {

  }
  
  public boolean hasReferenceName() {
    return true;
  }
  
  public String getReferenceName() {
    return null;
  }
  
  public void setReferenceName(String val) {

  }
  
  public void removeReferenceName() {

  }
  
  public boolean hasType() {
    return true;
  }
  
  public String getType() {
    return null;
  }
  
  public void setType(String val) {

  }
  
  public void removeType() {

  }
  
  public boolean hasPublishPolicy() {
    return true;
  }
  
  public String getPublishPolicy() {
    return null;
  }
  
  public void setPublishPolicy(String val) {

  }
  
  public void removePublishPolicy() {

  }
  
  public boolean hasUnpublishPolicy() {
    return true;
  }
  
  public String getUnpublishPolicy() {
    return null;
  }
  
  public void setUnpublishPolicy(String val) {

  }
  
  public void removeUnpublishPolicy() {

  }
  
  public boolean hasMetadata() {
    return true;
  }
  
  public String getMetadata() {
   return null;
  }
  
}
