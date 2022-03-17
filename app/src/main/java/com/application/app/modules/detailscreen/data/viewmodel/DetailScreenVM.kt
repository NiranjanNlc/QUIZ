package com.application.app.modules.detailscreen.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.detailscreen.`data`.model.DetailScreen1RowModel
import com.application.app.modules.detailscreen.`data`.model.DetailScreenModel
import kotlin.collections.MutableList

public class DetailScreenVM : ViewModel() {
  public val detailScreenModel: MutableLiveData<DetailScreenModel> =
      MutableLiveData(DetailScreenModel())

  public var navArguments: Bundle? = null

  public val recyclerDetailScreenList: MutableLiveData<MutableList<DetailScreen1RowModel>> =
      MutableLiveData(mutableListOf())
}
