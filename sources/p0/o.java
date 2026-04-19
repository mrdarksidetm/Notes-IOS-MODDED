package p0;

import l1.j0;
import l1.l0;

/* JADX INFO: loaded from: classes.dex */
public interface o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f17846a = a.f17847a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f17847a = new a();

        private a() {
        }

        public final f a(long j10, boolean z10) {
            return z10 ? ((double) l0.g(j10)) > 0.5d ? p.f17849b : p.f17850c : p.f17851d;
        }

        public final long b(long j10, boolean z10) {
            return (z10 || ((double) l0.g(j10)) >= 0.5d) ? j10 : j0.f14524b.k();
        }
    }

    f a(t0.l lVar, int i10);

    long b(t0.l lVar, int i10);
}
