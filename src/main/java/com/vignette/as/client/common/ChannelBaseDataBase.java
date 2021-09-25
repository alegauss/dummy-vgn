package com.vignette.as.client.common;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Enumeration;
import java.util.List;

public abstract class ChannelBaseDataBase extends ApplicationObjectData {
  
  public void addContentAssociations(ChannelContentAssociationData vContentAssociations) throws IndexOutOfBoundsException {
  
  }
  
  public void addContentAssociations(int index, ChannelContentAssociationData vContentAssociations) throws IndexOutOfBoundsException {
  }
  
  public void clearContentAssociations() {
  }
  
  public Enumeration enumerateContentAssociations() {
    return null;
  }
  
  public ChannelContentAssociationData getContentAssociations(int index) throws IndexOutOfBoundsException {
    return null;
  }
  
  public ChannelContentAssociationData[] getContentAssociations() {
    return null;
  }
  
  public Collection getContentAssociationsCollection() {
    return null;
  }
  
  public int getContentAssociationsCount() {
    return 1;
  }
  
  public boolean removeContentAssociations(ChannelContentAssociationData vContentAssociations) {
    return true;
  }
  
  public void setContentAssociations(int index, ChannelContentAssociationData vContentAssociations) throws IndexOutOfBoundsException {
  }
  
  public void setContentAssociations(ChannelContentAssociationData[] contentAssociationsArray) {

  }
  
  public void setContentAssociationsCollection(Collection pCollection) {
  }
  
  private List<ChannelContentAssociationData> getPrivateContentAssociations(boolean forModification) {
    return null;
  }
  
  public void clearPrivateContentAssociations() {
  }
  
  public boolean removeStaticFileAssociations(StaticFileAssociationData data) {
    return true;
  }
  
  public void addStaticFileAssociations(StaticFileAssociationData data) {
  }
  
  public void addContentInstanceAssociations(ContentInstanceAssociationData data) {
  }
  
  public ContentInstanceAssociationData[] getContentInstanceAssociations() {
    return null;
  }
  
  public boolean removeContentInstanceAssociations(ContentInstanceAssociationData data) {
    return true;
  }
  
  public StaticFileAssociationData[] getStaticFileAssociations() {
    return null;
  }
  
  public Collection getContentInstanceAssociationsCollection() {
    return null;
  }
  
  public void addContentInstanceAssociations(int index, ContentInstanceAssociationData vContentInstanceAssociations) throws IndexOutOfBoundsException {

  }
  
  public void addStaticFileAssociations(int index, StaticFileAssociationData vStaticFileAssociations) throws IndexOutOfBoundsException {

  }
  
  public void clearContentInstanceAssociations() {

  }
  
  public void clearStaticFileAssociations() {

  }
  
  public Enumeration enumerateContentInstanceAssociations() {
    return null;
  }
  
  public Enumeration enumerateStaticFileAssociations() {
    return null;
  }
  
  public ContentInstanceAssociationData getContentInstanceAssociations(int index) throws IndexOutOfBoundsException {
    return null;
  }
  
  public int getContentInstanceAssociationsCount() {
    return 0;
  }
  
  public StaticFileAssociationData getStaticFileAssociations(int index) throws IndexOutOfBoundsException {
    return null;
  }
  
  public Collection getStaticFileAssociationsCollection() {
    return null;
  }
  
  public int getStaticFileAssociationsCount() {
    return 1;
  }
  
  public void setContentInstanceAssociations(int index, ContentInstanceAssociationData vContentInstanceAssociations) throws IndexOutOfBoundsException {
  }
  
  public void setContentInstanceAssociations(ContentInstanceAssociationData[] contentInstanceAssociationsArray) {

  }
  
  public void setContentInstanceAssociationsCollection(Collection pCollection) {

  }
  
  public void setStaticFileAssociations(int index, StaticFileAssociationData vStaticFileAssociations) throws IndexOutOfBoundsException {
  }
  
  public void setStaticFileAssociations(StaticFileAssociationData[] staticFileAssociationsArray) {
  }
  
  public void setStaticFileAssociationsCollection(Collection pCollection) {
  }
}
