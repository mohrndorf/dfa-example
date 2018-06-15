/**
 */
package de.hu.berlin.dfa.model.dfamodel.impl;

import de.hu.berlin.dfa.model.dfamodel.DfamodelFactory;
import de.hu.berlin.dfa.model.dfamodel.DfamodelPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DfamodelPackageImpl extends EPackageImpl implements DfamodelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dfaEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see de.hu.berlin.dfa.model.dfamodel.DfamodelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DfamodelPackageImpl() {
		super(eNS_URI, DfamodelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link DfamodelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DfamodelPackage init() {
		if (isInited)
			return (DfamodelPackage) EPackage.Registry.INSTANCE.getEPackage(DfamodelPackage.eNS_URI);

		// Obtain or create and register package
		DfamodelPackageImpl theDfamodelPackage = (DfamodelPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof DfamodelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
						: new DfamodelPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theDfamodelPackage.createPackageContents();

		// Initialize created meta-data
		theDfamodelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDfamodelPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DfamodelPackage.eNS_URI, theDfamodelPackage);
		return theDfamodelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDFA() {
		return dfaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DfamodelFactory getDfamodelFactory() {
		return (DfamodelFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		dfaEClass = createEClass(DFA);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(dfaEClass, de.hu.berlin.dfa.model.dfamodel.DFA.class, "DFA", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //DfamodelPackageImpl
