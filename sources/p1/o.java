package p1;

import java.util.List;
import l1.h1;
import l1.j0;
import l1.k0;
import l1.v;
import l1.v1;
import l1.w;
import l1.w1;
import nd.u;

/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final List<h> f18046a = u.m();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f18047b = v1.f14620a.a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f18048c = w1.f14633a.b();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f18049d = v.f14592a.z();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final long f18050e = j0.f14524b.i();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f18051f = h1.f14510a.b();

    public static final List<h> a(String str) {
        return str == null ? f18046a : new j().a(str).b();
    }

    public static final int b() {
        return f18051f;
    }

    public static final int c() {
        return f18047b;
    }

    public static final int d() {
        return f18048c;
    }

    public static final List<h> e() {
        return f18046a;
    }

    public static final boolean f(long j10, long j11) {
        if (j0.B(j10) == j0.B(j11)) {
            if (j0.A(j10) == j0.A(j11)) {
                if (j0.y(j10) == j0.y(j11)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean g(k0 k0Var) {
        if (k0Var instanceof w) {
            w wVar = (w) k0Var;
            int iB = wVar.b();
            v.a aVar = v.f14592a;
            if (v.E(iB, aVar.z()) || v.E(wVar.b(), aVar.B())) {
                return true;
            }
        } else if (k0Var == null) {
            return true;
        }
        return false;
    }
}
