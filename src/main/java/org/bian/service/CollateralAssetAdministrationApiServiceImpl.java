/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class CollateralAssetAdministrationApiServiceImpl implements CollateralAssetAdministrationApiService {

	public CollateralAssetAdministrationRecordResponse record(String crReferenceId, CollateralAssetAdministrationRecordRequest request){
		return JsonReader.read("record-CollateralAssetAdministrationRecordResponse.json",new TypeReference<CollateralAssetAdministrationRecordResponse>(){});
	}
	
	public CaptureBaseWithId requestPostCaptures(String crReferenceId, CaptureBase request){
		return JsonReader.read("requestPost-CaptureBaseWithId.json",new TypeReference<CaptureBaseWithId>(){});
	}
	
	public CaptureBaseWithId requestPutCaptures(String crReferenceId, String bqReferenceId, CaptureBase request){
		return JsonReader.read("requestPut-CaptureBaseWithId.json",new TypeReference<CaptureBaseWithId>(){});
	}
	
	public CollateralAssetBaseWithId requestPost(CollateralAssetBase request){
		return JsonReader.read("requestPost-CollateralAssetBaseWithId.json",new TypeReference<CollateralAssetBaseWithId>(){});
	}
	
	public CollateralAssetBaseWithId requestPut(String crReferenceId, CollateralAssetBase request){
		return JsonReader.read("requestPut-CollateralAssetBaseWithId.json",new TypeReference<CollateralAssetBaseWithId>(){});
	}
	
	public CollateralAssetAdministrationRefreshResponse requestPutValuations(String crReferenceId, String bqReferenceId){
		return JsonReader.read("requestPut-CollateralAssetAdministrationRefreshResponse.json",new TypeReference<CollateralAssetAdministrationRefreshResponse>(){});
	}
	
	public List<String> retrieveBQIds(String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveRefIds(){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public RetrieveCollateralAssetAdministrationResponse retrieve(String crReferenceId){
		return JsonReader.read("retrieve-RetrieveCollateralAssetAdministrationResponse.json",new TypeReference<RetrieveCollateralAssetAdministrationResponse>(){});
	}
	
	public CollateralAssetCaptureBaseWithId retrieveCaptures(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-CollateralAssetCaptureBaseWithId.json",new TypeReference<CollateralAssetCaptureBaseWithId>(){});
	}
	
	public MaintenanceWithIdAndRoot retrieveMaintenances(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-MaintenanceWithIdAndRoot.json",new TypeReference<MaintenanceWithIdAndRoot>(){});
	}
	
	public CollateralAssetAdministrationReportingResponse retrieveReportings(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-CollateralAssetAdministrationReportingResponse.json",new TypeReference<CollateralAssetAdministrationReportingResponse>(){});
	}
	
	public UpdateBaseWithIdAndRoot retrieveUpdates(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-UpdateBaseWithIdAndRoot.json",new TypeReference<UpdateBaseWithIdAndRoot>(){});
	}
	
	public ValuationBaseWithIdAndRoot retrieveValuations(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-ValuationBaseWithIdAndRoot.json",new TypeReference<ValuationBaseWithIdAndRoot>(){});
	}
	
	public CollateralAssetUpdateResponse update(String crReferenceId, CollateralAssetUpdateRequest request){
		return JsonReader.read("update-CollateralAssetUpdateResponse.json",new TypeReference<CollateralAssetUpdateResponse>(){});
	}
	
}
