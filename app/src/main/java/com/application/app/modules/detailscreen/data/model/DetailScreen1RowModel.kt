package com.application.app.modules.detailscreen.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class DetailScreen1RowModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txt10Question: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_10_question)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt10PointForA: String? =
      MyApp.getInstance().resources.getString(R.string.msg_10_point_for_a)

)
