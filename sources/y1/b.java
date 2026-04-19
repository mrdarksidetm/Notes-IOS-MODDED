package y1;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final k f23198a = new k(a.f23200a);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final k f23199b = new k(C0483b.f23201a);

    /* synthetic */ class a extends ae.o implements zd.p<Integer, Integer, Integer> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f23200a = new a();

        a() {
            super(2, ce.a.class, "min", "min(II)I", 1);
        }

        public final Integer d(int i10, int i11) {
            return Integer.valueOf(Math.min(i10, i11));
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ Integer invoke(Integer num, Integer num2) {
            return d(num.intValue(), num2.intValue());
        }
    }

    /* JADX INFO: renamed from: y1.b$b, reason: collision with other inner class name */
    /* synthetic */ class C0483b extends ae.o implements zd.p<Integer, Integer, Integer> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0483b f23201a = new C0483b();

        C0483b() {
            super(2, ce.a.class, "max", "max(II)I", 1);
        }

        public final Integer d(int i10, int i11) {
            return Integer.valueOf(Math.max(i10, i11));
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ Integer invoke(Integer num, Integer num2) {
            return d(num.intValue(), num2.intValue());
        }
    }

    public static final k a() {
        return f23198a;
    }

    public static final k b() {
        return f23199b;
    }

    public static final int c(y1.a aVar, int i10, int i11) {
        return aVar.a().invoke(Integer.valueOf(i10), Integer.valueOf(i11)).intValue();
    }
}
