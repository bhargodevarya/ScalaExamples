package com.bhargo.model

/**
  * Created by Bhargo on 4/21/2017.
  */
sealed abstract class Role {

}

case object Admin extends Role
case object User extends Role
