package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CollateralAssetAdministrationReportingResponse
 */
public class CollateralAssetAdministrationReportingResponse   {
  private String collateralAssetReference = null;

  private String collateralAssetReportingServiceReference = null;

  private String collateralAssetType = null;

  private String collateralAssetProperties = null;

  private String collateralAssetDescription = null;

  private String collateralAssetTitle = null;

  private String collateralAssetLocation = null;

  private String collateralAssetJurisdiction = null;

  private String collateralAssetDocumentReference = null;

  private String collateralAssetDocumentType = null;

  private String collateralAssetOwnership = null;

  private String collateralAssetInterestedParties = null;

  private String collateralAssetValuationHistory = null;

  private String collateralAssetReportingResult = null;


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier       
   * @return collateralAssetReference
  **/

  public String getCollateralAssetReference() {
    return collateralAssetReference;
  }

  public void setCollateralAssetReference(String collateralAssetReference) {
    this.collateralAssetReference = collateralAssetReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier       
   * @return collateralAssetReportingServiceReference
  **/

  public String getCollateralAssetReportingServiceReference() {
    return collateralAssetReportingServiceReference;
  }

  public void setCollateralAssetReportingServiceReference(String collateralAssetReportingServiceReference) {
    this.collateralAssetReportingServiceReference = collateralAssetReportingServiceReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text      
   * @return collateralAssetType
  **/

  public String getCollateralAssetType() {
    return collateralAssetType;
  }

  public void setCollateralAssetType(String collateralAssetType) {
    this.collateralAssetType = collateralAssetType;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text      
   * @return collateralAssetProperties
  **/

  public String getCollateralAssetProperties() {
    return collateralAssetProperties;
  }

  public void setCollateralAssetProperties(String collateralAssetProperties) {
    this.collateralAssetProperties = collateralAssetProperties;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text      
   * @return collateralAssetDescription
  **/

  public String getCollateralAssetDescription() {
    return collateralAssetDescription;
  }

  public void setCollateralAssetDescription(String collateralAssetDescription) {
    this.collateralAssetDescription = collateralAssetDescription;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text      
   * @return collateralAssetTitle
  **/

  public String getCollateralAssetTitle() {
    return collateralAssetTitle;
  }

  public void setCollateralAssetTitle(String collateralAssetTitle) {
    this.collateralAssetTitle = collateralAssetTitle;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text      
   * @return collateralAssetLocation
  **/

  public String getCollateralAssetLocation() {
    return collateralAssetLocation;
  }

  public void setCollateralAssetLocation(String collateralAssetLocation) {
    this.collateralAssetLocation = collateralAssetLocation;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text      
   * @return collateralAssetJurisdiction
  **/

  public String getCollateralAssetJurisdiction() {
    return collateralAssetJurisdiction;
  }

  public void setCollateralAssetJurisdiction(String collateralAssetJurisdiction) {
    this.collateralAssetJurisdiction = collateralAssetJurisdiction;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier      
   * @return collateralAssetDocumentReference
  **/

  public String getCollateralAssetDocumentReference() {
    return collateralAssetDocumentReference;
  }

  public void setCollateralAssetDocumentReference(String collateralAssetDocumentReference) {
    this.collateralAssetDocumentReference = collateralAssetDocumentReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text      
   * @return collateralAssetDocumentType
  **/

  public String getCollateralAssetDocumentType() {
    return collateralAssetDocumentType;
  }

  public void setCollateralAssetDocumentType(String collateralAssetDocumentType) {
    this.collateralAssetDocumentType = collateralAssetDocumentType;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Name 
   * @return collateralAssetOwnership
  **/

  public String getCollateralAssetOwnership() {
    return collateralAssetOwnership;
  }

  public void setCollateralAssetOwnership(String collateralAssetOwnership) {
    this.collateralAssetOwnership = collateralAssetOwnership;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Name      
   * @return collateralAssetInterestedParties
  **/

  public String getCollateralAssetInterestedParties() {
    return collateralAssetInterestedParties;
  }

  public void setCollateralAssetInterestedParties(String collateralAssetInterestedParties) {
    this.collateralAssetInterestedParties = collateralAssetInterestedParties;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Value      
   * @return collateralAssetValuationHistory
  **/

  public String getCollateralAssetValuationHistory() {
    return collateralAssetValuationHistory;
  }

  public void setCollateralAssetValuationHistory(String collateralAssetValuationHistory) {
    this.collateralAssetValuationHistory = collateralAssetValuationHistory;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text      
   * @return collateralAssetReportingResult
  **/

  public String getCollateralAssetReportingResult() {
    return collateralAssetReportingResult;
  }

  public void setCollateralAssetReportingResult(String collateralAssetReportingResult) {
    this.collateralAssetReportingResult = collateralAssetReportingResult;
  }


}

