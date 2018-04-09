/**
 * generated by Xtext 2.13.0
 */
package uibk.ac.at.qe.dsl.game;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uibk.ac.at.qe.dsl.game.Person#getName <em>Name</em>}</li>
 *   <li>{@link uibk.ac.at.qe.dsl.game.Person#getType <em>Type</em>}</li>
 *   <li>{@link uibk.ac.at.qe.dsl.game.Person#getResponse <em>Response</em>}</li>
 *   <li>{@link uibk.ac.at.qe.dsl.game.Person#getPosition <em>Position</em>}</li>
 * </ul>
 *
 * @see uibk.ac.at.qe.dsl.game.GamePackage#getPerson()
 * @model
 * @generated
 */
public interface Person extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see uibk.ac.at.qe.dsl.game.GamePackage#getPerson_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link uibk.ac.at.qe.dsl.game.Person#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The literals are from the enumeration {@link uibk.ac.at.qe.dsl.game.PERSON_T}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see uibk.ac.at.qe.dsl.game.PERSON_T
   * @see #setType(PERSON_T)
   * @see uibk.ac.at.qe.dsl.game.GamePackage#getPerson_Type()
   * @model
   * @generated
   */
  PERSON_T getType();

  /**
   * Sets the value of the '{@link uibk.ac.at.qe.dsl.game.Person#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see uibk.ac.at.qe.dsl.game.PERSON_T
   * @see #getType()
   * @generated
   */
  void setType(PERSON_T value);

  /**
   * Returns the value of the '<em><b>Response</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Response</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Response</em>' attribute.
   * @see #setResponse(String)
   * @see uibk.ac.at.qe.dsl.game.GamePackage#getPerson_Response()
   * @model
   * @generated
   */
  String getResponse();

  /**
   * Sets the value of the '{@link uibk.ac.at.qe.dsl.game.Person#getResponse <em>Response</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Response</em>' attribute.
   * @see #getResponse()
   * @generated
   */
  void setResponse(String value);

  /**
   * Returns the value of the '<em><b>Position</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Position</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Position</em>' containment reference.
   * @see #setPosition(Position)
   * @see uibk.ac.at.qe.dsl.game.GamePackage#getPerson_Position()
   * @model containment="true"
   * @generated
   */
  Position getPosition();

  /**
   * Sets the value of the '{@link uibk.ac.at.qe.dsl.game.Person#getPosition <em>Position</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Position</em>' containment reference.
   * @see #getPosition()
   * @generated
   */
  void setPosition(Position value);

} // Person
