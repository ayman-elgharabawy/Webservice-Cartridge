// license-header java merge-point
//
// Attention: generated code (by Metafacade.vsl) - do not modify!
//
package org.andromda.cartridges.webservice.metafacades;

import org.andromda.metafacades.uml.ParameterFacade;

/**
 * <p>
 * Represents a parameter modeled on a webservice.
 * </p>
 *
 * Metafacade interface to be used by AndroMDA cartridges.
 */
public interface WebServiceParameter
    extends ParameterFacade
{
    /**
     * Indicates the metafacade type (used for metafacade mappings).
     *
     * @return boolean always <code>true</code>
     */
    public boolean isWebServiceParameterMetaType();

    /**
     * 
     * @return String
     */
    public String getRestParamType();

    /**
     * <p>
     * Customize the REST parameter path in the URL, by default it is
     * /paramname/{paramvalue}/, appended to the /class/method/ URL.
     * </p>
     * @return String
     */
    public String getRestPathParam();

    /**
     * 
     * @return String
     */
    public String getRestPathSegment();

    /**
     * <p>
     * The type name used when calling web service tests.
     * </p>
     * @return String
     */
    public String getTestTypeName();

    /**
     * <p>
     * Is the parameter an XML attribute?
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
     * Whether or not this webservice parameter is nillable.
     * </p>
     * @return boolean
     */
    public boolean isNillable();

    /**
     * 
     * @return boolean
     */
    public boolean isRestEncoded();
}