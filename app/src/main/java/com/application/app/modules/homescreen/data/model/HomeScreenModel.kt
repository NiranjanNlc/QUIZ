package com.application.app.modules.homescreen.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class HomeScreenModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtHelloJames: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_hello_james)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtLetsTestYour: String? =
      MyApp.getInstance().resources.getString(R.string.msg_let_s_test_your)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtPopular: String? = MyApp.getInstance().resources.getString(R.string.lbl_popular)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtScience: String? = MyApp.getInstance().resources.getString(R.string.lbl_science)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtMathematic: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_mathematic)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtComputer: String? = MyApp.getInstance().resources.getString(R.string.lbl_computer)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtContinueQuiz: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_continue_quiz)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt3DAnimation: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_3d_animation)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt810Question: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_8_10_question)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt35Min: String? = MyApp.getInstance().resources.getString(R.string.lbl_35_min)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var etSearchValue: String? = null
)
