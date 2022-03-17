package com.application.app.modules.homescreen.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class HomeScreen1RowModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtUIUXDesign: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_ui_ux_design)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt10Question: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_10_question)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt1Hour15Min: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_1_hour_15_min)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt48: String? = MyApp.getInstance().resources.getString(R.string.lbl_4_8)

)
