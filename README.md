# CustomDensity Android屏幕适配

## 单个 Activity 适配
```kotlin
class MainActivity : ComponentActivity() {
    override fun attachBaseContext(newBase: Context) {
        super.attachBaseContext(newBase.createCustomDensityContext())
    }
}
```

## 全局适配
``` kotlin
class MainActivity : ComponentActivity() {
    override fun attachBaseContext(newBase: Context) {
        newBase.setCustomDensity()
        super.attachBaseContext(newBase)
    }
}

class MainApplication: Application() {
    override fun attachBaseContext(base: Context) {
        base.setCustomDensity()
        super.attachBaseContext(base)
    }
}
```


## 只适配 这个 View 及其 子 view

*谨慎使用*，createCustomDensityContext 返回的 context 不是 Activity，
如果 子view 有地方拿 context 当做 Activity 使用就会有问题

```kotlin

/**
 *
 * 只适配 这个 View 及其 子 view
 * 谨慎使用，createCustomDensityContext 返回的 context 不是 Activity，
 * 如果 子view 有地方拿 context 当做 Activity 使用就会有问题
 *
 */
class FooView @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null
) : FrameLayout(context.createCustomDensityContext(), attrs)
```

[实现： 一种极低成本的Android屏幕适配方式](https://xechoz.github.io/2025/03/23/%E5%AE%9E%E7%8E%B0%EF%BC%9A%E4%B8%80%E7%A7%8D%E6%9E%81%E4%BD%8E%E6%88%90%E6%9C%AC%E7%9A%84Android%E5%B1%8F%E5%B9%95%E9%80%82%E9%85%8D%E6%96%B9%E5%BC%8F/)

参考 [一种极低成本的Android屏幕适配方式](https://mp.weixin.qq.com/s/d9QCoBP6kV9VSWvVldVVwA?mode=light)
