package com.udacity


sealed class ButtonState(var buttonText: Int) {
    object Clicked : ButtonState(R.string.custom_button_text_default)
    object Loading : ButtonState(R.string.custom_button_text_loading)
    object Completed : ButtonState(R.string.custom_button_text_completed)
}