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
import org.andromda.metafacades.uml.ClassifierFacade;
import org.andromda.metafacades.uml.ConstraintFacade;
import org.andromda.metafacades.uml.DependencyFacade;
import org.andromda.metafacades.uml.ModelElementFacade;
import org.andromda.metafacades.uml.ModelFacade;
import org.andromda.metafacades.uml.PackageFacade;
import org.andromda.metafacades.uml.StateMachineFacade;
import org.andromda.metafacades.uml.StereotypeFacade;
import org.andromda.metafacades.uml.TaggedValueFacade;
import org.andromda.metafacades.uml.TemplateParameterFacade;
import org.andromda.metafacades.uml.TypeMappings;
import org.andromda.translation.ocl.validation.OCLCollections;
import org.andromda.translation.ocl.validation.OCLExpressions;
import org.andromda.translation.ocl.validation.OCLIntrospector;
import org.andromda.translation.ocl.validation.OCLResultEnsurer;
import org.apache.commons.collections.Transformer;
import org.apache.log4j.Logger;

/**
 * 
 * MetafacadeLogic for WebServicePackage
 *
 * @see WebServicePackage
 */
public abstract class WebServicePackageLogic
    extends MetafacadeBase
    implements WebServicePackage
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
    protected WebServicePackageLogic(Object metaObjectIn, String context)
    {
        super(metaObjectIn, getContext(context));
        this.superPackageFacade =
           (PackageFacade)
            MetafacadeFactory.getInstance().createFacadeImpl(
                    "org.andromda.metafacades.uml.PackageFacade",
                    metaObjectIn,
                    getContext(context));
        this.metaObject = metaObjectIn;
    }

    /**
     * The logger instance.
     */
    private static final Logger logger = Logger.getLogger(WebServicePackageLogic.class);

    /**
     * Gets the context for this metafacade logic instance.
     * @param context String. Set to WebServicePackage if null
     * @return context String
     */
    private static String getContext(String context)
    {
        if (context == null)
        {
            context = "org.andromda.cartridges.webservice.metafacades.WebServicePackage";
        }
        return context;
    }

    private PackageFacade superPackageFacade;
    private boolean superPackageFacadeInitialized = false;

    /**
     * Gets the PackageFacade parent instance.
     * @return this.superPackageFacade PackageFacade
     */
    private PackageFacade getSuperPackageFacade()
    {
        if (!this.superPackageFacadeInitialized)
        {
            ((MetafacadeBase)this.superPackageFacade).setMetafacadeContext(this.getMetafacadeContext());
            this.superPackageFacadeInitialized = true;
        }
        return this.superPackageFacade;
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
            if (this.superPackageFacadeInitialized)
            {
                ((MetafacadeBase)this.superPackageFacade).resetMetafacadeContext(context);
            }
        }
    }

    /**
     * @return boolean true always
     * @see WebServicePackage
     */
    public boolean isWebServicePackageMetaType()
    {
        return true;
    }

    // --------------- attributes ---------------------

   /**
    * @see WebServicePackage#getAttributeFormDefault()
    * @return String
    */
    protected abstract String handleGetAttributeFormDefault();

    private String __attributeFormDefault1a;
    private boolean __attributeFormDefault1aSet = false;

    /**
     * 
     * @return (String)handleGetAttributeFormDefault()
     */
    public final String getAttributeFormDefault()
    {
        String attributeFormDefault1a = this.__attributeFormDefault1a;
        if (!this.__attributeFormDefault1aSet)
        {
            // attributeFormDefault has no pre constraints
            attributeFormDefault1a = handleGetAttributeFormDefault();
            // attributeFormDefault has no post constraints
            this.__attributeFormDefault1a = attributeFormDefault1a;
            if (isMetafacadePropertyCachingEnabled())
            {
                this.__attributeFormDefault1aSet = true;
            }
        }
        return attributeFormDefault1a;
    }

   /**
    * @see WebServicePackage#getElementFormDefault()
    * @return String
    */
    protected abstract String handleGetElementFormDefault();

    private String __elementFormDefault2a;
    private boolean __elementFormDefault2aSet = false;

    /**
     * 
     * @return (String)handleGetElementFormDefault()
     */
    public final String getElementFormDefault()
    {
        String elementFormDefault2a = this.__elementFormDefault2a;
        if (!this.__elementFormDefault2aSet)
        {
            // elementFormDefault has no pre constraints
            elementFormDefault2a = handleGetElementFormDefault();
            // elementFormDefault has no post constraints
            this.__elementFormDefault2a = elementFormDefault2a;
            if (isMetafacadePropertyCachingEnabled())
            {
                this.__elementFormDefault2aSet = true;
            }
        }
        return elementFormDefault2a;
    }

   /**
    * @see WebServicePackage#getNamespace()
    * @return String
    */
    protected abstract String handleGetNamespace();

    private String __namespace3a;
    private boolean __namespace3aSet = false;

    /**
     * 
     * @return (String)handleGetNamespace()
     */
    public final String getNamespace()
    {
        String namespace3a = this.__namespace3a;
        if (!this.__namespace3aSet)
        {
            // namespace has no pre constraints
            namespace3a = handleGetNamespace();
            // namespace has no post constraints
            this.__namespace3a = namespace3a;
            if (isMetafacadePropertyCachingEnabled())
            {
                this.__namespace3aSet = true;
            }
        }
        return namespace3a;
    }

   /**
    * @see WebServicePackage#getPackageAbbr()
    * @return String
    */
    protected abstract String handleGetPackageAbbr();

    private String __packageAbbr4a;
    private boolean __packageAbbr4aSet = false;

    /**
     * <p>
     * Package Abbreviation
     * </p>
     * @return (String)handleGetPackageAbbr()
     */
    public final String getPackageAbbr()
    {
        String packageAbbr4a = this.__packageAbbr4a;
        if (!this.__packageAbbr4aSet)
        {
            // packageAbbr has no pre constraints
            packageAbbr4a = handleGetPackageAbbr();
            // packageAbbr has no post constraints
            this.__packageAbbr4a = packageAbbr4a;
            if (isMetafacadePropertyCachingEnabled())
            {
                this.__packageAbbr4aSet = true;
            }
        }
        return packageAbbr4a;
    }

   /**
    * @see WebServicePackage#getSchemaLocation()
    * @return String
    */
    protected abstract String handleGetSchemaLocation();

    private String __schemaLocation5a;
    private boolean __schemaLocation5aSet = false;

    /**
     * <p>
     * Get the schema location for the generated schema file. By
     * default this is the service package name, without the leading
     * http://, with all namespace customizations replaced by '.', in
     * the xsd/ directory beneath the wsdl directory:
     * xsd/${service.package.namespace.substring(7).replaceAll('/','.')}xsd
     * </p>
     * @return (String)handleGetSchemaLocation()
     */
    public final String getSchemaLocation()
    {
        String schemaLocation5a = this.__schemaLocation5a;
        if (!this.__schemaLocation5aSet)
        {
            // schemaLocation has no pre constraints
            schemaLocation5a = handleGetSchemaLocation();
            // schemaLocation has no post constraints
            this.__schemaLocation5a = schemaLocation5a;
            if (isMetafacadePropertyCachingEnabled())
            {
                this.__schemaLocation5aSet = true;
            }
        }
        return schemaLocation5a;
    }

   /**
    * @see WebServicePackage#isMissingXmlSchema()
    * @return boolean
    */
    protected abstract boolean handleIsMissingXmlSchema();

    private boolean __missingXmlSchema6a;
    private boolean __missingXmlSchema6aSet = false;

    /**
     * <p>
     * If this package contains XML elements referenced by other
     * packages that are used by any webservices, if using CXF/JAX-WS
     * and schemas are imported.
     * </p>
     * @return (boolean)handleIsMissingXmlSchema()
     */
    public final boolean isMissingXmlSchema()
    {
        boolean missingXmlSchema6a = this.__missingXmlSchema6a;
        if (!this.__missingXmlSchema6aSet)
        {
            // missingXmlSchema has no pre constraints
            missingXmlSchema6a = handleIsMissingXmlSchema();
            // missingXmlSchema has no post constraints
            this.__missingXmlSchema6a = missingXmlSchema6a;
            if (isMetafacadePropertyCachingEnabled())
            {
                this.__missingXmlSchema6aSet = true;
            }
        }
        return missingXmlSchema6a;
    }

    // ---------------- business methods ----------------------

    /**
     * Method to be implemented in descendants
     * 
     * @param follow
     * @return Collection
     */
    protected abstract Collection handleGetPackageReferences(boolean follow);

    /**
     * 
     * @param follow boolean
     * <p>
     * Follow Inheritance references $extensionInheritanceDisabled
     * </p>
     * @return handleGetPackageReferences(follow)
     */
    public Collection getPackageReferences(boolean follow)
    {
        // getPackageReferences has no pre constraints
        Collection returnValue = handleGetPackageReferences(follow);
        // getPackageReferences has no post constraints
        return returnValue;
    }

    // ------------- associations ------------------

    /**
     * 
     * @return (Collection<WebServicePackage>)handleGetPackageReferences()
     */
    public final Collection<WebServicePackage> getPackageReferences()
    {
        Collection<WebServicePackage> getPackageReferences1r = null;
        // webServicePackage has no pre constraints
        Collection result = handleGetPackageReferences();
        List shieldedResult = this.shieldedElements(result);
        try
        {
            getPackageReferences1r = (Collection<WebServicePackage>)shieldedResult;
        }
        catch (ClassCastException ex)
        {
            // Bad things happen if the metafacade type mapping in metafacades.xml is wrong - Warn
            WebServicePackageLogic.logger.warn("incorrect metafacade cast for WebServicePackageLogic.getPackageReferences Collection<WebServicePackage> " + result + ": " + shieldedResult);
        }
        // webServicePackage has no post constraints
        return getPackageReferences1r;
    }

    /**
     * UML Specific type is returned in Collection, transformed by shieldedElements to AndroMDA Metafacade type
     * @return  Collection
     */
    protected abstract Collection handleGetPackageReferences();

    /**
     * 
     * @return (Collection<WebServicePackage>)handleGetPackages()
     */
    public final Collection<WebServicePackage> getPackages()
    {
        Collection<WebServicePackage> getPackages3r = null;
        // webServicePackage has no pre constraints
        Collection result = handleGetPackages();
        List shieldedResult = this.shieldedElements(result);
        try
        {
            getPackages3r = (Collection<WebServicePackage>)shieldedResult;
        }
        catch (ClassCastException ex)
        {
            // Bad things happen if the metafacade type mapping in metafacades.xml is wrong - Warn
            WebServicePackageLogic.logger.warn("incorrect metafacade cast for WebServicePackageLogic.getPackages Collection<WebServicePackage> " + result + ": " + shieldedResult);
        }
        // webServicePackage has no post constraints
        return getPackages3r;
    }

    /**
     * UML Specific type is returned in Collection, transformed by shieldedElements to AndroMDA Metafacade type
     * @return  Collection
     */
    protected abstract Collection handleGetPackages();

    /**
     * 
     * @return (Collection<WebServiceOperation>)handleGetAllowedOperations()
     */
    public final Collection<WebServiceOperation> getAllowedOperations()
    {
        Collection<WebServiceOperation> getAllowedOperations5r = null;
        // webServicePackage has no pre constraints
        Collection result = handleGetAllowedOperations();
        List shieldedResult = this.shieldedElements(result);
        try
        {
            getAllowedOperations5r = (Collection<WebServiceOperation>)shieldedResult;
        }
        catch (ClassCastException ex)
        {
            // Bad things happen if the metafacade type mapping in metafacades.xml is wrong - Warn
            WebServicePackageLogic.logger.warn("incorrect metafacade cast for WebServicePackageLogic.getAllowedOperations Collection<WebServiceOperation> " + result + ": " + shieldedResult);
        }
        // webServicePackage has no post constraints
        return getAllowedOperations5r;
    }

    /**
     * UML Specific type is returned in Collection, transformed by shieldedElements to AndroMDA Metafacade type
     * @return  Collection
     */
    protected abstract Collection handleGetAllowedOperations();

    /**
     * @return true
     * @see PackageFacade
     */
    public boolean isPackageFacadeMetaType()
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

    // ----------- delegates to PackageFacade ------------
    /**
     * <p>
     * Copies all tagged values from the given ModelElementFacade to
     * this model element facade.
     * </p>
     * @see ModelElementFacade#copyTaggedValues(ModelElementFacade element)
     */
    public void copyTaggedValues(ModelElementFacade element)
    {
        this.getSuperPackageFacade().copyTaggedValues(element);
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
        return this.getSuperPackageFacade().findTaggedValue(tagName);
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
        return this.getSuperPackageFacade().findTaggedValues(tagName);
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
        return this.getSuperPackageFacade().getBindedFullyQualifiedName(bindedElement);
    }

    /**
     * <p>
     * Gets all constraints belonging to the model element.
     * </p>
     * @see ModelElementFacade#getConstraints()
     */
    public Collection<ConstraintFacade> getConstraints()
    {
        return this.getSuperPackageFacade().getConstraints();
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
        return this.getSuperPackageFacade().getConstraints(kind);
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
        return this.getSuperPackageFacade().getDocumentation(indent);
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
        return this.getSuperPackageFacade().getDocumentation(indent, lineLength);
    }

    /**
     * 
     * @see ModelElementFacade#getDocumentation(String indent, int lineLength, boolean htmlStyle)
     */
    public String getDocumentation(String indent, int lineLength, boolean htmlStyle)
    {
        return this.getSuperPackageFacade().getDocumentation(indent, lineLength, htmlStyle);
    }

    /**
     * <p>
     * The fully qualified name of this model element.
     * </p>
     * @see ModelElementFacade#getFullyQualifiedName()
     */
    public String getFullyQualifiedName()
    {
        return this.getSuperPackageFacade().getFullyQualifiedName();
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
        return this.getSuperPackageFacade().getFullyQualifiedName(modelName);
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
        return this.getSuperPackageFacade().getFullyQualifiedNamePath();
    }

    /**
     * <p>
     * Gets the unique identifier of the underlying model element.
     * </p>
     * @see ModelElementFacade#getId()
     */
    public String getId()
    {
        return this.getSuperPackageFacade().getId();
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
        return this.getSuperPackageFacade().getKeywords();
    }

    /**
     * <p>
     * UML2: Retrieves a localized label for this named element.
     * </p>
     * @see ModelElementFacade#getLabel()
     */
    public String getLabel()
    {
        return this.getSuperPackageFacade().getLabel();
    }

    /**
     * <p>
     * The language mappings that have been set for this model elemnt.
     * </p>
     * @see ModelElementFacade#getLanguageMappings()
     */
    public TypeMappings getLanguageMappings()
    {
        return this.getSuperPackageFacade().getLanguageMappings();
    }

    /**
     * 
     * @see ModelElementFacade#getModel()
     */
    public ModelFacade getModel()
    {
        return this.getSuperPackageFacade().getModel();
    }

    /**
     * <p>
     * The name of the model element.
     * </p>
     * @see ModelElementFacade#getName()
     */
    public String getName()
    {
        return this.getSuperPackageFacade().getName();
    }

    /**
     * <p>
     * Gets the package to which this model element belongs.
     * </p>
     * @see ModelElementFacade#getPackage()
     */
    public ModelElementFacade getPackage()
    {
        return this.getSuperPackageFacade().getPackage();
    }

    /**
     * <p>
     * The name of this model element's package.
     * </p>
     * @see ModelElementFacade#getPackageName()
     */
    public String getPackageName()
    {
        return this.getSuperPackageFacade().getPackageName();
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
        return this.getSuperPackageFacade().getPackageName(modelName);
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
        return this.getSuperPackageFacade().getPackagePath();
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
        return this.getSuperPackageFacade().getQualifiedName();
    }

    /**
     * <p>
     * Gets the root package for the model element.
     * </p>
     * @see ModelElementFacade#getRootPackage()
     */
    public PackageFacade getRootPackage()
    {
        return this.getSuperPackageFacade().getRootPackage();
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
        return this.getSuperPackageFacade().getSourceDependencies();
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
        return this.getSuperPackageFacade().getStateMachineContext();
    }

    /**
     * <p>
     * The collection of ALL stereotype names for this model element.
     * </p>
     * @see ModelElementFacade#getStereotypeNames()
     */
    public Collection<String> getStereotypeNames()
    {
        return this.getSuperPackageFacade().getStereotypeNames();
    }

    /**
     * <p>
     * Gets all stereotypes for this model element.
     * </p>
     * @see ModelElementFacade#getStereotypes()
     */
    public Collection<StereotypeFacade> getStereotypes()
    {
        return this.getSuperPackageFacade().getStereotypes();
    }

    /**
     * 
     * @see ModelElementFacade#getTaggedValues()
     */
    public Collection<TaggedValueFacade> getTaggedValues()
    {
        return this.getSuperPackageFacade().getTaggedValues();
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
        return this.getSuperPackageFacade().getTargetDependencies();
    }

    /**
     * 
     * @see ModelElementFacade#getTemplateParameter(String parameterName)
     */
    public Object getTemplateParameter(String parameterName)
    {
        return this.getSuperPackageFacade().getTemplateParameter(parameterName);
    }

    /**
     * 
     * @see ModelElementFacade#getTemplateParameters()
     */
    public Collection<TemplateParameterFacade> getTemplateParameters()
    {
        return this.getSuperPackageFacade().getTemplateParameters();
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
        return this.getSuperPackageFacade().getVisibility();
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
        return this.getSuperPackageFacade().hasExactStereotype(stereotypeName);
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
        return this.getSuperPackageFacade().hasKeyword(keywordName);
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
        return this.getSuperPackageFacade().hasStereotype(stereotypeName);
    }

    /**
     * 
     * @see ModelElementFacade#isBindingDependenciesPresent()
     */
    public boolean isBindingDependenciesPresent()
    {
        return this.getSuperPackageFacade().isBindingDependenciesPresent();
    }

    /**
     * <p>
     * Indicates if any constraints are present on this model element.
     * </p>
     * @see ModelElementFacade#isConstraintsPresent()
     */
    public boolean isConstraintsPresent()
    {
        return this.getSuperPackageFacade().isConstraintsPresent();
    }

    /**
     * <p>
     * Indicates if any documentation is present on this model element.
     * </p>
     * @see ModelElementFacade#isDocumentationPresent()
     */
    public boolean isDocumentationPresent()
    {
        return this.getSuperPackageFacade().isDocumentationPresent();
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
        return this.getSuperPackageFacade().isReservedWord();
    }

    /**
     * 
     * @see ModelElementFacade#isTemplateParametersPresent()
     */
    public boolean isTemplateParametersPresent()
    {
        return this.getSuperPackageFacade().isTemplateParametersPresent();
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
        return this.getSuperPackageFacade().translateConstraint(name, translation);
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
        return this.getSuperPackageFacade().translateConstraints(translation);
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
        return this.getSuperPackageFacade().translateConstraints(kind, translation);
    }

    /**
     * <p>
     * Finds the model element with the given 'fullyQualifiedName', or
     * returns null if one can't be found with that name.
     * </p>
     * @see PackageFacade#findModelElement(String fullyQualifiedName)
     */
    public ModelElementFacade findModelElement(String fullyQualifiedName)
    {
        return this.getSuperPackageFacade().findModelElement(fullyQualifiedName);
    }

    /**
     * 
     * @see PackageFacade#getClasses()
     */
    public Collection<ClassifierFacade> getClasses()
    {
        return this.getSuperPackageFacade().getClasses();
    }

    /**
     * <p>
     * Gets all the model elements belonging to the root package.
     * </p>
     * @see PackageFacade#getModelElements()
     */
    public Collection<ModelElementFacade> getModelElements()
    {
        return this.getSuperPackageFacade().getModelElements();
    }

    /**
     * <p>
     * The elements directly found in this package.
     * </p>
     * @see PackageFacade#getOwnedElements()
     */
    public Collection<ModelElementFacade> getOwnedElements()
    {
        return this.getSuperPackageFacade().getOwnedElements();
    }

    /**
     * 
     * @see PackageFacade#getSubPackages()
     */
    public Collection<PackageFacade> getSubPackages()
    {
        return this.getSuperPackageFacade().getSubPackages();
    }

    /**
     * <p>
     * The Entity table prefix to be used for this package.
     * </p>
     * @see PackageFacade#getTablePrefix()
     */
    public String getTablePrefix()
    {
        return this.getSuperPackageFacade().getTablePrefix();
    }

    /**
     * @see MetafacadeBase#initialize()
     */
    @Override
    public void initialize()
    {
        this.getSuperPackageFacade().initialize();
    }

    /**
     * @return Object getSuperPackageFacade().getValidationOwner()
     * @see MetafacadeBase#getValidationOwner()
     */
    @Override
    public Object getValidationOwner()
    {
        Object owner = this.getSuperPackageFacade().getValidationOwner();
        return owner;
    }

    /**
     * @return String getSuperPackageFacade().getValidationName()
     * @see MetafacadeBase#getValidationName()
     */
    @Override
    public String getValidationName()
    {
        String name = this.getSuperPackageFacade().getValidationName();
        return name;
    }

    /**
     * <p><b>Constraint:</b> org::andromda::cartridges::webservice::metafacades::WebServicePackage::webservice operation names must be unique</p>
     * <p><b>Error:</b> Webservice operation names must be unique within each package/namespace.</p>
     * <p><b>OCL:</b> context WebServicePackage inv : allowedOperations -> isUnique(operationName)</p>
     * <p><b>Constraint:</b> org::andromda::cartridges::webservice::metafacades::WebServicePackage::missing xmlschema annotation</p>
     * <p><b>Error:</b> Classes referenced by services and service elements must be in a package with XmlSchema stereotype.</p>
     * <p><b>OCL:</b> context WebServicePackage inv : missingXmlSchema=false</p>
     * @param validationMessages Collection<ModelValidationMessage>
     * @see MetafacadeBase#validateInvariants(Collection validationMessages)
     */
    @Override
    public void validateInvariants(Collection<ModelValidationMessage> validationMessages)
    {
        this.getSuperPackageFacade().validateInvariants(validationMessages);
        try
        {
            final Object contextElement = this.THIS();
            boolean constraintValid = OCLResultEnsurer.ensure(OCLCollections.isUnique(OCLIntrospector.invoke(contextElement,"allowedOperations"),new Transformer(){public Object transform(Object object){return OCLIntrospector.invoke(object,"operationName");}}));
            if (!constraintValid)
            {
                validationMessages.add(
                    new ModelValidationMessage(
                        (MetafacadeBase)contextElement ,
                        "org::andromda::cartridges::webservice::metafacades::WebServicePackage::webservice operation names must be unique",
                        "Webservice operation names must be unique within each package/namespace."));
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
            logger.error("Error validating constraint 'org::andromda::cartridges::webservice::metafacades::WebServicePackage::webservice operation names must be unique' ON "
                + this.THIS().toString() + ": " + th.getMessage(), th);
        }
        try
        {
            final Object contextElement = this.THIS();
            boolean constraintValid = OCLResultEnsurer.ensure(OCLExpressions.equal(OCLIntrospector.invoke(contextElement,"missingXmlSchema"),false));
            if (!constraintValid)
            {
                validationMessages.add(
                    new ModelValidationMessage(
                        (MetafacadeBase)contextElement ,
                        "org::andromda::cartridges::webservice::metafacades::WebServicePackage::missing xmlschema annotation",
                        "Classes referenced by services and service elements must be in a package with XmlSchema stereotype."));
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
            logger.error("Error validating constraint 'org::andromda::cartridges::webservice::metafacades::WebServicePackage::missing xmlschema annotation' ON "
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