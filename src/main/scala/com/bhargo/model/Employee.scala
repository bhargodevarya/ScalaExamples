package com.bhargo.model

/**
  * Created by Bhargo on 4/21/2017.
  */
/**
  * @param empId employee ID which is unique
  * @param _name name
  * @param email email which is unique
  * case class which already has the following:-
  * apply(), unapply(), companion object, toString(), equals(), hashcode(), copy(), serialization
  * variables are val by default
  */
  class Employee (var empId:String, private var _name:String, email:String) {

  println("inline code is executed as part of the primary constructor")

  /**
    * for provate contructor, private keyword before the constructor parenthesis
    */

  /**
    * overloaded constructor, 1st line must be call to other constructor
    * @param name
    * @param email
    * @return
    */
  def this(name:String, email:String) = this("", name, email)

  /**
    * by default all variables are val, i.e. immutable
    * only getter methods are generated by default.
    * private does not generate getter and setter, must mention whether val or var
    * if var, getters and setters are generated
    */

  /**
    * getter and a setter method, in case your variables are private var
    */
  def name = _name
  def name_=(newName:String) = _name = newName

}

/**
  * object means singleton.
  * When embedded in a class and named the same it becomes a companion Object.
  * apply() methods with varying args can be created to create instances and
  * to execute some code before instance creation
  */
object Employee {
  def apply(empId: String,_name: String , email: String): Employee = new Employee(empId , _name, email)
}