/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface CollateralAssetAdministrationApiService {

	CollateralAssetAdministrationRecordResponse record(String crReferenceId, CollateralAssetAdministrationRecordRequest request);
	
	CaptureBaseWithId requestPostCaptures(String crReferenceId, CaptureBase request);
	
	CaptureBaseWithId requestPutCaptures(String crReferenceId, String bqReferenceId, CaptureBase request);
	
	CollateralAssetBaseWithId requestPost(CollateralAssetBase request);
	
	CollateralAssetBaseWithId requestPut(String crReferenceId, CollateralAssetBase request);
	
	CollateralAssetAdministrationRefreshResponse requestPutValuations(String crReferenceId, String bqReferenceId);
	
	List<String> retrieveBQIds(String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	List<String> retrieveRefIds();
	
	RetrieveCollateralAssetAdministrationResponse retrieve(String crReferenceId);
	
	CollateralAssetCaptureBaseWithId retrieveCaptures(String crReferenceId, String bqReferenceId);
	
	MaintenanceWithIdAndRoot retrieveMaintenances(String crReferenceId, String bqReferenceId);
	
	CollateralAssetAdministrationReportingResponse retrieveReportings(String crReferenceId, String bqReferenceId);
	
	UpdateBaseWithIdAndRoot retrieveUpdates(String crReferenceId, String bqReferenceId);
	
	ValuationBaseWithIdAndRoot retrieveValuations(String crReferenceId, String bqReferenceId);
	
	CollateralAssetUpdateResponse update(String crReferenceId, CollateralAssetUpdateRequest request);
	
}
