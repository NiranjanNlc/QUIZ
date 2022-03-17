package com.application.app.modules.quizscreen1.ui

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import com.application.app.modules.quizscreen.ui.QuizScreenFragment
import kotlin.Int
import kotlin.String
import kotlin.collections.List

public class QuizScreen1ActivityPagerAdapter(
    public val fragmentManager: FragmentManager,
    public val lifecycle: Lifecycle
) : FragmentStateAdapter(fragmentManager, lifecycle) {
    public override fun getItemCount(): Int = viewPages.size

    public override fun createFragment(position: Int): Fragment = viewPages[position]

    public companion object AdapterConstant {
        public val title: List<String> =
                listOf(MyApp.getInstance().resources.getString(R.string.msg_ui_ux_design_qu),MyApp.getInstance().resources.getString(R.string.lbl_16_35))

        public val viewPages: List<Fragment> = listOf(QuizScreenFragment(),QuizScreenFragment())

    }
}
