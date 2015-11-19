// license-header java merge-point
//
// Attention: generated code (by Metafacade.vsl) - do not modify!
//
package org.andromda.cartridges.webservice.metafacades;

import java.util.Collection;
import org.andromda.metafacades.uml.Service;
import org.andromda.metafacades.uml.TypeMappings;

/**
 * <p>
 * Represents a web service.
 * </p>
 *
 * Metafacade interface to be used by AndroMDA cartridges.
 */
public interface WebService
    extends Service
{
    /**
     * Indicates the metafacade type (used for metafacade mappings).
     *
     * @return boolean always <code>true</code>
     */
    public boolean isWebServiceMetaType();

    /**
     * <p>
     * Creates a space delimited string containing a name of ALL
     * allowed methods.
     * </p>
     * @return String
     */
    public String getAllowedMethods();

    /**
     * <p>
     * The collection of exceptions from all allowed operations present
     * in this webservice.
     * </p>
     * @return Collection<WSDLType>
     */
    public Collection<WSDLType> getAllowedOperationExceptions();

    /**
     * <p>
     * All operations which are exposed on the web service.
     * </p>
     * @return Collection<WebServiceOperation>
     */
    public Collection<WebServiceOperation> getAllowedOperations();

    /**
     * <p>
     * The home interface name for an EJB provider.
     * </p>
     * @return String
     */
    public String getEjbHomeInterface();

    /**
     * <p>
     * The interface name for an EJB provider.
     * </p>
     * @return String
     */
    public String getEjbInterface();

    /**
     * <p>
     * The JNDI name for the EJB provider (the EJB that provides the
     * functionality behind this web service).
     * </p>
     * @return String
     */
    public String getEjbJndiName();

    /**
     * <p>
     * The fully qualified name of the test implementation class for
     * this web service.
     * </p>
     * @return String
     */
    public String getFullyQualifiedTestImplementationName();

    /**
     * <p>
     * The fully qualified name of a test generated for this web
     * service.
     * </p>
     * @return String
     */
    public String getFullyQualifiedTestName();

    /**
     * <p>
     * The name of the namespace to which this web service belongs.
     * </p>
     * @return String
     */
    public String getNamespace();

    /**
     * <p>
     * The namespace prefix used for types defined within the generated
     * WSDLs.
     * </p>
     * @return String
     */
    public String getNamespacePrefix();

    /**
     * 
     * @param packageName String
     * @param follow boolean
     * @return Collection
     */
    public Collection getPackageReferences(String packageName, boolean follow);

    /**
     * <p>
     * The provider for this web service. Provider is something like:
     * 'java:RPC', or 'java:EJB' etc.
     * </p>
     * @return String
     */
    public String getProvider();

    /**
     * <p>
     * The QName for this service.  Usually it will be the same name as
     * the model element, however it is possible to specify a prefix to
     * give to this name.
     * </p>
     * @return String
     */
    public String getQName();

    /**
     * <p>
     * Specified CacheType (none, always, etc) in @CacheType
     * annotation.
     * </p>
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
     * Context used for REST JAX-WS implementation for this service.
     * </p>
     * @return Collection<String>
     */
    public Collection<String> getRestContexts();

    /**
     * <p>
     * Number of REST JAX-RS service methods in this class. If
     * WebService stereotype rest value is true, all methods are REST
     * methods, otherwise this is the count of exposed
     * WebServiceOperations with rest value set to true. This is the
     * only required configuration for implementing REST services, the
     * rest use intelligent defaults which can be overridden.
     * </p>
     * @return int
     */
    public int getRestCount();

    /**
     * <p>
     * Customized Http Method implementation.
     * </p>
     * @return String
     */
    public String getRestMethod();

    /**
     * <p>
     * The URL path for the REST webservice. If unspecified, the
     * lowercase /classname/ is used.
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
     * Customized RetentionPolicy (default=RUNTIME).
     * </p>
     * @return String
     */
    public String getRestRetention();

    /**
     * <p>
     * Customized target ElementType, default=METHOD.
     * </p>
     * @return String
     */
    public String getRestTarget();

    /**
     * <p>
     * The name of the RPC implementation class.
     * </p>
     * @return String
     */
    public String getRpcClassName();

    /**
     * 
     * @return TypeMappings
     */
    public TypeMappings getSchemaMappings();

    /**
     * <p>
     * The style of binding in the generated WSDL, either DOCUMENT,
     * RPC, or WRAPPED.
     * </p>
     * @return String
     */
    public String getStyle();

    /**
     * <p>
     * The name for the test implementation class.
     * </p>
     * @return String
     */
    public String getTestImplementationName();

    /**
     * <p>
     * The name of a the test for this web service.
     * </p>
     * @return String
     */
    public String getTestName();

    /**
     * <p>
     * The name of the package to which tests are generated.
     * </p>
     * @return String
     */
    public String getTestPackageName();

    /**
     * <p>
     * Returns a collection of all type mappings used by this
     * WebServiceFacade.  This consists of all complex types that the
     * service may take in as a parameter in an operation or returns
     * and exceptions that this web service throws.
     * </p>
     * @return Collection
     */
    public Collection getTypeMappingElements();

    /**
     * <p>
     * The use of items in the binding, either LITERAL or ENCODED.
     * </p>
     * @return String
     */
    public String getUse();

    /**
     * <p>
     * The location of the WSDL file for this web service.
     * </p>
     * @return String
     */
    public String getWsdlFile();

    /**
     * <p>
     * Override global default XJC arguments for Jaxb wsdl2java (i.e.
     * add Collection setters, equals, toString methods).
     * </p>
     * @return String
     */
    public String getXjcArguments();

    /**
     * <p>
     * Indicates whether or not this service is "document" style.
     * </p>
     * @return boolean
     */
    public boolean isDocumentStyle();

    /**
     * <p>
     * Indicates whether or not this web service has a "encoded" use
     * defined.
     * </p>
     * @return boolean
     */
    public boolean isEncodedUse();

    /**
     * <p>
     * Indicates whether or not this web service has a "literal" use
     * defined.
     * </p>
     * @return boolean
     */
    public boolean isLiteralUse();

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
     * Indicates whether or not this service is "rpc" style.
     * </p>
     * @return boolean
     */
    public boolean isRpcStyle();

    /**
     * <p>
     * Validate incoming webservice XML against wsdl/xsd schema
     * </p>
     * @return boolean
     */
    public boolean isSchemaValidation();

    /**
     * <p>
     * Whether or not this web service is secured (its based on whether
     * or not it has any roles associated to it).
     * </p>
     * @return boolean
     */
    public boolean isSecured();

    /**
     * <p>
     * Use Jaxb2 XJC simple binding mode
     * </p>
     * @return boolean
     */
    public boolean isSimpleBindingMode();

    /**
     * <p>
     * Indicates whether or not this service style is "wrapped".
     * </p>
     * @return boolean
     */
    public boolean isWrappedStyle();
}