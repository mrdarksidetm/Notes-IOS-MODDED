package l1;

import android.graphics.ColorFilter;

/* JADX INFO: loaded from: classes.dex */
public class k0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f14548b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ColorFilter f14549a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(ae.j jVar) {
            this();
        }

        public static /* synthetic */ k0 b(a aVar, long j10, int i10, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                i10 = v.f14592a.z();
            }
            return aVar.a(j10, i10);
        }

        public final k0 a(long j10, int i10) {
            return new w(j10, i10, (ae.j) null);
        }
    }

    public k0(ColorFilter colorFilter) {
        this.f14549a = colorFilter;
    }

    public final ColorFilter a() {
        return this.f14549a;
    }
}
