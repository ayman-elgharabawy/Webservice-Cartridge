// license-header java merge-point
//
// Attention: generated code (by Metafacade.vsl) - do not modify!
//
package org.andromda.cartridges.webservice.metafacades;

import org.andromda.metafacades.uml.ServiceOperation;

/**
 * <p>
 * Represents an operation on a web service.
 * </p>
 *
 * Metafacade interface to be used by AndroMDA cartridges.
 */
public interface WebServiceOperation
    extends ServiceOperation
{
    /**
     * Indicates the metafacade type (used for metafacade mappings).
     *
     * @return boolean always <code>true</code>
     */
    public boolean isWebServiceOperationMetaType();

    /**
     * <p>
     * Returns the customized operation name. Defaults to
     * operation.name, can be overridden with WebServiceOperation
     * stereotype operationName attribute. Prevents duplicate operation
     * names in wsdl for overloaded operations.
     * </p>
     * @return String
     */
    public String getOperationName();

    /**
     * <p>
     * WebService parameter style: bare or wrapped
     * </p>
     * @return String
     */
    public String getParameterStyle();

    /**
     * 
     * @return String
     */
    public String getRestCacheType();

    /**
     * <p>
     * @Consumes(media type) annotation. i.e. json, atom, plain/text,
     * xml.
     * </p>
     * @return String
     */
    public String getRestConsumes();

    /**
     * <p>
     * Multipart/xml type for this returned part.
     * </p>
     * @return String
     */
    public String getRestPartType();

    /**
     * <p>
     * The URL path for the REST webservice. If unspecified, the
     * lowercase /operation/parametername/{parametername}/ is used.
     * </p>
     * @return String
     */
    public String getRestPath();

    /**
     * <p>
     * @Produces(media type) annotation. i.e. json, atom, plain/text,
     * xml.
     * </p>
     * @return String
     */
    public String getRestProduces();

    /**
     * <p>
     * Customized REST @Provider annotation, must be implemented in the
     *  generated class.
     * </p>
     * @return String
     */
    public String getRestProvider();

    /**
     * <p>
     * HTML request type for this REST service (GET, PUT, POST, QUERY,
     * DELETE), used for method annotations.
     * </p>
     * @return String
     */
    public String getRestRequestType();

    /**
     * <p>
     * Asynchronous service implementation, suspend execution for X ms.
     * Adds @Suspend annotation to the operation. default=synchronous
     * (suspend=0=wait forever).
     * </p>
     * @return int
     */
    public int getRestSuspend();

    /**
     * <p>
     * The URL path to test the REST webservice. Substitutes test
     * values for {parametername} parts of the service URL.
     * </p>
     * @return String
     */
    public String getRestTestPath();

    /**
     * <p>
     * REST security roles allowed. default=All.
     * </p>
     * @return String
     */
    public String getRolesAllowed();

    /**
     * <p>
     * The call for the test that tests this operation.
     * </p>
     * @return String
     */
    public String getTestCall();

    /**
     * <p>
     * The method call for the test implementation operation.
     * </p>
     * @return String
     */
    public String getTestImplementationCall();

    /**
     * <p>
     * The name of the the operation used within the test
     * implementation.
     * </p>
     * @return String
     */
    public String getTestImplementationName();

    /**
     * <p>
     * The signature for the test implementation operation.
     * </p>
     * @return String
     */
    public String getTestImplementationSignature();

    /**
     * <p>
     * The name for the test that tests this operation.
     * </p>
     * @return String
     */
    public String getTestName();

    /**
     * <p>
     * The signature for the test that tests this operation.
     * </p>
     * @return String
     */
    public String getTestSignature();

    /**
     * 
     * @return WebServicePackage
     */
    public WebServicePackage getWebServicePackage();

    /**
     * <p>
     * Returns true/false depending on whether or not this web service
     * operation is exposed.
     * </p>
     * @return boolean
     */
    public boolean isExposed();

    /**
     * <p>
     * Is this operation a JAX-RS REST operation? JAX-WS and JAX-RS can
     * be mixed in the same service class. If false, all rest
     * attributes and methods are ignored.
     * </p>
     * @return boolean
     */
    public boolean isRest();

    /**
     * <p>
     * If this REST service provides application/atom, or any service
     * operations provide application/atom
     * </p>
     * @return boolean
     */
    public boolean isRestAtom();

    /**
     * <p>
     * @Encoded T/F. default=false.
     * </p>
     * @return boolean
     */
    public boolean isRestEncoded();

    /**
     * <p>
     * Checks is each service exception reference is some Exception
     * type and has stereotype WebFault, if CXF.
     * </p>
     * @return boolean
     */
    public boolean isWebFaultOnAllExceptions();
}