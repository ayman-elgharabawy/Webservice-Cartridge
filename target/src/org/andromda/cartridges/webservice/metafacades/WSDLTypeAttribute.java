// license-header java merge-point
//
// Attention: generated code (by Metafacade.vsl) - do not modify!
//
package org.andromda.cartridges.webservice.metafacades;

import org.andromda.metafacades.uml.AttributeFacade;

/**
 * <p>
 * Represents an attribute of a WSDL type.
 * </p>
 *
 * Metafacade interface to be used by AndroMDA cartridges.
 */
public interface WSDLTypeAttribute
    extends AttributeFacade
{
    /**
     * Indicates the metafacade type (used for metafacade mappings).
     *
     * @return boolean always <code>true</code>
     */
    public boolean isWSDLTypeAttributeMetaType();

    /**
     * <p>
     * Class referenced by @XmlAdapter Jaxb annotation
     * </p>
     * @return String
     */
    public String getXmlAdapter();

    /**
     * <p>
     * XMLSchema type for Jaxb type mapping. Overrides default.
     * </p>
     * @return String
     */
    public String getXmlSchemaType();

    /**
     * <p>
     * Is the attribute an XML attribute?
     * </p>
     * @return boolean
     */
    public boolean isAttribute();

    /**
     * <p>
     * Is the attribute an XML element?
     * </p>
     * @return boolean
     */
    public boolean isElement();

    /**
     * <p>
     * Whether or not this WSDL Type attribute is nillable.
     * </p>
     * @return boolean
     */
    public boolean isNillable();
}