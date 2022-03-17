package com.application.app.modules.homescreen.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityHomeScreenBinding
import com.application.app.modules.homescreen.`data`.model.HomeScreen1RowModel
import com.application.app.modules.homescreen.`data`.viewmodel.HomeScreenVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class HomeScreenActivity :
    BaseActivity<ActivityHomeScreenBinding>(R.layout.activity_home_screen) {
  private val viewModel: HomeScreenVM by viewModels<HomeScreenVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras
    val recyclerSelectedandnoAdapter =
    RecyclerSelectedandnoAdapter(viewModel.recyclerSelectedandnoList.value?:mutableListOf())
    binding.recyclerSelectedandno.adapter = recyclerSelectedandnoAdapter
    recyclerSelectedandnoAdapter.setOnItemClickListener(
    object : RecyclerSelectedandnoAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : HomeScreen1RowModel) {
        onClickRecyclerSelectedandno(view, position, item)
      }
    }
    )
    viewModel.recyclerSelectedandnoList.observe(this) {
      recyclerSelectedandnoAdapter.updateData(it)
    }
    binding.homeScreenVM = viewModel
  }

  public override fun setUpClicks(): Unit {
  }

  public fun onClickRecyclerSelectedandno(
    view: View,
    position: Int,
    item: HomeScreen1RowModel
  ): Unit {
    when(view.id) {
    }
  }

  public companion object {
    public const val TAG: String = "HOME_SCREEN_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, HomeScreenActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
