package i5;

import ae.r;
import md.q;
import nd.p;

/* JADX INFO: loaded from: classes.dex */
final class f<T> extends h<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final T f12534b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f12535c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f12536d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final g f12537e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final j f12538f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final l f12539g;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f12540a;

        static {
            int[] iArr = new int[j.values().length];
            try {
                iArr[j.STRICT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[j.LOG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[j.QUIET.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f12540a = iArr;
        }
    }

    public f(T t10, String str, String str2, g gVar, j jVar) {
        r.f(t10, "value");
        r.f(str, "tag");
        r.f(str2, "message");
        r.f(gVar, "logger");
        r.f(jVar, "verificationMode");
        this.f12534b = t10;
        this.f12535c = str;
        this.f12536d = str2;
        this.f12537e = gVar;
        this.f12538f = jVar;
        l lVar = new l(b(t10, str2));
        StackTraceElement[] stackTrace = lVar.getStackTrace();
        r.e(stackTrace, "stackTrace");
        lVar.setStackTrace((StackTraceElement[]) p.H(stackTrace, 2).toArray(new StackTraceElement[0]));
        this.f12539g = lVar;
    }

    @Override // i5.h
    public T a() throws l {
        int i10 = a.f12540a[this.f12538f.ordinal()];
        if (i10 == 1) {
            throw this.f12539g;
        }
        if (i10 == 2) {
            this.f12537e.a(this.f12535c, b(this.f12534b, this.f12536d));
            return null;
        }
        if (i10 == 3) {
            return null;
        }
        throw new q();
    }

    @Override // i5.h
    public h<T> c(String str, zd.l<? super T, Boolean> lVar) {
        r.f(str, "message");
        r.f(lVar, "condition");
        return this;
    }
}
