package com.application.app.modules.quizscreen1.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.quizscreen1.`data`.model.QuizScreen1Model

public class QuizScreen1VM : ViewModel() {
  public val quizScreen1Model: MutableLiveData<QuizScreen1Model> =
      MutableLiveData(QuizScreen1Model())

  public var navArguments: Bundle? = null
}
