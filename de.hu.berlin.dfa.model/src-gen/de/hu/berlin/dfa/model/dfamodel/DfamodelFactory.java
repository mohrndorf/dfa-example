/**
 */
package de.hu.berlin.dfa.model.dfamodel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.hu.berlin.dfa.model.dfamodel.DfamodelPackage
 * @generated
 */
public interface DfamodelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DfamodelFactory eINSTANCE = de.hu.berlin.dfa.model.dfamodel.impl.DfamodelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>DFA</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DFA</em>'.
	 * @generated
	 */
	DFA createDFA();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DfamodelPackage getDfamodelPackage();

} //DfamodelFactory
