package com.application.app.modules.appnavigation.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class AppNavigationModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtAppNavigation: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_app_navigation)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtCheckYourAppsUIFromTheBelowDemoScreensOfYourApp: String? =
      MyApp.getInstance().resources.getString(R.string.msg_check_your_app)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtHomeScreen: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_home_screen)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtDetailScreen: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_detail_screen)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtQuizScreen: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_quiz_screen)

)
