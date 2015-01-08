
package service.webservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "HackService", targetNamespace = "http://webService/")
@SOAPBinding(style = SOAPBinding.Style.RPC)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface HackService {


    /**
     * 
     * @param arg0
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://webService/HackService/updateUserRequest", output = "http://webService/HackService/updateUserResponse")
    public int updateUser(
        @WebParam(name = "arg0", partName = "arg0")
        User arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns service.webservice.User
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://webService/HackService/queryUserRequest", output = "http://webService/HackService/queryUserResponse")
    public User queryUser(
        @WebParam(name = "arg0", partName = "arg0")
        int arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://webService/HackService/addTranscationRequest", output = "http://webService/HackService/addTranscationResponse")
    public int addTranscation(
        @WebParam(name = "arg0", partName = "arg0")
        Transaction arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns service.webservice.Transaction
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://webService/HackService/queryTransactionDetailRequest", output = "http://webService/HackService/queryTransactionDetailResponse")
    public Transaction queryTransactionDetail(
        @WebParam(name = "arg0", partName = "arg0")
        int arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns service.webservice.TransactionArray
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://webService/HackService/queryTransactionListRequest", output = "http://webService/HackService/queryTransactionListResponse")
    public TransactionArray queryTransactionList(
        @WebParam(name = "arg0", partName = "arg0")
        QueryConfig arg0);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://webService/HackService/processTransactionRequest", output = "http://webService/HackService/processTransactionResponse")
    public int processTransaction(
        @WebParam(name = "arg0", partName = "arg0")
        int arg0,
        @WebParam(name = "arg1", partName = "arg1")
        int arg1);

}