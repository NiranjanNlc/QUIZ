package com.application.app.modules.quizscreen.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.quizscreen.`data`.model.QuizScreenModel

public class QuizScreenVM : ViewModel() {
  public val quizScreenModel: MutableLiveData<QuizScreenModel> = MutableLiveData(QuizScreenModel())

  public var navArguments: Bundle? = null
}
