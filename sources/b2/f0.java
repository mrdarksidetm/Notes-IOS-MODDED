package b2;

import android.view.ViewConfiguration;

/* JADX INFO: loaded from: classes.dex */
public final class f0 implements x1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ViewConfiguration f5245a;

    public f0(ViewConfiguration viewConfiguration) {
        this.f5245a = viewConfiguration;
    }

    @Override // b2.x1
    public long a() {
        return ViewConfiguration.getDoubleTapTimeout();
    }

    @Override // b2.x1
    public long b() {
        return 40L;
    }

    @Override // b2.x1
    public long c() {
        return ViewConfiguration.getLongPressTimeout();
    }

    @Override // b2.x1
    public float e() {
        return this.f5245a.getScaledMaximumFlingVelocity();
    }

    @Override // b2.x1
    public float f() {
        return this.f5245a.getScaledTouchSlop();
    }
}
