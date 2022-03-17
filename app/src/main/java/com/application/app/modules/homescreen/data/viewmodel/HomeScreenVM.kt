package com.application.app.modules.homescreen.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.homescreen.`data`.model.HomeScreen1RowModel
import com.application.app.modules.homescreen.`data`.model.HomeScreenModel
import kotlin.collections.MutableList

public class HomeScreenVM : ViewModel() {
  public val homeScreenModel: MutableLiveData<HomeScreenModel> = MutableLiveData(HomeScreenModel())

  public var navArguments: Bundle? = null

  public val recyclerSelectedandnoList: MutableLiveData<MutableList<HomeScreen1RowModel>> =
      MutableLiveData(mutableListOf())
}
