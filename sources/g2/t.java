package g2;

/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t f11412a = new t();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final w<Boolean> f11413b = new w<>("TestTagsAsResourceId", false, a.f11415a);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f11414c = 8;

    static final class a extends ae.s implements zd.p<Boolean, Boolean, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f11415a = new a();

        a() {
            super(2);
        }

        public final Boolean a(Boolean bool, boolean z10) {
            return bool;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool, Boolean bool2) {
            return a(bool, bool2.booleanValue());
        }
    }

    private t() {
    }

    public final w<Boolean> a() {
        return f11413b;
    }
}
