package androidx.compose.ui.focus;

import ae.s;

/* JADX INFO: loaded from: classes.dex */
public interface d {

    static final class a extends s implements zd.l<androidx.compose.ui.focus.b, f> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f2708a = new a();

        a() {
            super(1);
        }

        public final f a(int i10) {
            return f.f2723b.b();
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ f invoke(androidx.compose.ui.focus.b bVar) {
            return a(bVar.o());
        }
    }

    static final class b extends s implements zd.l<androidx.compose.ui.focus.b, f> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f2709a = new b();

        b() {
            super(1);
        }

        public final f a(int i10) {
            return f.f2723b.b();
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ f invoke(androidx.compose.ui.focus.b bVar) {
            return a(bVar.o());
        }
    }

    default f c() {
        return f.f2723b.b();
    }

    default f d() {
        return f.f2723b.b();
    }

    default f f() {
        return f.f2723b.b();
    }

    boolean g();

    default f h() {
        return f.f2723b.b();
    }

    default f i() {
        return f.f2723b.b();
    }

    default f j() {
        return f.f2723b.b();
    }

    default zd.l<androidx.compose.ui.focus.b, f> k() {
        return b.f2709a;
    }

    default f l() {
        return f.f2723b.b();
    }

    default f m() {
        return f.f2723b.b();
    }

    void n(boolean z10);

    default zd.l<androidx.compose.ui.focus.b, f> o() {
        return a.f2708a;
    }
}
