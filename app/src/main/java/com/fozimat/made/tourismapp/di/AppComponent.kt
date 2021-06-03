package com.fozimat.made.tourismapp.di

import com.fozimat.made.tourismapp.core.di.CoreComponent
import com.fozimat.made.tourismapp.detail.DetailTourismActivity
import com.fozimat.made.tourismapp.favorite.FavoriteFragment
import com.fozimat.made.tourismapp.home.HomeFragment
import dagger.Component

@AppScope
@Component(
    dependencies = [CoreComponent::class],
    modules = [AppModule::class]
)
interface AppComponent {
    @Component.Factory
    interface Factory {
        fun create(coreComponent: CoreComponent): AppComponent
    }

    fun inject(fragment: HomeFragment)
    fun inject(fragment: FavoriteFragment)
    fun inject(activity: DetailTourismActivity)
}