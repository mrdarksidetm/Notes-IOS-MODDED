package a2;

/* JADX INFO: loaded from: classes.dex */
final class e implements androidx.compose.ui.focus.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f63a = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Boolean f64b;

    private e() {
    }

    public final boolean a() {
        return f64b != null;
    }

    public final void b() {
        f64b = null;
    }

    @Override // androidx.compose.ui.focus.d
    public boolean g() {
        Boolean bool = f64b;
        if (bool != null) {
            return bool.booleanValue();
        }
        throw new IllegalStateException("canFocus is read before it is written".toString());
    }

    @Override // androidx.compose.ui.focus.d
    public void n(boolean z10) {
        f64b = Boolean.valueOf(z10);
    }
}
