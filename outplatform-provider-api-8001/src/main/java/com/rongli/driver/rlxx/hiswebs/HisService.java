package com.rongli.driver.rlxx.hiswebs;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * This class was generated by the JAX-WS RI. JAX-WS RI 2.1.3-hudson-390-
 * Generated source version: 2.0
 * 
 */
@WebService(name = "HisService", targetNamespace = "http://jaxws.yj.com/")
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface HisService {

	/**
	 * 
	 * @return returns java.lang.String
	 */
	@WebMethod(operationName = "SayHiDefault")
	@WebResult(partName = "return")
	public String sayHiDefault();

	/**
	 * 
	 * @param clientTime
	 * @return returns int
	 */
	@WebMethod(operationName = "CheckTime")
	@WebResult(name = "valid", partName = "valid")
	public int checkTime(
			@WebParam(name = "clientTime", partName = "clientTime") XMLGregorianCalendar clientTime);

	/**
	 * 
	 * @param name
	 * @return returns java.lang.String
	 */
	@WebMethod(operationName = "SayHi")
	@WebResult(partName = "return")
	public String sayHi(@WebParam(name = "name", partName = "name") String name);

	/**
	 * 
	 * @param recv
	 * @return returns java.lang.String
	 */
	@WebMethod
	@WebResult(partName = "return")
	public String getPatientInfoByJson(
			@WebParam(name = "recv", partName = "recv") String recv);

	/**
	 * 
	 * @param recv
	 * @return returns java.lang.String
	 */
	@WebMethod
	@WebResult(partName = "return")
	public String queryInpatientInfo(
			@WebParam(name = "recv", partName = "recv") String recv);

	/**
	 * 
	 * @param recv
	 * @return returns java.lang.String
	 */
	@WebMethod
	@WebResult(partName = "return")
	public String queryInhosFeeDetail(
			@WebParam(name = "recv", partName = "recv") String recv);

	/**
	 * 
	 * @param recv
	 * @return returns java.lang.String
	 */
	@WebMethod
	@WebResult(partName = "return")
	public String getPatientInfoByVertical(
			@WebParam(name = "recv", partName = "recv") String recv);

	/**
	 * 
	 * @param recv
	 * @return returns java.lang.String
	 */
	@WebMethod
	@WebResult(partName = "return")
	public String getPatientListByJson(
			@WebParam(name = "recv", partName = "recv") String recv);

	/**
	 * 
	 * @param recv
	 * @return returns java.lang.String
	 */
	@WebMethod
	@WebResult(partName = "return")
	public String getPatientListByVertical(
			@WebParam(name = "recv", partName = "recv") String recv);

	/**
	 * 
	 * @param recv
	 * @return returns java.lang.String
	 */
	@WebMethod
	@WebResult(partName = "return")
	public String queryExamineReport(
			@WebParam(name = "recv", partName = "recv") String recv);

	/**
	 * 
	 * @param recv
	 * @return returns java.lang.String
	 */
	@WebMethod
	@WebResult(partName = "return")
	public String queryBillPayDetail(
			@WebParam(name = "recv", partName = "recv") String recv);

	/**
	 * 
	 * @param recv
	 * @return returns java.lang.String
	 */
	@WebMethod
	@WebResult(partName = "return")
	public String queryExamineReportContent(
			@WebParam(name = "recv", partName = "recv") String recv);

	/**
	 * 
	 * @param recv
	 * @return returns java.lang.String
	 */
	@WebMethod
	@WebResult(partName = "return")
	public String unlockRegisterNo(
			@WebParam(name = "recv", partName = "recv") String recv);

	/**
	 * 
	 * @param recv
	 * @return returns java.lang.String
	 */
	@WebMethod
	@WebResult(partName = "return")
	public String checkPatientCard(
			@WebParam(name = "recv", partName = "recv") String recv);

	/**
	 * 
	 * @param recv
	 * @return returns java.lang.String
	 */
	@WebMethod
	@WebResult(partName = "return")
	public String getSchedule(
			@WebParam(name = "recv", partName = "recv") String recv);

	/**
	 * 
	 * @param recv
	 * @return returns java.lang.String
	 */
	@WebMethod
	@WebResult(partName = "return")
	public String getRegIndex(
			@WebParam(name = "recv", partName = "recv") String recv);

	/**
	 * 
	 * @param recv
	 * @return returns java.lang.String
	 */
	@WebMethod
	@WebResult(partName = "return")
	public String registerPay(
			@WebParam(name = "recv", partName = "recv") String recv);

	/**
	 * 
	 * @param recv
	 * @return returns java.lang.String
	 */
	@WebMethod
	@WebResult(partName = "return")
	public String getBill(
			@WebParam(name = "recv", partName = "recv") String recv);

	/**
	 * 
	 * @param recv
	 * @return returns java.lang.String
	 */
	@WebMethod
	@WebResult(partName = "return")
	public String getBillDetail(
			@WebParam(name = "recv", partName = "recv") String recv);

	/**
	 * 
	 * @param recv
	 * @return returns java.lang.String
	 */
	@WebMethod
	@WebResult(partName = "return")
	public String regPatientInfo(
			@WebParam(name = "recv", partName = "recv") String recv);

	/**
	 * 
	 * @param recv
	 * @return returns java.lang.String
	 */
	@WebMethod
	@WebResult(partName = "return")
	public String getPatientInfo(
			@WebParam(name = "recv", partName = "recv") String recv);

	/**
	 * 
	 * @param recv
	 * @return returns java.lang.String
	 */
	@WebMethod
	@WebResult(partName = "return")
	public String lockRegisterNo(
			@WebParam(name = "recv", partName = "recv") String recv);

	/**
	 * 
	 * @param recv
	 * @return returns java.lang.String
	 */
	@WebMethod
	@WebResult(partName = "return")
	public String queryBillPay(
			@WebParam(name = "recv", partName = "recv") String recv);

	/**
	 * 
	 * @param recv
	 * @return returns java.lang.String
	 */
	@WebMethod
	@WebResult(partName = "return")
	public String prePayExpense(
			@WebParam(name = "recv", partName = "recv") String recv);

	/**
	 * 
	 * @param recv
	 * @return returns java.lang.String
	 */
	@WebMethod
	@WebResult(partName = "return")
	public String billToPayAll(
			@WebParam(name = "recv", partName = "recv") String recv);

}
