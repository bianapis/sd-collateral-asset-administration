/**
 * @author Virtusa
 */
package org.bian.controller;

import java.util.List;
import org.bian.annotation.BianRestController;
import org.bian.annotation.BQ;
import org.bian.dto.BianRequest;
import org.bian.dto.BianResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.bian.dto.*;
import org.bian.service.*;
import org.bian.annotation.functionalpattern.Administer;

@BianRestController
public class CollateralAssetAdministrationApiController {

	@Autowired
	CollateralAssetAdministrationApiService service;
	
	@Administer.Record
	public BianResponse<CollateralAssetAdministrationRecordResponse> record(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CollateralAssetAdministrationRecordRequest> bianRequest) {
		return BianResponse.forSuccess(service.record(crReferenceId, bianRequest.getData()));
	}
	
	@BQ("captures")
	@Administer.RequestPost
	public BianResponse<CaptureBaseWithId> requestPostCaptures(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CaptureBase> bianRequest) {
		return BianResponse.forSuccess(service.requestPostCaptures(crReferenceId, bianRequest.getData()));
	}
	
	@BQ("captures")
	@Administer.RequestPut
	public BianResponse<CaptureBaseWithId> requestPutCaptures(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<CaptureBase> bianRequest) {
		return BianResponse.forSuccess(service.requestPutCaptures(crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Administer.RequestPost
	public BianResponse<CollateralAssetBaseWithId> requestPost(@RequestBody BianRequest<CollateralAssetBase> bianRequest) {
		return BianResponse.forSuccess(service.requestPost(bianRequest.getData()));
	}
	
	@Administer.RequestPut
	public BianResponse<CollateralAssetBaseWithId> requestPut(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CollateralAssetBase> bianRequest) {
		return BianResponse.forSuccess(service.requestPut(crReferenceId, bianRequest.getData()));
	}
	
	@BQ("valuations")
	@Administer.RequestPut
	public BianResponse<CollateralAssetAdministrationRefreshResponse> requestPutValuations(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.requestPutValuations(crReferenceId, bqReferenceId));
	}
	
	@Administer.RetrieveBQIds
	public BianResponse<List<String>> retrieveBQIds(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("behavior-qualifier") String behaviorQualifier) {
		return BianResponse.forSuccess(service.retrieveBQIds(crReferenceId, behaviorQualifier));
	}
	
	@Administer.RetrieveBQs
	public BianResponse<List<String>> retrieveBQs() {
		return BianResponse.forSuccess(service.retrieveBQs());
	}
	
	@Administer.RetrieveRefIds
	public BianResponse<List<String>> retrieveRefIds() {
		return BianResponse.forSuccess(service.retrieveRefIds());
	}
	
	@Administer.Retrieve
	public BianResponse<RetrieveCollateralAssetAdministrationResponse> retrieve(@PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.retrieve(crReferenceId));
	}
	
	@BQ("captures")
	@Administer.Retrieve
	public BianResponse<CollateralAssetCaptureBaseWithId> retrieveCaptures(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveCaptures(crReferenceId, bqReferenceId));
	}
	
	@BQ("maintenances")
	@Administer.Retrieve
	public BianResponse<MaintenanceWithIdAndRoot> retrieveMaintenances(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveMaintenances(crReferenceId, bqReferenceId));
	}
	
	@BQ("reportings")
	@Administer.Retrieve
	public BianResponse<CollateralAssetAdministrationReportingResponse> retrieveReportings(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveReportings(crReferenceId, bqReferenceId));
	}
	
	@BQ("updates")
	@Administer.Retrieve
	public BianResponse<UpdateBaseWithIdAndRoot> retrieveUpdates(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveUpdates(crReferenceId, bqReferenceId));
	}
	
	@BQ("valuations")
	@Administer.Retrieve
	public BianResponse<ValuationBaseWithIdAndRoot> retrieveValuations(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveValuations(crReferenceId, bqReferenceId));
	}
	
	@Administer.Update
	public BianResponse<CollateralAssetUpdateResponse> update(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CollateralAssetUpdateRequest> bianRequest) {
		return BianResponse.forSuccess(service.update(crReferenceId, bianRequest.getData()));
	}
	
}
