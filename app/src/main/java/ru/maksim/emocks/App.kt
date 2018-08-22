package ru.maksim.emocks

import android.app.Application
import toothpick.Scope
import toothpick.Toothpick
import toothpick.configuration.Configuration
import toothpick.registries.FactoryRegistryLocator
import toothpick.registries.MemberInjectorRegistryLocator

open class App : Application() {

    override fun onCreate() {
        super.onCreate()

        Toothpick.setConfiguration(Configuration.forProduction().disableReflection())
        FactoryRegistryLocator.setRootRegistry(ru.maksim.emocks.FactoryRegistry())
        MemberInjectorRegistryLocator.setRootRegistry(ru.maksim.emocks.MemberInjectorRegistry())

        val appScope = Toothpick.openScope(DiScopes.APP)
        initToothpick(appScope)
    }

    protected open fun initToothpick(appScope: Scope) {
        appScope.installModules(ApplicationModule(this))
    }
}

