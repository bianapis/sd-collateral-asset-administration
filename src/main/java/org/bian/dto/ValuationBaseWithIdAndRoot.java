package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * ValuationBaseWithIdAndRoot
 */
public class ValuationBaseWithIdAndRoot   {
  private String collateralAssetReference = null;

  private String collateralAssetValuationReference = null;

  private String collateralAssetValuationType = null;

  private String collateralAssetValuationServiceReference = null;

  private String collateralAssetValuationSchedule = null;

  private String collateralAssetLoanToValueRatio = null;

  private String collateralAssetValuation = null;

  private String collateralAssetValuationDate = null;


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
   * @return collateralAssetValuationReference
  **/

  public String getCollateralAssetValuationReference() {
    return collateralAssetValuationReference;
  }

  public void setCollateralAssetValuationReference(String collateralAssetValuationReference) {
    this.collateralAssetValuationReference = collateralAssetValuationReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text      
   * @return collateralAssetValuationType
  **/

  public String getCollateralAssetValuationType() {
    return collateralAssetValuationType;
  }

  public void setCollateralAssetValuationType(String collateralAssetValuationType) {
    this.collateralAssetValuationType = collateralAssetValuationType;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier        
   * @return collateralAssetValuationServiceReference
  **/

  public String getCollateralAssetValuationServiceReference() {
    return collateralAssetValuationServiceReference;
  }

  public void setCollateralAssetValuationServiceReference(String collateralAssetValuationServiceReference) {
    this.collateralAssetValuationServiceReference = collateralAssetValuationServiceReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Duration      
   * @return collateralAssetValuationSchedule
  **/

  public String getCollateralAssetValuationSchedule() {
    return collateralAssetValuationSchedule;
  }

  public void setCollateralAssetValuationSchedule(String collateralAssetValuationSchedule) {
    this.collateralAssetValuationSchedule = collateralAssetValuationSchedule;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Ratio      
   * @return collateralAssetLoanToValueRatio
  **/

  public String getCollateralAssetLoanToValueRatio() {
    return collateralAssetLoanToValueRatio;
  }

  public void setCollateralAssetLoanToValueRatio(String collateralAssetLoanToValueRatio) {
    this.collateralAssetLoanToValueRatio = collateralAssetLoanToValueRatio;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Value      
   * @return collateralAssetValuation
  **/

  public String getCollateralAssetValuation() {
    return collateralAssetValuation;
  }

  public void setCollateralAssetValuation(String collateralAssetValuation) {
    this.collateralAssetValuation = collateralAssetValuation;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Date 
   * @return collateralAssetValuationDate
  **/

  public String getCollateralAssetValuationDate() {
    return collateralAssetValuationDate;
  }

  public void setCollateralAssetValuationDate(String collateralAssetValuationDate) {
    this.collateralAssetValuationDate = collateralAssetValuationDate;
  }


}

