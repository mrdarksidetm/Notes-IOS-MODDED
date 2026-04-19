package i4;

import android.text.Editable;

/* JADX INFO: loaded from: classes.dex */
final class b extends Editable.Factory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f12495a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile Editable.Factory f12496b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Class<?> f12497c;

    private b() {
        try {
            f12497c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, b.class.getClassLoader());
        } catch (Throwable unused) {
        }
    }

    public static Editable.Factory getInstance() {
        if (f12496b == null) {
            synchronized (f12495a) {
                if (f12496b == null) {
                    f12496b = new b();
                }
            }
        }
        return f12496b;
    }

    @Override // android.text.Editable.Factory
    public Editable newEditable(CharSequence charSequence) {
        Class<?> cls = f12497c;
        return cls != null ? g4.b.c(cls, charSequence) : super.newEditable(charSequence);
    }
}
