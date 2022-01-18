package han.howcom.howmath.di

import android.content.Context
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent

// @Provides DI(의존 주입)하는 샘플 모듈 첫번째
// 직접 대상을 리턴 하도록 구현함
// @ApplicationContext는 Hilt에 약속된어노테이션
@InstallIn(SingletonComponent:: class)
@Module
class AppModule {
    @Provides
    fun provideContext(@ApplicationContext context: Context): Context{
        return context
    }
}