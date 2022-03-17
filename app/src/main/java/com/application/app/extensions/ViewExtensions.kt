package com.application.app.extensions

import android.app.Activity
import android.content.Context
import android.view.inputmethod.InputMethodManager
import com.application.app.appcomponents.di.MyApp

/**
 * ViewExtensions file contains view related extension method
 */

/**
 * The activity extension method to hide the keyboard, if it is open in the screen
 */
fun Activity.hideKeyboard() {
    this.currentFocus?.let { view ->
        val imm = MyApp.getInstance()
            .getSystemService(Context.INPUT_METHOD_SERVICE) as? InputMethodManager
        imm?.hideSoftInputFromWindow(view.windowToken, 0)
    }
}