package com.assess15.openProjects.dagger2.demo10

import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
class MouseModule {

    @Provides
    @Named("wired")
    fun providesWireMouse(): Mouse {
        return WireMouse()
    }

    @Provides
    @Named("wireless")
    fun providesWirelessMouse(): Mouse {
        return WirelessMouse()
    }
}
