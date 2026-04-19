package androidx.core.view;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import z.c0;

/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f3440a;

    private static class a extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected final Window f3441a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final androidx.core.view.e f3442b;

        a(Window window, androidx.core.view.e eVar) {
            this.f3441a = window;
            this.f3442b = eVar;
        }

        protected void c(int i10) {
            View decorView = this.f3441a.getDecorView();
            decorView.setSystemUiVisibility(i10 | decorView.getSystemUiVisibility());
        }

        protected void d(int i10) {
            this.f3441a.addFlags(i10);
        }

        protected void e(int i10) {
            View decorView = this.f3441a.getDecorView();
            decorView.setSystemUiVisibility((~i10) & decorView.getSystemUiVisibility());
        }

        protected void f(int i10) {
            this.f3441a.clearFlags(i10);
        }
    }

    private static class b extends a {
        b(Window window, androidx.core.view.e eVar) {
            super(window, eVar);
        }

        @Override // androidx.core.view.p.e
        public void b(boolean z10) {
            if (!z10) {
                e(8192);
                return;
            }
            f(67108864);
            d(Integer.MIN_VALUE);
            c(8192);
        }
    }

    private static class c extends b {
        c(Window window, androidx.core.view.e eVar) {
            super(window, eVar);
        }

        @Override // androidx.core.view.p.e
        public void a(boolean z10) {
            if (!z10) {
                e(16);
                return;
            }
            f(134217728);
            d(Integer.MIN_VALUE);
            c(16);
        }
    }

    private static class d extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final p f3443a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final WindowInsetsController f3444b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final androidx.core.view.e f3445c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final c0<Object, WindowInsetsController.OnControllableInsetsChangedListener> f3446d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        protected Window f3447e;

        d(Window window, p pVar, androidx.core.view.e eVar) {
            this(window.getInsetsController(), pVar, eVar);
            this.f3447e = window;
        }

        d(WindowInsetsController windowInsetsController, p pVar, androidx.core.view.e eVar) {
            this.f3446d = new c0<>();
            this.f3444b = windowInsetsController;
            this.f3443a = pVar;
            this.f3445c = eVar;
        }

        @Override // androidx.core.view.p.e
        public void a(boolean z10) {
            if (z10) {
                if (this.f3447e != null) {
                    c(16);
                }
                this.f3444b.setSystemBarsAppearance(16, 16);
            } else {
                if (this.f3447e != null) {
                    d(16);
                }
                this.f3444b.setSystemBarsAppearance(0, 16);
            }
        }

        @Override // androidx.core.view.p.e
        public void b(boolean z10) {
            if (z10) {
                if (this.f3447e != null) {
                    c(8192);
                }
                this.f3444b.setSystemBarsAppearance(8, 8);
            } else {
                if (this.f3447e != null) {
                    d(8192);
                }
                this.f3444b.setSystemBarsAppearance(0, 8);
            }
        }

        protected void c(int i10) {
            View decorView = this.f3447e.getDecorView();
            decorView.setSystemUiVisibility(i10 | decorView.getSystemUiVisibility());
        }

        protected void d(int i10) {
            View decorView = this.f3447e.getDecorView();
            decorView.setSystemUiVisibility((~i10) & decorView.getSystemUiVisibility());
        }
    }

    private static class e {
        e() {
        }

        public void a(boolean z10) {
        }

        public void b(boolean z10) {
            throw null;
        }
    }

    public p(Window window, View view) {
        androidx.core.view.e eVar = new androidx.core.view.e(view);
        int i10 = Build.VERSION.SDK_INT;
        this.f3440a = i10 >= 30 ? new d(window, this, eVar) : i10 >= 26 ? new c(window, eVar) : new b(window, eVar);
    }

    public void a(boolean z10) {
        this.f3440a.a(z10);
    }

    public void b(boolean z10) {
        this.f3440a.b(z10);
    }
}
