package androidx.webkit.internal;

import android.os.Build;
import g5.l0;
import g5.z;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements z {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Set<a> f4936c = new HashSet();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f4937a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f4938b;

    /* JADX INFO: renamed from: androidx.webkit.internal.a$a, reason: collision with other inner class name */
    private static class C0116a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final Set<String> f4939a = new HashSet(Arrays.asList(l0.d().a()));
    }

    public static class b extends a {
        b(String str, String str2) {
            super(str, str2);
        }

        @Override // androidx.webkit.internal.a
        public final boolean c() {
            return true;
        }
    }

    public static class c extends a {
        c(String str, String str2) {
            super(str, str2);
        }

        @Override // androidx.webkit.internal.a
        public final boolean c() {
            return true;
        }
    }

    public static class d extends a {
        d(String str, String str2) {
            super(str, str2);
        }

        @Override // androidx.webkit.internal.a
        public final boolean c() {
            return false;
        }
    }

    public static class e extends a {
        e(String str, String str2) {
            super(str, str2);
        }

        @Override // androidx.webkit.internal.a
        public final boolean c() {
            return Build.VERSION.SDK_INT >= 26;
        }
    }

    public static class f extends a {
        f(String str, String str2) {
            super(str, str2);
        }

        @Override // androidx.webkit.internal.a
        public final boolean c() {
            return Build.VERSION.SDK_INT >= 27;
        }
    }

    public static class g extends a {
        g(String str, String str2) {
            super(str, str2);
        }

        @Override // androidx.webkit.internal.a
        public final boolean c() {
            return Build.VERSION.SDK_INT >= 28;
        }
    }

    public static class h extends a {
        h(String str, String str2) {
            super(str, str2);
        }

        @Override // androidx.webkit.internal.a
        public final boolean c() {
            return Build.VERSION.SDK_INT >= 29;
        }
    }

    public static class i extends a {
        i(String str, String str2) {
            super(str, str2);
        }

        @Override // androidx.webkit.internal.a
        public final boolean c() {
            return Build.VERSION.SDK_INT >= 33;
        }
    }

    a(String str, String str2) {
        this.f4937a = str;
        this.f4938b = str2;
        f4936c.add(this);
    }

    public static Set<a> e() {
        return Collections.unmodifiableSet(f4936c);
    }

    @Override // g5.z
    public boolean a() {
        return c() || d();
    }

    @Override // g5.z
    public String b() {
        return this.f4937a;
    }

    public abstract boolean c();

    public boolean d() {
        return nf.a.b(C0116a.f4939a, this.f4938b);
    }
}
