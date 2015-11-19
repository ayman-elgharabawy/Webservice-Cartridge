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
import org.andromda.metafacades.uml.EnumerationFacade;
import org.andromda.metafacades.uml.GeneralizableElementFacade;
import org.andromda.metafacades.uml.GeneralizationFacade;
import org.andromda.metafacades.uml.ModelElementFacade;
import org.andromda.metafacades.uml.ModelFacade;
import org.andromda.metafacades.uml.OperationFacade;
import org.andromda.metafacades.uml.PackageFacade;
import org.andromda.metafacades.uml.StateMachineFacade;
import org.andromda.metafacades.uml.StereotypeFacade;
import org.andromda.metafacades.uml.TaggedValueFacade;
import org.andromda.metafacades.uml.TemplateParameterFacade;
import org.andromda.metafacades.uml.TypeMappings;

/**
 * <p>
 * Represents an web service WSDL enumeration type.
 * </p>
 * MetafacadeLogic for WSDLEnumerationType
 *
 * @see WSDLEnumerationType
 */
public abstract class WSDLEnumerationTypeLogic
    extends MetafacadeBase
    implements WSDLEnumerationType
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
    protected WSDLEnumerationTypeLogic(Object metaObjectIn, String context)
    {
        super(metaObjectIn, getContext(context));
        this.superEnumerationFacade =
           (EnumerationFacade)
            MetafacadeFactory.getInstance().createFacadeImpl(
                    "org.andromda.metafacades.uml.EnumerationFacade",
                    metaObjectIn,
                    getContext(context));
        this.metaObject = metaObjectIn;
    }

    /**
     * Gets the context for this metafacade logic instance.
     * @param context String. Set to WSDLEnumerationType if null
     * @return context String
     */
    private static String getContext(String context)
    {
        if (context == null)
        {
            context = "org.andromda.cartridges.webservice.metafacades.WSDLEnumerationType";
        }
        return context;
    }

    private EnumerationFacade superEnumerationFacade;
    private boolean superEnumerationFacadeInitialized = false;

    /**
     * Gets the EnumerationFacade parent instance.
     * @return this.superEnumerationFacade EnumerationFacade
     */
    private EnumerationFacade getSuperEnumerationFacade()
    {
        if (!this.superEnumerationFacadeInitialized)
        {
            ((MetafacadeBase)this.superEnumerationFacade).setMetafacadeContext(this.getMetafacadeContext());
            this.superEnumerationFacadeInitialized = true;
        }
        return this.superEnumerationFacade;
    }

    /** Reset context only for non-root metafacades
     * @param context
     * @see org.andromda.core.metafacade.MetafacadeBase#resetMetafacadeContext(String context)
     */
    @Override
    public void resetMetafacadeContext(String context)
    {
        if (!this.contextRoot) // reset context only for non-root metafacades
        {
            context = getContext(context);  // to have same value as in original constructor call
            setMetafacadeContext (context);
            if (this.superEnumerationFacadeInitialized)
            {
                ((MetafacadeBase)this.superEnumerationFacade).resetMetafacadeContext(context);
            }
        }
    }

    /**
     * @return boolean true always
     * @see WSDLEnumerationType
     */
    public boolean isWSDLEnumerationTypeMetaType()
    {
        return true;
    }

    // --------------- attributes ---------------------

   /**
    * @see org.andromda.cartridges.webservice.metafacades.WSDLEnumerationType#getSchemaType()
    * @return String
    */
    protected abstract String handleGetSchemaType();

    private String __schemaType1a;
    private boolean __schemaType1aSet = false;

    /**
     * <p>
     * The schema type for tihs WSDL type.
     * </p>
     * @return (String)handleGetSchemaType()
     */
    public final String getSchemaType()
    {
        String schemaType1a = this.__schemaType1a;
        if (!this.__schemaType1aSet)
        {
            // schemaType has no pre constraints
            schemaType1a = handleGetSchemaType();
            // schemaType has no post constraints
            this.__schemaType1a = schemaType1a;
            if (isMetafacadePropertyCachingEnabled())
            {
                this.__schemaType1aSet = true;
            }
        }
        return schemaType1a;
    }

   /**
    * @see org.andromda.cartridges.webservice.metafacades.WSDLEnumerationType#getQName()
    * @return String
    */
    protected abstract String handleGetQName();

    private String __qName2a;
    private boolean __qName2aSet = false;

    /**
     * <p>
     * The QName for this type, normally this name will just be the
     * same name of the model element, however we can also add a prefix
     * to the name through a namepace property.
     * </p>
     * @return (String)handleGetQName()
     */
    public final String getQName()
    {
        String qName2a = this.__qName2a;
        if (!this.__qName2aSet)
        {
            // qName has no pre constraints
            qName2a = handleGetQName();
            // qName has no post constraints
            this.__qName2a = qName2a;
            if (isMetafacadePropertyCachingEnabled())
            {
                this.__qName2aSet = true;
            }
        }
        return qName2a;
    }

   /**
    * @see org.andromda.cartridges.webservice.metafacades.WSDLEnumerationType#getNamespacePrefix()
    * @return String
    */
    protected abstract String handleGetNamespacePrefix();

    private String __namespacePrefix3a;
    private boolean __namespacePrefix3aSet = false;

    /**
     * <p>
     * The namespace prefix used for this type, this will match the
     * namespace prefix on the WebService.
     * </p>
     * @return (String)handleGetNamespacePrefix()
     */
    public final String getNamespacePrefix()
    {
        String namespacePrefix3a = this.__namespacePrefix3a;
        if (!this.__namespacePrefix3aSet)
        {
            // namespacePrefix has no pre constraints
            namespacePrefix3a = handleGetNamespacePrefix();
            // namespacePrefix has no post constraints
            this.__namespacePrefix3a = namespacePrefix3a;
            if (isMetafacadePropertyCachingEnabled())
            {
                this.__namespacePrefix3aSet = true;
            }
        }
        return namespacePrefix3a;
    }

   /**
    * @see org.andromda.cartridges.webservice.metafacades.WSDLEnumerationType#getNamespace()
    * @return String
    */
    protected abstract String handleGetNamespace();

    private String __namespace4a;
    private boolean __namespace4aSet = false;

    /**
     * <p>
     * The name of the namespace to which this type belongs.
     * </p>
     * @return (String)handleGetNamespace()
     */
    public final String getNamespace()
    {
        String namespace4a = this.__namespace4a;
        if (!this.__namespace4aSet)
        {
            // namespace has no pre constraints
            namespace4a = handleGetNamespace();
            // namespace has no post constraints
            this.__namespace4a = namespace4a;
            if (isMetafacadePropertyCachingEnabled())
            {
                this.__namespace4aSet = true;
            }
        }
        return namespace4a;
    }

   /**
    * @see org.andromda.cartridges.webservice.metafacades.WSDLEnumerationType#getWsdlArrayNamePrefix()
    * @return String
    */
    protected abstract String handleGetWsdlArrayNamePrefix();

    private String __wsdlArrayNamePrefix5a;
    private boolean __wsdlArrayNamePrefix5aSet = false;

    /**
     * <p>
     * The configurable prefix to use for wrapped array types.
     * </p>
     * @return (String)handleGetWsdlArrayNamePrefix()
     */
    public final String getWsdlArrayNamePrefix()
    {
        String wsdlArrayNamePrefix5a = this.__wsdlArrayNamePrefix5a;
        if (!this.__wsdlArrayNamePrefix5aSet)
        {
            // wsdlArrayNamePrefix has no pre constraints
            wsdlArrayNamePrefix5a = handleGetWsdlArrayNamePrefix();
            // wsdlArrayNamePrefix has no post constraints
            this.__wsdlArrayNamePrefix5a = wsdlArrayNamePrefix5a;
            if (isMetafacadePropertyCachingEnabled())
            {
                this.__wsdlArrayNamePrefix5aSet = true;
            }
        }
        return wsdlArrayNamePrefix5a;
    }

   /**
    * @see org.andromda.cartridges.webservice.metafacades.WSDLEnumerationType#getWsdlArrayName()
    * @return String
    */
    protected abstract String handleGetWsdlArrayName();

    private String __wsdlArrayName6a;
    private boolean __wsdlArrayName6aSet = false;

    /**
     * <p>
     * The type name as a wrapped array type.
     * </p>
     * @return (String)handleGetWsdlArrayName()
     */
    public final String getWsdlArrayName()
    {
        String wsdlArrayName6a = this.__wsdlArrayName6a;
        if (!this.__wsdlArrayName6aSet)
        {
            // wsdlArrayName has no pre constraints
            wsdlArrayName6a = handleGetWsdlArrayName();
            // wsdlArrayName has no post constraints
            this.__wsdlArrayName6a = wsdlArrayName6a;
            if (isMetafacadePropertyCachingEnabled())
            {
                this.__wsdlArrayName6aSet = true;
            }
        }
        return wsdlArrayName6a;
    }

    // ---------------- business methods ----------------------

    /**
     * Method to be implemented in descendants
     * <p>
     * Gets the schema type for this WSDL type.  If 'withPrefix' is
     * true then the schema type with
     * </p>
     * <p>
     * the namespace prefix will be returned.
     * </p>
     * @param withPrefix
     * @param preserveArray
     * @return String
     */
    protected abstract String handleGetSchemaType(boolean withPrefix, boolean preserveArray);

    /**
     * <p>
     * Gets the schema type for this WSDL type.  If 'withPrefix' is
     * true then the schema type with
     * </p>
     * <p>
     * the namespace prefix will be returned.
     * </p>
     * @param withPrefix boolean
     * <p>
     * If true then the schema type with the namespace prefix will be
     * returned.
     * </p>
     * @param preserveArray boolean
     * <p>
     * True/false, if true then if the schema type is an array we'll
     * preserve the fact that its an array and return an array schema
     * type name.  If false we will return back the non array type even
     * if its an array.
     * </p>
     * @return handleGetSchemaType(withPrefix, preserveArray)
     */
    public String getSchemaType(boolean withPrefix, boolean preserveArray)
    {
        // getSchemaType has no pre constraints
        String returnValue = handleGetSchemaType(withPrefix, preserveArray);
        // getSchemaType has no post constraints
        return returnValue;
    }

    /**
     * @return true
     * @see EnumerationFacade
     */
    public boolean isEnumerationFacadeMetaType()
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

    // ----------- delegates to EnumerationFacade ------------
    /**
     * <p>
     * Return the attribute which name matches the parameter
     * </p>
     * @see ClassifierFacade#findAttribute(String name)
     */
    public AttributeFacade findAttribute(String name)
    {
        return this.getSuperEnumerationFacade().findAttribute(name);
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
        return this.getSuperEnumerationFacade().getAbstractions();
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
        return this.getSuperEnumerationFacade().getAllAssociatedClasses();
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
        return this.getSuperEnumerationFacade().getAllProperties();
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
        return this.getSuperEnumerationFacade().getAllRequiredConstructorParameters();
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
        return this.getSuperEnumerationFacade().getArray();
    }

    /**
     * <p>
     * The name of the classifier as an array.
     * </p>
     * @see ClassifierFacade#getArrayName()
     */
    public String getArrayName()
    {
        return this.getSuperEnumerationFacade().getArrayName();
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
        return this.getSuperEnumerationFacade().getAssociatedClasses();
    }

    /**
     * <p>
     * Gets the association ends belonging to a classifier.
     * </p>
     * @see ClassifierFacade#getAssociationEnds()
     */
    public List<AssociationEndFacade> getAssociationEnds()
    {
        return this.getSuperEnumerationFacade().getAssociationEnds();
    }

    /**
     * <p>
     * Gets the attributes that belong to the classifier.
     * </p>
     * @see ClassifierFacade#getAttributes()
     */
    public List<AttributeFacade> getAttributes()
    {
        return this.getSuperEnumerationFacade().getAttributes();
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
        return this.getSuperEnumerationFacade().getAttributes(follow);
    }

    /**
     * <p>
     * The fully qualified name of the classifier as an array.
     * </p>
     * @see ClassifierFacade#getFullyQualifiedArrayName()
     */
    public String getFullyQualifiedArrayName()
    {
        return this.getSuperEnumerationFacade().getFullyQualifiedArrayName();
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
        return this.getSuperEnumerationFacade().getImplementationOperations();
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
        return this.getSuperEnumerationFacade().getImplementedInterfaceList();
    }

    /**
     * <p>
     * Those attributes that are scoped to an instance of this class.
     * </p>
     * @see ClassifierFacade#getInstanceAttributes()
     */
    public Collection<AttributeFacade> getInstanceAttributes()
    {
        return this.getSuperEnumerationFacade().getInstanceAttributes();
    }

    /**
     * <p>
     * Those operations that are scoped to an instance of this class.
     * </p>
     * @see ClassifierFacade#getInstanceOperations()
     */
    public List<OperationFacade> getInstanceOperations()
    {
        return this.getSuperEnumerationFacade().getInstanceOperations();
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
        return this.getSuperEnumerationFacade().getInterfaceAbstractions();
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
        return this.getSuperEnumerationFacade().getJavaNewString();
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
        return this.getSuperEnumerationFacade().getJavaNullString();
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
        return this.getSuperEnumerationFacade().getNavigableConnectingEnds();
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
        return this.getSuperEnumerationFacade().getNavigableConnectingEnds(follow);
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
        return this.getSuperEnumerationFacade().getNonArray();
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
        return this.getSuperEnumerationFacade().getOperationCallFromAttributes();
    }

    /**
     * <p>
     * The operations owned by this classifier.
     * </p>
     * @see ClassifierFacade#getOperations()
     */
    public List<OperationFacade> getOperations()
    {
        return this.getSuperEnumerationFacade().getOperations();
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
        return this.getSuperEnumerationFacade().getProperties();
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
        return this.getSuperEnumerationFacade().getProperties(follow);
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
        return this.getSuperEnumerationFacade().getRequiredConstructorParameters();
    }

    /**
     * <p>
     * Returns the serial version UID of the underlying model element.
     * </p>
     * @see ClassifierFacade#getSerialVersionUID()
     */
    public long getSerialVersionUID()
    {
        return this.getSuperEnumerationFacade().getSerialVersionUID();
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
        return this.getSuperEnumerationFacade().getStaticAttributes();
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
        return this.getSuperEnumerationFacade().getStaticOperations();
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
        return this.getSuperEnumerationFacade().getSuperClass();
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
        return this.getSuperEnumerationFacade().getWrapperName();
    }

    /**
     * <p>
     * Indicates if this classifier is 'abstract'.
     * </p>
     * @see ClassifierFacade#isAbstract()
     */
    public boolean isAbstract()
    {
        return this.getSuperEnumerationFacade().isAbstract();
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
        return this.getSuperEnumerationFacade().isArrayType();
    }

    /**
     * 
     * @see ClassifierFacade#isAssociationClass()
     */
    public boolean isAssociationClass()
    {
        return this.getSuperEnumerationFacade().isAssociationClass();
    }

    /**
     * <p>
     * Returns true if this type represents a Blob type.
     * </p>
     * @see ClassifierFacade#isBlobType()
     */
    public boolean isBlobType()
    {
        return this.getSuperEnumerationFacade().isBlobType();
    }

    /**
     * <p>
     * Indicates if this type represents a boolean type or not.
     * </p>
     * @see ClassifierFacade#isBooleanType()
     */
    public boolean isBooleanType()
    {
        return this.getSuperEnumerationFacade().isBooleanType();
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
        return this.getSuperEnumerationFacade().isCharacterType();
    }

    /**
     * <p>
     * Returns true if this type represents a Clob type.
     * </p>
     * @see ClassifierFacade#isClobType()
     */
    public boolean isClobType()
    {
        return this.getSuperEnumerationFacade().isClobType();
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
        return this.getSuperEnumerationFacade().isCollectionType();
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
        return this.getSuperEnumerationFacade().isDataType();
    }

    /**
     * <p>
     * True when this classifier is a date type.
     * </p>
     * @see ClassifierFacade#isDateType()
     */
    public boolean isDateType()
    {
        return this.getSuperEnumerationFacade().isDateType();
    }

    /**
     * <p>
     * Indicates if this type represents a Double type or not.
     * </p>
     * @see ClassifierFacade#isDoubleType()
     */
    public boolean isDoubleType()
    {
        return this.getSuperEnumerationFacade().isDoubleType();
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
        return this.getSuperEnumerationFacade().isEmbeddedValue();
    }

    /**
     * <p>
     * True if this classifier is in fact marked as an enumeration.
     * </p>
     * @see ClassifierFacade#isEnumeration()
     */
    public boolean isEnumeration()
    {
        return this.getSuperEnumerationFacade().isEnumeration();
    }

    /**
     * <p>
     * Returns true if this type represents a 'file' type.
     * </p>
     * @see ClassifierFacade#isFileType()
     */
    public boolean isFileType()
    {
        return this.getSuperEnumerationFacade().isFileType();
    }

    /**
     * <p>
     * Indicates if this type represents a Float type or not.
     * </p>
     * @see ClassifierFacade#isFloatType()
     */
    public boolean isFloatType()
    {
        return this.getSuperEnumerationFacade().isFloatType();
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
        return this.getSuperEnumerationFacade().isIntegerType();
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
        return this.getSuperEnumerationFacade().isInterface();
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
        return this.getSuperEnumerationFacade().isLeaf();
    }

    /**
     * <p>
     * True if this classifier represents a list type. False otherwise.
     * </p>
     * @see ClassifierFacade#isListType()
     */
    public boolean isListType()
    {
        return this.getSuperEnumerationFacade().isListType();
    }

    /**
     * <p>
     * Indicates if this type represents a Long type or not.
     * </p>
     * @see ClassifierFacade#isLongType()
     */
    public boolean isLongType()
    {
        return this.getSuperEnumerationFacade().isLongType();
    }

    /**
     * <p>
     * Indicates whether or not this classifier represents a Map type.
     * </p>
     * @see ClassifierFacade#isMapType()
     */
    public boolean isMapType()
    {
        return this.getSuperEnumerationFacade().isMapType();
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
        return this.getSuperEnumerationFacade().isPrimitive();
    }

    /**
     * <p>
     * True if this classifier represents a set type. False otherwise.
     * </p>
     * @see ClassifierFacade#isSetType()
     */
    public boolean isSetType()
    {
        return this.getSuperEnumerationFacade().isSetType();
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
        return this.getSuperEnumerationFacade().isStringType();
    }

    /**
     * <p>
     * Indicates whether or not this classifier represents a time type.
     * </p>
     * @see ClassifierFacade#isTimeType()
     */
    public boolean isTimeType()
    {
        return this.getSuperEnumerationFacade().isTimeType();
    }

    /**
     * <p>
     * Returns true if this type is a wrapped primitive type.
     * </p>
     * @see ClassifierFacade#isWrappedPrimitive()
     */
    public boolean isWrappedPrimitive()
    {
        return this.getSuperEnumerationFacade().isWrappedPrimitive();
    }

    /**
     * <p>
     * The 'from' operation name.  This is the name of the operation
     * that takes the actual literal value and allows a new enumeration
     * to be constructed.
     * </p>
     * @see EnumerationFacade#getFromOperationName()
     */
    public String getFromOperationName()
    {
        return this.getSuperEnumerationFacade().getFromOperationName();
    }

    /**
     * <p>
     * The 'from' operation signature.  This is the signature that
     * takes the actual literal value and allows a new enumeration to
     * be constructed.
     * </p>
     * @see EnumerationFacade#getFromOperationSignature()
     */
    public String getFromOperationSignature()
    {
        return this.getSuperEnumerationFacade().getFromOperationSignature();
    }

    /**
     * <p>
     * The type of the enumeration's literals.
     * </p>
     * @see EnumerationFacade#getLiteralType()
     */
    public ClassifierFacade getLiteralType()
    {
        return this.getSuperEnumerationFacade().getLiteralType();
    }

    /**
     * <p>
     * This enumeration's literals.
     * </p>
     * @see EnumerationFacade#getLiterals()
     */
    public Collection<AttributeFacade> getLiterals()
    {
        return this.getSuperEnumerationFacade().getLiterals();
    }

    /**
     * <p>
     * The enumeration member variables.
     * </p>
     * @see EnumerationFacade#getMemberVariables()
     */
    public Collection<AttributeFacade> getMemberVariables()
    {
        return this.getSuperEnumerationFacade().getMemberVariables();
    }

    /**
     * <p>
     * Indicates whether the enumeration must be generated using a Java
     * 5 type-safe enum or a traditional enumeration-pattern class.
     * </p>
     * @see EnumerationFacade#isTypeSafe()
     */
    public boolean isTypeSafe()
    {
        return this.getSuperEnumerationFacade().isTypeSafe();
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
        return this.getSuperEnumerationFacade().findTaggedValue(tagName, follow);
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
        return this.getSuperEnumerationFacade().getAllGeneralizations();
    }

    /**
     * <p>
     * All specializations (travels down the inheritance hierarchy).
     * </p>
     * @see GeneralizableElementFacade#getAllSpecializations()
     */
    public Collection<GeneralizableElementFacade> getAllSpecializations()
    {
        return this.getSuperEnumerationFacade().getAllSpecializations();
    }

    /**
     * <p>
     * Gets the direct generalization for this generalizable element.
     * </p>
     * @see GeneralizableElementFacade#getGeneralization()
     */
    public GeneralizableElementFacade getGeneralization()
    {
        return this.getSuperEnumerationFacade().getGeneralization();
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
        return this.getSuperEnumerationFacade().getGeneralizationLinks();
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
        return this.getSuperEnumerationFacade().getGeneralizationList();
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
        return this.getSuperEnumerationFacade().getGeneralizationRoot();
    }

    /**
     * 
     * @see GeneralizableElementFacade#getGeneralizations()
     */
    public Collection<GeneralizableElementFacade> getGeneralizations()
    {
        return this.getSuperEnumerationFacade().getGeneralizations();
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
        return this.getSuperEnumerationFacade().getSpecializations();
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
        this.getSuperEnumerationFacade().copyTaggedValues(element);
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
        return this.getSuperEnumerationFacade().findTaggedValue(tagName);
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
        return this.getSuperEnumerationFacade().findTaggedValues(tagName);
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
        return this.getSuperEnumerationFacade().getBindedFullyQualifiedName(bindedElement);
    }

    /**
     * <p>
     * Gets all constraints belonging to the model element.
     * </p>
     * @see ModelElementFacade#getConstraints()
     */
    public Collection<ConstraintFacade> getConstraints()
    {
        return this.getSuperEnumerationFacade().getConstraints();
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
        return this.getSuperEnumerationFacade().getConstraints(kind);
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
        return this.getSuperEnumerationFacade().getDocumentation(indent);
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
        return this.getSuperEnumerationFacade().getDocumentation(indent, lineLength);
    }

    /**
     * 
     * @see ModelElementFacade#getDocumentation(String indent, int lineLength, boolean htmlStyle)
     */
    public String getDocumentation(String indent, int lineLength, boolean htmlStyle)
    {
        return this.getSuperEnumerationFacade().getDocumentation(indent, lineLength, htmlStyle);
    }

    /**
     * <p>
     * The fully qualified name of this model element.
     * </p>
     * @see ModelElementFacade#getFullyQualifiedName()
     */
    public String getFullyQualifiedName()
    {
        return this.getSuperEnumerationFacade().getFullyQualifiedName();
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
        return this.getSuperEnumerationFacade().getFullyQualifiedName(modelName);
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
        return this.getSuperEnumerationFacade().getFullyQualifiedNamePath();
    }

    /**
     * <p>
     * Gets the unique identifier of the underlying model element.
     * </p>
     * @see ModelElementFacade#getId()
     */
    public String getId()
    {
        return this.getSuperEnumerationFacade().getId();
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
        return this.getSuperEnumerationFacade().getKeywords();
    }

    /**
     * <p>
     * UML2: Retrieves a localized label for this named element.
     * </p>
     * @see ModelElementFacade#getLabel()
     */
    public String getLabel()
    {
        return this.getSuperEnumerationFacade().getLabel();
    }

    /**
     * <p>
     * The language mappings that have been set for this model elemnt.
     * </p>
     * @see ModelElementFacade#getLanguageMappings()
     */
    public TypeMappings getLanguageMappings()
    {
        return this.getSuperEnumerationFacade().getLanguageMappings();
    }

    /**
     * 
     * @see ModelElementFacade#getModel()
     */
    public ModelFacade getModel()
    {
        return this.getSuperEnumerationFacade().getModel();
    }

    /**
     * <p>
     * The name of the model element.
     * </p>
     * @see ModelElementFacade#getName()
     */
    public String getName()
    {
        return this.getSuperEnumerationFacade().getName();
    }

    /**
     * <p>
     * Gets the package to which this model element belongs.
     * </p>
     * @see ModelElementFacade#getPackage()
     */
    public ModelElementFacade getPackage()
    {
        return this.getSuperEnumerationFacade().getPackage();
    }

    /**
     * <p>
     * The name of this model element's package.
     * </p>
     * @see ModelElementFacade#getPackageName()
     */
    public String getPackageName()
    {
        return this.getSuperEnumerationFacade().getPackageName();
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
        return this.getSuperEnumerationFacade().getPackageName(modelName);
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
        return this.getSuperEnumerationFacade().getPackagePath();
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
        return this.getSuperEnumerationFacade().getQualifiedName();
    }

    /**
     * <p>
     * Gets the root package for the model element.
     * </p>
     * @see ModelElementFacade#getRootPackage()
     */
    public PackageFacade getRootPackage()
    {
        return this.getSuperEnumerationFacade().getRootPackage();
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
        return this.getSuperEnumerationFacade().getSourceDependencies();
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
        return this.getSuperEnumerationFacade().getStateMachineContext();
    }

    /**
     * <p>
     * The collection of ALL stereotype names for this model element.
     * </p>
     * @see ModelElementFacade#getStereotypeNames()
     */
    public Collection<String> getStereotypeNames()
    {
        return this.getSuperEnumerationFacade().getStereotypeNames();
    }

    /**
     * <p>
     * Gets all stereotypes for this model element.
     * </p>
     * @see ModelElementFacade#getStereotypes()
     */
    public Collection<StereotypeFacade> getStereotypes()
    {
        return this.getSuperEnumerationFacade().getStereotypes();
    }

    /**
     * 
     * @see ModelElementFacade#getTaggedValues()
     */
    public Collection<TaggedValueFacade> getTaggedValues()
    {
        return this.getSuperEnumerationFacade().getTaggedValues();
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
        return this.getSuperEnumerationFacade().getTargetDependencies();
    }

    /**
     * 
     * @see ModelElementFacade#getTemplateParameter(String parameterName)
     */
    public Object getTemplateParameter(String parameterName)
    {
        return this.getSuperEnumerationFacade().getTemplateParameter(parameterName);
    }

    /**
     * 
     * @see ModelElementFacade#getTemplateParameters()
     */
    public Collection<TemplateParameterFacade> getTemplateParameters()
    {
        return this.getSuperEnumerationFacade().getTemplateParameters();
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
        return this.getSuperEnumerationFacade().getVisibility();
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
        return this.getSuperEnumerationFacade().hasExactStereotype(stereotypeName);
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
        return this.getSuperEnumerationFacade().hasKeyword(keywordName);
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
        return this.getSuperEnumerationFacade().hasStereotype(stereotypeName);
    }

    /**
     * 
     * @see ModelElementFacade#isBindingDependenciesPresent()
     */
    public boolean isBindingDependenciesPresent()
    {
        return this.getSuperEnumerationFacade().isBindingDependenciesPresent();
    }

    /**
     * <p>
     * Indicates if any constraints are present on this model element.
     * </p>
     * @see ModelElementFacade#isConstraintsPresent()
     */
    public boolean isConstraintsPresent()
    {
        return this.getSuperEnumerationFacade().isConstraintsPresent();
    }

    /**
     * <p>
     * Indicates if any documentation is present on this model element.
     * </p>
     * @see ModelElementFacade#isDocumentationPresent()
     */
    public boolean isDocumentationPresent()
    {
        return this.getSuperEnumerationFacade().isDocumentationPresent();
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
        return this.getSuperEnumerationFacade().isReservedWord();
    }

    /**
     * 
     * @see ModelElementFacade#isTemplateParametersPresent()
     */
    public boolean isTemplateParametersPresent()
    {
        return this.getSuperEnumerationFacade().isTemplateParametersPresent();
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
        return this.getSuperEnumerationFacade().translateConstraint(name, translation);
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
        return this.getSuperEnumerationFacade().translateConstraints(translation);
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
        return this.getSuperEnumerationFacade().translateConstraints(kind, translation);
    }

    /**
     * @see org.andromda.core.metafacade.MetafacadeBase#initialize()
     */
    @Override
    public void initialize()
    {
        this.getSuperEnumerationFacade().initialize();
    }

    /**
     * @return Object getSuperEnumerationFacade().getValidationOwner()
     * @see org.andromda.core.metafacade.MetafacadeBase#getValidationOwner()
     */
    @Override
    public Object getValidationOwner()
    {
        Object owner = this.getSuperEnumerationFacade().getValidationOwner();
        return owner;
    }

    /**
     * @return String getSuperEnumerationFacade().getValidationName()
     * @see org.andromda.core.metafacade.MetafacadeBase#getValidationName()
     */
    @Override
    public String getValidationName()
    {
        String name = this.getSuperEnumerationFacade().getValidationName();
        return name;
    }

    /**
     * @param validationMessages Collection<ModelValidationMessage>
     * @see org.andromda.core.metafacade.MetafacadeBase#validateInvariants(Collection validationMessages)
     */
    @Override
    public void validateInvariants(Collection<ModelValidationMessage> validationMessages)
    {
        this.getSuperEnumerationFacade().validateInvariants(validationMessages);
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