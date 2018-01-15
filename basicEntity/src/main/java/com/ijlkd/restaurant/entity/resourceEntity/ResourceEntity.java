package com.ijlkd.restaurant.entity.resourceEntity;

public class ResourceEntity {
  private String resourceId ;
  private String resourceName;
  private String resourceUrl;
  private String resourceLevel;
  private String resourceParent;
  private String resourceSort;
  private String resourceTime;
  private String resourceUser;
  private String resourcePermission;
  private String resourceInBillType;

    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public String getResourceUrl() {
        return resourceUrl;
    }

    public void setResourceUrl(String resourceUrl) {
        this.resourceUrl = resourceUrl;
    }

    public String getResourceLevel() {
        return resourceLevel;
    }

    public void setResourceLevel(String resourceLevel) {
        this.resourceLevel = resourceLevel;
    }

    public String getResourceParent() {
        return resourceParent;
    }

    public void setResourceParent(String resourceParent) {
        this.resourceParent = resourceParent;
    }

    public String getResourceSort() {
        return resourceSort;
    }

    public void setResourceSort(String resourceSort) {
        this.resourceSort = resourceSort;
    }

    public String getResourceTime() {
        return resourceTime;
    }

    public void setResourceTime(String resourceTime) {
        this.resourceTime = resourceTime;
    }

    public String getResourceUser() {
        return resourceUser;
    }

    public void setResourceUser(String resourceUser) {
        this.resourceUser = resourceUser;
    }

    public String getResourcePermission() {
        return resourcePermission;
    }

    public void setResourcePermission(String resourcePermission) {
        this.resourcePermission = resourcePermission;
    }

    public String getResourceInBillType() {
        return resourceInBillType;
    }

    public void setResourceInBillType(String resourceInBillType) {
        this.resourceInBillType = resourceInBillType;
    }

    @Override
    public String toString() {
        return "ResourceEntity{" +
                "resourceId='" + resourceId + '\'' +
                ", resourceName='" + resourceName + '\'' +
                ", resourceUrl='" + resourceUrl + '\'' +
                ", resourceLevel='" + resourceLevel + '\'' +
                ", resourceParent='" + resourceParent + '\'' +
                ", resourceSort='" + resourceSort + '\'' +
                ", resourceTime='" + resourceTime + '\'' +
                ", resourceUser='" + resourceUser + '\'' +
                ", resourcePermission='" + resourcePermission + '\'' +
                ", resourceInBillType='" + resourceInBillType + '\'' +
                '}';
    }
}
