package o6;

import com.google.android.gms.common.api.a;
import k6.c;

/* JADX INFO: loaded from: classes.dex */
final class q implements n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f16402b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r f16403a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(ae.j jVar) {
            this();
        }
    }

    public q(r rVar) {
        this.f16403a = rVar;
    }

    @Override // o6.n
    public boolean a(k6.i iVar) {
        k6.c cVarB = iVar.b();
        boolean z10 = cVarB instanceof c.a;
        int i10 = a.e.API_PRIORITY_OTHER;
        if ((z10 ? ((c.a) cVarB).f14405a : Integer.MAX_VALUE) > 100) {
            k6.c cVarA = iVar.a();
            if (cVarA instanceof c.a) {
                i10 = ((c.a) cVarA).f14405a;
            }
            if (i10 > 100) {
                return true;
            }
        }
        return false;
    }

    @Override // o6.n
    public boolean b() {
        return m.f16391a.b(this.f16403a);
    }
}
