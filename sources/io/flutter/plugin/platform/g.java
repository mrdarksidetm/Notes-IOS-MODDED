package io.flutter.plugin.platform;

import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.WindowMetrics;
import java.util.concurrent.Executor;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes2.dex */
abstract class g implements WindowManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final WindowManager f13083a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    f f13084b;

    g(WindowManager windowManager, f fVar) {
        this.f13083a = windowManager;
        this.f13084b = fVar;
    }

    @Override // android.view.WindowManager
    public void addCrossWindowBlurEnabledListener(Executor executor, Consumer<Boolean> consumer) {
        this.f13083a.addCrossWindowBlurEnabledListener(executor, consumer);
    }

    @Override // android.view.WindowManager
    public void addCrossWindowBlurEnabledListener(Consumer<Boolean> consumer) {
        this.f13083a.addCrossWindowBlurEnabledListener(consumer);
    }

    @Override // android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        f fVar = this.f13084b;
        if (fVar == null) {
            cc.b.g("PlatformViewsController", "Embedded view called addView while detached from presentation");
        } else {
            fVar.addView(view, layoutParams);
        }
    }

    @Override // android.view.WindowManager
    public WindowMetrics getCurrentWindowMetrics() {
        return this.f13083a.getCurrentWindowMetrics();
    }

    @Override // android.view.WindowManager
    @Deprecated
    public Display getDefaultDisplay() {
        return this.f13083a.getDefaultDisplay();
    }

    @Override // android.view.WindowManager
    public WindowMetrics getMaximumWindowMetrics() {
        return this.f13083a.getMaximumWindowMetrics();
    }

    @Override // android.view.WindowManager
    public boolean isCrossWindowBlurEnabled() {
        return this.f13083a.isCrossWindowBlurEnabled();
    }

    @Override // android.view.WindowManager
    public void removeCrossWindowBlurEnabledListener(Consumer<Boolean> consumer) {
        this.f13083a.removeCrossWindowBlurEnabledListener(consumer);
    }

    @Override // android.view.ViewManager
    public void removeView(View view) {
        f fVar = this.f13084b;
        if (fVar == null) {
            cc.b.g("PlatformViewsController", "Embedded view called removeView while detached from presentation");
        } else {
            fVar.removeView(view);
        }
    }

    @Override // android.view.WindowManager
    public void removeViewImmediate(View view) {
        if (this.f13084b == null) {
            cc.b.g("PlatformViewsController", "Embedded view called removeViewImmediate while detached from presentation");
        } else {
            view.clearAnimation();
            this.f13084b.removeView(view);
        }
    }

    @Override // android.view.ViewManager
    public void updateViewLayout(View view, ViewGroup.LayoutParams layoutParams) {
        f fVar = this.f13084b;
        if (fVar == null) {
            cc.b.g("PlatformViewsController", "Embedded view called updateViewLayout while detached from presentation");
        } else {
            fVar.updateViewLayout(view, layoutParams);
        }
    }
}
