// license-header java merge-point
//
// Attention: generated code (by Metafacade.vsl) - do not modify!
//
package org.andromda.cartridges.webservice.metafacades;

import java.util.Collection;
import org.andromda.metafacades.uml.PackageFacade;

/**
 * 
 *
 * Metafacade interface to be used by AndroMDA cartridges.
 */
public interface WebServicePackage
    extends PackageFacade
{
    /**
     * Indicates the metafacade type (used for metafacade mappings).
     *
     * @return boolean always <code>true</code>
     */
    public boolean isWebServicePackageMetaType();

    /**
     * 
     * @return Collection<WebServiceOperation>
     */
    public Collection<WebServiceOperation> getAllowedOperations();

    /**
     * 
     * @return String
     */
    public String getAttributeFormDefault();

    /**
     * 
     * @return String
     */
    public String getElementFormDefault();

    /**
     * 
     * @return String
     */
    public String getNamespace();

    /**
     * <p>
     * Package Abbreviation
     * </p>
     * @return String
     */
    public String getPackageAbbr();

    /**
     * <p>
     * Packages referenced by this package, optionally following the
     * inheritance hierarchy.
     * </p>
     * @return Collection<WebServicePackage>
     */
    public Collection<WebServicePackage> getPackageReferences();

    /**
     * 
     * @param follow boolean
     * @return Collection
     */
    public Collection getPackageReferences(boolean follow);

    /**
     * <p>
     * Creates a list of referenced packages, following the inheritance
     * hierarchy.
     * </p>
     * @return Collection<WebServicePackage>
     */
    public Collection<WebServicePackage> getPackages();

    /**
     * <p>
     * Get the schema location for the generated schema file. By
     * default this is the service package name, without the leading
     * http://, with all namespace customizations replaced by '.', in
     * the xsd/ directory beneath the wsdl directory:
     * xsd/${service.package.namespace.substring(7).replaceAll('/','.')}xsd
     * </p>
     * @return String
     */
    public String getSchemaLocation();

    /**
     * <p>
     * If this package contains XML elements referenced by other
     * packages that are used by any webservices, if using CXF/JAX-WS
     * and schemas are imported.
     * </p>
     * @return boolean
     */
    public boolean isMissingXmlSchema();
}