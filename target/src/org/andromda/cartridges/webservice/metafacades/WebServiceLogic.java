// license-header java merge-point
//
// Attention: generated code (by MetafacadeLogic.vsl) - do not modify!
//
package org.andromda.cartridges.webservice.metafacades;

import java.util.Collection;
import java.util.List;
import org.andromda.core.common.Introspector;
import org.andromda.core.metafacade.MetafacadeBase;
import org.andromda.core.metafacade.MetafacadeFactory;
import org.andromda.core.metafacade.ModelValidationMessage;
import org.andromda.metafacades.uml.AssociationEndFacade;
import org.andromda.metafacades.uml.AttributeFacade;
import org.andromda.metafacades.uml.ClassifierFacade;
import org.andromda.metafacades.uml.ConstraintFacade;
import org.andromda.metafacades.uml.DependencyFacade;
import org.andromda.metafacades.uml.Destination;
import org.andromda.metafacades.uml.GeneralizableElementFacade;
import org.andromda.metafacades.uml.GeneralizationFacade;
import org.andromda.metafacades.uml.ModelElementFacade;
import org.andromda.metafacades.uml.ModelFacade;
import org.andromda.metafacades.uml.OperationFacade;
import org.andromda.metafacades.uml.PackageFacade;
import org.andromda.metafacades.uml.Role;
import org.andromda.metafacades.uml.Service;
import org.andromda.metafacades.uml.StateMachineFacade;
import org.andromda.metafacades.uml.StereotypeFacade;
import org.andromda.metafacades.uml.TaggedValueFacade;
import org.andromda.metafacades.uml.TemplateParameterFacade;
import org.andromda.metafacades.uml.TypeMappings;
import org.andromda.translation.ocl.validation.OCLCollections;
import org.andromda.translation.ocl.validation.OCLIntrospector;
import org.andromda.translation.ocl.validation.OCLResultEnsurer;
import org.apache.commons.collections.Transformer;
import org.apache.log4j.Logger;

/**
 * <p>
 * Represents a web service.
 * </p>
 * MetafacadeLogic for WebService
 *
 * @see WebService
 */
public abstract class WebServiceLogic
    extends MetafacadeBase
    implements WebService
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
    protected WebServiceLogic(Object metaObjectIn, String context)
    {
        super(metaObjectIn, getContext(context));
        this.superService =
           (Service)
            MetafacadeFactory.getInstance().createFacadeImpl(
                    "org.andromda.metafacades.uml.Service",
                    metaObjectIn,
                    getContext(context));
        this.metaObject = metaObjectIn;
    }

    /**
     * The logger instance.
     */
    private static final Logger logger = Logger.getLogger(WebServiceLogic.class);

    /**
     * Gets the context for this metafacade logic instance.
     * @param context String. Set to WebService if null
     * @return context String
     */
    private static String getContext(String context)
    {
        if (context == null)
        {
            context = "org.andromda.cartridges.webservice.metafacades.WebService";
        }
        return context;
    }

    private Service superService;
    private boolean superServiceInitialized = false;

    /**
     * Gets the Service parent instance.
     * @return this.superService Service
     */
    private Service getSuperService()
    {
        if (!this.superServiceInitialized)
        {
            ((MetafacadeBase)this.superService).setMetafacadeContext(this.getMetafacadeContext());
            this.superServiceInitialized = true;
        }
        return this.superService;
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
            if (this.superServiceInitialized)
            {
                ((MetafacadeBase)this.superService).resetMetafacadeContext(context);
            }
        }
    }

    /**
     * @return boolean true always
     * @see WebService
     */
    public boolean isWebServiceMetaType()
    {
        return true;
    }

    // --------------- attributes ---------------------

   /**
    * @see org.andromda.cartridges.webservice.metafacades.WebService#getRpcClassName()
    * @return String
    */
    protected abstract String handleGetRpcClassName();

    private String __rpcClassName1a;
    private boolean __rpcClassName1aSet = false;

    /**
     * <p>
     * The name of the RPC implementation class.
     * </p>
     * @return (String)handleGetRpcClassName()
     */
    public final String getRpcClassName()
    {
        String rpcClassName1a = this.__rpcClassName1a;
        if (!this.__rpcClassName1aSet)
        {
            // rpcClassName has no pre constraints
            rpcClassName1a = handleGetRpcClassName();
            // rpcClassName has no post constraints
            this.__rpcClassName1a = rpcClassName1a;
            if (isMetafacadePropertyCachingEnabled())
            {
                this.__rpcClassName1aSet = true;
            }
        }
        return rpcClassName1a;
    }

   /**
    * @see org.andromda.cartridges.webservice.metafacades.WebService#isSecured()
    * @return boolean
    */
    protected abstract boolean handleIsSecured();

    private boolean __secured2a;
    private boolean __secured2aSet = false;

    /**
     * <p>
     * Whether or not this web service is secured (its based on whether
     * or not it has any roles associated to it).
     * </p>
     * @return (boolean)handleIsSecured()
     */
    public final boolean isSecured()
    {
        boolean secured2a = this.__secured2a;
        if (!this.__secured2aSet)
        {
            // secured has no pre constraints
            secured2a = handleIsSecured();
            // secured has no post constraints
            this.__secured2a = secured2a;
            if (isMetafacadePropertyCachingEnabled())
            {
                this.__secured2aSet = true;
            }
        }
        return secured2a;
    }

   /**
    * @see org.andromda.cartridges.webservice.metafacades.WebService#getAllowedMethods()
    * @return String
    */
    protected abstract String handleGetAllowedMethods();

    private String __allowedMethods3a;
    private boolean __allowedMethods3aSet = false;

    /**
     * <p>
     * Creates a space delimited string containing a name of ALL
     * allowed methods.
     * </p>
     * @return (String)handleGetAllowedMethods()
     */
    public final String getAllowedMethods()
    {
        String allowedMethods3a = this.__allowedMethods3a;
        if (!this.__allowedMethods3aSet)
        {
            // allowedMethods has no pre constraints
            allowedMethods3a = handleGetAllowedMethods();
            // allowedMethods has no post constraints
            this.__allowedMethods3a = allowedMethods3a;
            if (isMetafacadePropertyCachingEnabled())
            {
                this.__allowedMethods3aSet = true;
            }
        }
        return allowedMethods3a;
    }

   /**
    * @see org.andromda.cartridges.webservice.metafacades.WebService#getWsdlFile()
    * @return String
    */
    protected abstract String handleGetWsdlFile();

    private String __wsdlFile4a;
    private boolean __wsdlFile4aSet = false;

    /**
     * <p>
     * The location of the WSDL file for this web service.
     * </p>
     * @return (String)handleGetWsdlFile()
     */
    public final String getWsdlFile()
    {
        String wsdlFile4a = this.__wsdlFile4a;
        if (!this.__wsdlFile4aSet)
        {
            // wsdlFile has no pre constraints
            wsdlFile4a = handleGetWsdlFile();
            // wsdlFile has no post constraints
            this.__wsdlFile4a = wsdlFile4a;
            if (isMetafacadePropertyCachingEnabled())
            {
                this.__wsdlFile4aSet = true;
            }
        }
        return wsdlFile4a;
    }

   /**
    * @see org.andromda.cartridges.webservice.metafacades.WebService#getUse()
    * @return String
    */
    protected abstract String handleGetUse();

    private String __use5a;
    private boolean __use5aSet = false;

    /**
     * <p>
     * The use of items in the binding, either LITERAL or ENCODED.
     * </p>
     * @return (String)handleGetUse()
     */
    public final String getUse()
    {
        String use5a = this.__use5a;
        if (!this.__use5aSet)
        {
            // use has no pre constraints
            use5a = handleGetUse();
            // use has no post constraints
            this.__use5a = use5a;
            if (isMetafacadePropertyCachingEnabled())
            {
                this.__use5aSet = true;
            }
        }
        return use5a;
    }

   /**
    * @see org.andromda.cartridges.webservice.metafacades.WebService#getStyle()
    * @return String
    */
    protected abstract String handleGetStyle();

    private String __style6a;
    private boolean __style6aSet = false;

    /**
     * <p>
     * The style of binding in the generated WSDL, either DOCUMENT,
     * RPC, or WRAPPED.
     * </p>
     * @return (String)handleGetStyle()
     */
    public final String getStyle()
    {
        String style6a = this.__style6a;
        if (!this.__style6aSet)
        {
            // style has no pre constraints
            style6a = handleGetStyle();
            // style has no post constraints
            this.__style6a = style6a;
            if (isMetafacadePropertyCachingEnabled())
            {
                this.__style6aSet = true;
            }
        }
        return style6a;
    }

   /**
    * @see org.andromda.cartridges.webservice.metafacades.WebService#getNamespace()
    * @return String
    */
    protected abstract String handleGetNamespace();

    private String __namespace7a;
    private boolean __namespace7aSet = false;

    /**
     * <p>
     * The name of the namespace to which this web service belongs.
     * </p>
     * @return (String)handleGetNamespace()
     */
    public final String getNamespace()
    {
        String namespace7a = this.__namespace7a;
        if (!this.__namespace7aSet)
        {
            // namespace has no pre constraints
            namespace7a = handleGetNamespace();
            // namespace has no post constraints
            this.__namespace7a = namespace7a;
            if (isMetafacadePropertyCachingEnabled())
            {
                this.__namespace7aSet = true;
            }
        }
        return namespace7a;
    }

   /**
    * @see org.andromda.cartridges.webservice.metafacades.WebService#getProvider()
    * @return String
    */
    protected abstract String handleGetProvider();

    private String __provider8a;
    private boolean __provider8aSet = false;

    /**
     * <p>
     * The provider for this web service. Provider is something like:
     * 'java:RPC', or 'java:EJB' etc.
     * </p>
     * @return (String)handleGetProvider()
     */
    public final String getProvider()
    {
        String provider8a = this.__provider8a;
        if (!this.__provider8aSet)
        {
            // provider has no pre constraints
            provider8a = handleGetProvider();
            // provider has no post constraints
            this.__provider8a = provider8a;
            if (isMetafacadePropertyCachingEnabled())
            {
                this.__provider8aSet = true;
            }
        }
        return provider8a;
    }

   /**
    * @see org.andromda.cartridges.webservice.metafacades.WebService#getNamespacePrefix()
    * @return String
    */
    protected abstract String handleGetNamespacePrefix();

    private String __namespacePrefix9a;
    private boolean __namespacePrefix9aSet = false;

    /**
     * <p>
     * The namespace prefix used for types defined within the generated
     * WSDLs.
     * </p>
     * @return (String)handleGetNamespacePrefix()
     */
    public final String getNamespacePrefix()
    {
        String namespacePrefix9a = this.__namespacePrefix9a;
        if (!this.__namespacePrefix9aSet)
        {
            // namespacePrefix has no pre constraints
            namespacePrefix9a = handleGetNamespacePrefix();
            // namespacePrefix has no post constraints
            this.__namespacePrefix9a = namespacePrefix9a;
            if (isMetafacadePropertyCachingEnabled())
            {
                this.__namespacePrefix9aSet = true;
            }
        }
        return namespacePrefix9a;
    }

   /**
    * @see org.andromda.cartridges.webservice.metafacades.WebService#getEjbHomeInterface()
    * @return String
    */
    protected abstract String handleGetEjbHomeInterface();

    private String __ejbHomeInterface10a;
    private boolean __ejbHomeInterface10aSet = false;

    /**
     * <p>
     * The home interface name for an EJB provider.
     * </p>
     * @return (String)handleGetEjbHomeInterface()
     */
    public final String getEjbHomeInterface()
    {
        String ejbHomeInterface10a = this.__ejbHomeInterface10a;
        if (!this.__ejbHomeInterface10aSet)
        {
            // ejbHomeInterface has no pre constraints
            ejbHomeInterface10a = handleGetEjbHomeInterface();
            // ejbHomeInterface has no post constraints
            this.__ejbHomeInterface10a = ejbHomeInterface10a;
            if (isMetafacadePropertyCachingEnabled())
            {
                this.__ejbHomeInterface10aSet = true;
            }
        }
        return ejbHomeInterface10a;
    }

   /**
    * @see org.andromda.cartridges.webservice.metafacades.WebService#getEjbInterface()
    * @return String
    */
    protected abstract String handleGetEjbInterface();

    private String __ejbInterface11a;
    private boolean __ejbInterface11aSet = false;

    /**
     * <p>
     * The interface name for an EJB provider.
     * </p>
     * @return (String)handleGetEjbInterface()
     */
    public final String getEjbInterface()
    {
        String ejbInterface11a = this.__ejbInterface11a;
        if (!this.__ejbInterface11aSet)
        {
            // ejbInterface has no pre constraints
            ejbInterface11a = handleGetEjbInterface();
            // ejbInterface has no post constraints
            this.__ejbInterface11a = ejbInterface11a;
            if (isMetafacadePropertyCachingEnabled())
            {
                this.__ejbInterface11aSet = true;
            }
        }
        return ejbInterface11a;
    }

   /**
    * @see org.andromda.cartridges.webservice.metafacades.WebService#getEjbJndiName()
    * @return String
    */
    protected abstract String handleGetEjbJndiName();

    private String __ejbJndiName12a;
    private boolean __ejbJndiName12aSet = false;

    /**
     * <p>
     * The JNDI name for the EJB provider (the EJB that provides the
     * functionality behind this web service).
     * </p>
     * @return (String)handleGetEjbJndiName()
     */
    public final String getEjbJndiName()
    {
        String ejbJndiName12a = this.__ejbJndiName12a;
        if (!this.__ejbJndiName12aSet)
        {
            // ejbJndiName has no pre constraints
            ejbJndiName12a = handleGetEjbJndiName();
            // ejbJndiName has no post constraints
            this.__ejbJndiName12a = ejbJndiName12a;
            if (isMetafacadePropertyCachingEnabled())
            {
                this.__ejbJndiName12aSet = true;
            }
        }
        return ejbJndiName12a;
    }

   /**
    * @see org.andromda.cartridges.webservice.metafacades.WebService#getQName()
    * @return String
    */
    protected abstract String handleGetQName();

    private String __qName13a;
    private boolean __qName13aSet = false;

    /**
     * <p>
     * The QName for this service.  Usually it will be the same name as
     * the model element, however it is possible to specify a prefix to
     * give to this name.
     * </p>
     * @return (String)handleGetQName()
     */
    public final String getQName()
    {
        String qName13a = this.__qName13a;
        if (!this.__qName13aSet)
        {
            // qName has no pre constraints
            qName13a = handleGetQName();
            // qName has no post constraints
            this.__qName13a = qName13a;
            if (isMetafacadePropertyCachingEnabled())
            {
                this.__qName13aSet = true;
            }
        }
        return qName13a;
    }

   /**
    * @see org.andromda.cartridges.webservice.metafacades.WebService#getTestPackageName()
    * @return String
    */
    protected abstract String handleGetTestPackageName();

    private String __testPackageName14a;
    private boolean __testPackageName14aSet = false;

    /**
     * <p>
     * The name of the package to which tests are generated.
     * </p>
     * @return (String)handleGetTestPackageName()
     */
    public final String getTestPackageName()
    {
        String testPackageName14a = this.__testPackageName14a;
        if (!this.__testPackageName14aSet)
        {
            // testPackageName has no pre constraints
            testPackageName14a = handleGetTestPackageName();
            // testPackageName has no post constraints
            this.__testPackageName14a = testPackageName14a;
            if (isMetafacadePropertyCachingEnabled())
            {
                this.__testPackageName14aSet = true;
            }
        }
        return testPackageName14a;
    }

   /**
    * @see org.andromda.cartridges.webservice.metafacades.WebService#getFullyQualifiedTestName()
    * @return String
    */
    protected abstract String handleGetFullyQualifiedTestName();

    private String __fullyQualifiedTestName15a;
    private boolean __fullyQualifiedTestName15aSet = false;

    /**
     * <p>
     * The fully qualified name of a test generated for this web
     * service.
     * </p>
     * @return (String)handleGetFullyQualifiedTestName()
     */
    public final String getFullyQualifiedTestName()
    {
        String fullyQualifiedTestName15a = this.__fullyQualifiedTestName15a;
        if (!this.__fullyQualifiedTestName15aSet)
        {
            // fullyQualifiedTestName has no pre constraints
            fullyQualifiedTestName15a = handleGetFullyQualifiedTestName();
            // fullyQualifiedTestName has no post constraints
            this.__fullyQualifiedTestName15a = fullyQualifiedTestName15a;
            if (isMetafacadePropertyCachingEnabled())
            {
                this.__fullyQualifiedTestName15aSet = true;
            }
        }
        return fullyQualifiedTestName15a;
    }

   /**
    * @see org.andromda.cartridges.webservice.metafacades.WebService#getTestName()
    * @return String
    */
    protected abstract String handleGetTestName();

    private String __testName16a;
    private boolean __testName16aSet = false;

    /**
     * <p>
     * The name of a the test for this web service.
     * </p>
     * @return (String)handleGetTestName()
     */
    public final String getTestName()
    {
        String testName16a = this.__testName16a;
        if (!this.__testName16aSet)
        {
            // testName has no pre constraints
            testName16a = handleGetTestName();
            // testName has no post constraints
            this.__testName16a = testName16a;
            if (isMetafacadePropertyCachingEnabled())
            {
                this.__testName16aSet = true;
            }
        }
        return testName16a;
    }

   /**
    * @see org.andromda.cartridges.webservice.metafacades.WebService#isWrappedStyle()
    * @return boolean
    */
    protected abstract boolean handleIsWrappedStyle();

    private boolean __wrappedStyle17a;
    private boolean __wrappedStyle17aSet = false;

    /**
     * <p>
     * Indicates whether or not this service style is "wrapped".
     * </p>
     * @return (boolean)handleIsWrappedStyle()
     */
    public final boolean isWrappedStyle()
    {
        boolean wrappedStyle17a = this.__wrappedStyle17a;
        if (!this.__wrappedStyle17aSet)
        {
            // wrappedStyle has no pre constraints
            wrappedStyle17a = handleIsWrappedStyle();
            // wrappedStyle has no post constraints
            this.__wrappedStyle17a = wrappedStyle17a;
            if (isMetafacadePropertyCachingEnabled())
            {
                this.__wrappedStyle17aSet = true;
            }
        }
        return wrappedStyle17a;
    }

   /**
    * @see org.andromda.cartridges.webservice.metafacades.WebService#isDocumentStyle()
    * @return boolean
    */
    protected abstract boolean handleIsDocumentStyle();

    private boolean __documentStyle18a;
    private boolean __documentStyle18aSet = false;

    /**
     * <p>
     * Indicates whether or not this service is "document" style.
     * </p>
     * @return (boolean)handleIsDocumentStyle()
     */
    public final boolean isDocumentStyle()
    {
        boolean documentStyle18a = this.__documentStyle18a;
        if (!this.__documentStyle18aSet)
        {
            // documentStyle has no pre constraints
            documentStyle18a = handleIsDocumentStyle();
            // documentStyle has no post constraints
            this.__documentStyle18a = documentStyle18a;
            if (isMetafacadePropertyCachingEnabled())
            {
                this.__documentStyle18aSet = true;
            }
        }
        return documentStyle18a;
    }

   /**
    * @see org.andromda.cartridges.webservice.metafacades.WebService#isRpcStyle()
    * @return boolean
    */
    protected abstract boolean handleIsRpcStyle();

    private boolean __rpcStyle19a;
    private boolean __rpcStyle19aSet = false;

    /**
     * <p>
     * Indicates whether or not this service is "rpc" style.
     * </p>
     * @return (boolean)handleIsRpcStyle()
     */
    public final boolean isRpcStyle()
    {
        boolean rpcStyle19a = this.__rpcStyle19a;
        if (!this.__rpcStyle19aSet)
        {
            // rpcStyle has no pre constraints
            rpcStyle19a = handleIsRpcStyle();
            // rpcStyle has no post constraints
            this.__rpcStyle19a = rpcStyle19a;
            if (isMetafacadePropertyCachingEnabled())
            {
                this.__rpcStyle19aSet = true;
            }
        }
        return rpcStyle19a;
    }

   /**
    * @see org.andromda.cartridges.webservice.metafacades.WebService#isLiteralUse()
    * @return boolean
    */
    protected abstract boolean handleIsLiteralUse();

    private boolean __literalUse20a;
    private boolean __literalUse20aSet = false;

    /**
     * <p>
     * Indicates whether or not this web service has a "literal" use
     * defined.
     * </p>
     * @return (boolean)handleIsLiteralUse()
     */
    public final boolean isLiteralUse()
    {
        boolean literalUse20a = this.__literalUse20a;
        if (!this.__literalUse20aSet)
        {
            // literalUse has no pre constraints
            literalUse20a = handleIsLiteralUse();
            // literalUse has no post constraints
            this.__literalUse20a = literalUse20a;
            if (isMetafacadePropertyCachingEnabled())
            {
                this.__literalUse20aSet = true;
            }
        }
        return literalUse20a;
    }

   /**
    * @see org.andromda.cartridges.webservice.metafacades.WebService#isEncodedUse()
    * @return boolean
    */
    protected abstract boolean handleIsEncodedUse();

    private boolean __encodedUse21a;
    private boolean __encodedUse21aSet = false;

    /**
     * <p>
     * Indicates whether or not this web service has a "encoded" use
     * defined.
     * </p>
     * @return (boolean)handleIsEncodedUse()
     */
    public final boolean isEncodedUse()
    {
        boolean encodedUse21a = this.__encodedUse21a;
        if (!this.__encodedUse21aSet)
        {
            // encodedUse has no pre constraints
            encodedUse21a = handleIsEncodedUse();
            // encodedUse has no post constraints
            this.__encodedUse21a = encodedUse21a;
            if (isMetafacadePropertyCachingEnabled())
            {
                this.__encodedUse21aSet = true;
            }
        }
        return encodedUse21a;
    }

   /**
    * @see org.andromda.cartridges.webservice.metafacades.WebService#getTestImplementationName()
    * @return String
    */
    protected abstract String handleGetTestImplementationName();

    private String __testImplementationName22a;
    private boolean __testImplementationName22aSet = false;

    /**
     * <p>
     * The name for the test implementation class.
     * </p>
     * @return (String)handleGetTestImplementationName()
     */
    public final String getTestImplementationName()
    {
        String testImplementationName22a = this.__testImplementationName22a;
        if (!this.__testImplementationName22aSet)
        {
            // testImplementationName has no pre constraints
            testImplementationName22a = handleGetTestImplementationName();
            // testImplementationName has no post constraints
            this.__testImplementationName22a = testImplementationName22a;
            if (isMetafacadePropertyCachingEnabled())
            {
                this.__testImplementationName22aSet = true;
            }
        }
        return testImplementationName22a;
    }

   /**
    * @see org.andromda.cartridges.webservice.metafacades.WebService#getFullyQualifiedTestImplementationName()
    * @return String
    */
    protected abstract String handleGetFullyQualifiedTestImplementationName();

    private String __fullyQualifiedTestImplementationName23a;
    private boolean __fullyQualifiedTestImplementationName23aSet = false;

    /**
     * <p>
     * The fully qualified name of the test implementation class for
     * this web service.
     * </p>
     * @return (String)handleGetFullyQualifiedTestImplementationName()
     */
    public final String getFullyQualifiedTestImplementationName()
    {
        String fullyQualifiedTestImplementationName23a = this.__fullyQualifiedTestImplementationName23a;
        if (!this.__fullyQualifiedTestImplementationName23aSet)
        {
            // fullyQualifiedTestImplementationName has no pre constraints
            fullyQualifiedTestImplementationName23a = handleGetFullyQualifiedTestImplementationName();
            // fullyQualifiedTestImplementationName has no post constraints
            this.__fullyQualifiedTestImplementationName23a = fullyQualifiedTestImplementationName23a;
            if (isMetafacadePropertyCachingEnabled())
            {
                this.__fullyQualifiedTestImplementationName23aSet = true;
            }
        }
        return fullyQualifiedTestImplementationName23a;
    }

   /**
    * @see org.andromda.cartridges.webservice.metafacades.WebService#getTypeMappingElements()
    * @return Collection
    */
    protected abstract Collection handleGetTypeMappingElements();

    private Collection __typeMappingElements24a;
    private boolean __typeMappingElements24aSet = false;

    /**
     * <p>
     * Returns a collection of all type mappings used by this
     * WebServiceFacade.  This consists of all complex types that the
     * service may take in as a parameter in an operation or returns
     * and exceptions that this web service throws.
     * </p>
     * @return (Collection)handleGetTypeMappingElements()
     */
    public final Collection getTypeMappingElements()
    {
        Collection typeMappingElements24a = this.__typeMappingElements24a;
        if (!this.__typeMappingElements24aSet)
        {
            // typeMappingElements has no pre constraints
            typeMappingElements24a = handleGetTypeMappingElements();
            // typeMappingElements has no post constraints
            this.__typeMappingElements24a = typeMappingElements24a;
            if (isMetafacadePropertyCachingEnabled())
            {
                this.__typeMappingElements24aSet = true;
            }
        }
        return typeMappingElements24a;
    }

   /**
    * @see org.andromda.cartridges.webservice.metafacades.WebService#isSimpleBindingMode()
    * @return boolean
    */
    protected abstract boolean handleIsSimpleBindingMode();

    private boolean __simpleBindingMode25a;
    private boolean __simpleBindingMode25aSet = false;

    /**
     * <p>
     * Use Jaxb2 XJC simple binding mode
     * </p>
     * @return (boolean)handleIsSimpleBindingMode()
     */
    public final boolean isSimpleBindingMode()
    {
        boolean simpleBindingMode25a = this.__simpleBindingMode25a;
        if (!this.__simpleBindingMode25aSet)
        {
            // simpleBindingMode has no pre constraints
            simpleBindingMode25a = handleIsSimpleBindingMode();
            // simpleBindingMode has no post constraints
            this.__simpleBindingMode25a = simpleBindingMode25a;
            if (isMetafacadePropertyCachingEnabled())
            {
                this.__simpleBindingMode25aSet = true;
            }
        }
        return simpleBindingMode25a;
    }

   /**
    * @see org.andromda.cartridges.webservice.metafacades.WebService#getXjcArguments()
    * @return String
    */
    protected abstract String handleGetXjcArguments();

    private String __xjcArguments26a;
    private boolean __xjcArguments26aSet = false;

    /**
     * <p>
     * Override global default XJC arguments for Jaxb wsdl2java (i.e.
     * add Collection setters, equals, toString methods).
     * </p>
     * @return (String)handleGetXjcArguments()
     */
    public final String getXjcArguments()
    {
        String xjcArguments26a = this.__xjcArguments26a;
        if (!this.__xjcArguments26aSet)
        {
            // xjcArguments has no pre constraints
            xjcArguments26a = handleGetXjcArguments();
            // xjcArguments has no post constraints
            this.__xjcArguments26a = xjcArguments26a;
            if (isMetafacadePropertyCachingEnabled())
            {
                this.__xjcArguments26aSet = true;
            }
        }
        return xjcArguments26a;
    }

   /**
    * @see org.andromda.cartridges.webservice.metafacades.WebService#isSchemaValidation()
    * @return boolean
    */
    protected abstract boolean handleIsSchemaValidation();

    private boolean __schemaValidation27a;
    private boolean __schemaValidation27aSet = false;

    /**
     * <p>
     * Validate incoming webservice XML against wsdl/xsd schema
     * </p>
     * @return (boolean)handleIsSchemaValidation()
     */
    public final boolean isSchemaValidation()
    {
        boolean schemaValidation27a = this.__schemaValidation27a;
        if (!this.__schemaValidation27aSet)
        {
            // schemaValidation has no pre constraints
            schemaValidation27a = handleIsSchemaValidation();
            // schemaValidation has no post constraints
            this.__schemaValidation27a = schemaValidation27a;
            if (isMetafacadePropertyCachingEnabled())
            {
                this.__schemaValidation27aSet = true;
            }
        }
        return schemaValidation27a;
    }

   /**
    * @see org.andromda.cartridges.webservice.metafacades.WebService#getRestPath()
    * @return String
    */
    protected abstract String handleGetRestPath();

    private String __restPath28a;
    private boolean __restPath28aSet = false;

    /**
     * <p>
     * The URL path for the REST webservice. If unspecified, the
     * lowercase /classname/ is used.
     * </p>
     * @return (String)handleGetRestPath()
     */
    public final String getRestPath()
    {
        String restPath28a = this.__restPath28a;
        if (!this.__restPath28aSet)
        {
            // restPath has no pre constraints
            restPath28a = handleGetRestPath();
            // restPath has no post constraints
            this.__restPath28a = restPath28a;
            if (isMetafacadePropertyCachingEnabled())
            {
                this.__restPath28aSet = true;
            }
        }
        return restPath28a;
    }

   /**
    * @see org.andromda.cartridges.webservice.metafacades.WebService#getRestContexts()
    * @return Collection<String>
    */
    protected abstract Collection<String> handleGetRestContexts();

    private Collection<String> __restContexts29a;
    private boolean __restContexts29aSet = false;

    /**
     * <p>
     * Context used for REST JAX-WS implementation for this service.
     * </p>
     * @return (Collection<String>)handleGetRestContexts()
     */
    public final Collection<String> getRestContexts()
    {
        Collection<String> restContexts29a = this.__restContexts29a;
        if (!this.__restContexts29aSet)
        {
            // restContexts has no pre constraints
            restContexts29a = handleGetRestContexts();
            // restContexts has no post constraints
            this.__restContexts29a = restContexts29a;
            if (isMetafacadePropertyCachingEnabled())
            {
                this.__restContexts29aSet = true;
            }
        }
        return restContexts29a;
    }

   /**
    * @see org.andromda.cartridges.webservice.metafacades.WebService#getRestCount()
    * @return int
    */
    protected abstract int handleGetRestCount();

    private int __restCount30a;
    private boolean __restCount30aSet = false;

    /**
     * <p>
     * Number of REST JAX-RS service methods in this class. If
     * WebService stereotype rest value is true, all methods are REST
     * methods, otherwise this is the count of exposed
     * WebServiceOperations with rest value set to true. This is the
     * only required configuration for implementing REST services, the
     * rest use intelligent defaults which can be overridden.
     * </p>
     * @return (int)handleGetRestCount()
     */
    public final int getRestCount()
    {
        int restCount30a = this.__restCount30a;
        if (!this.__restCount30aSet)
        {
            // restCount has no pre constraints
            restCount30a = handleGetRestCount();
            // restCount has no post constraints
            this.__restCount30a = restCount30a;
            if (isMetafacadePropertyCachingEnabled())
            {
                this.__restCount30aSet = true;
            }
        }
        return restCount30a;
    }

   /**
    * @see org.andromda.cartridges.webservice.metafacades.WebService#getRestCacheType()
    * @return String
    */
    protected abstract String handleGetRestCacheType();

    private String __restCacheType31a;
    private boolean __restCacheType31aSet = false;

    /**
     * <p>
     * Specified CacheType (none, always, etc) in @CacheType
     * annotation.
     * </p>
     * @return (String)handleGetRestCacheType()
     */
    public final String getRestCacheType()
    {
        String restCacheType31a = this.__restCacheType31a;
        if (!this.__restCacheType31aSet)
        {
            // restCacheType has no pre constraints
            restCacheType31a = handleGetRestCacheType();
            // restCacheType has no post constraints
            this.__restCacheType31a = restCacheType31a;
            if (isMetafacadePropertyCachingEnabled())
            {
                this.__restCacheType31aSet = true;
            }
        }
        return restCacheType31a;
    }

   /**
    * @see org.andromda.cartridges.webservice.metafacades.WebService#getRestProduces()
    * @return String
    */
    protected abstract String handleGetRestProduces();

    private String __restProduces32a;
    private boolean __restProduces32aSet = false;

    /**
     * <p>
     * @Produces(media type) annotation. i.e. json, atom, plain/text,
     * xml.
     * </p>
     * @return (String)handleGetRestProduces()
     */
    public final String getRestProduces()
    {
        String restProduces32a = this.__restProduces32a;
        if (!this.__restProduces32aSet)
        {
            // restProduces has no pre constraints
            restProduces32a = handleGetRestProduces();
            // restProduces has no post constraints
            this.__restProduces32a = restProduces32a;
            if (isMetafacadePropertyCachingEnabled())
            {
                this.__restProduces32aSet = true;
            }
        }
        return restProduces32a;
    }

   /**
    * @see org.andromda.cartridges.webservice.metafacades.WebService#getRestConsumes()
    * @return String
    */
    protected abstract String handleGetRestConsumes();

    private String __restConsumes33a;
    private boolean __restConsumes33aSet = false;

    /**
     * <p>
     * @Consumes(media type) annotation. i.e. json, atom, plain/text,
     * xml.
     * </p>
     * @return (String)handleGetRestConsumes()
     */
    public final String getRestConsumes()
    {
        String restConsumes33a = this.__restConsumes33a;
        if (!this.__restConsumes33aSet)
        {
            // restConsumes has no pre constraints
            restConsumes33a = handleGetRestConsumes();
            // restConsumes has no post constraints
            this.__restConsumes33a = restConsumes33a;
            if (isMetafacadePropertyCachingEnabled())
            {
                this.__restConsumes33aSet = true;
            }
        }
        return restConsumes33a;
    }

   /**
    * @see org.andromda.cartridges.webservice.metafacades.WebService#getRestProvider()
    * @return String
    */
    protected abstract String handleGetRestProvider();

    private String __restProvider34a;
    private boolean __restProvider34aSet = false;

    /**
     * <p>
     * Customized REST @Provider annotation, must be implemented in the
     *  generated class.
     * </p>
     * @return (String)handleGetRestProvider()
     */
    public final String getRestProvider()
    {
        String restProvider34a = this.__restProvider34a;
        if (!this.__restProvider34aSet)
        {
            // restProvider has no pre constraints
            restProvider34a = handleGetRestProvider();
            // restProvider has no post constraints
            this.__restProvider34a = restProvider34a;
            if (isMetafacadePropertyCachingEnabled())
            {
                this.__restProvider34aSet = true;
            }
        }
        return restProvider34a;
    }

   /**
    * @see org.andromda.cartridges.webservice.metafacades.WebService#getRestTarget()
    * @return String
    */
    protected abstract String handleGetRestTarget();

    private String __restTarget35a;
    private boolean __restTarget35aSet = false;

    /**
     * <p>
     * Customized target ElementType, default=METHOD.
     * </p>
     * @return (String)handleGetRestTarget()
     */
    public final String getRestTarget()
    {
        String restTarget35a = this.__restTarget35a;
        if (!this.__restTarget35aSet)
        {
            // restTarget has no pre constraints
            restTarget35a = handleGetRestTarget();
            // restTarget has no post constraints
            this.__restTarget35a = restTarget35a;
            if (isMetafacadePropertyCachingEnabled())
            {
                this.__restTarget35aSet = true;
            }
        }
        return restTarget35a;
    }

   /**
    * @see org.andromda.cartridges.webservice.metafacades.WebService#getRestRetention()
    * @return String
    */
    protected abstract String handleGetRestRetention();

    private String __restRetention36a;
    private boolean __restRetention36aSet = false;

    /**
     * <p>
     * Customized RetentionPolicy (default=RUNTIME).
     * </p>
     * @return (String)handleGetRestRetention()
     */
    public final String getRestRetention()
    {
        String restRetention36a = this.__restRetention36a;
        if (!this.__restRetention36aSet)
        {
            // restRetention has no pre constraints
            restRetention36a = handleGetRestRetention();
            // restRetention has no post constraints
            this.__restRetention36a = restRetention36a;
            if (isMetafacadePropertyCachingEnabled())
            {
                this.__restRetention36aSet = true;
            }
        }
        return restRetention36a;
    }

   /**
    * @see org.andromda.cartridges.webservice.metafacades.WebService#getRestMethod()
    * @return String
    */
    protected abstract String handleGetRestMethod();

    private String __restMethod37a;
    private boolean __restMethod37aSet = false;

    /**
     * <p>
     * Customized Http Method implementation.
     * </p>
     * @return (String)handleGetRestMethod()
     */
    public final String getRestMethod()
    {
        String restMethod37a = this.__restMethod37a;
        if (!this.__restMethod37aSet)
        {
            // restMethod has no pre constraints
            restMethod37a = handleGetRestMethod();
            // restMethod has no post constraints
            this.__restMethod37a = restMethod37a;
            if (isMetafacadePropertyCachingEnabled())
            {
                this.__restMethod37aSet = true;
            }
        }
        return restMethod37a;
    }

   /**
    * @see org.andromda.cartridges.webservice.metafacades.WebService#isRestAtom()
    * @return boolean
    */
    protected abstract boolean handleIsRestAtom();

    private boolean __restAtom38a;
    private boolean __restAtom38aSet = false;

    /**
     * <p>
     * If this REST service provides application/atom, or any service
     * operations provide application/atom
     * </p>
     * @return (boolean)handleIsRestAtom()
     */
    public final boolean isRestAtom()
    {
        boolean restAtom38a = this.__restAtom38a;
        if (!this.__restAtom38aSet)
        {
            // restAtom has no pre constraints
            restAtom38a = handleIsRestAtom();
            // restAtom has no post constraints
            this.__restAtom38a = restAtom38a;
            if (isMetafacadePropertyCachingEnabled())
            {
                this.__restAtom38aSet = true;
            }
        }
        return restAtom38a;
    }

    // ---------------- business methods ----------------------

    /**
     * Method to be implemented in descendants
     * 
     * @return TypeMappings
     */
    protected abstract TypeMappings handleGetSchemaMappings();

    /**
     * 
     * @return handleGetSchemaMappings()
     */
    public TypeMappings getSchemaMappings()
    {
        // getSchemaMappings has no pre constraints
        TypeMappings returnValue = handleGetSchemaMappings();
        // getSchemaMappings has no post constraints
        return returnValue;
    }

    /**
     * Method to be implemented in descendants
     * 
     * @param packageName
     * @param follow
     * @return Collection
     */
    protected abstract Collection handleGetPackageReferences(String packageName, boolean follow);

    /**
     * 
     * @param packageName String
     * <p>
     * Package for which to find elements referenced by the web service
     * </p>
     * @param follow boolean
     * <p>
     * Follow the inheritance hierarchy when determining referenced
     * packages
     * </p>
     * @return handleGetPackageReferences(packageName, follow)
     */
    public Collection getPackageReferences(String packageName, boolean follow)
    {
        // getPackageReferences has no pre constraints
        Collection returnValue = handleGetPackageReferences(packageName, follow);
        // getPackageReferences has no post constraints
        return returnValue;
    }

    // ------------- associations ------------------

    private Collection<WebServiceOperation> __getAllowedOperations1r;
    private boolean __getAllowedOperations1rSet = false;

    /**
     * 
     * @return (Collection<WebServiceOperation>)handleGetAllowedOperations()
     */
    public final Collection<WebServiceOperation> getAllowedOperations()
    {
        Collection<WebServiceOperation> getAllowedOperations1r = this.__getAllowedOperations1r;
        if (!this.__getAllowedOperations1rSet)
        {
            // webService has no pre constraints
            Collection result = handleGetAllowedOperations();
            List shieldedResult = this.shieldedElements(result);
            try
            {
                getAllowedOperations1r = (Collection<WebServiceOperation>)shieldedResult;
            }
            catch (ClassCastException ex)
            {
                // Bad things happen if the metafacade type mapping in metafacades.xml is wrong - Warn
                WebServiceLogic.logger.warn("incorrect metafacade cast for WebServiceLogic.getAllowedOperations Collection<WebServiceOperation> " + result + ": " + shieldedResult);
            }
            // webService has no post constraints
            this.__getAllowedOperations1r = getAllowedOperations1r;
            if (isMetafacadePropertyCachingEnabled())
            {
                this.__getAllowedOperations1rSet = true;
            }
        }
        return getAllowedOperations1r;
    }

    /**
     * UML Specific type is returned in Collection, transformed by shieldedElements to AndroMDA Metafacade type
     * @return  Collection
     */
    protected abstract Collection handleGetAllowedOperations();

    /**
     * 
     * @return (Collection<WSDLType>)handleGetAllowedOperationExceptions()
     */
    public final Collection<WSDLType> getAllowedOperationExceptions()
    {
        Collection<WSDLType> getAllowedOperationExceptions2r = null;
        // webService has no pre constraints
        Collection result = handleGetAllowedOperationExceptions();
        List shieldedResult = this.shieldedElements(result);
        try
        {
            getAllowedOperationExceptions2r = (Collection<WSDLType>)shieldedResult;
        }
        catch (ClassCastException ex)
        {
            // Bad things happen if the metafacade type mapping in metafacades.xml is wrong - Warn
            WebServiceLogic.logger.warn("incorrect metafacade cast for WebServiceLogic.getAllowedOperationExceptions Collection<WSDLType> " + result + ": " + shieldedResult);
        }
        // webService has no post constraints
        return getAllowedOperationExceptions2r;
    }

    /**
     * UML Specific type is returned in Collection, transformed by shieldedElements to AndroMDA Metafacade type
     * @return  Collection
     */
    protected abstract Collection handleGetAllowedOperationExceptions();

    /**
     * @return true
     * @see Service
     */
    public boolean isServiceMetaType()
    {
        return true;
    }

    /**
     * @return true
     * @see ClassifierFacade
     */
    public boolean isClassifierFacadeMetaType()
    {
        return true;
    }

    /**
     * @return true
     * @see GeneralizableElementFacade
     */
    public boolean isGeneralizableElementFacadeMetaType()
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

    // ----------- delegates to Service ------------
    /**
     * <p>
     * Return the attribute which name matches the parameter
     * </p>
     * @see ClassifierFacade#findAttribute(String name)
     */
    public AttributeFacade findAttribute(String name)
    {
        return this.getSuperService().findAttribute(name);
    }

    /**
     * <p>
     * Those abstraction dependencies for which this classifier is the
     * client.
     * </p>
     * @see ClassifierFacade#getAbstractions()
     */
    public Collection<ClassifierFacade> getAbstractions()
    {
        return this.getSuperService().getAbstractions();
    }

    /**
     * <p>
     * Lists all classes associated to this one and any ancestor
     * classes (through generalization). There will be no duplicates.
     * The order of the elements is predictable.
     * </p>
     * @see ClassifierFacade#getAllAssociatedClasses()
     */
    public Collection<ClassifierFacade> getAllAssociatedClasses()
    {
        return this.getSuperService().getAllAssociatedClasses();
    }

    /**
     * <p>
     * A collection containing all 'properties' of the classifier and
     * its ancestors.  Properties are any attributes and navigable
     * connecting association ends.
     * </p>
     * @see ClassifierFacade#getAllProperties()
     */
    public Collection getAllProperties()
    {
        return this.getSuperService().getAllProperties();
    }

    /**
     * <p>
     * A collection containing all required and/or read-only
     * 'properties' of the classifier and its ancestors. Properties are
     * any attributes and navigable connecting association ends.
     * </p>
     * @see ClassifierFacade#getAllRequiredConstructorParameters()
     */
    public Collection getAllRequiredConstructorParameters()
    {
        return this.getSuperService().getAllRequiredConstructorParameters();
    }

    /**
     * <p>
     * Gets the array type for this classifier.  If this classifier
     * already represents an array, it just returns itself.
     * </p>
     * @see ClassifierFacade#getArray()
     */
    public ClassifierFacade getArray()
    {
        return this.getSuperService().getArray();
    }

    /**
     * <p>
     * The name of the classifier as an array.
     * </p>
     * @see ClassifierFacade#getArrayName()
     */
    public String getArrayName()
    {
        return this.getSuperService().getArrayName();
    }

    /**
     * <p>
     * Lists the classes associated to this one, there is no repitition
     * of classes. The order of the elements is predictable.
     * </p>
     * @see ClassifierFacade#getAssociatedClasses()
     */
    public Collection<ClassifierFacade> getAssociatedClasses()
    {
        return this.getSuperService().getAssociatedClasses();
    }

    /**
     * <p>
     * Gets the association ends belonging to a classifier.
     * </p>
     * @see ClassifierFacade#getAssociationEnds()
     */
    public List<AssociationEndFacade> getAssociationEnds()
    {
        return this.getSuperService().getAssociationEnds();
    }

    /**
     * <p>
     * Gets the attributes that belong to the classifier.
     * </p>
     * @see ClassifierFacade#getAttributes()
     */
    public List<AttributeFacade> getAttributes()
    {
        return this.getSuperService().getAttributes();
    }

    /**
     * <p>
     * Gets all attributes for the classifier and if 'follow' is true
     * goes up the inheritance hierarchy and gets the attributes from
     * the super classes as well.
     * </p>
     * @see ClassifierFacade#getAttributes(boolean follow)
     */
    public List getAttributes(boolean follow)
    {
        return this.getSuperService().getAttributes(follow);
    }

    /**
     * <p>
     * The fully qualified name of the classifier as an array.
     * </p>
     * @see ClassifierFacade#getFullyQualifiedArrayName()
     */
    public String getFullyQualifiedArrayName()
    {
        return this.getSuperService().getFullyQualifiedArrayName();
    }

    /**
     * <p>
     * Returns all those operations that could be implemented at this
     * classifier's level. This means the operations owned by this
     * classifier as well as any realized interface's operations
     * (recursively) in case this classifier itself is not already an
     * interface, or generalized when this classifier is an interface.
     * </p>
     * @see ClassifierFacade#getImplementationOperations()
     */
    public Collection<OperationFacade> getImplementationOperations()
    {
        return this.getSuperService().getImplementationOperations();
    }

    /**
     * <p>
     * A comma separated list of the fully qualified names of all
     * implemented interfaces.
     * </p>
     * @see ClassifierFacade#getImplementedInterfaceList()
     */
    public String getImplementedInterfaceList()
    {
        return this.getSuperService().getImplementedInterfaceList();
    }

    /**
     * <p>
     * Those attributes that are scoped to an instance of this class.
     * </p>
     * @see ClassifierFacade#getInstanceAttributes()
     */
    public Collection<AttributeFacade> getInstanceAttributes()
    {
        return this.getSuperService().getInstanceAttributes();
    }

    /**
     * <p>
     * Those operations that are scoped to an instance of this class.
     * </p>
     * @see ClassifierFacade#getInstanceOperations()
     */
    public List<OperationFacade> getInstanceOperations()
    {
        return this.getSuperService().getInstanceOperations();
    }

    /**
     * <p>
     * Those interfaces that are abstractions of this classifier, this
     * basically means this classifier realizes them.
     * </p>
     * @see ClassifierFacade#getInterfaceAbstractions()
     */
    public Collection<ClassifierFacade> getInterfaceAbstractions()
    {
        return this.getSuperService().getInterfaceAbstractions();
    }

    /**
     * <p>
     * A String representing a new Constructor declaration for this
     * classifier type to be used in a Java environment.
     * </p>
     * @see ClassifierFacade#getJavaNewString()
     */
    public String getJavaNewString()
    {
        return this.getSuperService().getJavaNewString();
    }

    /**
     * <p>
     * A String representing the null-value for this classifier type to
     * be used in a Java environment.
     * </p>
     * @see ClassifierFacade#getJavaNullString()
     */
    public String getJavaNullString()
    {
        return this.getSuperService().getJavaNullString();
    }

    /**
     * <p>
     * The other ends of this classifier's association ends which are
     * navigable.
     * </p>
     * @see ClassifierFacade#getNavigableConnectingEnds()
     */
    public Collection<ClassifierFacade> getNavigableConnectingEnds()
    {
        return this.getSuperService().getNavigableConnectingEnds();
    }

    /**
     * <p>
     * Get the other ends of this classifier's association ends which
     * are navigable and if 'follow' is true goes up the inheritance
     * hierarchy and gets the super association ends as well.
     * </p>
     * @see ClassifierFacade#getNavigableConnectingEnds(boolean follow)
     */
    public List getNavigableConnectingEnds(boolean follow)
    {
        return this.getSuperService().getNavigableConnectingEnds(follow);
    }

    /**
     * <p>
     * Assuming that the classifier is an array, this will return the
     * non array type of the classifier from
     * </p>
     * <p>
     * the model.  If the classifier is NOT an array, it will just
     * return itself.
     * </p>
     * @see ClassifierFacade#getNonArray()
     */
    public ClassifierFacade getNonArray()
    {
        return this.getSuperService().getNonArray();
    }

    /**
     * <p>
     * The attributes from this classifier in the form of an operation
     * call (this example would be in Java): '(String attributeOne,
     * String attributeTwo).  If there were no attributes on the
     * classifier, the result would be an empty '()'.
     * </p>
     * @see ClassifierFacade#getOperationCallFromAttributes()
     */
    public String getOperationCallFromAttributes()
    {
        return this.getSuperService().getOperationCallFromAttributes();
    }

    /**
     * <p>
     * The operations owned by this classifier.
     * </p>
     * @see ClassifierFacade#getOperations()
     */
    public List<OperationFacade> getOperations()
    {
        return this.getSuperService().getOperations();
    }

    /**
     * <p>
     * A collection containing all 'properties' of the classifier. 
     * Properties are any attributes and navigable connecting
     * association ends.
     * </p>
     * @see ClassifierFacade#getProperties()
     */
    public List getProperties()
    {
        return this.getSuperService().getProperties();
    }

    /**
     * <p>
     * Gets all properties (attributes and navigable association ends)
     * for the classifier and if 'follow' is true goes up the
     * inheritance hierarchy and gets the properties from the super
     * classes as well.
     * </p>
     * @see ClassifierFacade#getProperties(boolean follow)
     */
    public List getProperties(boolean follow)
    {
        return this.getSuperService().getProperties(follow);
    }

    /**
     * <p>
     * A collection containing all required and/or read-only
     * 'properties' of the classifier.  Properties are any attributes
     * and navigable connecting association ends.
     * </p>
     * @see ClassifierFacade#getRequiredConstructorParameters()
     */
    public Collection getRequiredConstructorParameters()
    {
        return this.getSuperService().getRequiredConstructorParameters();
    }

    /**
     * <p>
     * Returns the serial version UID of the underlying model element.
     * </p>
     * @see ClassifierFacade#getSerialVersionUID()
     */
    public long getSerialVersionUID()
    {
        return this.getSuperService().getSerialVersionUID();
    }

    /**
     * <p>
     * Those attributes that are scoped to the definition of this
     * class.
     * </p>
     * @see ClassifierFacade#getStaticAttributes()
     */
    public Collection<AttributeFacade> getStaticAttributes()
    {
        return this.getSuperService().getStaticAttributes();
    }

    /**
     * <p>
     * Those operations that are scoped to the definition of this
     * class.
     * </p>
     * @see ClassifierFacade#getStaticOperations()
     */
    public List<OperationFacade> getStaticOperations()
    {
        return this.getSuperService().getStaticOperations();
    }

    /**
     * <p>
     * This class' superclass, returns the generalization if it is a
     * ClassifierFacade, null otherwise.
     * </p>
     * @see ClassifierFacade#getSuperClass()
     */
    public ClassifierFacade getSuperClass()
    {
        return this.getSuperService().getSuperClass();
    }

    /**
     * <p>
     * The wrapper name for this classifier if a mapped type has a
     * defined wrapper class (ie. 'long' maps to 'Long').  If the
     * classifier doesn't have a wrapper defined for it, this method
     * will return a null.  Note that wrapper mappings must be defined
     * for the namespace by defining the 'wrapperMappingsUri', this
     * property must point to the location of the mappings file which
     * maps the primitives to wrapper types.
     * </p>
     * @see ClassifierFacade#getWrapperName()
     */
    public String getWrapperName()
    {
        return this.getSuperService().getWrapperName();
    }

    /**
     * <p>
     * Indicates if this classifier is 'abstract'.
     * </p>
     * @see ClassifierFacade#isAbstract()
     */
    public boolean isAbstract()
    {
        return this.getSuperService().isAbstract();
    }

    /**
     * <p>
     * True if this classifier represents an array type. False
     * otherwise.
     * </p>
     * @see ClassifierFacade#isArrayType()
     */
    public boolean isArrayType()
    {
        return this.getSuperService().isArrayType();
    }

    /**
     * 
     * @see ClassifierFacade#isAssociationClass()
     */
    public boolean isAssociationClass()
    {
        return this.getSuperService().isAssociationClass();
    }

    /**
     * <p>
     * Returns true if this type represents a Blob type.
     * </p>
     * @see ClassifierFacade#isBlobType()
     */
    public boolean isBlobType()
    {
        return this.getSuperService().isBlobType();
    }

    /**
     * <p>
     * Indicates if this type represents a boolean type or not.
     * </p>
     * @see ClassifierFacade#isBooleanType()
     */
    public boolean isBooleanType()
    {
        return this.getSuperService().isBooleanType();
    }

    /**
     * <p>
     * Indicates if this type represents a char, Character, or
     * java.lang.Character type or not.
     * </p>
     * @see ClassifierFacade#isCharacterType()
     */
    public boolean isCharacterType()
    {
        return this.getSuperService().isCharacterType();
    }

    /**
     * <p>
     * Returns true if this type represents a Clob type.
     * </p>
     * @see ClassifierFacade#isClobType()
     */
    public boolean isClobType()
    {
        return this.getSuperService().isClobType();
    }

    /**
     * <p>
     * True if this classifier represents a collection type. False
     * otherwise.
     * </p>
     * @see ClassifierFacade#isCollectionType()
     */
    public boolean isCollectionType()
    {
        return this.getSuperService().isCollectionType();
    }

    /**
     * <p>
     * True/false depending on whether or not this classifier
     * represents a datatype. A data type is a type whose instances are
     * identified only by their value. A data type may contain
     * attributes to support the modeling of structured data types.
     * </p>
     * @see ClassifierFacade#isDataType()
     */
    public boolean isDataType()
    {
        return this.getSuperService().isDataType();
    }

    /**
     * <p>
     * True when this classifier is a date type.
     * </p>
     * @see ClassifierFacade#isDateType()
     */
    public boolean isDateType()
    {
        return this.getSuperService().isDateType();
    }

    /**
     * <p>
     * Indicates if this type represents a Double type or not.
     * </p>
     * @see ClassifierFacade#isDoubleType()
     */
    public boolean isDoubleType()
    {
        return this.getSuperService().isDoubleType();
    }

    /**
     * <p>
     * Indicates whether or not this classifier represents an
     * "EmbeddedValue'.
     * </p>
     * @see ClassifierFacade#isEmbeddedValue()
     */
    public boolean isEmbeddedValue()
    {
        return this.getSuperService().isEmbeddedValue();
    }

    /**
     * <p>
     * True if this classifier is in fact marked as an enumeration.
     * </p>
     * @see ClassifierFacade#isEnumeration()
     */
    public boolean isEnumeration()
    {
        return this.getSuperService().isEnumeration();
    }

    /**
     * <p>
     * Returns true if this type represents a 'file' type.
     * </p>
     * @see ClassifierFacade#isFileType()
     */
    public boolean isFileType()
    {
        return this.getSuperService().isFileType();
    }

    /**
     * <p>
     * Indicates if this type represents a Float type or not.
     * </p>
     * @see ClassifierFacade#isFloatType()
     */
    public boolean isFloatType()
    {
        return this.getSuperService().isFloatType();
    }

    /**
     * <p>
     * Indicates if this type represents an int or Integer or
     * java.lang.Integer type or not.
     * </p>
     * @see ClassifierFacade#isIntegerType()
     */
    public boolean isIntegerType()
    {
        return this.getSuperService().isIntegerType();
    }

    /**
     * <p>
     * True/false depending on whether or not this Classifier
     * represents an interface.
     * </p>
     * @see ClassifierFacade#isInterface()
     */
    public boolean isInterface()
    {
        return this.getSuperService().isInterface();
    }

    /**
     * <p>
     * True if this classifier cannot be extended and represent a leaf
     * in the inheritance tree.
     * </p>
     * @see ClassifierFacade#isLeaf()
     */
    public boolean isLeaf()
    {
        return this.getSuperService().isLeaf();
    }

    /**
     * <p>
     * True if this classifier represents a list type. False otherwise.
     * </p>
     * @see ClassifierFacade#isListType()
     */
    public boolean isListType()
    {
        return this.getSuperService().isListType();
    }

    /**
     * <p>
     * Indicates if this type represents a Long type or not.
     * </p>
     * @see ClassifierFacade#isLongType()
     */
    public boolean isLongType()
    {
        return this.getSuperService().isLongType();
    }

    /**
     * <p>
     * Indicates whether or not this classifier represents a Map type.
     * </p>
     * @see ClassifierFacade#isMapType()
     */
    public boolean isMapType()
    {
        return this.getSuperService().isMapType();
    }

    /**
     * <p>
     * Indicates whether or not this classifier represents a primitive
     * type.
     * </p>
     * @see ClassifierFacade#isPrimitive()
     */
    public boolean isPrimitive()
    {
        return this.getSuperService().isPrimitive();
    }

    /**
     * <p>
     * True if this classifier represents a set type. False otherwise.
     * </p>
     * @see ClassifierFacade#isSetType()
     */
    public boolean isSetType()
    {
        return this.getSuperService().isSetType();
    }

    /**
     * <p>
     * Indicates whether or not this classifier represents a string
     * type.
     * </p>
     * @see ClassifierFacade#isStringType()
     */
    public boolean isStringType()
    {
        return this.getSuperService().isStringType();
    }

    /**
     * <p>
     * Indicates whether or not this classifier represents a time type.
     * </p>
     * @see ClassifierFacade#isTimeType()
     */
    public boolean isTimeType()
    {
        return this.getSuperService().isTimeType();
    }

    /**
     * <p>
     * Returns true if this type is a wrapped primitive type.
     * </p>
     * @see ClassifierFacade#isWrappedPrimitive()
     */
    public boolean isWrappedPrimitive()
    {
        return this.getSuperService().isWrappedPrimitive();
    }

    /**
     * <p>
     * Finds the tagged value optional searching the entire inheritance
     * hierarchy if 'follow' is set to true.
     * </p>
     * @see GeneralizableElementFacade#findTaggedValue(String tagName, boolean follow)
     */
    public Object findTaggedValue(String tagName, boolean follow)
    {
        return this.getSuperService().findTaggedValue(tagName, follow);
    }

    /**
     * <p>
     * All generalizations for this generalizable element, goes up the
     * inheritance tree.
     * </p>
     * @see GeneralizableElementFacade#getAllGeneralizations()
     */
    public Collection<GeneralizableElementFacade> getAllGeneralizations()
    {
        return this.getSuperService().getAllGeneralizations();
    }

    /**
     * <p>
     * All specializations (travels down the inheritance hierarchy).
     * </p>
     * @see GeneralizableElementFacade#getAllSpecializations()
     */
    public Collection<GeneralizableElementFacade> getAllSpecializations()
    {
        return this.getSuperService().getAllSpecializations();
    }

    /**
     * <p>
     * Gets the direct generalization for this generalizable element.
     * </p>
     * @see GeneralizableElementFacade#getGeneralization()
     */
    public GeneralizableElementFacade getGeneralization()
    {
        return this.getSuperService().getGeneralization();
    }

    /**
     * <p>
     * Gets the actual links that this generalization element is part
     * of (it plays either the specialization or generalization).
     * </p>
     * @see GeneralizableElementFacade#getGeneralizationLinks()
     */
    public Collection<GeneralizationFacade> getGeneralizationLinks()
    {
        return this.getSuperService().getGeneralizationLinks();
    }

    /**
     * <p>
     * A comma separated list of the fully qualified names of all
     * generalizations.
     * </p>
     * @see GeneralizableElementFacade#getGeneralizationList()
     */
    public String getGeneralizationList()
    {
        return this.getSuperService().getGeneralizationList();
    }

    /**
     * <p>
     * The element found when you recursively follow the generalization
     * path up to the root. If an element has no generalization itself
     * will be considered the root.
     * </p>
     * @see GeneralizableElementFacade#getGeneralizationRoot()
     */
    public GeneralizableElementFacade getGeneralizationRoot()
    {
        return this.getSuperService().getGeneralizationRoot();
    }

    /**
     * 
     * @see GeneralizableElementFacade#getGeneralizations()
     */
    public Collection<GeneralizableElementFacade> getGeneralizations()
    {
        return this.getSuperService().getGeneralizations();
    }

    /**
     * <p>
     * Gets the direct specializations (i.e. sub elements) for this
     * generalizatble element.
     * </p>
     * @see GeneralizableElementFacade#getSpecializations()
     */
    public Collection<GeneralizableElementFacade> getSpecializations()
    {
        return this.getSuperService().getSpecializations();
    }

    /**
     * <p>
     * Copies all tagged values from the given ModelElementFacade to
     * this model element facade.
     * </p>
     * @see ModelElementFacade#copyTaggedValues(ModelElementFacade element)
     */
    public void copyTaggedValues(ModelElementFacade element)
    {
        this.getSuperService().copyTaggedValues(element);
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
        return this.getSuperService().findTaggedValue(tagName);
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
        return this.getSuperService().findTaggedValues(tagName);
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
        return this.getSuperService().getBindedFullyQualifiedName(bindedElement);
    }

    /**
     * <p>
     * Gets all constraints belonging to the model element.
     * </p>
     * @see ModelElementFacade#getConstraints()
     */
    public Collection<ConstraintFacade> getConstraints()
    {
        return this.getSuperService().getConstraints();
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
        return this.getSuperService().getConstraints(kind);
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
        return this.getSuperService().getDocumentation(indent);
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
        return this.getSuperService().getDocumentation(indent, lineLength);
    }

    /**
     * 
     * @see ModelElementFacade#getDocumentation(String indent, int lineLength, boolean htmlStyle)
     */
    public String getDocumentation(String indent, int lineLength, boolean htmlStyle)
    {
        return this.getSuperService().getDocumentation(indent, lineLength, htmlStyle);
    }

    /**
     * <p>
     * The fully qualified name of this model element.
     * </p>
     * @see ModelElementFacade#getFullyQualifiedName()
     */
    public String getFullyQualifiedName()
    {
        return this.getSuperService().getFullyQualifiedName();
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
        return this.getSuperService().getFullyQualifiedName(modelName);
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
        return this.getSuperService().getFullyQualifiedNamePath();
    }

    /**
     * <p>
     * Gets the unique identifier of the underlying model element.
     * </p>
     * @see ModelElementFacade#getId()
     */
    public String getId()
    {
        return this.getSuperService().getId();
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
        return this.getSuperService().getKeywords();
    }

    /**
     * <p>
     * UML2: Retrieves a localized label for this named element.
     * </p>
     * @see ModelElementFacade#getLabel()
     */
    public String getLabel()
    {
        return this.getSuperService().getLabel();
    }

    /**
     * <p>
     * The language mappings that have been set for this model elemnt.
     * </p>
     * @see ModelElementFacade#getLanguageMappings()
     */
    public TypeMappings getLanguageMappings()
    {
        return this.getSuperService().getLanguageMappings();
    }

    /**
     * 
     * @see ModelElementFacade#getModel()
     */
    public ModelFacade getModel()
    {
        return this.getSuperService().getModel();
    }

    /**
     * <p>
     * The name of the model element.
     * </p>
     * @see ModelElementFacade#getName()
     */
    public String getName()
    {
        return this.getSuperService().getName();
    }

    /**
     * <p>
     * Gets the package to which this model element belongs.
     * </p>
     * @see ModelElementFacade#getPackage()
     */
    public ModelElementFacade getPackage()
    {
        return this.getSuperService().getPackage();
    }

    /**
     * <p>
     * The name of this model element's package.
     * </p>
     * @see ModelElementFacade#getPackageName()
     */
    public String getPackageName()
    {
        return this.getSuperService().getPackageName();
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
        return this.getSuperService().getPackageName(modelName);
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
        return this.getSuperService().getPackagePath();
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
        return this.getSuperService().getQualifiedName();
    }

    /**
     * <p>
     * Gets the root package for the model element.
     * </p>
     * @see ModelElementFacade#getRootPackage()
     */
    public PackageFacade getRootPackage()
    {
        return this.getSuperService().getRootPackage();
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
        return this.getSuperService().getSourceDependencies();
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
        return this.getSuperService().getStateMachineContext();
    }

    /**
     * <p>
     * The collection of ALL stereotype names for this model element.
     * </p>
     * @see ModelElementFacade#getStereotypeNames()
     */
    public Collection<String> getStereotypeNames()
    {
        return this.getSuperService().getStereotypeNames();
    }

    /**
     * <p>
     * Gets all stereotypes for this model element.
     * </p>
     * @see ModelElementFacade#getStereotypes()
     */
    public Collection<StereotypeFacade> getStereotypes()
    {
        return this.getSuperService().getStereotypes();
    }

    /**
     * 
     * @see ModelElementFacade#getTaggedValues()
     */
    public Collection<TaggedValueFacade> getTaggedValues()
    {
        return this.getSuperService().getTaggedValues();
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
        return this.getSuperService().getTargetDependencies();
    }

    /**
     * 
     * @see ModelElementFacade#getTemplateParameter(String parameterName)
     */
    public Object getTemplateParameter(String parameterName)
    {
        return this.getSuperService().getTemplateParameter(parameterName);
    }

    /**
     * 
     * @see ModelElementFacade#getTemplateParameters()
     */
    public Collection<TemplateParameterFacade> getTemplateParameters()
    {
        return this.getSuperService().getTemplateParameters();
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
        return this.getSuperService().getVisibility();
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
        return this.getSuperService().hasExactStereotype(stereotypeName);
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
        return this.getSuperService().hasKeyword(keywordName);
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
        return this.getSuperService().hasStereotype(stereotypeName);
    }

    /**
     * 
     * @see ModelElementFacade#isBindingDependenciesPresent()
     */
    public boolean isBindingDependenciesPresent()
    {
        return this.getSuperService().isBindingDependenciesPresent();
    }

    /**
     * <p>
     * Indicates if any constraints are present on this model element.
     * </p>
     * @see ModelElementFacade#isConstraintsPresent()
     */
    public boolean isConstraintsPresent()
    {
        return this.getSuperService().isConstraintsPresent();
    }

    /**
     * <p>
     * Indicates if any documentation is present on this model element.
     * </p>
     * @see ModelElementFacade#isDocumentationPresent()
     */
    public boolean isDocumentationPresent()
    {
        return this.getSuperService().isDocumentationPresent();
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
        return this.getSuperService().isReservedWord();
    }

    /**
     * 
     * @see ModelElementFacade#isTemplateParametersPresent()
     */
    public boolean isTemplateParametersPresent()
    {
        return this.getSuperService().isTemplateParametersPresent();
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
        return this.getSuperService().translateConstraint(name, translation);
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
        return this.getSuperService().translateConstraints(translation);
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
        return this.getSuperService().translateConstraints(kind, translation);
    }

    /**
     * <p>
     * Returns a collection of all entities this service and its
     * ancestors have a relation to.
     * </p>
     * @see Service#getAllEntityReferences()
     */
    public Collection<DependencyFacade> getAllEntityReferences()
    {
        return this.getSuperService().getAllEntityReferences();
    }

    /**
     * <p>
     * All messaging destinations that belong to this service and all
     * decendent services.
     * </p>
     * @see Service#getAllMessagingDestinations()
     */
    public Collection<Destination> getAllMessagingDestinations()
    {
        return this.getSuperService().getAllMessagingDestinations();
    }

    /**
     * <p>
     * All roles associated with the service, this includes both roles
     * that have access to the entire service, and any roles that have
     * access to a single operation.
     * </p>
     * @see Service#getAllRoles()
     */
    public Collection<Role> getAllRoles()
    {
        return this.getSuperService().getAllRoles();
    }

    /**
     * <p>
     * Returns a collection of all services this service and its
     * ancestors have a relation to.
     * </p>
     * @see Service#getAllServiceReferences()
     */
    public Collection<DependencyFacade> getAllServiceReferences()
    {
        return this.getSuperService().getAllServiceReferences();
    }

    /**
     * <p>
     * References to all entities to which this service has a
     * dependency.
     * </p>
     * @see Service#getEntityReferences()
     */
    public Collection<DependencyFacade> getEntityReferences()
    {
        return this.getSuperService().getEntityReferences();
    }

    /**
     * <p>
     * All messaging destinations available to this service.
     * </p>
     * @see Service#getMessagingDestinations()
     */
    public Collection<Destination> getMessagingDestinations()
    {
        return this.getSuperService().getMessagingDestinations();
    }

    /**
     * <p>
     * The roles of the service, these are the actor's that can access
     * this service.
     * </p>
     * @see Service#getRoles()
     */
    public Collection<Role> getRoles()
    {
        return this.getSuperService().getRoles();
    }

    /**
     * <p>
     * References to all services to which this service has a
     * dependency.
     * </p>
     * @see Service#getServiceReferences()
     */
    public Collection<DependencyFacade> getServiceReferences()
    {
        return this.getSuperService().getServiceReferences();
    }

    /**
     * @see MetafacadeBase#initialize()
     */
    @Override
    public void initialize()
    {
        this.getSuperService().initialize();
    }

    /**
     * @return Object getSuperService().getValidationOwner()
     * @see MetafacadeBase#getValidationOwner()
     */
    @Override
    public Object getValidationOwner()
    {
        Object owner = this.getSuperService().getValidationOwner();
        return owner;
    }

    /**
     * @return String getSuperService().getValidationName()
     * @see MetafacadeBase#getValidationName()
     */
    @Override
    public String getValidationName()
    {
        String name = this.getSuperService().getValidationName();
        return name;
    }

    /**
     * <p><b>Constraint:</b> org::andromda::cartridges::webservice::metafacades::WebService::operation name must be unique</p>
     * <p><b>Error:</b> A web service can not have more than one operation with the same name, please check the names of your web service operations.</p>
     * <p><b>OCL:</b> context WebService inv : allowedOperations -> isUnique(operationName)</p>
     * @param validationMessages Collection<ModelValidationMessage>
     * @see MetafacadeBase#validateInvariants(Collection validationMessages)
     */
    @Override
    public void validateInvariants(Collection<ModelValidationMessage> validationMessages)
    {
        this.getSuperService().validateInvariants(validationMessages);
        try
        {
            final Object contextElement = this.THIS();
            boolean constraintValid = OCLResultEnsurer.ensure(OCLCollections.isUnique(OCLIntrospector.invoke(contextElement,"allowedOperations"),new Transformer(){public Object transform(Object object){return OCLIntrospector.invoke(object,"operationName");}}));
            if (!constraintValid)
            {
                validationMessages.add(
                    new ModelValidationMessage(
                        (MetafacadeBase)contextElement ,
                        "org::andromda::cartridges::webservice::metafacades::WebService::operation name must be unique",
                        "A web service can not have more than one operation with the same name, please check the names of your web service operations."));
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
            logger.error("Error validating constraint 'org::andromda::cartridges::webservice::metafacades::WebService::operation name must be unique' ON "
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