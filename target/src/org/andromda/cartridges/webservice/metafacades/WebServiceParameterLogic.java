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
import org.andromda.metafacades.uml.ClassifierFacade;
import org.andromda.metafacades.uml.ConstraintFacade;
import org.andromda.metafacades.uml.DependencyFacade;
import org.andromda.metafacades.uml.EventFacade;
import org.andromda.metafacades.uml.ModelElementFacade;
import org.andromda.metafacades.uml.ModelFacade;
import org.andromda.metafacades.uml.OperationFacade;
import org.andromda.metafacades.uml.PackageFacade;
import org.andromda.metafacades.uml.ParameterFacade;
import org.andromda.metafacades.uml.StateMachineFacade;
import org.andromda.metafacades.uml.StereotypeFacade;
import org.andromda.metafacades.uml.TaggedValueFacade;
import org.andromda.metafacades.uml.TemplateParameterFacade;
import org.andromda.metafacades.uml.TypeMappings;
import org.andromda.translation.ocl.validation.OCLExpressions;
import org.andromda.translation.ocl.validation.OCLIntrospector;
import org.andromda.translation.ocl.validation.OCLResultEnsurer;
import org.apache.log4j.Logger;

/**
 * <p>
 * Represents a parameter modeled on a webservice.
 * </p>
 * MetafacadeLogic for WebServiceParameter
 *
 * @see WebServiceParameter
 */
public abstract class WebServiceParameterLogic
    extends MetafacadeBase
    implements WebServiceParameter
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
    protected WebServiceParameterLogic(Object metaObjectIn, String context)
    {
        super(metaObjectIn, getContext(context));
        this.superParameterFacade =
           (ParameterFacade)
            MetafacadeFactory.getInstance().createFacadeImpl(
                    "org.andromda.metafacades.uml.ParameterFacade",
                    metaObjectIn,
                    getContext(context));
        this.metaObject = metaObjectIn;
    }

    /**
     * The logger instance.
     */
    private static final Logger logger = Logger.getLogger(WebServiceParameterLogic.class);

    /**
     * Gets the context for this metafacade logic instance.
     * @param context String. Set to WebServiceParameter if null
     * @return context String
     */
    private static String getContext(String context)
    {
        if (context == null)
        {
            context = "org.andromda.cartridges.webservice.metafacades.WebServiceParameter";
        }
        return context;
    }

    private ParameterFacade superParameterFacade;
    private boolean superParameterFacadeInitialized = false;

    /**
     * Gets the ParameterFacade parent instance.
     * @return this.superParameterFacade ParameterFacade
     */
    private ParameterFacade getSuperParameterFacade()
    {
        if (!this.superParameterFacadeInitialized)
        {
            ((MetafacadeBase)this.superParameterFacade).setMetafacadeContext(this.getMetafacadeContext());
            this.superParameterFacadeInitialized = true;
        }
        return this.superParameterFacade;
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
            if (this.superParameterFacadeInitialized)
            {
                ((MetafacadeBase)this.superParameterFacade).resetMetafacadeContext(context);
            }
        }
    }

    /**
     * @return boolean true always
     * @see WebServiceParameter
     */
    public boolean isWebServiceParameterMetaType()
    {
        return true;
    }

    // --------------- attributes ---------------------

   /**
    * @see org.andromda.cartridges.webservice.metafacades.WebServiceParameter#isNillable()
    * @return boolean
    */
    protected abstract boolean handleIsNillable();

    private boolean __nillable1a;
    private boolean __nillable1aSet = false;

    /**
     * <p>
     * Whether or not this webservice parameter is nillable.
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
    * @see org.andromda.cartridges.webservice.metafacades.WebServiceParameter#getTestTypeName()
    * @return String
    */
    protected abstract String handleGetTestTypeName();

    private String __testTypeName2a;
    private boolean __testTypeName2aSet = false;

    /**
     * <p>
     * The type name used when calling web service tests.
     * </p>
     * @return (String)handleGetTestTypeName()
     */
    public final String getTestTypeName()
    {
        String testTypeName2a = this.__testTypeName2a;
        if (!this.__testTypeName2aSet)
        {
            // testTypeName has no pre constraints
            testTypeName2a = handleGetTestTypeName();
            // testTypeName has no post constraints
            this.__testTypeName2a = testTypeName2a;
            if (isMetafacadePropertyCachingEnabled())
            {
                this.__testTypeName2aSet = true;
            }
        }
        return testTypeName2a;
    }

   /**
    * @see org.andromda.cartridges.webservice.metafacades.WebServiceParameter#isAttribute()
    * @return boolean
    */
    protected abstract boolean handleIsAttribute();

    private boolean __attribute3a;
    private boolean __attribute3aSet = false;

    /**
     * <p>
     * Is the parameter an XML attribute?
     * </p>
     * @return (boolean)handleIsAttribute()
     */
    public final boolean isAttribute()
    {
        boolean attribute3a = this.__attribute3a;
        if (!this.__attribute3aSet)
        {
            // attribute has no pre constraints
            attribute3a = handleIsAttribute();
            // attribute has no post constraints
            this.__attribute3a = attribute3a;
            if (isMetafacadePropertyCachingEnabled())
            {
                this.__attribute3aSet = true;
            }
        }
        return attribute3a;
    }

   /**
    * @see org.andromda.cartridges.webservice.metafacades.WebServiceParameter#isElement()
    * @return boolean
    */
    protected abstract boolean handleIsElement();

    private boolean __element4a;
    private boolean __element4aSet = false;

    /**
     * <p>
     * Is the attribute an XML element?
     * </p>
     * @return (boolean)handleIsElement()
     */
    public final boolean isElement()
    {
        boolean element4a = this.__element4a;
        if (!this.__element4aSet)
        {
            // element has no pre constraints
            element4a = handleIsElement();
            // element has no post constraints
            this.__element4a = element4a;
            if (isMetafacadePropertyCachingEnabled())
            {
                this.__element4aSet = true;
            }
        }
        return element4a;
    }

   /**
    * @see org.andromda.cartridges.webservice.metafacades.WebServiceParameter#getRestPathParam()
    * @return String
    */
    protected abstract String handleGetRestPathParam();

    private String __restPathParam5a;
    private boolean __restPathParam5aSet = false;

    /**
     * <p>
     * Customize the REST parameter path in the URL, by default it is
     * /paramname/{paramvalue}/, appended to the /class/method/ URL.
     * </p>
     * @return (String)handleGetRestPathParam()
     */
    public final String getRestPathParam()
    {
        String restPathParam5a = this.__restPathParam5a;
        if (!this.__restPathParam5aSet)
        {
            // restPathParam has no pre constraints
            restPathParam5a = handleGetRestPathParam();
            // restPathParam has no post constraints
            this.__restPathParam5a = restPathParam5a;
            if (isMetafacadePropertyCachingEnabled())
            {
                this.__restPathParam5aSet = true;
            }
        }
        return restPathParam5a;
    }

   /**
    * @see org.andromda.cartridges.webservice.metafacades.WebServiceParameter#getRestParamType()
    * @return String
    */
    protected abstract String handleGetRestParamType();

    private String __restParamType6a;
    private boolean __restParamType6aSet = false;

    /**
     * 
     * @return (String)handleGetRestParamType()
     */
    public final String getRestParamType()
    {
        String restParamType6a = this.__restParamType6a;
        if (!this.__restParamType6aSet)
        {
            // restParamType has no pre constraints
            restParamType6a = handleGetRestParamType();
            // restParamType has no post constraints
            this.__restParamType6a = restParamType6a;
            if (isMetafacadePropertyCachingEnabled())
            {
                this.__restParamType6aSet = true;
            }
        }
        return restParamType6a;
    }

   /**
    * @see org.andromda.cartridges.webservice.metafacades.WebServiceParameter#isRestEncoded()
    * @return boolean
    */
    protected abstract boolean handleIsRestEncoded();

    private boolean __restEncoded7a;
    private boolean __restEncoded7aSet = false;

    /**
     * 
     * @return (boolean)handleIsRestEncoded()
     */
    public final boolean isRestEncoded()
    {
        boolean restEncoded7a = this.__restEncoded7a;
        if (!this.__restEncoded7aSet)
        {
            // restEncoded has no pre constraints
            restEncoded7a = handleIsRestEncoded();
            // restEncoded has no post constraints
            this.__restEncoded7a = restEncoded7a;
            if (isMetafacadePropertyCachingEnabled())
            {
                this.__restEncoded7aSet = true;
            }
        }
        return restEncoded7a;
    }

   /**
    * @see org.andromda.cartridges.webservice.metafacades.WebServiceParameter#getRestPathSegment()
    * @return String
    */
    protected abstract String handleGetRestPathSegment();

    private String __restPathSegment8a;
    private boolean __restPathSegment8aSet = false;

    /**
     * 
     * @return (String)handleGetRestPathSegment()
     */
    public final String getRestPathSegment()
    {
        String restPathSegment8a = this.__restPathSegment8a;
        if (!this.__restPathSegment8aSet)
        {
            // restPathSegment has no pre constraints
            restPathSegment8a = handleGetRestPathSegment();
            // restPathSegment has no post constraints
            this.__restPathSegment8a = restPathSegment8a;
            if (isMetafacadePropertyCachingEnabled())
            {
                this.__restPathSegment8aSet = true;
            }
        }
        return restPathSegment8a;
    }

    /**
     * @return true
     * @see ParameterFacade
     */
    public boolean isParameterFacadeMetaType()
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

    // ----------- delegates to ParameterFacade ------------
    /**
     * <p>
     * Copies all tagged values from the given ModelElementFacade to
     * this model element facade.
     * </p>
     * @see ModelElementFacade#copyTaggedValues(ModelElementFacade element)
     */
    public void copyTaggedValues(ModelElementFacade element)
    {
        this.getSuperParameterFacade().copyTaggedValues(element);
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
        return this.getSuperParameterFacade().findTaggedValue(tagName);
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
        return this.getSuperParameterFacade().findTaggedValues(tagName);
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
        return this.getSuperParameterFacade().getBindedFullyQualifiedName(bindedElement);
    }

    /**
     * <p>
     * Gets all constraints belonging to the model element.
     * </p>
     * @see ModelElementFacade#getConstraints()
     */
    public Collection<ConstraintFacade> getConstraints()
    {
        return this.getSuperParameterFacade().getConstraints();
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
        return this.getSuperParameterFacade().getConstraints(kind);
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
        return this.getSuperParameterFacade().getDocumentation(indent);
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
        return this.getSuperParameterFacade().getDocumentation(indent, lineLength);
    }

    /**
     * 
     * @see ModelElementFacade#getDocumentation(String indent, int lineLength, boolean htmlStyle)
     */
    public String getDocumentation(String indent, int lineLength, boolean htmlStyle)
    {
        return this.getSuperParameterFacade().getDocumentation(indent, lineLength, htmlStyle);
    }

    /**
     * <p>
     * The fully qualified name of this model element.
     * </p>
     * @see ModelElementFacade#getFullyQualifiedName()
     */
    public String getFullyQualifiedName()
    {
        return this.getSuperParameterFacade().getFullyQualifiedName();
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
        return this.getSuperParameterFacade().getFullyQualifiedName(modelName);
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
        return this.getSuperParameterFacade().getFullyQualifiedNamePath();
    }

    /**
     * <p>
     * Gets the unique identifier of the underlying model element.
     * </p>
     * @see ModelElementFacade#getId()
     */
    public String getId()
    {
        return this.getSuperParameterFacade().getId();
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
        return this.getSuperParameterFacade().getKeywords();
    }

    /**
     * <p>
     * UML2: Retrieves a localized label for this named element.
     * </p>
     * @see ModelElementFacade#getLabel()
     */
    public String getLabel()
    {
        return this.getSuperParameterFacade().getLabel();
    }

    /**
     * <p>
     * The language mappings that have been set for this model elemnt.
     * </p>
     * @see ModelElementFacade#getLanguageMappings()
     */
    public TypeMappings getLanguageMappings()
    {
        return this.getSuperParameterFacade().getLanguageMappings();
    }

    /**
     * 
     * @see ModelElementFacade#getModel()
     */
    public ModelFacade getModel()
    {
        return this.getSuperParameterFacade().getModel();
    }

    /**
     * <p>
     * The name of the model element.
     * </p>
     * @see ModelElementFacade#getName()
     */
    public String getName()
    {
        return this.getSuperParameterFacade().getName();
    }

    /**
     * <p>
     * Gets the package to which this model element belongs.
     * </p>
     * @see ModelElementFacade#getPackage()
     */
    public ModelElementFacade getPackage()
    {
        return this.getSuperParameterFacade().getPackage();
    }

    /**
     * <p>
     * The name of this model element's package.
     * </p>
     * @see ModelElementFacade#getPackageName()
     */
    public String getPackageName()
    {
        return this.getSuperParameterFacade().getPackageName();
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
        return this.getSuperParameterFacade().getPackageName(modelName);
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
        return this.getSuperParameterFacade().getPackagePath();
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
        return this.getSuperParameterFacade().getQualifiedName();
    }

    /**
     * <p>
     * Gets the root package for the model element.
     * </p>
     * @see ModelElementFacade#getRootPackage()
     */
    public PackageFacade getRootPackage()
    {
        return this.getSuperParameterFacade().getRootPackage();
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
        return this.getSuperParameterFacade().getSourceDependencies();
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
        return this.getSuperParameterFacade().getStateMachineContext();
    }

    /**
     * <p>
     * The collection of ALL stereotype names for this model element.
     * </p>
     * @see ModelElementFacade#getStereotypeNames()
     */
    public Collection<String> getStereotypeNames()
    {
        return this.getSuperParameterFacade().getStereotypeNames();
    }

    /**
     * <p>
     * Gets all stereotypes for this model element.
     * </p>
     * @see ModelElementFacade#getStereotypes()
     */
    public Collection<StereotypeFacade> getStereotypes()
    {
        return this.getSuperParameterFacade().getStereotypes();
    }

    /**
     * 
     * @see ModelElementFacade#getTaggedValues()
     */
    public Collection<TaggedValueFacade> getTaggedValues()
    {
        return this.getSuperParameterFacade().getTaggedValues();
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
        return this.getSuperParameterFacade().getTargetDependencies();
    }

    /**
     * 
     * @see ModelElementFacade#getTemplateParameter(String parameterName)
     */
    public Object getTemplateParameter(String parameterName)
    {
        return this.getSuperParameterFacade().getTemplateParameter(parameterName);
    }

    /**
     * 
     * @see ModelElementFacade#getTemplateParameters()
     */
    public Collection<TemplateParameterFacade> getTemplateParameters()
    {
        return this.getSuperParameterFacade().getTemplateParameters();
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
        return this.getSuperParameterFacade().getVisibility();
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
        return this.getSuperParameterFacade().hasExactStereotype(stereotypeName);
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
        return this.getSuperParameterFacade().hasKeyword(keywordName);
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
        return this.getSuperParameterFacade().hasStereotype(stereotypeName);
    }

    /**
     * 
     * @see ModelElementFacade#isBindingDependenciesPresent()
     */
    public boolean isBindingDependenciesPresent()
    {
        return this.getSuperParameterFacade().isBindingDependenciesPresent();
    }

    /**
     * <p>
     * Indicates if any constraints are present on this model element.
     * </p>
     * @see ModelElementFacade#isConstraintsPresent()
     */
    public boolean isConstraintsPresent()
    {
        return this.getSuperParameterFacade().isConstraintsPresent();
    }

    /**
     * <p>
     * Indicates if any documentation is present on this model element.
     * </p>
     * @see ModelElementFacade#isDocumentationPresent()
     */
    public boolean isDocumentationPresent()
    {
        return this.getSuperParameterFacade().isDocumentationPresent();
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
        return this.getSuperParameterFacade().isReservedWord();
    }

    /**
     * 
     * @see ModelElementFacade#isTemplateParametersPresent()
     */
    public boolean isTemplateParametersPresent()
    {
        return this.getSuperParameterFacade().isTemplateParametersPresent();
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
        return this.getSuperParameterFacade().translateConstraint(name, translation);
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
        return this.getSuperParameterFacade().translateConstraints(translation);
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
        return this.getSuperParameterFacade().translateConstraints(kind, translation);
    }

    /**
     * 
     * @see ParameterFacade#getDefaultValue()
     */
    public String getDefaultValue()
    {
        return this.getSuperParameterFacade().getDefaultValue();
    }

    /**
     * <p>
     * UML2: A representation of the literals of the enumeration
     * 'Parameter Effect Kind': CREATE, READ, UPDATE, DELETE. The
     * datatype ParameterEffectKind is an enumeration that indicates
     * the effect of a behavior on values passed in or out of its
     * parameters.
     * </p>
     * @see ParameterFacade#getEffect()
     */
    public String getEffect()
    {
        return this.getSuperParameterFacade().getEffect();
    }

    /**
     * <p>
     * If this parameter is located on an event, this will represent
     * that event.
     * </p>
     * @see ParameterFacade#getEvent()
     */
    public EventFacade getEvent()
    {
        return this.getSuperParameterFacade().getEvent();
    }

    /**
     * <p>
     * The name to use for accessors getting this parameter from a
     * bean.
     * </p>
     * @see ParameterFacade#getGetterName()
     */
    public String getGetterName()
    {
        return this.getSuperParameterFacade().getGetterName();
    }

    /**
     * <p>
     * Fully Qualified TypeName, determined in part by multiplicity
     * (for UML2). For UML14, same as getterName.
     * </p>
     * @see ParameterFacade#getGetterSetterTypeName()
     */
    public String getGetterSetterTypeName()
    {
        return this.getSuperParameterFacade().getGetterSetterTypeName();
    }

    /**
     * <p>
     * Fully Qualified implementation class of TypeName, determined in
     * part by multiplicity (for UML2). If upper multiplicity =1, same
     * as getterSetterTypeName.
     * </p>
     * @see ParameterFacade#getGetterSetterTypeNameImpl()
     */
    public String getGetterSetterTypeNameImpl()
    {
        return this.getSuperParameterFacade().getGetterSetterTypeNameImpl();
    }

    /**
     * <p>
     * the lower value for the multiplicity
     * </p>
     * <p>
     * -only applicable for UML2
     * </p>
     * @see ParameterFacade#getLower()
     */
    public int getLower()
    {
        return this.getSuperParameterFacade().getLower();
    }

    /**
     * <p>
     * If this parameter is located on an operation, this will
     * represent that operation.
     * </p>
     * @see ParameterFacade#getOperation()
     */
    public OperationFacade getOperation()
    {
        return this.getSuperParameterFacade().getOperation();
    }

    /**
     * <p>
     * The name to use for accessors getting this parameter in a bean.
     * </p>
     * @see ParameterFacade#getSetterName()
     */
    public String getSetterName()
    {
        return this.getSuperParameterFacade().getSetterName();
    }

    /**
     * 
     * @see ParameterFacade#getType()
     */
    public ClassifierFacade getType()
    {
        return this.getSuperParameterFacade().getType();
    }

    /**
     * <p>
     * the upper value of the multiplicity (will be -1 for *)
     * </p>
     * <p>
     * -only applicable for UML2
     * </p>
     * @see ParameterFacade#getUpper()
     */
    public int getUpper()
    {
        return this.getSuperParameterFacade().getUpper();
    }

    /**
     * <p>
     * Indicates if the default value is present.
     * </p>
     * @see ParameterFacade#isDefaultValuePresent()
     */
    public boolean isDefaultValuePresent()
    {
        return this.getSuperParameterFacade().isDefaultValuePresent();
    }

    /**
     * <p>
     * UML2: Returns the value of the 'Is Exception' attribute. The
     * default value is "false". Tells whether an output parameter may
     * emit a value to the exclusion of the other outputs.
     * </p>
     * @see ParameterFacade#isException()
     */
    public boolean isException()
    {
        return this.getSuperParameterFacade().isException();
    }

    /**
     * <p>
     * True if this parameter is an 'in' parameter.
     * </p>
     * @see ParameterFacade#isInParameter()
     */
    public boolean isInParameter()
    {
        return this.getSuperParameterFacade().isInParameter();
    }

    /**
     * <p>
     * True if this parameter is an inout parameter.
     * </p>
     * @see ParameterFacade#isInoutParameter()
     */
    public boolean isInoutParameter()
    {
        return this.getSuperParameterFacade().isInoutParameter();
    }

    /**
     * <p>
     * If upper>1 or upper==unlimited. Only applies to UML2. For UML14,
     * always false.
     * </p>
     * @see ParameterFacade#isMany()
     */
    public boolean isMany()
    {
        return this.getSuperParameterFacade().isMany();
    }

    /**
     * <p>
     * UML2 Only: Is parameter ordered within the Collection type.
     * Ordered+Unique determines the implementation Collection Type.
     * For UML14, always false.
     * </p>
     * @see ParameterFacade#isOrdered()
     */
    public boolean isOrdered()
    {
        return this.getSuperParameterFacade().isOrdered();
    }

    /**
     * <p>
     * True if this parameter is an 'out' parameter.
     * </p>
     * @see ParameterFacade#isOutParameter()
     */
    public boolean isOutParameter()
    {
        return this.getSuperParameterFacade().isOutParameter();
    }

    /**
     * <p>
     * True if this parameter is readable, aka an in-parameter, or this
     * feature is unspecified.
     * </p>
     * @see ParameterFacade#isReadable()
     */
    public boolean isReadable()
    {
        return this.getSuperParameterFacade().isReadable();
    }

    /**
     * <p>
     * Whether or not this parameter is considered required (i.e must a
     * non-empty value).
     * </p>
     * @see ParameterFacade#isRequired()
     */
    public boolean isRequired()
    {
        return this.getSuperParameterFacade().isRequired();
    }

    /**
     * <p>
     * Whether or not this parameter represents a return parameter.
     * </p>
     * @see ParameterFacade#isReturn()
     */
    public boolean isReturn()
    {
        return this.getSuperParameterFacade().isReturn();
    }

    /**
     * <p>
     * If Parameter type isMany (UML2), is the parameter unique within
     * the Collection. Unique+Sorted determines pareter implementation
     * type. For UML14, always false.
     * </p>
     * @see ParameterFacade#isUnique()
     */
    public boolean isUnique()
    {
        return this.getSuperParameterFacade().isUnique();
    }

    /**
     * <p>
     * True if this parameter is writable, aka an out-parameter, or
     * this feature is unspecified.
     * </p>
     * @see ParameterFacade#isWritable()
     */
    public boolean isWritable()
    {
        return this.getSuperParameterFacade().isWritable();
    }

    /**
     * @see MetafacadeBase#initialize()
     */
    @Override
    public void initialize()
    {
        this.getSuperParameterFacade().initialize();
    }

    /**
     * @return Object getSuperParameterFacade().getValidationOwner()
     * @see MetafacadeBase#getValidationOwner()
     */
    @Override
    public Object getValidationOwner()
    {
        Object owner = this.getSuperParameterFacade().getValidationOwner();
        return owner;
    }

    /**
     * @return String getSuperParameterFacade().getValidationName()
     * @see MetafacadeBase#getValidationName()
     */
    @Override
    public String getValidationName()
    {
        String name = this.getSuperParameterFacade().getValidationName();
        return name;
    }

    /**
     * <p><b>Constraint:</b> org::andromda::cartridges::webservice::metafacades::WebServiceParameter::a web service parameter can not be of type collection</p>
     * <p><b>Error:</b> A web service parameter can NOT be a collection type You'll need to model an array instead.</p>
     * <p><b>OCL:</b> context WebServiceParameter inv :
return = false implies
type.collectionType = false</p>
     * @param validationMessages Collection<ModelValidationMessage>
     * @see MetafacadeBase#validateInvariants(Collection validationMessages)
     */
    @Override
    public void validateInvariants(Collection<ModelValidationMessage> validationMessages)
    {
        this.getSuperParameterFacade().validateInvariants(validationMessages);
        try
        {
            final Object contextElement = this.THIS();
            boolean constraintValid = OCLResultEnsurer.ensure((Boolean.valueOf(String.valueOf(OCLExpressions.equal(OCLIntrospector.invoke(contextElement,"return"),false))).booleanValue()?OCLExpressions.equal(OCLIntrospector.invoke(contextElement,"type.collectionType"),false):true));
            if (!constraintValid)
            {
                validationMessages.add(
                    new ModelValidationMessage(
                        (MetafacadeBase)contextElement ,
                        "org::andromda::cartridges::webservice::metafacades::WebServiceParameter::a web service parameter can not be of type collection",
                        "A web service parameter can NOT be a collection type You'll need to model an array instead."));
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
            logger.error("Error validating constraint 'org::andromda::cartridges::webservice::metafacades::WebServiceParameter::a web service parameter can not be of type collection' ON "
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