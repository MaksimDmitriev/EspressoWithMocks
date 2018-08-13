package ru.maksim.emocks

import android.content.Context
import toothpick.config.Module

class SmoothieApplicationModule(context: Context) : Module() {

    init {
        bind(Context::class.java) to context
    }

}
