// license-header java merge-point
//
// Attention: generated code (by Metafacade.vsl) - do not modify!
//
package org.andromda.cartridges.webservice.metafacades;

import org.andromda.metafacades.uml.EnumerationFacade;

/**
 * <p>
 * Represents an web service WSDL enumeration type.
 * </p>
 *
 * Metafacade interface to be used by AndroMDA cartridges.
 */
public interface WSDLEnumerationType
    extends EnumerationFacade
{
    /**
     * Indicates the metafacade type (used for metafacade mappings).
     *
     * @return boolean always <code>true</code>
     */
    public boolean isWSDLEnumerationTypeMetaType();

    /**
     * <p>
     * The name of the namespace to which this type belongs.
     * </p>
     * @return String
     */
    public String getNamespace();

    /**
     * <p>
     * The namespace prefix used for this type, this will match the
     * namespace prefix on the WebService.
     * </p>
     * @return String
     */
    public String getNamespacePrefix();

    /**
     * <p>
     * The QName for this type, normally this name will just be the
     * same name of the model element, however we can also add a prefix
     * to the name through a namepace property.
     * </p>
     * @return String
     */
    public String getQName();

    /**
     * <p>
     * The schema type for tihs WSDL type.
     * </p>
     * @return String
     */
    public String getSchemaType();

    /**
     * <p>
     * Gets the schema type for this WSDL type.  If 'withPrefix' is
     * true then the schema type with
     * </p>
     * <p>
     * the namespace prefix will be returned.
     * </p>
     * @param withPrefix boolean
     * @param preserveArray boolean
     * @return String
     */
    public String getSchemaType(boolean withPrefix, boolean preserveArray);

    /**
     * <p>
     * The type name as a wrapped array type.
     * </p>
     * @return String
     */
    public String getWsdlArrayName();

    /**
     * <p>
     * The configurable prefix to use for wrapped array types.
     * </p>
     * @return String
     */
    public String getWsdlArrayNamePrefix();
}