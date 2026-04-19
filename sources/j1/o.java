package j1;

/* JADX INFO: loaded from: classes.dex */
public enum o implements n {
    Active,
    ActiveParent,
    Captured,
    Inactive;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f13818a;

        static {
            int[] iArr = new int[o.values().length];
            try {
                iArr[o.Captured.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[o.Active.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[o.ActiveParent.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[o.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f13818a = iArr;
        }
    }

    @Override // j1.n
    public boolean a() {
        int i10 = a.f13818a[ordinal()];
        if (i10 == 1 || i10 == 2) {
            return true;
        }
        if (i10 == 3 || i10 == 4) {
            return false;
        }
        throw new md.q();
    }

    public boolean c() {
        int i10 = a.f13818a[ordinal()];
        if (i10 == 1 || i10 == 2 || i10 == 3) {
            return true;
        }
        if (i10 == 4) {
            return false;
        }
        throw new md.q();
    }
}
