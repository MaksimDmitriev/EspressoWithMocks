package ru.maksim.emocks

import android.app.Application
import toothpick.Scope
import toothpick.Toothpick
import toothpick.configuration.Configuration
import toothpick.registries.FactoryRegistryLocator
import toothpick.registries.MemberInjectorRegistryLocator

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        Toothpick.setConfiguration(Configuration.forProduction().disableReflection())
        MemberInjectorRegistryLocator.setRootRegistry(ru.maksim.emocks.MemberInjectorRegistry())
        FactoryRegistryLocator.setRootRegistry(ru.maksim.emocks.FactoryRegistry())

        val appScope = Toothpick.openScope(this)
        initToothpick(appScope)
    }

    private fun initToothpick(appScope: Scope) {
        appScope.installModules(SmoothieApplicationModule(this))
    }
}

