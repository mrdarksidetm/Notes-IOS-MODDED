package le;

/* JADX INFO: loaded from: classes2.dex */
public enum p0 {
    DEFAULT,
    LAZY,
    ATOMIC,
    UNDISPATCHED;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15103a;

        static {
            int[] iArr = new int[p0.values().length];
            try {
                iArr[p0.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[p0.ATOMIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[p0.UNDISPATCHED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[p0.LAZY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f15103a = iArr;
        }
    }

    public final <R, T> void b(zd.p<? super R, ? super qd.d<? super T>, ? extends Object> pVar, R r10, qd.d<? super T> dVar) throws Throwable {
        int i10 = a.f15103a[ordinal()];
        if (i10 == 1) {
            re.a.d(pVar, r10, dVar, null, 4, null);
            return;
        }
        if (i10 == 2) {
            qd.f.b(pVar, r10, dVar);
        } else if (i10 == 3) {
            re.b.a(pVar, r10, dVar);
        } else if (i10 != 4) {
            throw new md.q();
        }
    }

    public final boolean c() {
        return this == LAZY;
    }
}
