package md;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes2.dex */
public class n {

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15568a;

        static {
            int[] iArr = new int[p.values().length];
            try {
                iArr[p.f15569a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[p.f15570b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[p.f15571c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f15568a = iArr;
        }
    }

    public static <T> l<T> a(p pVar, zd.a<? extends T> aVar) {
        ae.r.f(pVar, "mode");
        ae.r.f(aVar, "initializer");
        int i10 = a.f15568a[pVar.ordinal()];
        if (i10 == 1) {
            return new w(aVar, null, 2, null);
        }
        if (i10 == 2) {
            return new v(aVar);
        }
        if (i10 == 3) {
            return new j0(aVar);
        }
        throw new q();
    }

    public static <T> l<T> b(zd.a<? extends T> aVar) {
        ae.r.f(aVar, "initializer");
        return new w(aVar, null, 2, null);
    }
}
