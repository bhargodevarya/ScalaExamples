package com.bhargo

import com.bhargo.model.{Admin, Employee, User}

/**
  * Created by barya on 4/17/2017.
  */
object Main {

  def main(args:Array[String]) = {
    //uses the apply method of the companion object in the Employee class
    // methods with single param are treated as operators like +, * etc, syntax sugar
    val emp:Employee = Employee("41NYG", "Bhargodev Arya", "Bhargodev.arya@morganstanley.com") as Admin
    println(emp)
  }
}
