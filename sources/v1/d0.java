package v1;

import android.view.MotionEvent;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f21905a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<e0> f21906b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final MotionEvent f21907c;

    public d0(long j10, List<e0> list, MotionEvent motionEvent) {
        this.f21905a = j10;
        this.f21906b = list;
        this.f21907c = motionEvent;
    }

    public final MotionEvent a() {
        return this.f21907c;
    }

    public final List<e0> b() {
        return this.f21906b;
    }
}
