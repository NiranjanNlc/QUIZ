package com.application.app.modules.appnavigation.ui

import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityAppNavigationBinding
import com.application.app.modules.appnavigation.`data`.viewmodel.AppNavigationVM
import com.application.app.modules.detailscreen.ui.DetailScreenActivity
import com.application.app.modules.homescreen.ui.HomeScreenActivity
import com.application.app.modules.quizscreen1.ui.QuizScreen1Activity
import kotlin.String
import kotlin.Unit

public class AppNavigationActivity :
    BaseActivity<ActivityAppNavigationBinding>(R.layout.activity_app_navigation) {
  private val viewModel: AppNavigationVM by viewModels<AppNavigationVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras
    binding.appNavigationVM = viewModel
  }

  public override fun setUpClicks(): Unit {
    binding.linearHomeScreen.setOnClickListener {
      val destIntent = HomeScreenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearDetailScreen.setOnClickListener {
      val destIntent = DetailScreenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearQuizScreen.setOnClickListener {
      val destIntent = QuizScreen1Activity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  public companion object {
    public const val TAG: String = "APP_NAVIGATION_ACTIVITY"
  }
}
