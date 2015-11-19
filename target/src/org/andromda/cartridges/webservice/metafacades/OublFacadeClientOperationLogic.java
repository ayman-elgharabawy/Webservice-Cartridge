// license-header java merge-point
//
// Attention: generated code (by MetafacadeLogic.vsl) - do not modify!
//
package org.andromda.cartridges.webservice.metafacades;

import java.util.Collection;
import org.andromda.core.metafacade.ModelValidationMessage;

/**
 * 
 * MetafacadeLogic for OublFacadeClientOperation
 *
 * @see OublFacadeClientOperation
 */
public abstract class OublFacadeClientOperationLogic
    extends WebServiceOperationLogicImpl
    implements OublFacadeClientOperation
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
    protected OublFacadeClientOperationLogic(Object metaObjectIn, String context)
    {
        super(metaObjectIn, getContext(context));
        this.metaObject = metaObjectIn;
    }

    /**
     * Gets the context for this metafacade logic instance.
     * @param context String. Set to OublFacadeClientOperation if null
     * @return context String
     */
    private static String getContext(String context)
    {
        if (context == null)
        {
            context = "org.andromda.cartridges.webservice.metafacades.OublFacadeClientOperation";
        }
        return context;
    }

    /** Reset context only for non-root metafacades
     * @param context
     */
    @Override
    public void resetMetafacadeContext(String context)
    {
        if (!this.contextRoot) // reset context only for non-root metafacades
        {
            context = getContext(context);  // to have same value as in original constructor call
            setMetafacadeContext (context);
        }
    }

    /**
     * @return boolean true always
     * @see OublFacadeClientOperation
     */
    public boolean isOublFacadeClientOperationMetaType()
    {
        return true;
    }

    // ---------------- business methods ----------------------

    /**
     * Method to be implemented in descendants
     * 
     * @return String
     */
    protected abstract String handleGetOublFacadeClientUrl();

    /**
     * 
     * @return handleGetOublFacadeClientUrl()
     */
    public String getOublFacadeClientUrl()
    {
        // getOublFacadeClientUrl has no pre constraints
        String returnValue = handleGetOublFacadeClientUrl();
        // getOublFacadeClientUrl has no post constraints
        return returnValue;
    }

    /**
     * @param validationMessages Collection<ModelValidationMessage>
     * @see WebServiceOperationLogicImpl#validateInvariants(Collection validationMessages)
     */
    @Override
    public void validateInvariants(Collection<ModelValidationMessage> validationMessages)
    {
        super.validateInvariants(validationMessages);
    }
}