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
import org.andromda.metafacades.uml.AttributeFacade;
import org.andromda.metafacades.uml.ClassifierFacade;
import org.andromda.metafacades.uml.ConstraintFacade;
import org.andromda.metafacades.uml.DependencyFacade;
import org.andromda.metafacades.uml.EnumerationFacade;
import org.andromda.metafacades.uml.ModelElementFacade;
import org.andromda.metafacades.uml.ModelFacade;
import org.andromda.metafacades.uml.PackageFacade;
import org.andromda.metafacades.uml.StateMachineFacade;
import org.andromda.metafacades.uml.StereotypeFacade;
import org.andromda.metafacades.uml.TaggedValueFacade;
import org.andromda.metafacades.uml.TemplateParameterFacade;
import org.andromda.metafacades.uml.TypeMappings;

/**
 * <p>
 * Represents an attribute of a WSDL type.
 * </p>
 * MetafacadeLogic for WSDLTypeAttribute
 *
 * @see WSDLTypeAttribute
 */
public abstract class WSDLTypeAttributeLogic
    extends MetafacadeBase
    implements WSDLTypeAttribute
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
    protected WSDLTypeAttributeLogic(Object metaObjectIn, String context)
    {
        super(metaObjectIn, getContext(context));
        this.superAttributeFacade =
           (AttributeFacade)
            MetafacadeFactory.getInstance().createFacadeImpl(
                    "org.andromda.metafacades.uml.AttributeFacade",
                    metaObjectIn,
                    getContext(context));
        this.metaObject = metaObjectIn;
    }

    /**
     * Gets the context for this metafacade logic instance.
     * @param context String. Set to WSDLTypeAttribute if null
     * @return context String
     */
    private static String getContext(String context)
    {
        if (context == null)
        {
            context = "org.andromda.cartridges.webservice.metafacades.WSDLTypeAttribute";
        }
        return context;
    }

    private AttributeFacade superAttributeFacade;
    private boolean superAttributeFacadeInitialized = false;

    /**
     * Gets the AttributeFacade parent instance.
     * @return this.superAttributeFacade AttributeFacade
     */
    private AttributeFacade getSuperAttributeFacade()
    {
        if (!this.superAttributeFacadeInitialized)
        {
            ((MetafacadeBase)this.superAttributeFacade).setMetafacadeContext(this.getMetafacadeContext());
            this.superAttributeFacadeInitialized = true;
        }
        return this.superAttributeFacade;
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
            if (this.superAttributeFacadeInitialized)
            {
                ((MetafacadeBase)this.superAttributeFacade).resetMetafacadeContext(context);
            }
        }
    }

    /**
     * @return boolean true always
     * @see WSDLTypeAttribute
     */
    public boolean isWSDLTypeAttributeMetaType()
    {
        return true;
    }

    // --------------- attributes ---------------------

   /**
    * @see org.andromda.cartridges.webservice.metafacades.WSDLTypeAttribute#isNillable()
    * @return boolean
    */
    protected abstract boolean handleIsNillable();

    private boolean __nillable1a;
    private boolean __nillable1aSet = false;

    /**
     * <p>
     * Whether or not this WSDL Type attribute is nillable.
     * </p>
     * @return (boolean)handleIsNillable()
     */
    public final boolean isNillable()
    {
        boolean nillable1a = this.__nillable1a;
        if (!this.__nillable1aSet)
        {
            // nillable has no pre constraints
            nillable1a = handleIsNillable();
            // nillable has no post constraints
            this.__nillable1a = nillable1a;
            if (isMetafacadePropertyCachingEnabled())
            {
                this.__nillable1aSet = true;
            }
        }
        return nillable1a;
    }

   /**
    * @see org.andromda.cartridges.webservice.metafacades.WSDLTypeAttribute#isAttribute()
    * @return boolean
    */
    protected abstract boolean handleIsAttribute();

    private boolean __attribute2a;
    private boolean __attribute2aSet = false;

    /**
     * <p>
     * Is the attribute an XML attribute?
     * </p>
     * @return (boolean)handleIsAttribute()
     */
    public final boolean isAttribute()
    {
        boolean attribute2a = this.__attribute2a;
        if (!this.__attribute2aSet)
        {
            // attribute has no pre constraints
            attribute2a = handleIsAttribute();
            // attribute has no post constraints
            this.__attribute2a = attribute2a;
            if (isMetafacadePropertyCachingEnabled())
            {
                this.__attribute2aSet = true;
            }
        }
        return attribute2a;
    }

   /**
    * @see org.andromda.cartridges.webservice.metafacades.WSDLTypeAttribute#isElement()
    * @return boolean
    */
    protected abstract boolean handleIsElement();

    private boolean __element3a;
    private boolean __element3aSet = false;

    /**
     * <p>
     * Is the attribute an XML element?
     * </p>
     * @return (boolean)handleIsElement()
     */
    public final boolean isElement()
    {
        boolean element3a = this.__element3a;
        if (!this.__element3aSet)
        {
            // element has no pre constraints
            element3a = handleIsElement();
            // element has no post constraints
            this.__element3a = element3a;
            if (isMetafacadePropertyCachingEnabled())
            {
                this.__element3aSet = true;
            }
        }
        return element3a;
    }

   /**
    * @see org.andromda.cartridges.webservice.metafacades.WSDLTypeAttribute#getXmlAdapter()
    * @return String
    */
    protected abstract String handleGetXmlAdapter();

    private String __xmlAdapter4a;
    private boolean __xmlAdapter4aSet = false;

    /**
     * <p>
     * Class referenced by @XmlAdapter Jaxb annotation
     * </p>
     * @return (String)handleGetXmlAdapter()
     */
    public final String getXmlAdapter()
    {
        String xmlAdapter4a = this.__xmlAdapter4a;
        if (!this.__xmlAdapter4aSet)
        {
            // xmlAdapter has no pre constraints
            xmlAdapter4a = handleGetXmlAdapter();
            // xmlAdapter has no post constraints
            this.__xmlAdapter4a = xmlAdapter4a;
            if (isMetafacadePropertyCachingEnabled())
            {
                this.__xmlAdapter4aSet = true;
            }
        }
        return xmlAdapter4a;
    }

   /**
    * @see org.andromda.cartridges.webservice.metafacades.WSDLTypeAttribute#getXmlSchemaType()
    * @return String
    */
    protected abstract String handleGetXmlSchemaType();

    private String __xmlSchemaType5a;
    private boolean __xmlSchemaType5aSet = false;

    /**
     * <p>
     * XMLSchema type for Jaxb type mapping. Overrides default.
     * </p>
     * @return (String)handleGetXmlSchemaType()
     */
    public final String getXmlSchemaType()
    {
        String xmlSchemaType5a = this.__xmlSchemaType5a;
        if (!this.__xmlSchemaType5aSet)
        {
            // xmlSchemaType has no pre constraints
            xmlSchemaType5a = handleGetXmlSchemaType();
            // xmlSchemaType has no post constraints
            this.__xmlSchemaType5a = xmlSchemaType5a;
            if (isMetafacadePropertyCachingEnabled())
            {
                this.__xmlSchemaType5aSet = true;
            }
        }
        return xmlSchemaType5a;
    }

    /**
     * @return true
     * @see AttributeFacade
     */
    public boolean isAttributeFacadeMetaType()
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

    // ----------- delegates to AttributeFacade ------------
    /**
     * <p>
     * Searches the given feature for the specified tag.
     * </p>
     * <p>
     * If the follow boolean is set to true then the search will
     * continue from the class attribute to the class itself and then
     * up the class hierarchy.
     * </p>
     * @see AttributeFacade#findTaggedValue(String name, boolean follow)
     */
    public Object findTaggedValue(String name, boolean follow)
    {
        return this.getSuperAttributeFacade().findTaggedValue(name, follow);
    }

    /**
     * <p>
     * The default value of the attribute.  This is the value given if
     * no value is defined.
     * </p>
     * @see AttributeFacade#getDefaultValue()
     */
    public String getDefaultValue()
    {
        return this.getSuperAttributeFacade().getDefaultValue();
    }

    /**
     * <p>
     * If the attribute is an enumeration literal this represents the
     * owning enumeration. Can be empty.
     * </p>
     * @see AttributeFacade#getEnumeration()
     */
    public EnumerationFacade getEnumeration()
    {
        return this.getSuperAttributeFacade().getEnumeration();
    }

    /**
     * <p>
     * Returns the enumeration literal parameters defined by tagged
     * value as a comma separated list.
     * </p>
     * @see AttributeFacade#getEnumerationLiteralParameters()
     */
    public String getEnumerationLiteralParameters()
    {
        return this.getSuperAttributeFacade().getEnumerationLiteralParameters();
    }

    /**
     * <p>
     * The value for this attribute if it is an enumeration literal,
     * null otherwise. The default value is returned as a String if it
     * has been specified, if it's not specified this attribute's name
     * is assumed.
     * </p>
     * @see AttributeFacade#getEnumerationValue()
     */
    public String getEnumerationValue()
    {
        return this.getSuperAttributeFacade().getEnumerationValue();
    }

    /**
     * <p>
     * The name of the accessor operation that would retrieve this
     * attribute's value.
     * </p>
     * @see AttributeFacade#getGetterName()
     */
    public String getGetterName()
    {
        return this.getSuperAttributeFacade().getGetterName();
    }

    /**
     * <p>
     * The name of the type that is returned on the accessor and
     * mutator operations,  determined in part by the multiplicity.
     * </p>
     * @see AttributeFacade#getGetterSetterTypeName()
     */
    public String getGetterSetterTypeName()
    {
        return this.getSuperAttributeFacade().getGetterSetterTypeName();
    }

    /**
     * <p>
     * the lower value for the multiplicity
     * </p>
     * <p>
     * -only applicable for UML2
     * </p>
     * @see AttributeFacade#getLower()
     */
    public int getLower()
    {
        return this.getSuperAttributeFacade().getLower();
    }

    /**
     * <p>
     * Gets the classifier who is the owner of the attributes.
     * </p>
     * @see AttributeFacade#getOwner()
     */
    public ClassifierFacade getOwner()
    {
        return this.getSuperAttributeFacade().getOwner();
    }

    /**
     * <p>
     * The name of the mutator operation that would retrieve this
     * attribute's value.
     * </p>
     * @see AttributeFacade#getSetterName()
     */
    public String getSetterName()
    {
        return this.getSuperAttributeFacade().getSetterName();
    }

    /**
     * <p>
     * The classifier owning this attribute.
     * </p>
     * @see AttributeFacade#getType()
     */
    public ClassifierFacade getType()
    {
        return this.getSuperAttributeFacade().getType();
    }

    /**
     * <p>
     * the upper value for the multiplicity (will be -1 for *)
     * </p>
     * <p>
     * -only applicable for UML2
     * </p>
     * @see AttributeFacade#getUpper()
     */
    public int getUpper()
    {
        return this.getSuperAttributeFacade().getUpper();
    }

    /**
     * <p>
     * True if this attribute can only be set.
     * </p>
     * @see AttributeFacade#isAddOnly()
     */
    public boolean isAddOnly()
    {
        return this.getSuperAttributeFacade().isAddOnly();
    }

    /**
     * <p>
     * True if this attribute can be modified.
     * </p>
     * @see AttributeFacade#isChangeable()
     */
    public boolean isChangeable()
    {
        return this.getSuperAttributeFacade().isChangeable();
    }

    /**
     * <p>
     * Indicates if the default value is present.
     * </p>
     * @see AttributeFacade#isDefaultValuePresent()
     */
    public boolean isDefaultValuePresent()
    {
        return this.getSuperAttributeFacade().isDefaultValuePresent();
    }

    /**
     * <p>
     * If the attribute is derived (its value is computed). UML2 only.
     * UML14 always returns false. Default=false.
     * </p>
     * @see AttributeFacade#isDerived()
     */
    public boolean isDerived()
    {
        return this.getSuperAttributeFacade().isDerived();
    }

    /**
     * <p>
     * True if this attribute is owned by an enumeration.
     * </p>
     * @see AttributeFacade#isEnumerationLiteral()
     */
    public boolean isEnumerationLiteral()
    {
        return this.getSuperAttributeFacade().isEnumerationLiteral();
    }

    /**
     * <p>
     * Returns true if enumeration literal parameters exist (defined by
     * tagged value) for the literal.
     * </p>
     * @see AttributeFacade#isEnumerationLiteralParametersExist()
     */
    public boolean isEnumerationLiteralParametersExist()
    {
        return this.getSuperAttributeFacade().isEnumerationLiteralParametersExist();
    }

    /**
     * <p>
     * True if this attribute is owned by an enumeration but is defined
     * as a member variable (NOT a literal).
     * </p>
     * @see AttributeFacade#isEnumerationMember()
     */
    public boolean isEnumerationMember()
    {
        return this.getSuperAttributeFacade().isEnumerationMember();
    }

    /**
     * <p>
     * IsLeaf property in the operation. If true, operation is final,
     * cannot be extended or implemented by a descendant.
     * </p>
     * @see AttributeFacade#isLeaf()
     */
    public boolean isLeaf()
    {
        return this.getSuperAttributeFacade().isLeaf();
    }

    /**
     * <p>
     * Whether or not this attribute has a multiplicity greater than 1.
     * </p>
     * @see AttributeFacade#isMany()
     */
    public boolean isMany()
    {
        return this.getSuperAttributeFacade().isMany();
    }

    /**
     * <p>
     * Indicates whether or not the attributes are ordered (if
     * multiplicity is greater than 1).
     * </p>
     * @see AttributeFacade#isOrdered()
     */
    public boolean isOrdered()
    {
        return this.getSuperAttributeFacade().isOrdered();
    }

    /**
     * <p>
     * Whether or not this attribute can be modified.
     * </p>
     * @see AttributeFacade#isReadOnly()
     */
    public boolean isReadOnly()
    {
        return this.getSuperAttributeFacade().isReadOnly();
    }

    /**
     * <p>
     * Whether or not the multiplicity of this attribute is 1.
     * </p>
     * @see AttributeFacade#isRequired()
     */
    public boolean isRequired()
    {
        return this.getSuperAttributeFacade().isRequired();
    }

    /**
     * <p>
     * Indicates if this attribute is 'static', meaning it has a
     * classifier scope.
     * </p>
     * @see AttributeFacade#isStatic()
     */
    public boolean isStatic()
    {
        return this.getSuperAttributeFacade().isStatic();
    }

    /**
     * <p>
     * If the attribute is unique within the Collection type. UML2
     * only. UML14 always returns false. Unique+Ordered determines the
     * implementation Collection type. Default=false.
     * </p>
     * @see AttributeFacade#isUnique()
     */
    public boolean isUnique()
    {
        return this.getSuperAttributeFacade().isUnique();
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
        this.getSuperAttributeFacade().copyTaggedValues(element);
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
        return this.getSuperAttributeFacade().findTaggedValue(tagName);
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
        return this.getSuperAttributeFacade().findTaggedValues(tagName);
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
        return this.getSuperAttributeFacade().getBindedFullyQualifiedName(bindedElement);
    }

    /**
     * <p>
     * Gets all constraints belonging to the model element.
     * </p>
     * @see ModelElementFacade#getConstraints()
     */
    public Collection<ConstraintFacade> getConstraints()
    {
        return this.getSuperAttributeFacade().getConstraints();
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
        return this.getSuperAttributeFacade().getConstraints(kind);
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
        return this.getSuperAttributeFacade().getDocumentation(indent);
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
        return this.getSuperAttributeFacade().getDocumentation(indent, lineLength);
    }

    /**
     * 
     * @see ModelElementFacade#getDocumentation(String indent, int lineLength, boolean htmlStyle)
     */
    public String getDocumentation(String indent, int lineLength, boolean htmlStyle)
    {
        return this.getSuperAttributeFacade().getDocumentation(indent, lineLength, htmlStyle);
    }

    /**
     * <p>
     * The fully qualified name of this model element.
     * </p>
     * @see ModelElementFacade#getFullyQualifiedName()
     */
    public String getFullyQualifiedName()
    {
        return this.getSuperAttributeFacade().getFullyQualifiedName();
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
        return this.getSuperAttributeFacade().getFullyQualifiedName(modelName);
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
        return this.getSuperAttributeFacade().getFullyQualifiedNamePath();
    }

    /**
     * <p>
     * Gets the unique identifier of the underlying model element.
     * </p>
     * @see ModelElementFacade#getId()
     */
    public String getId()
    {
        return this.getSuperAttributeFacade().getId();
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
        return this.getSuperAttributeFacade().getKeywords();
    }

    /**
     * <p>
     * UML2: Retrieves a localized label for this named element.
     * </p>
     * @see ModelElementFacade#getLabel()
     */
    public String getLabel()
    {
        return this.getSuperAttributeFacade().getLabel();
    }

    /**
     * <p>
     * The language mappings that have been set for this model elemnt.
     * </p>
     * @see ModelElementFacade#getLanguageMappings()
     */
    public TypeMappings getLanguageMappings()
    {
        return this.getSuperAttributeFacade().getLanguageMappings();
    }

    /**
     * 
     * @see ModelElementFacade#getModel()
     */
    public ModelFacade getModel()
    {
        return this.getSuperAttributeFacade().getModel();
    }

    /**
     * <p>
     * The name of the model element.
     * </p>
     * @see ModelElementFacade#getName()
     */
    public String getName()
    {
        return this.getSuperAttributeFacade().getName();
    }

    /**
     * <p>
     * Gets the package to which this model element belongs.
     * </p>
     * @see ModelElementFacade#getPackage()
     */
    public ModelElementFacade getPackage()
    {
        return this.getSuperAttributeFacade().getPackage();
    }

    /**
     * <p>
     * The name of this model element's package.
     * </p>
     * @see ModelElementFacade#getPackageName()
     */
    public String getPackageName()
    {
        return this.getSuperAttributeFacade().getPackageName();
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
        return this.getSuperAttributeFacade().getPackageName(modelName);
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
        return this.getSuperAttributeFacade().getPackagePath();
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
        return this.getSuperAttributeFacade().getQualifiedName();
    }

    /**
     * <p>
     * Gets the root package for the model element.
     * </p>
     * @see ModelElementFacade#getRootPackage()
     */
    public PackageFacade getRootPackage()
    {
        return this.getSuperAttributeFacade().getRootPackage();
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
        return this.getSuperAttributeFacade().getSourceDependencies();
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
        return this.getSuperAttributeFacade().getStateMachineContext();
    }

    /**
     * <p>
     * The collection of ALL stereotype names for this model element.
     * </p>
     * @see ModelElementFacade#getStereotypeNames()
     */
    public Collection<String> getStereotypeNames()
    {
        return this.getSuperAttributeFacade().getStereotypeNames();
    }

    /**
     * <p>
     * Gets all stereotypes for this model element.
     * </p>
     * @see ModelElementFacade#getStereotypes()
     */
    public Collection<StereotypeFacade> getStereotypes()
    {
        return this.getSuperAttributeFacade().getStereotypes();
    }

    /**
     * 
     * @see ModelElementFacade#getTaggedValues()
     */
    public Collection<TaggedValueFacade> getTaggedValues()
    {
        return this.getSuperAttributeFacade().getTaggedValues();
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
        return this.getSuperAttributeFacade().getTargetDependencies();
    }

    /**
     * 
     * @see ModelElementFacade#getTemplateParameter(String parameterName)
     */
    public Object getTemplateParameter(String parameterName)
    {
        return this.getSuperAttributeFacade().getTemplateParameter(parameterName);
    }

    /**
     * 
     * @see ModelElementFacade#getTemplateParameters()
     */
    public Collection<TemplateParameterFacade> getTemplateParameters()
    {
        return this.getSuperAttributeFacade().getTemplateParameters();
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
        return this.getSuperAttributeFacade().getVisibility();
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
        return this.getSuperAttributeFacade().hasExactStereotype(stereotypeName);
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
        return this.getSuperAttributeFacade().hasKeyword(keywordName);
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
        return this.getSuperAttributeFacade().hasStereotype(stereotypeName);
    }

    /**
     * 
     * @see ModelElementFacade#isBindingDependenciesPresent()
     */
    public boolean isBindingDependenciesPresent()
    {
        return this.getSuperAttributeFacade().isBindingDependenciesPresent();
    }

    /**
     * <p>
     * Indicates if any constraints are present on this model element.
     * </p>
     * @see ModelElementFacade#isConstraintsPresent()
     */
    public boolean isConstraintsPresent()
    {
        return this.getSuperAttributeFacade().isConstraintsPresent();
    }

    /**
     * <p>
     * Indicates if any documentation is present on this model element.
     * </p>
     * @see ModelElementFacade#isDocumentationPresent()
     */
    public boolean isDocumentationPresent()
    {
        return this.getSuperAttributeFacade().isDocumentationPresent();
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
        return this.getSuperAttributeFacade().isReservedWord();
    }

    /**
     * 
     * @see ModelElementFacade#isTemplateParametersPresent()
     */
    public boolean isTemplateParametersPresent()
    {
        return this.getSuperAttributeFacade().isTemplateParametersPresent();
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
        return this.getSuperAttributeFacade().translateConstraint(name, translation);
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
        return this.getSuperAttributeFacade().translateConstraints(translation);
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
        return this.getSuperAttributeFacade().translateConstraints(kind, translation);
    }

    /**
     * @see org.andromda.core.metafacade.MetafacadeBase#initialize()
     */
    @Override
    public void initialize()
    {
        this.getSuperAttributeFacade().initialize();
    }

    /**
     * @return Object getSuperAttributeFacade().getValidationOwner()
     * @see org.andromda.core.metafacade.MetafacadeBase#getValidationOwner()
     */
    @Override
    public Object getValidationOwner()
    {
        Object owner = this.getSuperAttributeFacade().getValidationOwner();
        return owner;
    }

    /**
     * @return String getSuperAttributeFacade().getValidationName()
     * @see org.andromda.core.metafacade.MetafacadeBase#getValidationName()
     */
    @Override
    public String getValidationName()
    {
        String name = this.getSuperAttributeFacade().getValidationName();
        return name;
    }

    /**
     * @param validationMessages Collection<ModelValidationMessage>
     * @see org.andromda.core.metafacade.MetafacadeBase#validateInvariants(Collection validationMessages)
     */
    @Override
    public void validateInvariants(Collection<ModelValidationMessage> validationMessages)
    {
        this.getSuperAttributeFacade().validateInvariants(validationMessages);
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