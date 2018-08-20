package ru.maksim.emocks

import android.content.Context
import toothpick.config.Module

class ApplicationModule(context: Context) : Module() {

    init {
        bind(Context::class.java) to context
        bind(DummyApi::class.java).toInstance(DummyApiImpl())
    }

}
