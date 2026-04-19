package v1;

import android.view.MotionEvent;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<b0> f21960a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final h f21961b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f21962c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f21963d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f21964e;

    public p(List<b0> list) {
        this(list, null);
    }

    public p(List<b0> list, h hVar) {
        this.f21960a = list;
        this.f21961b = hVar;
        MotionEvent motionEventD = d();
        this.f21962c = o.a(motionEventD != null ? motionEventD.getButtonState() : 0);
        MotionEvent motionEventD2 = d();
        this.f21963d = l0.b(motionEventD2 != null ? motionEventD2.getMetaState() : 0);
        this.f21964e = a();
    }

    private final int a() {
        MotionEvent motionEventD = d();
        if (motionEventD != null) {
            int actionMasked = motionEventD.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        switch (actionMasked) {
                        }
                        return t.f21997a.d();
                    }
                    return t.f21997a.c();
                }
                return t.f21997a.e();
            }
            return t.f21997a.d();
        }
        List<b0> list = this.f21960a;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            b0 b0Var = list.get(i10);
            if (q.d(b0Var)) {
                return t.f21997a.e();
            }
            if (q.b(b0Var)) {
                return t.f21997a.d();
            }
        }
        return t.f21997a.c();
    }

    public final int b() {
        return this.f21962c;
    }

    public final List<b0> c() {
        return this.f21960a;
    }

    public final MotionEvent d() {
        h hVar = this.f21961b;
        if (hVar != null) {
            return hVar.b();
        }
        return null;
    }

    public final int e() {
        return this.f21964e;
    }

    public final void f(int i10) {
        this.f21964e = i10;
    }
}
