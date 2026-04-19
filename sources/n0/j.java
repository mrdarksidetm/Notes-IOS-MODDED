package n0;

import i2.d0;
import y1.r;

/* JADX INFO: loaded from: classes.dex */
public class j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f15673c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f15674d = 8;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final j f15675e = new j(null, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r f15676a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d0 f15677b;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(ae.j jVar) {
            this();
        }

        public final j a() {
            return j.f15675e;
        }
    }

    public j(r rVar, d0 d0Var) {
        this.f15676a = rVar;
        this.f15677b = d0Var;
    }

    public static /* synthetic */ j c(j jVar, r rVar, d0 d0Var, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: copy");
        }
        if ((i10 & 1) != 0) {
            rVar = jVar.f15676a;
        }
        if ((i10 & 2) != 0) {
            d0Var = jVar.f15677b;
        }
        return jVar.b(rVar, d0Var);
    }

    public final j b(r rVar, d0 d0Var) {
        return new j(rVar, d0Var);
    }

    public final r d() {
        return this.f15676a;
    }

    public final d0 e() {
        return this.f15677b;
    }
}
