package o0;

import ae.s;
import l1.j0;
import l1.l0;
import t0.a2;
import t0.v;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final a2<l> f16254a = v.d(null, a.f16257a, 1, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f16255b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final l f16256c;

    static final class a extends s implements zd.a<l> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f16257a = new a();

        a() {
            super(0);
        }

        @Override // zd.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final l invoke() {
            return m.f16256c;
        }
    }

    static {
        long jD = l0.d(4282550004L);
        f16255b = jD;
        f16256c = new l(jD, j0.u(jD, 0.4f, 0.0f, 0.0f, 0.0f, 14, null), null);
    }

    public static final a2<l> b() {
        return f16254a;
    }
}
