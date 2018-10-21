package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * MaintenanceWithIdAndRoot
 */
public class MaintenanceWithIdAndRoot   {
  private String collateralAssetReference = null;

  private String collateralAssetMaintenanceTaskReference = null;

  private String collateralAssetMaintenanceTaskRecord = null;

  private String collateralAssetMaintenanceType = null;

  private String collateralAssetMaintenanceServiceProviderReference = null;

  private String collateralAssetMaintenanceSchedule = null;

  private String collateralAssetVerificationAndComplianceReference = null;

  private String collateralAssetMaintenanceSafekeepingFees = null;


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
   * @return collateralAssetMaintenanceTaskReference
  **/

  public String getCollateralAssetMaintenanceTaskReference() {
    return collateralAssetMaintenanceTaskReference;
  }

  public void setCollateralAssetMaintenanceTaskReference(String collateralAssetMaintenanceTaskReference) {
    this.collateralAssetMaintenanceTaskReference = collateralAssetMaintenanceTaskReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text        
   * @return collateralAssetMaintenanceTaskRecord
  **/

  public String getCollateralAssetMaintenanceTaskRecord() {
    return collateralAssetMaintenanceTaskRecord;
  }

  public void setCollateralAssetMaintenanceTaskRecord(String collateralAssetMaintenanceTaskRecord) {
    this.collateralAssetMaintenanceTaskRecord = collateralAssetMaintenanceTaskRecord;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text        
   * @return collateralAssetMaintenanceType
  **/

  public String getCollateralAssetMaintenanceType() {
    return collateralAssetMaintenanceType;
  }

  public void setCollateralAssetMaintenanceType(String collateralAssetMaintenanceType) {
    this.collateralAssetMaintenanceType = collateralAssetMaintenanceType;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier         
   * @return collateralAssetMaintenanceServiceProviderReference
  **/

  public String getCollateralAssetMaintenanceServiceProviderReference() {
    return collateralAssetMaintenanceServiceProviderReference;
  }

  public void setCollateralAssetMaintenanceServiceProviderReference(String collateralAssetMaintenanceServiceProviderReference) {
    this.collateralAssetMaintenanceServiceProviderReference = collateralAssetMaintenanceServiceProviderReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Duration        
   * @return collateralAssetMaintenanceSchedule
  **/

  public String getCollateralAssetMaintenanceSchedule() {
    return collateralAssetMaintenanceSchedule;
  }

  public void setCollateralAssetMaintenanceSchedule(String collateralAssetMaintenanceSchedule) {
    this.collateralAssetMaintenanceSchedule = collateralAssetMaintenanceSchedule;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier       
   * @return collateralAssetVerificationAndComplianceReference
  **/

  public String getCollateralAssetVerificationAndComplianceReference() {
    return collateralAssetVerificationAndComplianceReference;
  }

  public void setCollateralAssetVerificationAndComplianceReference(String collateralAssetVerificationAndComplianceReference) {
    this.collateralAssetVerificationAndComplianceReference = collateralAssetVerificationAndComplianceReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Amount        
   * @return collateralAssetMaintenanceSafekeepingFees
  **/

  public String getCollateralAssetMaintenanceSafekeepingFees() {
    return collateralAssetMaintenanceSafekeepingFees;
  }

  public void setCollateralAssetMaintenanceSafekeepingFees(String collateralAssetMaintenanceSafekeepingFees) {
    this.collateralAssetMaintenanceSafekeepingFees = collateralAssetMaintenanceSafekeepingFees;
  }


}

