package com.application.app.modules.quizscreen.ui

import androidx.fragment.app.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseFragment
import com.application.app.databinding.FragmentQuizScreenBinding
import com.application.app.modules.quizscreen.`data`.viewmodel.QuizScreenVM
import kotlin.String
import kotlin.Unit

public class QuizScreenFragment :
    BaseFragment<FragmentQuizScreenBinding>(R.layout.fragment_quiz_screen) {
  private val viewModel: QuizScreenVM by viewModels<QuizScreenVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.quizScreenVM = viewModel
  }

  public override fun setUpClicks(): Unit {
  }

  public companion object {
    public const val TAG: String = "QUIZ_SCREEN_FRAGMENT"
  }
}
