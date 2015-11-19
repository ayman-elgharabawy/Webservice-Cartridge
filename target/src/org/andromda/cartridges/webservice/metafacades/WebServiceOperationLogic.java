// license-header java merge-point
//
// Attention: generated code (by MetafacadeLogic.vsl) - do not modify!
//
package org.andromda.cartridges.webservice.metafacades;

import java.util.Collection;
import org.andromda.core.common.Introspector;
import org.andromda.core.metafacade.MetafacadeBase;
import org.andromda.core.metafacade.MetafacadeFactory;
import org.andromda.core.metafacade.ModelValidationMessage;
import org.andromda.metafacades.uml.ClassifierFacade;
import org.andromda.metafacades.uml.ConstraintFacade;
import org.andromda.metafacades.uml.DependencyFacade;
import org.andromda.metafacades.uml.Destination;
import org.andromda.metafacades.uml.ModelElementFacade;
import org.andromda.metafacades.uml.ModelFacade;
import org.andromda.metafacades.uml.OperationFacade;
import org.andromda.metafacades.uml.PackageFacade;
import org.andromda.metafacades.uml.ParameterFacade;
import org.andromda.metafacades.uml.Role;
import org.andromda.metafacades.uml.Service;
import org.andromda.metafacades.uml.ServiceOperation;
import org.andromda.metafacades.uml.StateMachineFacade;
import org.andromda.metafacades.uml.StereotypeFacade;
import org.andromda.metafacades.uml.TaggedValueFacade;
import org.andromda.metafacades.uml.TemplateParameterFacade;
import org.andromda.metafacades.uml.TypeMappings;
import org.andromda.translation.ocl.validation.OCLExpressions;
import org.andromda.translation.ocl.validation.OCLIntrospector;
import org.andromda.translation.ocl.validation.OCLResultEnsurer;
import org.apache.log4j.Logger;

/**
 * <p>
 * Represents an operation on a web service.
 * </p>
 * MetafacadeLogic for WebServiceOperation
 *
 * @see WebServiceOperation
 */
public abstract class WebServiceOperationLogic
    extends MetafacadeBase
    implements WebServiceOperation
{
    /**
     * The underlying UML object
     * @see Object
     */
    protected Object metaObject;

    /** Create Metafacade implementation instance using the MetafacadeFactory from the context
     * @param metaObjectIn
     * @param context
     */
    protected WebServiceOperationLogic(Object metaObjectIn, String context)
    {
        super(metaObjectIn, getContext(context));
        this.superServiceOperation =
           (ServiceOperation)
            MetafacadeFactory.getInstance().createFacadeImpl(
                    "org.andromda.metafacades.uml.ServiceOperation",
                    metaObjectIn,
                    getContext(context));
        this.metaObject = metaObjectIn;
    }

    /**
     * The logger instance.
     */
    private static final Logger logger = Logger.getLogger(WebServiceOperationLogic.class);

    /**
     * Gets the context for this metafacade logic instance.
     * @param context String. Set to WebServiceOperation if null
     * @return context String
     */
    private static String getContext(String context)
    {
        if (context == null)
        {
            context = "org.andromda.cartridges.webservice.metafacades.WebServiceOperation";
        }
        return context;
    }

    private ServiceOperation superServiceOperation;
    private boolean superServiceOperationInitialized = false;

    /**
     * Gets the ServiceOperation parent instance.
     * @return this.superServiceOperation ServiceOperation
     */
    private ServiceOperation getSuperServiceOperation()
    {
        if (!this.superServiceOperationInitialized)
        {
            ((MetafacadeBase)this.superServiceOperation).setMetafacadeContext(this.getMetafacadeContext());
            this.superServiceOperationInitialized = true;
        }
        return this.superServiceOperation;
    }

    /** Reset context only for non-root metafacades
     * @param context
     * @see MetafacadeBase#resetMetafacadeContext(String context)
     */
    @Override
    public void resetMetafacadeContext(String context)
    {
        if (!this.contextRoot) // reset context only for non-root metafacades
        {
            context = getContext(context);  // to have same value as in original constructor call
            setMetafacadeContext (context);
            if (this.superServiceOperationInitialized)
            {
                ((MetafacadeBase)this.superServiceOperation).resetMetafacadeContext(context);
            }
        }
    }

    /**
     * @return boolean true always
     * @see WebServiceOperation
     */
    public boolean isWebServiceOperationMetaType()
    {
        return true;
    }

    // --------------- attributes ---------------------

   /**
    * @see org.andromda.cartridges.webservice.metafacades.WebServiceOperation#isExposed()
    * @return boolean
    */
    protected abstract boolean handleIsExposed();

    private boolean __exposed1a;
    private boolean __exposed1aSet = false;

    /**
     * <p>
     * Returns true/false depending on whether or not this web service
     * operation is exposed.
     * </p>
     * @return (boolean)handleIsExposed()
     */
    public final boolean isExposed()
    {
        boolean exposed1a = this.__exposed1a;
        if (!this.__exposed1aSet)
        {
            // exposed has no pre constraints
            exposed1a = handleIsExposed();
            // exposed has no post constraints
            this.__exposed1a = exposed1a;
            if (isMetafacadePropertyCachingEnabled())
            {
                this.__exposed1aSet = true;
            }
        }
        return exposed1a;
    }

   /**
    * @see org.andromda.cartridges.webservice.metafacades.WebServiceOperation#getTestImplementationName()
    * @return String
    */
    protected abstract String handleGetTestImplementationName();

    private String __testImplementationName2a;
    private boolean __testImplementationName2aSet = false;

    /**
     * <p>
     * The name of the the operation used within the test
     * implementation.
     * </p>
     * @return (String)handleGetTestImplementationName()
     */
    public final String getTestImplementationName()
    {
        String testImplementationName2a = this.__testImplementationName2a;
        if (!this.__testImplementationName2aSet)
        {
            // testImplementationName has no pre constraints
            testImplementationName2a = handleGetTestImplementationName();
            // testImplementationName has no post constraints
            this.__testImplementationName2a = testImplementationName2a;
            if (isMetafacadePropertyCachingEnabled())
            {
                this.__testImplementationName2aSet = true;
            }
        }
        return testImplementationName2a;
    }

   /**
    * @see org.andromda.cartridges.webservice.metafacades.WebServiceOperation#getTestImplementationCall()
    * @return String
    */
    protected abstract String handleGetTestImplementationCall();

    private String __testImplementationCall3a;
    private boolean __testImplementationCall3aSet = false;

    /**
     * <p>
     * The method call for the test implementation operation.
     * </p>
     * @return (String)handleGetTestImplementationCall()
     */
    public final String getTestImplementationCall()
    {
        String testImplementationCall3a = this.__testImplementationCall3a;
        if (!this.__testImplementationCall3aSet)
        {
            // testImplementationCall has no pre constraints
            testImplementationCall3a = handleGetTestImplementationCall();
            // testImplementationCall has no post constraints
            this.__testImplementationCall3a = testImplementationCall3a;
            if (isMetafacadePropertyCachingEnabled())
            {
                this.__testImplementationCall3aSet = true;
            }
        }
        return testImplementationCall3a;
    }

   /**
    * @see org.andromda.cartridges.webservice.metafacades.WebServiceOperation#getTestImplementationSignature()
    * @return String
    */
    protected abstract String handleGetTestImplementationSignature();

    private String __testImplementationSignature4a;
    private boolean __testImplementationSignature4aSet = false;

    /**
     * <p>
     * The signature for the test implementation operation.
     * </p>
     * @return (String)handleGetTestImplementationSignature()
     */
    public final String getTestImplementationSignature()
    {
        String testImplementationSignature4a = this.__testImplementationSignature4a;
        if (!this.__testImplementationSignature4aSet)
        {
            // testImplementationSignature has no pre constraints
            testImplementationSignature4a = handleGetTestImplementationSignature();
            // testImplementationSignature has no post constraints
            this.__testImplementationSignature4a = testImplementationSignature4a;
            if (isMetafacadePropertyCachingEnabled())
            {
                this.__testImplementationSignature4aSet = true;
            }
        }
        return testImplementationSignature4a;
    }

   /**
    * @see org.andromda.cartridges.webservice.metafacades.WebServiceOperation#getTestName()
    * @return String
    */
    protected abstract String handleGetTestName();

    private String __testName5a;
    private boolean __testName5aSet = false;

    /**
     * <p>
     * The name for the test that tests this operation.
     * </p>
     * @return (String)handleGetTestName()
     */
    public final String getTestName()
    {
        String testName5a = this.__testName5a;
        if (!this.__testName5aSet)
        {
            // testName has no pre constraints
            testName5a = handleGetTestName();
            // testName has no post constraints
            this.__testName5a = testName5a;
            if (isMetafacadePropertyCachingEnabled())
            {
                this.__testName5aSet = true;
            }
        }
        return testName5a;
    }

   /**
    * @see org.andromda.cartridges.webservice.metafacades.WebServiceOperation#getTestCall()
    * @return String
    */
    protected abstract String handleGetTestCall();

    private String __testCall6a;
    private boolean __testCall6aSet = false;

    /**
     * <p>
     * The call for the test that tests this operation.
     * </p>
     * @return (String)handleGetTestCall()
     */
    public final String getTestCall()
    {
        String testCall6a = this.__testCall6a;
        if (!this.__testCall6aSet)
        {
            // testCall has no pre constraints
            testCall6a = handleGetTestCall();
            // testCall has no post constraints
            this.__testCall6a = testCall6a;
            if (isMetafacadePropertyCachingEnabled())
            {
                this.__testCall6aSet = true;
            }
        }
        return testCall6a;
    }

   /**
    * @see org.andromda.cartridges.webservice.metafacades.WebServiceOperation#getTestSignature()
    * @return String
    */
    protected abstract String handleGetTestSignature();

    private String __testSignature7a;
    private boolean __testSignature7aSet = false;

    /**
     * <p>
     * The signature for the test that tests this operation.
     * </p>
     * @return (String)handleGetTestSignature()
     */
    public final String getTestSignature()
    {
        String testSignature7a = this.__testSignature7a;
        if (!this.__testSignature7aSet)
        {
            // testSignature has no pre constraints
            testSignature7a = handleGetTestSignature();
            // testSignature has no post constraints
            this.__testSignature7a = testSignature7a;
            if (isMetafacadePropertyCachingEnabled())
            {
                this.__testSignature7aSet = true;
            }
        }
        return testSignature7a;
    }

   /**
    * @see org.andromda.cartridges.webservice.metafacades.WebServiceOperation#getParameterStyle()
    * @return String
    */
    protected abstract String handleGetParameterStyle();

    private String __parameterStyle8a;
    private boolean __parameterStyle8aSet = false;

    /**
     * <p>
     * WebService parameter style: bare or wrapped
     * </p>
     * @return (String)handleGetParameterStyle()
     */
    public final String getParameterStyle()
    {
        String parameterStyle8a = this.__parameterStyle8a;
        if (!this.__parameterStyle8aSet)
        {
            // parameterStyle has no pre constraints
            parameterStyle8a = handleGetParameterStyle();
            // parameterStyle has no post constraints
            this.__parameterStyle8a = parameterStyle8a;
            if (isMetafacadePropertyCachingEnabled())
            {
                this.__parameterStyle8aSet = true;
            }
        }
        return parameterStyle8a;
    }

   /**
    * @see org.andromda.cartridges.webservice.metafacades.WebServiceOperation#getRestPath()
    * @return String
    */
    protected abstract String handleGetRestPath();

    private String __restPath9a;
    private boolean __restPath9aSet = false;

    /**
     * <p>
     * The URL path for the REST webservice. If unspecified, the
     * lowercase /operation/parametername/{parametername}/ is used.
     * </p>
     * @return (String)handleGetRestPath()
     */
    public final String getRestPath()
    {
        String restPath9a = this.__restPath9a;
        if (!this.__restPath9aSet)
        {
            // restPath has no pre constraints
            restPath9a = handleGetRestPath();
            // restPath has no post constraints
            this.__restPath9a = restPath9a;
            if (isMetafacadePropertyCachingEnabled())
            {
                this.__restPath9aSet = true;
            }
        }
        return restPath9a;
    }

   /**
    * @see org.andromda.cartridges.webservice.metafacades.WebServiceOperation#getRestRequestType()
    * @return String
    */
    protected abstract String handleGetRestRequestType();

    private String __restRequestType10a;
    private boolean __restRequestType10aSet = false;

    /**
     * <p>
     * HTML request type for this REST service (GET, PUT, POST, QUERY,
     * DELETE), used for method annotations.
     * </p>
     * @return (String)handleGetRestRequestType()
     */
    public final String getRestRequestType()
    {
        String restRequestType10a = this.__restRequestType10a;
        if (!this.__restRequestType10aSet)
        {
            // restRequestType has no pre constraints
            restRequestType10a = handleGetRestRequestType();
            // restRequestType has no post constraints
            this.__restRequestType10a = restRequestType10a;
            if (isMetafacadePropertyCachingEnabled())
            {
                this.__restRequestType10aSet = true;
            }
        }
        return restRequestType10a;
    }

   /**
    * @see org.andromda.cartridges.webservice.metafacades.WebServiceOperation#getRestCacheType()
    * @return String
    */
    protected abstract String handleGetRestCacheType();

    private String __restCacheType11a;
    private boolean __restCacheType11aSet = false;

    /**
     * 
     * @return (String)handleGetRestCacheType()
     */
    public final String getRestCacheType()
    {
        String restCacheType11a = this.__restCacheType11a;
        if (!this.__restCacheType11aSet)
        {
            // restCacheType has no pre constraints
            restCacheType11a = handleGetRestCacheType();
            // restCacheType has no post constraints
            this.__restCacheType11a = restCacheType11a;
            if (isMetafacadePropertyCachingEnabled())
            {
                this.__restCacheType11aSet = true;
            }
        }
        return restCacheType11a;
    }

   /**
    * @see org.andromda.cartridges.webservice.metafacades.WebServiceOperation#isRestEncoded()
    * @return boolean
    */
    protected abstract boolean handleIsRestEncoded();

    private boolean __restEncoded12a;
    private boolean __restEncoded12aSet = false;

    /**
     * <p>
     * @Encoded T/F. default=false.
     * </p>
     * @return (boolean)handleIsRestEncoded()
     */
    public final boolean isRestEncoded()
    {
        boolean restEncoded12a = this.__restEncoded12a;
        if (!this.__restEncoded12aSet)
        {
            // restEncoded has no pre constraints
            restEncoded12a = handleIsRestEncoded();
            // restEncoded has no post constraints
            this.__restEncoded12a = restEncoded12a;
            if (isMetafacadePropertyCachingEnabled())
            {
                this.__restEncoded12aSet = true;
            }
        }
        return restEncoded12a;
    }

   /**
    * @see org.andromda.cartridges.webservice.metafacades.WebServiceOperation#getRestConsumes()
    * @return String
    */
    protected abstract String handleGetRestConsumes();

    private String __restConsumes13a;
    private boolean __restConsumes13aSet = false;

    /**
     * <p>
     * @Consumes(media type) annotation. i.e. json, atom, plain/text,
     * xml.
     * </p>
     * @return (String)handleGetRestConsumes()
     */
    public final String getRestConsumes()
    {
        String restConsumes13a = this.__restConsumes13a;
        if (!this.__restConsumes13aSet)
        {
            // restConsumes has no pre constraints
            restConsumes13a = handleGetRestConsumes();
            // restConsumes has no post constraints
            this.__restConsumes13a = restConsumes13a;
            if (isMetafacadePropertyCachingEnabled())
            {
                this.__restConsumes13aSet = true;
            }
        }
        return restConsumes13a;
    }

   /**
    * @see org.andromda.cartridges.webservice.metafacades.WebServiceOperation#getRestProduces()
    * @return String
    */
    protected abstract String handleGetRestProduces();

    private String __restProduces14a;
    private boolean __restProduces14aSet = false;

    /**
     * <p>
     * @Produces(media type) annotation. i.e. json, atom, plain/text,
     * xml.
     * </p>
     * @return (String)handleGetRestProduces()
     */
    public final String getRestProduces()
    {
        String restProduces14a = this.__restProduces14a;
        if (!this.__restProduces14aSet)
        {
            // restProduces has no pre constraints
            restProduces14a = handleGetRestProduces();
            // restProduces has no post constraints
            this.__restProduces14a = restProduces14a;
            if (isMetafacadePropertyCachingEnabled())
            {
                this.__restProduces14aSet = true;
            }
        }
        return restProduces14a;
    }

   /**
    * @see org.andromda.cartridges.webservice.metafacades.WebServiceOperation#getRestProvider()
    * @return String
    */
    protected abstract String handleGetRestProvider();

    private String __restProvider15a;
    private boolean __restProvider15aSet = false;

    /**
     * <p>
     * Customized REST @Provider annotation, must be implemented in the
     *  generated class.
     * </p>
     * @return (String)handleGetRestProvider()
     */
    public final String getRestProvider()
    {
        String restProvider15a = this.__restProvider15a;
        if (!this.__restProvider15aSet)
        {
            // restProvider has no pre constraints
            restProvider15a = handleGetRestProvider();
            // restProvider has no post constraints
            this.__restProvider15a = restProvider15a;
            if (isMetafacadePropertyCachingEnabled())
            {
                this.__restProvider15aSet = true;
            }
        }
        return restProvider15a;
    }

   /**
    * @see org.andromda.cartridges.webservice.metafacades.WebServiceOperation#getRestPartType()
    * @return String
    */
    protected abstract String handleGetRestPartType();

    private String __restPartType16a;
    private boolean __restPartType16aSet = false;

    /**
     * <p>
     * Multipart/xml type for this returned part.
     * </p>
     * @return (String)handleGetRestPartType()
     */
    public final String getRestPartType()
    {
        String restPartType16a = this.__restPartType16a;
        if (!this.__restPartType16aSet)
        {
            // restPartType has no pre constraints
            restPartType16a = handleGetRestPartType();
            // restPartType has no post constraints
            this.__restPartType16a = restPartType16a;
            if (isMetafacadePropertyCachingEnabled())
            {
                this.__restPartType16aSet = true;
            }
        }
        return restPartType16a;
    }

   /**
    * @see org.andromda.cartridges.webservice.metafacades.WebServiceOperation#getRestSuspend()
    * @return int
    */
    protected abstract int handleGetRestSuspend();

    private int __restSuspend17a;
    private boolean __restSuspend17aSet = false;

    /**
     * <p>
     * Asynchronous service implementation, suspend execution for X ms.
     * Adds @Suspend annotation to the operation. default=synchronous
     * (suspend=0=wait forever).
     * </p>
     * @return (int)handleGetRestSuspend()
     */
    public final int getRestSuspend()
    {
        int restSuspend17a = this.__restSuspend17a;
        if (!this.__restSuspend17aSet)
        {
            // restSuspend has no pre constraints
            restSuspend17a = handleGetRestSuspend();
            // restSuspend has no post constraints
            this.__restSuspend17a = restSuspend17a;
            if (isMetafacadePropertyCachingEnabled())
            {
                this.__restSuspend17aSet = true;
            }
        }
        return restSuspend17a;
    }

   /**
    * @see org.andromda.cartridges.webservice.metafacades.WebServiceOperation#getRolesAllowed()
    * @return String
    */
    protected abstract String handleGetRolesAllowed();

    private String __rolesAllowed18a;
    private boolean __rolesAllowed18aSet = false;

    /**
     * <p>
     * REST security roles allowed. default=All.
     * </p>
     * @return (String)handleGetRolesAllowed()
     */
    public final String getRolesAllowed()
    {
        String rolesAllowed18a = this.__rolesAllowed18a;
        if (!this.__rolesAllowed18aSet)
        {
            // rolesAllowed has no pre constraints
            rolesAllowed18a = handleGetRolesAllowed();
            // rolesAllowed has no post constraints
            this.__rolesAllowed18a = rolesAllowed18a;
            if (isMetafacadePropertyCachingEnabled())
            {
                this.__rolesAllowed18aSet = true;
            }
        }
        return rolesAllowed18a;
    }

   /**
    * @see org.andromda.cartridges.webservice.metafacades.WebServiceOperation#isRestAtom()
    * @return boolean
    */
    protected abstract boolean handleIsRestAtom();

    private boolean __restAtom19a;
    private boolean __restAtom19aSet = false;

    /**
     * <p>
     * If this REST service provides application/atom, or any service
     * operations provide application/atom
     * </p>
     * @return (boolean)handleIsRestAtom()
     */
    public final boolean isRestAtom()
    {
        boolean restAtom19a = this.__restAtom19a;
        if (!this.__restAtom19aSet)
        {
            // restAtom has no pre constraints
            restAtom19a = handleIsRestAtom();
            // restAtom has no post constraints
            this.__restAtom19a = restAtom19a;
            if (isMetafacadePropertyCachingEnabled())
            {
                this.__restAtom19aSet = true;
            }
        }
        return restAtom19a;
    }

   /**
    * @see org.andromda.cartridges.webservice.metafacades.WebServiceOperation#isRest()
    * @return boolean
    */
    protected abstract boolean handleIsRest();

    private boolean __rest20a;
    private boolean __rest20aSet = false;

    /**
     * <p>
     * Is this operation a JAX-RS REST operation? JAX-WS and JAX-RS can
     * be mixed in the same service class. If false, all rest
     * attributes and methods are ignored.
     * </p>
     * @return (boolean)handleIsRest()
     */
    public final boolean isRest()
    {
        boolean rest20a = this.__rest20a;
        if (!this.__rest20aSet)
        {
            // rest has no pre constraints
            rest20a = handleIsRest();
            // rest has no post constraints
            this.__rest20a = rest20a;
            if (isMetafacadePropertyCachingEnabled())
            {
                this.__rest20aSet = true;
            }
        }
        return rest20a;
    }

   /**
    * @see org.andromda.cartridges.webservice.metafacades.WebServiceOperation#getRestTestPath()
    * @return String
    */
    protected abstract String handleGetRestTestPath();

    private String __restTestPath21a;
    private boolean __restTestPath21aSet = false;

    /**
     * <p>
     * The URL path to test the REST webservice. Substitutes test
     * values for {parametername} parts of the service URL.
     * </p>
     * @return (String)handleGetRestTestPath()
     */
    public final String getRestTestPath()
    {
        String restTestPath21a = this.__restTestPath21a;
        if (!this.__restTestPath21aSet)
        {
            // restTestPath has no pre constraints
            restTestPath21a = handleGetRestTestPath();
            // restTestPath has no post constraints
            this.__restTestPath21a = restTestPath21a;
            if (isMetafacadePropertyCachingEnabled())
            {
                this.__restTestPath21aSet = true;
            }
        }
        return restTestPath21a;
    }

   /**
    * @see org.andromda.cartridges.webservice.metafacades.WebServiceOperation#getOperationName()
    * @return String
    */
    protected abstract String handleGetOperationName();

    private String __operationName22a;
    private boolean __operationName22aSet = false;

    /**
     * <p>
     * Returns the customized operation name. Defaults to
     * operation.name, can be overridden with WebServiceOperation
     * stereotype operationName attribute. Prevents duplicate operation
     * names in wsdl for overloaded operations.
     * </p>
     * @return (String)handleGetOperationName()
     */
    public final String getOperationName()
    {
        String operationName22a = this.__operationName22a;
        if (!this.__operationName22aSet)
        {
            // operationName has no pre constraints
            operationName22a = handleGetOperationName();
            // operationName has no post constraints
            this.__operationName22a = operationName22a;
            if (isMetafacadePropertyCachingEnabled())
            {
                this.__operationName22aSet = true;
            }
        }
        return operationName22a;
    }

   /**
    * @see org.andromda.cartridges.webservice.metafacades.WebServiceOperation#isWebFaultOnAllExceptions()
    * @return boolean
    */
    protected abstract boolean handleIsWebFaultOnAllExceptions();

    private boolean __webFaultOnAllExceptions23a;
    private boolean __webFaultOnAllExceptions23aSet = false;

    /**
     * <p>
     * Checks is each service exception reference is some Exception
     * type and has stereotype WebFault, if CXF.
     * </p>
     * @return (boolean)handleIsWebFaultOnAllExceptions()
     */
    public final boolean isWebFaultOnAllExceptions()
    {
        boolean webFaultOnAllExceptions23a = this.__webFaultOnAllExceptions23a;
        if (!this.__webFaultOnAllExceptions23aSet)
        {
            // webFaultOnAllExceptions has no pre constraints
            webFaultOnAllExceptions23a = handleIsWebFaultOnAllExceptions();
            // webFaultOnAllExceptions has no post constraints
            this.__webFaultOnAllExceptions23a = webFaultOnAllExceptions23a;
            if (isMetafacadePropertyCachingEnabled())
            {
                this.__webFaultOnAllExceptions23aSet = true;
            }
        }
        return webFaultOnAllExceptions23a;
    }

    // ------------- associations ------------------

    /**
     * 
     * @return (WebServicePackage)handleGetWebServicePackage()
     */
    public final WebServicePackage getWebServicePackage()
    {
        WebServicePackage getWebServicePackage2r = null;
        // allowedOperations has no pre constraints
        Object result = handleGetWebServicePackage();
        MetafacadeBase shieldedResult = this.shieldedElement(result);
        try
        {
            getWebServicePackage2r = (WebServicePackage)shieldedResult;
        }
        catch (ClassCastException ex)
        {
            // Bad things happen if the metafacade type mapping in metafacades.xml is wrong - Warn
            WebServiceOperationLogic.logger.warn("incorrect metafacade cast for WebServiceOperationLogic.getWebServicePackage WebServicePackage " + result + ": " + shieldedResult);
        }
        // allowedOperations has no post constraints
        return getWebServicePackage2r;
    }

    /**
     * UML Specific type is transformed by shieldedElements to AndroMDA Metafacade type
     * @return Object
     */
    protected abstract Object handleGetWebServicePackage();

    /**
     * @return true
     * @see ServiceOperation
     */
    public boolean isServiceOperationMetaType()
    {
        return true;
    }

    /**
     * @return true
     * @see OperationFacade
     */
    public boolean isOperationFacadeMetaType()
    {
        return true;
    }

    /**
     * @return true
     * @see ModelElementFacade
     */
    public boolean isModelElementFacadeMetaType()
    {
        return true;
    }

    // ----------- delegates to ServiceOperation ------------
    /**
     * <p>
     * Copies all tagged values from the given ModelElementFacade to
     * this model element facade.
     * </p>
     * @see ModelElementFacade#copyTaggedValues(ModelElementFacade element)
     */
    public void copyTaggedValues(ModelElementFacade element)
    {
        this.getSuperServiceOperation().copyTaggedValues(element);
    }

    /**
     * <p>
     * Finds the tagged value with the specified 'tagName'. In case
     * there are more values the first one found will be returned.
     * </p>
     * @see ModelElementFacade#findTaggedValue(String tagName)
     */
    public Object findTaggedValue(String tagName)
    {
        return this.getSuperServiceOperation().findTaggedValue(tagName);
    }

    /**
     * <p>
     * Returns all the values for the tagged value with the specified
     * name. The returned collection will contains only String
     * instances, or will be empty. Never null.
     * </p>
     * @see ModelElementFacade#findTaggedValues(String tagName)
     */
    public Collection findTaggedValues(String tagName)
    {
        return this.getSuperServiceOperation().findTaggedValues(tagName);
    }

    /**
     * <p>
     * Returns the fully qualified name of the model element. The fully
     * qualified name includes complete package qualified name of the
     * underlying model element. The templates parameter will be
     * replaced by the correct one given the binding relation of the
     * parameter to this element.
     * </p>
     * @see ModelElementFacade#getBindedFullyQualifiedName(ModelElementFacade bindedElement)
     */
    public String getBindedFullyQualifiedName(ModelElementFacade bindedElement)
    {
        return this.getSuperServiceOperation().getBindedFullyQualifiedName(bindedElement);
    }

    /**
     * <p>
     * Gets all constraints belonging to the model element.
     * </p>
     * @see ModelElementFacade#getConstraints()
     */
    public Collection<ConstraintFacade> getConstraints()
    {
        return this.getSuperServiceOperation().getConstraints();
    }

    /**
     * <p>
     * Returns the constraints of the argument kind that have been
     * placed onto this model. Typical kinds are "inv", "pre" and
     * "post". Other kinds are possible.
     * </p>
     * @see ModelElementFacade#getConstraints(String kind)
     */
    public Collection getConstraints(String kind)
    {
        return this.getSuperServiceOperation().getConstraints(kind);
    }

    /**
     * <p>
     * Gets the documentation for the model element, The indent
     * argument is prefixed to each line. By default this method wraps
     * lines after 64 characters.
     * </p>
     * <p>
     * This method is equivalent to <code>getDocumentation(indent,
     * 64)</code>.
     * </p>
     * @see ModelElementFacade#getDocumentation(String indent)
     */
    public String getDocumentation(String indent)
    {
        return this.getSuperServiceOperation().getDocumentation(indent);
    }

    /**
     * <p>
     * This method returns the documentation for this model element,
     * with the lines wrapped after the specified number of characters,
     * values of less than 1 will indicate no line wrapping is
     * required. By default paragraphs are returned as HTML.
     * </p>
     * <p>
     * This method is equivalent to <code>getDocumentation(indent,
     * lineLength, true)</code>.
     * </p>
     * @see ModelElementFacade#getDocumentation(String indent, int lineLength)
     */
    public String getDocumentation(String indent, int lineLength)
    {
        return this.getSuperServiceOperation().getDocumentation(indent, lineLength);
    }

    /**
     * 
     * @see ModelElementFacade#getDocumentation(String indent, int lineLength, boolean htmlStyle)
     */
    public String getDocumentation(String indent, int lineLength, boolean htmlStyle)
    {
        return this.getSuperServiceOperation().getDocumentation(indent, lineLength, htmlStyle);
    }

    /**
     * <p>
     * The fully qualified name of this model element.
     * </p>
     * @see ModelElementFacade#getFullyQualifiedName()
     */
    public String getFullyQualifiedName()
    {
        return this.getSuperServiceOperation().getFullyQualifiedName();
    }

    /**
     * <p>
     * Returns the fully qualified name of the model element. The fully
     * qualified name includes complete package qualified name of the
     * underlying model element.  If modelName is true, then the
     * original name of the model element (the name contained within
     * the model) will be the name returned, otherwise a name from a
     * language mapping will be returned.
     * </p>
     * @see ModelElementFacade#getFullyQualifiedName(boolean modelName)
     */
    public String getFullyQualifiedName(boolean modelName)
    {
        return this.getSuperServiceOperation().getFullyQualifiedName(modelName);
    }

    /**
     * <p>
     * Returns the fully qualified name as a path, the returned value
     * always starts with out a slash '/'.
     * </p>
     * @see ModelElementFacade#getFullyQualifiedNamePath()
     */
    public String getFullyQualifiedNamePath()
    {
        return this.getSuperServiceOperation().getFullyQualifiedNamePath();
    }

    /**
     * <p>
     * Gets the unique identifier of the underlying model element.
     * </p>
     * @see ModelElementFacade#getId()
     */
    public String getId()
    {
        return this.getSuperServiceOperation().getId();
    }

    /**
     * <p>
     * UML2: Retrieves the keywords for this element. Used to modify
     * implementation properties which are not represented by other
     * properties, i.e. native, transient, volatile, synchronized,
     * (added annotations) override, deprecated. Can also be used to
     * suppress compiler warnings: (added annotations) unchecked,
     * fallthrough, path, serial, finally, all. Annotations require
     * JDK5 compiler level.
     * </p>
     * @see ModelElementFacade#getKeywords()
     */
    public Collection<String> getKeywords()
    {
        return this.getSuperServiceOperation().getKeywords();
    }

    /**
     * <p>
     * UML2: Retrieves a localized label for this named element.
     * </p>
     * @see ModelElementFacade#getLabel()
     */
    public String getLabel()
    {
        return this.getSuperServiceOperation().getLabel();
    }

    /**
     * <p>
     * The language mappings that have been set for this model elemnt.
     * </p>
     * @see ModelElementFacade#getLanguageMappings()
     */
    public TypeMappings getLanguageMappings()
    {
        return this.getSuperServiceOperation().getLanguageMappings();
    }

    /**
     * 
     * @see ModelElementFacade#getModel()
     */
    public ModelFacade getModel()
    {
        return this.getSuperServiceOperation().getModel();
    }

    /**
     * <p>
     * The name of the model element.
     * </p>
     * @see ModelElementFacade#getName()
     */
    public String getName()
    {
        return this.getSuperServiceOperation().getName();
    }

    /**
     * <p>
     * Gets the package to which this model element belongs.
     * </p>
     * @see ModelElementFacade#getPackage()
     */
    public ModelElementFacade getPackage()
    {
        return this.getSuperServiceOperation().getPackage();
    }

    /**
     * <p>
     * The name of this model element's package.
     * </p>
     * @see ModelElementFacade#getPackageName()
     */
    public String getPackageName()
    {
        return this.getSuperServiceOperation().getPackageName();
    }

    /**
     * <p>
     * Gets the package name (optionally providing the ability to
     * retrieve the model name and not the mapped name).
     * </p>
     * @see ModelElementFacade#getPackageName(boolean modelName)
     */
    public String getPackageName(boolean modelName)
    {
        return this.getSuperServiceOperation().getPackageName(modelName);
    }

    /**
     * <p>
     * Returns the package as a path, the returned value always starts
     * with out a slash '/'.
     * </p>
     * @see ModelElementFacade#getPackagePath()
     */
    public String getPackagePath()
    {
        return this.getSuperServiceOperation().getPackagePath();
    }

    /**
     * <p>
     * UML2: Returns the value of the 'Qualified Name' attribute. A
     * name which allows the NamedElement to be identified within a
     * hierarchy of nested Namespaces. It is constructed from the names
     * of the containing namespaces starting at the root of the
     * hierarchy and ending with the name of the NamedElement itself.
     * </p>
     * @see ModelElementFacade#getQualifiedName()
     */
    public String getQualifiedName()
    {
        return this.getSuperServiceOperation().getQualifiedName();
    }

    /**
     * <p>
     * Gets the root package for the model element.
     * </p>
     * @see ModelElementFacade#getRootPackage()
     */
    public PackageFacade getRootPackage()
    {
        return this.getSuperServiceOperation().getRootPackage();
    }

    /**
     * <p>
     * Gets the dependencies for which this model element is the
     * source.
     * </p>
     * @see ModelElementFacade#getSourceDependencies()
     */
    public Collection<DependencyFacade> getSourceDependencies()
    {
        return this.getSuperServiceOperation().getSourceDependencies();
    }

    /**
     * <p>
     * If this model element is the context of an activity graph, this
     * represents that activity graph.
     * </p>
     * @see ModelElementFacade#getStateMachineContext()
     */
    public StateMachineFacade getStateMachineContext()
    {
        return this.getSuperServiceOperation().getStateMachineContext();
    }

    /**
     * <p>
     * The collection of ALL stereotype names for this model element.
     * </p>
     * @see ModelElementFacade#getStereotypeNames()
     */
    public Collection<String> getStereotypeNames()
    {
        return this.getSuperServiceOperation().getStereotypeNames();
    }

    /**
     * <p>
     * Gets all stereotypes for this model element.
     * </p>
     * @see ModelElementFacade#getStereotypes()
     */
    public Collection<StereotypeFacade> getStereotypes()
    {
        return this.getSuperServiceOperation().getStereotypes();
    }

    /**
     * 
     * @see ModelElementFacade#getTaggedValues()
     */
    public Collection<TaggedValueFacade> getTaggedValues()
    {
        return this.getSuperServiceOperation().getTaggedValues();
    }

    /**
     * <p>
     * Gets the dependencies for which this model element is the
     * target.
     * </p>
     * @see ModelElementFacade#getTargetDependencies()
     */
    public Collection<DependencyFacade> getTargetDependencies()
    {
        return this.getSuperServiceOperation().getTargetDependencies();
    }

    /**
     * 
     * @see ModelElementFacade#getTemplateParameter(String parameterName)
     */
    public Object getTemplateParameter(String parameterName)
    {
        return this.getSuperServiceOperation().getTemplateParameter(parameterName);
    }

    /**
     * 
     * @see ModelElementFacade#getTemplateParameters()
     */
    public Collection<TemplateParameterFacade> getTemplateParameters()
    {
        return this.getSuperServiceOperation().getTemplateParameters();
    }

    /**
     * <p>
     * The visibility (i.e. public, private, protected or package) of
     * the model element, will attempt a lookup for these values in the
     * language mappings (if any).
     * </p>
     * @see ModelElementFacade#getVisibility()
     */
    public String getVisibility()
    {
        return this.getSuperServiceOperation().getVisibility();
    }

    /**
     * <p>
     * Returns true if the model element has the exact stereotype
     * (meaning no stereotype inheritance is taken into account when
     * searching for the stereotype), false otherwise.
     * </p>
     * @see ModelElementFacade#hasExactStereotype(String stereotypeName)
     */
    public boolean hasExactStereotype(String stereotypeName)
    {
        return this.getSuperServiceOperation().hasExactStereotype(stereotypeName);
    }

    /**
     * <p>
     * Does the UML Element contain the named Keyword? Keywords can be
     * separated by space, comma, pipe, semicolon, or << >>
     * </p>
     * @see ModelElementFacade#hasKeyword(String keywordName)
     */
    public boolean hasKeyword(String keywordName)
    {
        return this.getSuperServiceOperation().hasKeyword(keywordName);
    }

    /**
     * <p>
     * Returns true if the model element has the specified stereotype. 
     * If the stereotype itself does not match, then a search will be
     * made up the stereotype inheritance hierarchy, and if one of the
     * stereotype's ancestors has a matching name this method will
     * return true, false otherwise.
     * </p>
     * <p>
     * For example, if we have a certain stereotype called
     * <<exception>> and a model element has a stereotype called
     * <<applicationException>> which extends <<exception>>, when
     * calling this method with 'stereotypeName' defined as 'exception'
     * the method would return true since <<applicationException>>
     * inherits from <<exception>>.  If you want to check if the model
     * element has the exact stereotype, then use the method
     * 'hasExactStereotype' instead.
     * </p>
     * @see ModelElementFacade#hasStereotype(String stereotypeName)
     */
    public boolean hasStereotype(String stereotypeName)
    {
        return this.getSuperServiceOperation().hasStereotype(stereotypeName);
    }

    /**
     * 
     * @see ModelElementFacade#isBindingDependenciesPresent()
     */
    public boolean isBindingDependenciesPresent()
    {
        return this.getSuperServiceOperation().isBindingDependenciesPresent();
    }

    /**
     * <p>
     * Indicates if any constraints are present on this model element.
     * </p>
     * @see ModelElementFacade#isConstraintsPresent()
     */
    public boolean isConstraintsPresent()
    {
        return this.getSuperServiceOperation().isConstraintsPresent();
    }

    /**
     * <p>
     * Indicates if any documentation is present on this model element.
     * </p>
     * @see ModelElementFacade#isDocumentationPresent()
     */
    public boolean isDocumentationPresent()
    {
        return this.getSuperServiceOperation().isDocumentationPresent();
    }

    /**
     * <p>
     * True if this element name is a reserved word in Java, C#, ANSI
     * or ISO C, C++, JavaScript.
     * </p>
     * @see ModelElementFacade#isReservedWord()
     */
    public boolean isReservedWord()
    {
        return this.getSuperServiceOperation().isReservedWord();
    }

    /**
     * 
     * @see ModelElementFacade#isTemplateParametersPresent()
     */
    public boolean isTemplateParametersPresent()
    {
        return this.getSuperServiceOperation().isTemplateParametersPresent();
    }

    /**
     * <p>
     * Searches for the constraint with the specified 'name' on this
     * model element, and if found translates it using the specified
     * 'translation' from a translation library discovered by the
     * framework.
     * </p>
     * @see ModelElementFacade#translateConstraint(String name, String translation)
     */
    public String translateConstraint(String name, String translation)
    {
        return this.getSuperServiceOperation().translateConstraint(name, translation);
    }

    /**
     * <p>
     * Translates all constraints belonging to this model element with
     * the given 'translation'.
     * </p>
     * @see ModelElementFacade#translateConstraints(String translation)
     */
    public String[] translateConstraints(String translation)
    {
        return this.getSuperServiceOperation().translateConstraints(translation);
    }

    /**
     * <p>
     * Translates the constraints of the specified 'kind' belonging to
     * this model element.
     * </p>
     * @see ModelElementFacade#translateConstraints(String kind, String translation)
     */
    public String[] translateConstraints(String kind, String translation)
    {
        return this.getSuperServiceOperation().translateConstraints(kind, translation);
    }

    /**
     * <p>
     * Finds the parameter on this operation having the given name, if
     * no parameter is found, null is returned instead.
     * </p>
     * @see OperationFacade#findParameter(String name)
     */
    public ParameterFacade findParameter(String name)
    {
        return this.getSuperServiceOperation().findParameter(name);
    }

    /**
     * <p>
     * Searches the given feature for the specified tag.
     * </p>
     * <p>
     * If the follow boolean is set to true then the search will
     * continue from the class operation to the class itself and then
     * up the class hierarchy.
     * </p>
     * @see OperationFacade#findTaggedValue(String name, boolean follow)
     */
    public Object findTaggedValue(String name, boolean follow)
    {
        return this.getSuperServiceOperation().findTaggedValue(name, follow);
    }

    /**
     * <p>
     * A comma separated list of all argument names.
     * </p>
     * @see OperationFacade#getArgumentNames()
     */
    public String getArgumentNames()
    {
        return this.getSuperServiceOperation().getArgumentNames();
    }

    /**
     * 
     * @see OperationFacade#getArgumentTypeNames()
     */
    public String getArgumentTypeNames()
    {
        return this.getSuperServiceOperation().getArgumentTypeNames();
    }

    /**
     * 
     * @see OperationFacade#getArguments()
     */
    public Collection<ParameterFacade> getArguments()
    {
        return this.getSuperServiceOperation().getArguments();
    }

    /**
     * 
     * @see OperationFacade#getCall()
     */
    public String getCall()
    {
        return this.getSuperServiceOperation().getCall();
    }

    /**
     * <p>
     * Returns the concurrency modifier for this operation (i.e.
     * concurrent, guarded or sequential) of the model element, will
     * attempt a lookup for these values in the language mappings (if
     * any).
     * </p>
     * @see OperationFacade#getConcurrency()
     */
    public String getConcurrency()
    {
        return this.getSuperServiceOperation().getConcurrency();
    }

    /**
     * <p>
     * A comma separated list containing all exceptions that this
     * operation throws.  Exceptions are determined through
     * dependencies that have the target element stereotyped as
     * <<Exception>>.
     * </p>
     * @see OperationFacade#getExceptionList()
     */
    public String getExceptionList()
    {
        return this.getSuperServiceOperation().getExceptionList();
    }

    /**
     * <p>
     * Returns a comma separated list of exceptions appended to the
     * comma separated list of fully qualified 'initialException'
     * classes passed in to this method.
     * </p>
     * @see OperationFacade#getExceptionList(String initialExceptions)
     */
    public String getExceptionList(String initialExceptions)
    {
        return this.getSuperServiceOperation().getExceptionList(initialExceptions);
    }

    /**
     * <p>
     * A collection of all exceptions thrown by this operation.
     * </p>
     * @see OperationFacade#getExceptions()
     */
    public Collection getExceptions()
    {
        return this.getSuperServiceOperation().getExceptions();
    }

    /**
     * <p>
     * Return Type with multiplicity taken into account. UML14 does not
     * allow multiplicity *.
     * </p>
     * @see OperationFacade#getGetterSetterReturnTypeName()
     */
    public String getGetterSetterReturnTypeName()
    {
        return this.getSuperServiceOperation().getGetterSetterReturnTypeName();
    }

    /**
     * <p>
     * the lower value for the multiplicity
     * </p>
     * <p>
     * -only applicable for UML2
     * </p>
     * @see OperationFacade#getLower()
     */
    public int getLower()
    {
        return this.getSuperServiceOperation().getLower();
    }

    /**
     * <p>
     * Returns the operation method body determined from UML sequence
     * diagrams or other UML sources.
     * </p>
     * @see OperationFacade#getMethodBody()
     */
    public String getMethodBody()
    {
        return this.getSuperServiceOperation().getMethodBody();
    }

    /**
     * <p>
     * The operation this operation overrides, null if this operation
     * is not overriding.
     * </p>
     * @see OperationFacade#getOverriddenOperation()
     */
    public OperationFacade getOverriddenOperation()
    {
        return this.getSuperServiceOperation().getOverriddenOperation();
    }

    /**
     * <p>
     * Gets the owner of this operation
     * </p>
     * @see OperationFacade#getOwner()
     */
    public ClassifierFacade getOwner()
    {
        return this.getSuperServiceOperation().getOwner();
    }

    /**
     * 
     * @see OperationFacade#getParameters()
     */
    public Collection<ParameterFacade> getParameters()
    {
        return this.getSuperServiceOperation().getParameters();
    }

    /**
     * <p>
     * The name of the operation that handles postcondition
     * constraints.
     * </p>
     * @see OperationFacade#getPostconditionName()
     */
    public String getPostconditionName()
    {
        return this.getSuperServiceOperation().getPostconditionName();
    }

    /**
     * <p>
     * The postcondition constraints belonging to this operation.
     * </p>
     * @see OperationFacade#getPostconditions()
     */
    public Collection<ConstraintFacade> getPostconditions()
    {
        return this.getSuperServiceOperation().getPostconditions();
    }

    /**
     * <p>
     * The call to the precondition operation.
     * </p>
     * @see OperationFacade#getPreconditionCall()
     */
    public String getPreconditionCall()
    {
        return this.getSuperServiceOperation().getPreconditionCall();
    }

    /**
     * <p>
     * The name of the operation that handles precondition constraints.
     * </p>
     * @see OperationFacade#getPreconditionName()
     */
    public String getPreconditionName()
    {
        return this.getSuperServiceOperation().getPreconditionName();
    }

    /**
     * <p>
     * The signature of the precondition operation.
     * </p>
     * @see OperationFacade#getPreconditionSignature()
     */
    public String getPreconditionSignature()
    {
        return this.getSuperServiceOperation().getPreconditionSignature();
    }

    /**
     * <p>
     * The precondition constraints belonging to this operation.
     * </p>
     * @see OperationFacade#getPreconditions()
     */
    public Collection<ConstraintFacade> getPreconditions()
    {
        return this.getSuperServiceOperation().getPreconditions();
    }

    /**
     * <p>
     * (UML2 Only). Get the actual return parameter (which may have
     * stereotypes etc).
     * </p>
     * @see OperationFacade#getReturnParameter()
     */
    public ParameterFacade getReturnParameter()
    {
        return this.getSuperServiceOperation().getReturnParameter();
    }

    /**
     * 
     * @see OperationFacade#getReturnType()
     */
    public ClassifierFacade getReturnType()
    {
        return this.getSuperServiceOperation().getReturnType();
    }

    /**
     * 
     * @see OperationFacade#getSignature()
     */
    public String getSignature()
    {
        return this.getSuperServiceOperation().getSignature();
    }

    /**
     * <p>
     * Returns the signature of the operation and optionally appends
     * the argument names (if withArgumentNames is true), otherwise
     * returns the signature with just the types alone in the
     * signature.
     * </p>
     * @see OperationFacade#getSignature(boolean withArgumentNames)
     */
    public String getSignature(boolean withArgumentNames)
    {
        return this.getSuperServiceOperation().getSignature(withArgumentNames);
    }

    /**
     * <p>
     * Returns the signature of the operation and optionally appends
     * the given 'argumentModifier' to each argument.
     * </p>
     * @see OperationFacade#getSignature(String argumentModifier)
     */
    public String getSignature(String argumentModifier)
    {
        return this.getSuperServiceOperation().getSignature(argumentModifier);
    }

    /**
     * <p>
     * A comma-separated parameter list  (type and name of each
     * parameter) of an operation.
     * </p>
     * @see OperationFacade#getTypedArgumentList()
     */
    public String getTypedArgumentList()
    {
        return this.getSuperServiceOperation().getTypedArgumentList();
    }

    /**
     * <p>
     * A comma-separated parameter list  (type and name of each
     * parameter) of an operation with an optional modifier (i.e final)
     * before each parameter.
     * </p>
     * @see OperationFacade#getTypedArgumentList(String modifier)
     */
    public String getTypedArgumentList(String modifier)
    {
        return this.getSuperServiceOperation().getTypedArgumentList(modifier);
    }

    /**
     * <p>
     * the upper value for the multiplicity (will be -1 for *)
     * </p>
     * <p>
     * - only applicable for UML2
     * </p>
     * @see OperationFacade#getUpper()
     */
    public int getUpper()
    {
        return this.getSuperServiceOperation().getUpper();
    }

    /**
     * 
     * @see OperationFacade#isAbstract()
     */
    public boolean isAbstract()
    {
        return this.getSuperServiceOperation().isAbstract();
    }

    /**
     * <p>
     * True if the operation has (i.e. throws any exceptions) false
     * otherwise.
     * </p>
     * @see OperationFacade#isExceptionsPresent()
     */
    public boolean isExceptionsPresent()
    {
        return this.getSuperServiceOperation().isExceptionsPresent();
    }

    /**
     * <p>
     * IsLeaf property in the operation. If true, operation is final,
     * cannot be extended or implemented by a descendant.
     * Default=false.
     * </p>
     * @see OperationFacade#isLeaf()
     */
    public boolean isLeaf()
    {
        return this.getSuperServiceOperation().isLeaf();
    }

    /**
     * <p>
     * UML2 only. If the return type parameter multiplicity>1 OR the
     * operation multiplicity>1. Default=false.
     * </p>
     * @see OperationFacade#isMany()
     */
    public boolean isMany()
    {
        return this.getSuperServiceOperation().isMany();
    }

    /**
     * <p>
     * UML2 only: If isMany (Collection type returned), is the type
     * unique within the collection.  Unique+Ordered determines
     * CollectionType implementation of return result. Default=false.
     * </p>
     * @see OperationFacade#isOrdered()
     */
    public boolean isOrdered()
    {
        return this.getSuperServiceOperation().isOrdered();
    }

    /**
     * <p>
     * True if this operation overrides an operation defined in an
     * ancestor class. An operation overrides when the names of the
     * operations as well as the types of the arguments are equal. The
     * return type may be different and is, as well as any exceptions,
     * ignored.
     * </p>
     * @see OperationFacade#isOverriding()
     */
    public boolean isOverriding()
    {
        return this.getSuperServiceOperation().isOverriding();
    }

    /**
     * <p>
     * Whether any postcondition constraints are present on this
     * operation.
     * </p>
     * @see OperationFacade#isPostconditionsPresent()
     */
    public boolean isPostconditionsPresent()
    {
        return this.getSuperServiceOperation().isPostconditionsPresent();
    }

    /**
     * <p>
     * Whether any precondition constraints are present on this
     * operation.
     * </p>
     * @see OperationFacade#isPreconditionsPresent()
     */
    public boolean isPreconditionsPresent()
    {
        return this.getSuperServiceOperation().isPreconditionsPresent();
    }

    /**
     * <p>
     * Indicates whether or not this operation is a query operation.
     * </p>
     * @see OperationFacade#isQuery()
     */
    public boolean isQuery()
    {
        return this.getSuperServiceOperation().isQuery();
    }

    /**
     * <p>
     * True/false depending on whether or not the operation has a
     * return type or not (i.e. a return type of something other than
     * void).
     * </p>
     * @see OperationFacade#isReturnTypePresent()
     */
    public boolean isReturnTypePresent()
    {
        return this.getSuperServiceOperation().isReturnTypePresent();
    }

    /**
     * 
     * @see OperationFacade#isStatic()
     */
    public boolean isStatic()
    {
        return this.getSuperServiceOperation().isStatic();
    }

    /**
     * <p>
     * UML2 only: for Collection return type, is the type unique within
     * the collection. Unique+Ordered determines the returned
     * CollectionType. Default=false.
     * </p>
     * @see OperationFacade#isUnique()
     */
    public boolean isUnique()
    {
        return this.getSuperServiceOperation().isUnique();
    }

    /**
     * <p>
     * The destination for any incoming messages.
     * </p>
     * @see ServiceOperation#getIncomingDestination()
     */
    public Destination getIncomingDestination()
    {
        return this.getSuperServiceOperation().getIncomingDestination();
    }

    /**
     * <p>
     * The destination for any outgoing messages.
     * </p>
     * @see ServiceOperation#getOutgoingDestination()
     */
    public Destination getOutgoingDestination()
    {
        return this.getSuperServiceOperation().getOutgoingDestination();
    }

    /**
     * <p>
     * The users of the service operation, these are the actor's that
     * can access this operation.
     * </p>
     * @see ServiceOperation#getRoles()
     */
    public Collection<Role> getRoles()
    {
        return this.getSuperServiceOperation().getRoles();
    }

    /**
     * <p>
     * The service which owns the service operation.
     * </p>
     * @see ServiceOperation#getService()
     */
    public Service getService()
    {
        return this.getSuperServiceOperation().getService();
    }

    /**
     * <p>
     * Whether or not this operation represents an "incoming" message
     * operation (i.e. it receives messages from Queues or Topics).
     * </p>
     * @see ServiceOperation#isIncomingMessageOperation()
     */
    public boolean isIncomingMessageOperation()
    {
        return this.getSuperServiceOperation().isIncomingMessageOperation();
    }

    /**
     * <p>
     * Whether or not this is operation accepts incoming or outgoing
     * messages.
     * </p>
     * @see ServiceOperation#isMessageOperation()
     */
    public boolean isMessageOperation()
    {
        return this.getSuperServiceOperation().isMessageOperation();
    }

    /**
     * <p>
     * Whether or not this service operation represents an "outgoing"
     * messaging operation (i.e. it sends messages to Queues or
     * Topics).
     * </p>
     * @see ServiceOperation#isOutgoingMessageOperation()
     */
    public boolean isOutgoingMessageOperation()
    {
        return this.getSuperServiceOperation().isOutgoingMessageOperation();
    }

    /**
     * @see MetafacadeBase#initialize()
     */
    @Override
    public void initialize()
    {
        this.getSuperServiceOperation().initialize();
    }

    /**
     * @return Object getSuperServiceOperation().getValidationOwner()
     * @see MetafacadeBase#getValidationOwner()
     */
    @Override
    public Object getValidationOwner()
    {
        Object owner = this.getSuperServiceOperation().getValidationOwner();
        return owner;
    }

    /**
     * @return String getSuperServiceOperation().getValidationName()
     * @see MetafacadeBase#getValidationName()
     */
    @Override
    public String getValidationName()
    {
        String name = this.getSuperServiceOperation().getValidationName();
        return name;
    }

    /**
     * <p><b>Constraint:</b> org::andromda::cartridges::webservice::metafacades::WebServiceOperation::a web service operation return type can not be a collection type</p>
     * <p><b>Error:</b> A web service operation's return type can NOT be a collection type, you'll need to model an array instead.</p>
     * <p><b>OCL:</b> context WebServiceOperation inv: exposed implies returnType.collectionType = false</p>
     * <p><b>Constraint:</b> org::andromda::cartridges::webservice::metafacades::WebServiceOperation::a web service operation exception must be a web fault</p>
     * <p><b>Error:</b> Each web service operation exception must have the web fault stereotype.</p>
     * <p><b>OCL:</b> context WebServiceOperation inv: exposed implies webFaultOnAllExceptions = true</p>
     * @param validationMessages Collection<ModelValidationMessage>
     * @see MetafacadeBase#validateInvariants(Collection validationMessages)
     */
    @Override
    public void validateInvariants(Collection<ModelValidationMessage> validationMessages)
    {
        this.getSuperServiceOperation().validateInvariants(validationMessages);
        try
        {
            final Object contextElement = this.THIS();
            boolean constraintValid = OCLResultEnsurer.ensure((Boolean.valueOf(String.valueOf(OCLIntrospector.invoke(contextElement,"exposed"))).booleanValue()?OCLExpressions.equal(OCLIntrospector.invoke(contextElement,"returnType.collectionType"),false):true));
            if (!constraintValid)
            {
                validationMessages.add(
                    new ModelValidationMessage(
                        (MetafacadeBase)contextElement ,
                        "org::andromda::cartridges::webservice::metafacades::WebServiceOperation::a web service operation return type can not be a collection type",
                        "A web service operation's return type can NOT be a collection type, you'll need to model an array instead."));
            }
        }
        catch (Throwable th)
        {
            Throwable cause = th.getCause();
            int depth = 0; // Some throwables have infinite recursion
            while (cause != null && depth < 7)
            {
                th = cause;
                depth++;
            }
            logger.error("Error validating constraint 'org::andromda::cartridges::webservice::metafacades::WebServiceOperation::a web service operation return type can not be a collection type' ON "
                + this.THIS().toString() + ": " + th.getMessage(), th);
        }
        try
        {
            final Object contextElement = this.THIS();
            boolean constraintValid = OCLResultEnsurer.ensure((Boolean.valueOf(String.valueOf(OCLIntrospector.invoke(contextElement,"exposed"))).booleanValue()?OCLExpressions.equal(OCLIntrospector.invoke(contextElement,"webFaultOnAllExceptions"),true):true));
            if (!constraintValid)
            {
                validationMessages.add(
                    new ModelValidationMessage(
                        (MetafacadeBase)contextElement ,
                        "org::andromda::cartridges::webservice::metafacades::WebServiceOperation::a web service operation exception must be a web fault",
                        "Each web service operation exception must have the web fault stereotype."));
            }
        }
        catch (Throwable th)
        {
            Throwable cause = th.getCause();
            int depth = 0; // Some throwables have infinite recursion
            while (cause != null && depth < 7)
            {
                th = cause;
                depth++;
            }
            logger.error("Error validating constraint 'org::andromda::cartridges::webservice::metafacades::WebServiceOperation::a web service operation exception must be a web fault' ON "
                + this.THIS().toString() + ": " + th.getMessage(), th);
        }
    }

    /**
     * The property that stores the name of the metafacade.
     */
    private static final String NAME_PROPERTY = "name";
    private static final String FQNAME_PROPERTY = "fullyQualifiedName";

    /**
     * @see Object#toString()
     */
    @Override
    public String toString()
    {
        final StringBuilder toString = new StringBuilder(this.getClass().getName());
        toString.append("[");
        try
        {
            toString.append(Introspector.instance().getProperty(this, FQNAME_PROPERTY));
        }
        catch (final Throwable tryAgain)
        {
            try
            {
                toString.append(Introspector.instance().getProperty(this, NAME_PROPERTY));
            }
            catch (final Throwable ignore)
            {
                // - just ignore when the metafacade doesn't have a name or fullyQualifiedName property
            }
        }
        toString.append("]");
        return toString.toString();
    }
}