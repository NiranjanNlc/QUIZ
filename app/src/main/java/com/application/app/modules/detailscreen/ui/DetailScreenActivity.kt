package com.application.app.modules.detailscreen.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityDetailScreenBinding
import com.application.app.modules.detailscreen.`data`.model.DetailScreen1RowModel
import com.application.app.modules.detailscreen.`data`.viewmodel.DetailScreenVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class DetailScreenActivity :
    BaseActivity<ActivityDetailScreenBinding>(R.layout.activity_detail_screen) {
  private val viewModel: DetailScreenVM by viewModels<DetailScreenVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras
    val recyclerDetailScreenAdapter =
    RecyclerDetailScreenAdapter(viewModel.recyclerDetailScreenList.value?:mutableListOf())
    binding.recyclerDetailScreen.adapter = recyclerDetailScreenAdapter
    recyclerDetailScreenAdapter.setOnItemClickListener(
    object : RecyclerDetailScreenAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : DetailScreen1RowModel) {
        onClickRecyclerDetailScreen(view, position, item)
      }
    }
    )
    viewModel.recyclerDetailScreenList.observe(this) {
      recyclerDetailScreenAdapter.updateData(it)
    }
    binding.detailScreenVM = viewModel
  }

  public override fun setUpClicks(): Unit {
  }

  public fun onClickRecyclerDetailScreen(
    view: View,
    position: Int,
    item: DetailScreen1RowModel
  ): Unit {
    when(view.id) {
    }
  }

  public companion object {
    public const val TAG: String = "DETAIL_SCREEN_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, DetailScreenActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
