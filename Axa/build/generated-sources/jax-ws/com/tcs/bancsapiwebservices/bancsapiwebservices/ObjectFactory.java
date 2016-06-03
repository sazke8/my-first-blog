
package com.tcs.bancsapiwebservices.bancsapiwebservices;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import com.tcs.bancsapiwebservicescommon.bancsapiwebservicescommon.ReceiptsInfo;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.tcs.bancsapiwebservices.bancsapiwebservices package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CatalogueRequest_QNAME = new QName("http://www.tcs.com/BancsAPIWebservices/BancsAPIWebservices", "catalogueRequest");
    private final static QName _AddRiskRequest_QNAME = new QName("http://www.tcs.com/BancsAPIWebservices/BancsAPIWebservices", "addRiskRequest");
    private final static QName _MultiSearchRequest_QNAME = new QName("http://www.tcs.com/BancsAPIWebservices/BancsAPIWebservices", "multiSearchRequest");
    private final static QName _MultiSearchResponse_QNAME = new QName("http://www.tcs.com/BancsAPIWebservices/BancsAPIWebservices", "multiSearchResponse");
    private final static QName _CancellationRequest_QNAME = new QName("http://www.tcs.com/BancsAPIWebservices/BancsAPIWebservices", "cancellationRequest");
    private final static QName _CancellationResponse_QNAME = new QName("http://www.tcs.com/BancsAPIWebservices/BancsAPIWebservices", "cancellationResponse");
    private final static QName _EndorsementRequest_QNAME = new QName("http://www.tcs.com/BancsAPIWebservices/BancsAPIWebservices", "endorsementRequest");
    private final static QName _SearchResponse_QNAME = new QName("http://www.tcs.com/BancsAPIWebservices/BancsAPIWebservices", "searchResponse");
    private final static QName _CatalogueResponse_QNAME = new QName("http://www.tcs.com/BancsAPIWebservices/BancsAPIWebservices", "catalogueResponse");
    private final static QName _IssuanceResponse_QNAME = new QName("http://www.tcs.com/BancsAPIWebservices/BancsAPIWebservices", "issuanceResponse");
    private final static QName _IssuanceRequest_QNAME = new QName("http://www.tcs.com/BancsAPIWebservices/BancsAPIWebservices", "issuanceRequest");
    private final static QName _AddRiskResponse_QNAME = new QName("http://www.tcs.com/BancsAPIWebservices/BancsAPIWebservices", "addRiskResponse");
    private final static QName _SearchRequest_QNAME = new QName("http://www.tcs.com/BancsAPIWebservices/BancsAPIWebservices", "searchRequest");
    private final static QName _EndorsementResponse_QNAME = new QName("http://www.tcs.com/BancsAPIWebservices/BancsAPIWebservices", "endorsementResponse");
    private final static QName _MultiSearchPolicyDetailsMultiSearchVehicleDetails_QNAME = new QName("", "multiSearchVehicleDetails");
    private final static QName _SearchDetailsSearchDriverInfo_QNAME = new QName("", "searchDriverInfo");
    private final static QName _SearchDetailsSearchGeneralInfo_QNAME = new QName("", "searchGeneralInfo");
    private final static QName _SearchDetailsSearchCustomerInfo_QNAME = new QName("", "searchCustomerInfo");
    private final static QName _SearchDetailsSearchSpecialEquipInfo_QNAME = new QName("", "searchSpecialEquipInfo");
    private final static QName _SearchDetailsSearchBeneficiaryInfo_QNAME = new QName("", "searchBeneficiaryInfo");
    private final static QName _SearchDetailsSearchAccBeneficiaryInfo_QNAME = new QName("", "searchAccBeneficiaryInfo");
    private final static QName _SearchDetailsSearchCoverageInfo_QNAME = new QName("", "searchCoverageInfo");
    private final static QName _QuoteInfoReceiptsInfo_QNAME = new QName("", "receiptsInfo");
    private final static QName _SearchGeneralInfoSearchVehicleInfo_QNAME = new QName("", "searchVehicleInfo");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.tcs.bancsapiwebservices.bancsapiwebservices
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link IssuanceResponse }
     * 
     */
    public IssuanceResponse createIssuanceResponse() {
        return new IssuanceResponse();
    }

    /**
     * Create an instance of {@link IssuanceRequest }
     * 
     */
    public IssuanceRequest createIssuanceRequest() {
        return new IssuanceRequest();
    }

    /**
     * Create an instance of {@link SearchResponse }
     * 
     */
    public SearchResponse createSearchResponse() {
        return new SearchResponse();
    }

    /**
     * Create an instance of {@link CatalogueResponse }
     * 
     */
    public CatalogueResponse createCatalogueResponse() {
        return new CatalogueResponse();
    }

    /**
     * Create an instance of {@link SearchRequest }
     * 
     */
    public SearchRequest createSearchRequest() {
        return new SearchRequest();
    }

    /**
     * Create an instance of {@link EndorsementRequest }
     * 
     */
    public EndorsementRequest createEndorsementRequest() {
        return new EndorsementRequest();
    }

    /**
     * Create an instance of {@link EndorsementResponse }
     * 
     */
    public EndorsementResponse createEndorsementResponse() {
        return new EndorsementResponse();
    }

    /**
     * Create an instance of {@link CatalogueRequest }
     * 
     */
    public CatalogueRequest createCatalogueRequest() {
        return new CatalogueRequest();
    }

    /**
     * Create an instance of {@link AddRiskResponse }
     * 
     */
    public AddRiskResponse createAddRiskResponse() {
        return new AddRiskResponse();
    }

    /**
     * Create an instance of {@link CancellationRequest }
     * 
     */
    public CancellationRequest createCancellationRequest() {
        return new CancellationRequest();
    }

    /**
     * Create an instance of {@link CancellationResponse }
     * 
     */
    public CancellationResponse createCancellationResponse() {
        return new CancellationResponse();
    }

    /**
     * Create an instance of {@link MultiSearchRequest }
     * 
     */
    public MultiSearchRequest createMultiSearchRequest() {
        return new MultiSearchRequest();
    }

    /**
     * Create an instance of {@link MultiSearchResponse }
     * 
     */
    public MultiSearchResponse createMultiSearchResponse() {
        return new MultiSearchResponse();
    }

    /**
     * Create an instance of {@link AddRiskRequest }
     * 
     */
    public AddRiskRequest createAddRiskRequest() {
        return new AddRiskRequest();
    }

    /**
     * Create an instance of {@link Endorsement }
     * 
     */
    public Endorsement createEndorsement() {
        return new Endorsement();
    }

    /**
     * Create an instance of {@link SearchCustomerInfo }
     * 
     */
    public SearchCustomerInfo createSearchCustomerInfo() {
        return new SearchCustomerInfo();
    }

    /**
     * Create an instance of {@link SearchSpecialEquipInfo }
     * 
     */
    public SearchSpecialEquipInfo createSearchSpecialEquipInfo() {
        return new SearchSpecialEquipInfo();
    }

    /**
     * Create an instance of {@link EndorsePartyDetails }
     * 
     */
    public EndorsePartyDetails createEndorsePartyDetails() {
        return new EndorsePartyDetails();
    }

    /**
     * Create an instance of {@link QuickQuoteInfo }
     * 
     */
    public QuickQuoteInfo createQuickQuoteInfo() {
        return new QuickQuoteInfo();
    }

    /**
     * Create an instance of {@link EndorsementDetails }
     * 
     */
    public EndorsementDetails createEndorsementDetails() {
        return new EndorsementDetails();
    }

    /**
     * Create an instance of {@link EndorseCoverInfo }
     * 
     */
    public EndorseCoverInfo createEndorseCoverInfo() {
        return new EndorseCoverInfo();
    }

    /**
     * Create an instance of {@link NonFinancialEndorseInfo }
     * 
     */
    public NonFinancialEndorseInfo createNonFinancialEndorseInfo() {
        return new NonFinancialEndorseInfo();
    }

    /**
     * Create an instance of {@link IssuePolicyInfo }
     * 
     */
    public IssuePolicyInfo createIssuePolicyInfo() {
        return new IssuePolicyInfo();
    }

    /**
     * Create an instance of {@link EndorsePaymentInfo }
     * 
     */
    public EndorsePaymentInfo createEndorsePaymentInfo() {
        return new EndorsePaymentInfo();
    }

    /**
     * Create an instance of {@link EndorseReceiptDetails }
     * 
     */
    public EndorseReceiptDetails createEndorseReceiptDetails() {
        return new EndorseReceiptDetails();
    }

    /**
     * Create an instance of {@link AddRisk }
     * 
     */
    public AddRisk createAddRisk() {
        return new AddRisk();
    }

    /**
     * Create an instance of {@link MultiSearchVehicleDetails }
     * 
     */
    public MultiSearchVehicleDetails createMultiSearchVehicleDetails() {
        return new MultiSearchVehicleDetails();
    }

    /**
     * Create an instance of {@link CatalogueDetails }
     * 
     */
    public CatalogueDetails createCatalogueDetails() {
        return new CatalogueDetails();
    }

    /**
     * Create an instance of {@link IssuanceDetails }
     * 
     */
    public IssuanceDetails createIssuanceDetails() {
        return new IssuanceDetails();
    }

    /**
     * Create an instance of {@link SearchVehicleInfo }
     * 
     */
    public SearchVehicleInfo createSearchVehicleInfo() {
        return new SearchVehicleInfo();
    }

    /**
     * Create an instance of {@link SearchDetails }
     * 
     */
    public SearchDetails createSearchDetails() {
        return new SearchDetails();
    }

    /**
     * Create an instance of {@link IssuePolicyDeatils }
     * 
     */
    public IssuePolicyDeatils createIssuePolicyDeatils() {
        return new IssuePolicyDeatils();
    }

    /**
     * Create an instance of {@link SearchAccBeneficiaryInfo }
     * 
     */
    public SearchAccBeneficiaryInfo createSearchAccBeneficiaryInfo() {
        return new SearchAccBeneficiaryInfo();
    }

    /**
     * Create an instance of {@link Catalogue }
     * 
     */
    public Catalogue createCatalogue() {
        return new Catalogue();
    }

    /**
     * Create an instance of {@link SearchGeneralInfo }
     * 
     */
    public SearchGeneralInfo createSearchGeneralInfo() {
        return new SearchGeneralInfo();
    }

    /**
     * Create an instance of {@link Cancellation }
     * 
     */
    public Cancellation createCancellation() {
        return new Cancellation();
    }

    /**
     * Create an instance of {@link CancellationDetails }
     * 
     */
    public CancellationDetails createCancellationDetails() {
        return new CancellationDetails();
    }

    /**
     * Create an instance of {@link EndorseRiskInfo }
     * 
     */
    public EndorseRiskInfo createEndorseRiskInfo() {
        return new EndorseRiskInfo();
    }

    /**
     * Create an instance of {@link EndorseAgentInfo }
     * 
     */
    public EndorseAgentInfo createEndorseAgentInfo() {
        return new EndorseAgentInfo();
    }

    /**
     * Create an instance of {@link RiskEndorsementDetails }
     * 
     */
    public RiskEndorsementDetails createRiskEndorsementDetails() {
        return new RiskEndorsementDetails();
    }

    /**
     * Create an instance of {@link Search }
     * 
     */
    public Search createSearch() {
        return new Search();
    }

    /**
     * Create an instance of {@link FinancialEndorseInfo }
     * 
     */
    public FinancialEndorseInfo createFinancialEndorseInfo() {
        return new FinancialEndorseInfo();
    }

    /**
     * Create an instance of {@link DomainList }
     * 
     */
    public DomainList createDomainList() {
        return new DomainList();
    }

    /**
     * Create an instance of {@link QuoteInfo }
     * 
     */
    public QuoteInfo createQuoteInfo() {
        return new QuoteInfo();
    }

    /**
     * Create an instance of {@link SearchReceiptsInfo }
     * 
     */
    public SearchReceiptsInfo createSearchReceiptsInfo() {
        return new SearchReceiptsInfo();
    }

    /**
     * Create an instance of {@link MultiSearch }
     * 
     */
    public MultiSearch createMultiSearch() {
        return new MultiSearch();
    }

    /**
     * Create an instance of {@link MultiSearchPolicyDetails }
     * 
     */
    public MultiSearchPolicyDetails createMultiSearchPolicyDetails() {
        return new MultiSearchPolicyDetails();
    }

    /**
     * Create an instance of {@link EndorseCustomerInfo }
     * 
     */
    public EndorseCustomerInfo createEndorseCustomerInfo() {
        return new EndorseCustomerInfo();
    }

    /**
     * Create an instance of {@link PackageCoverInfo }
     * 
     */
    public PackageCoverInfo createPackageCoverInfo() {
        return new PackageCoverInfo();
    }

    /**
     * Create an instance of {@link GeneralInfo }
     * 
     */
    public GeneralInfo createGeneralInfo() {
        return new GeneralInfo();
    }

    /**
     * Create an instance of {@link SearchDriverInfo }
     * 
     */
    public SearchDriverInfo createSearchDriverInfo() {
        return new SearchDriverInfo();
    }

    /**
     * Create an instance of {@link SearchBeneficiaryInfo }
     * 
     */
    public SearchBeneficiaryInfo createSearchBeneficiaryInfo() {
        return new SearchBeneficiaryInfo();
    }

    /**
     * Create an instance of {@link Issuance }
     * 
     */
    public Issuance createIssuance() {
        return new Issuance();
    }

    /**
     * Create an instance of {@link SearchCoverageInfo }
     * 
     */
    public SearchCoverageInfo createSearchCoverageInfo() {
        return new SearchCoverageInfo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CatalogueRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tcs.com/BancsAPIWebservices/BancsAPIWebservices", name = "catalogueRequest")
    public JAXBElement<CatalogueRequest> createCatalogueRequest(CatalogueRequest value) {
        return new JAXBElement<CatalogueRequest>(_CatalogueRequest_QNAME, CatalogueRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddRiskRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tcs.com/BancsAPIWebservices/BancsAPIWebservices", name = "addRiskRequest")
    public JAXBElement<AddRiskRequest> createAddRiskRequest(AddRiskRequest value) {
        return new JAXBElement<AddRiskRequest>(_AddRiskRequest_QNAME, AddRiskRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MultiSearchRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tcs.com/BancsAPIWebservices/BancsAPIWebservices", name = "multiSearchRequest")
    public JAXBElement<MultiSearchRequest> createMultiSearchRequest(MultiSearchRequest value) {
        return new JAXBElement<MultiSearchRequest>(_MultiSearchRequest_QNAME, MultiSearchRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MultiSearchResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tcs.com/BancsAPIWebservices/BancsAPIWebservices", name = "multiSearchResponse")
    public JAXBElement<MultiSearchResponse> createMultiSearchResponse(MultiSearchResponse value) {
        return new JAXBElement<MultiSearchResponse>(_MultiSearchResponse_QNAME, MultiSearchResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CancellationRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tcs.com/BancsAPIWebservices/BancsAPIWebservices", name = "cancellationRequest")
    public JAXBElement<CancellationRequest> createCancellationRequest(CancellationRequest value) {
        return new JAXBElement<CancellationRequest>(_CancellationRequest_QNAME, CancellationRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CancellationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tcs.com/BancsAPIWebservices/BancsAPIWebservices", name = "cancellationResponse")
    public JAXBElement<CancellationResponse> createCancellationResponse(CancellationResponse value) {
        return new JAXBElement<CancellationResponse>(_CancellationResponse_QNAME, CancellationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EndorsementRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tcs.com/BancsAPIWebservices/BancsAPIWebservices", name = "endorsementRequest")
    public JAXBElement<EndorsementRequest> createEndorsementRequest(EndorsementRequest value) {
        return new JAXBElement<EndorsementRequest>(_EndorsementRequest_QNAME, EndorsementRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tcs.com/BancsAPIWebservices/BancsAPIWebservices", name = "searchResponse")
    public JAXBElement<SearchResponse> createSearchResponse(SearchResponse value) {
        return new JAXBElement<SearchResponse>(_SearchResponse_QNAME, SearchResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CatalogueResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tcs.com/BancsAPIWebservices/BancsAPIWebservices", name = "catalogueResponse")
    public JAXBElement<CatalogueResponse> createCatalogueResponse(CatalogueResponse value) {
        return new JAXBElement<CatalogueResponse>(_CatalogueResponse_QNAME, CatalogueResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IssuanceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tcs.com/BancsAPIWebservices/BancsAPIWebservices", name = "issuanceResponse")
    public JAXBElement<IssuanceResponse> createIssuanceResponse(IssuanceResponse value) {
        return new JAXBElement<IssuanceResponse>(_IssuanceResponse_QNAME, IssuanceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IssuanceRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tcs.com/BancsAPIWebservices/BancsAPIWebservices", name = "issuanceRequest")
    public JAXBElement<IssuanceRequest> createIssuanceRequest(IssuanceRequest value) {
        return new JAXBElement<IssuanceRequest>(_IssuanceRequest_QNAME, IssuanceRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddRiskResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tcs.com/BancsAPIWebservices/BancsAPIWebservices", name = "addRiskResponse")
    public JAXBElement<AddRiskResponse> createAddRiskResponse(AddRiskResponse value) {
        return new JAXBElement<AddRiskResponse>(_AddRiskResponse_QNAME, AddRiskResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tcs.com/BancsAPIWebservices/BancsAPIWebservices", name = "searchRequest")
    public JAXBElement<SearchRequest> createSearchRequest(SearchRequest value) {
        return new JAXBElement<SearchRequest>(_SearchRequest_QNAME, SearchRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EndorsementResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tcs.com/BancsAPIWebservices/BancsAPIWebservices", name = "endorsementResponse")
    public JAXBElement<EndorsementResponse> createEndorsementResponse(EndorsementResponse value) {
        return new JAXBElement<EndorsementResponse>(_EndorsementResponse_QNAME, EndorsementResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MultiSearchVehicleDetails }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "multiSearchVehicleDetails", scope = MultiSearchPolicyDetails.class)
    public JAXBElement<MultiSearchVehicleDetails> createMultiSearchPolicyDetailsMultiSearchVehicleDetails(MultiSearchVehicleDetails value) {
        return new JAXBElement<MultiSearchVehicleDetails>(_MultiSearchPolicyDetailsMultiSearchVehicleDetails_QNAME, MultiSearchVehicleDetails.class, MultiSearchPolicyDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchDriverInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "searchDriverInfo", scope = SearchDetails.class)
    public JAXBElement<SearchDriverInfo> createSearchDetailsSearchDriverInfo(SearchDriverInfo value) {
        return new JAXBElement<SearchDriverInfo>(_SearchDetailsSearchDriverInfo_QNAME, SearchDriverInfo.class, SearchDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchGeneralInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "searchGeneralInfo", scope = SearchDetails.class)
    public JAXBElement<SearchGeneralInfo> createSearchDetailsSearchGeneralInfo(SearchGeneralInfo value) {
        return new JAXBElement<SearchGeneralInfo>(_SearchDetailsSearchGeneralInfo_QNAME, SearchGeneralInfo.class, SearchDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchCustomerInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "searchCustomerInfo", scope = SearchDetails.class)
    public JAXBElement<SearchCustomerInfo> createSearchDetailsSearchCustomerInfo(SearchCustomerInfo value) {
        return new JAXBElement<SearchCustomerInfo>(_SearchDetailsSearchCustomerInfo_QNAME, SearchCustomerInfo.class, SearchDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchSpecialEquipInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "searchSpecialEquipInfo", scope = SearchDetails.class)
    public JAXBElement<SearchSpecialEquipInfo> createSearchDetailsSearchSpecialEquipInfo(SearchSpecialEquipInfo value) {
        return new JAXBElement<SearchSpecialEquipInfo>(_SearchDetailsSearchSpecialEquipInfo_QNAME, SearchSpecialEquipInfo.class, SearchDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchBeneficiaryInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "searchBeneficiaryInfo", scope = SearchDetails.class)
    public JAXBElement<SearchBeneficiaryInfo> createSearchDetailsSearchBeneficiaryInfo(SearchBeneficiaryInfo value) {
        return new JAXBElement<SearchBeneficiaryInfo>(_SearchDetailsSearchBeneficiaryInfo_QNAME, SearchBeneficiaryInfo.class, SearchDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchAccBeneficiaryInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "searchAccBeneficiaryInfo", scope = SearchDetails.class)
    public JAXBElement<SearchAccBeneficiaryInfo> createSearchDetailsSearchAccBeneficiaryInfo(SearchAccBeneficiaryInfo value) {
        return new JAXBElement<SearchAccBeneficiaryInfo>(_SearchDetailsSearchAccBeneficiaryInfo_QNAME, SearchAccBeneficiaryInfo.class, SearchDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchCoverageInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "searchCoverageInfo", scope = SearchDetails.class)
    public JAXBElement<SearchCoverageInfo> createSearchDetailsSearchCoverageInfo(SearchCoverageInfo value) {
        return new JAXBElement<SearchCoverageInfo>(_SearchDetailsSearchCoverageInfo_QNAME, SearchCoverageInfo.class, SearchDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReceiptsInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "receiptsInfo", scope = QuoteInfo.class)
    public JAXBElement<ReceiptsInfo> createQuoteInfoReceiptsInfo(ReceiptsInfo value) {
        return new JAXBElement<ReceiptsInfo>(_QuoteInfoReceiptsInfo_QNAME, ReceiptsInfo.class, QuoteInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchVehicleInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "searchVehicleInfo", scope = SearchGeneralInfo.class)
    public JAXBElement<SearchVehicleInfo> createSearchGeneralInfoSearchVehicleInfo(SearchVehicleInfo value) {
        return new JAXBElement<SearchVehicleInfo>(_SearchGeneralInfoSearchVehicleInfo_QNAME, SearchVehicleInfo.class, SearchGeneralInfo.class, value);
    }

}
