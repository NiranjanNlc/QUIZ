package com.application.app.modules.quizscreen1.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityQuizScreen1Binding
import com.application.app.modules.quizscreen1.`data`.viewmodel.QuizScreen1VM
import com.google.android.material.tabs.TabLayoutMediator
import kotlin.String
import kotlin.Unit

public class QuizScreen1Activity :
    BaseActivity<ActivityQuizScreen1Binding>(R.layout.activity_quiz_screen1) {
  private val viewModel: QuizScreen1VM by viewModels<QuizScreen1VM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras
    binding.quizScreen1VM = viewModel
    val adapter = QuizScreen1ActivityPagerAdapter(supportFragmentManager,lifecycle)
    binding.viewPagerGroup27.adapter = adapter
    TabLayoutMediator(binding.tabLayoutGroup6,binding.viewPagerGroup27) { tab, position ->
      tab.text = QuizScreen1ActivityPagerAdapter.title[position]
      }.attach()
    }

    public override fun setUpClicks(): Unit {
    }

    public companion object {
      public const val TAG: String = "QUIZ_SCREEN1ACTIVITY"

      public fun getIntent(context: Context, bundle: Bundle?): Intent {
        val destIntent = Intent(context, QuizScreen1Activity::class.java)
        destIntent.putExtra("bundle", bundle)
        return destIntent
      }
    }
  }
