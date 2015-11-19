// license-header java merge-point
//
// Attention: generated code (by Metafacade.vsl) - do not modify!
//
package org.andromda.cartridges.webservice.metafacades;

import org.andromda.metafacades.uml.AssociationEndFacade;

/**
 * <p>
 * Represents an association end of a WSDL type.
 * </p>
 *
 * Metafacade interface to be used by AndroMDA cartridges.
 */
public interface WSDLTypeAssociationEnd
    extends AssociationEndFacade
{
    /**
     * Indicates the metafacade type (used for metafacade mappings).
     *
     * @return boolean always <code>true</code>
     */
    public boolean isWSDLTypeAssociationEndMetaType();

    /**
     * <p>
     * Whether or not this WSDL Type association end is nillable.
     * </p>
     * @return boolean
     */
    public boolean isNillable();
}