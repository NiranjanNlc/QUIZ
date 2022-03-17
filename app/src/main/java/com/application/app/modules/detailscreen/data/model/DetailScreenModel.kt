package com.application.app.modules.detailscreen.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class DetailScreenModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtUIUXDesignQu: String? =
      MyApp.getInstance().resources.getString(R.string.msg_ui_ux_design_qu)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtGET100Points: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_get_100_points)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt48: String? = MyApp.getInstance().resources.getString(R.string.lbl_4_8)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt10PointAwarde: String? =
      MyApp.getInstance().resources.getString(R.string.msg_10_point_awarde)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtTapOnOptions: String? =
      MyApp.getInstance().resources.getString(R.string.msg_tap_on_options)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtTapOnTheBook: String? =
      MyApp.getInstance().resources.getString(R.string.msg_tap_on_the_book)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtClickSubmitIf: String? =
      MyApp.getInstance().resources.getString(R.string.msg_click_submit_if)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtPleaseReadThe: String? =
      MyApp.getInstance().resources.getString(R.string.msg_please_read_the)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtBriefExplanati: String? =
      MyApp.getInstance().resources.getString(R.string.msg_brief_explanati)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtDetailQuiz: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_detail_quiz)

)
