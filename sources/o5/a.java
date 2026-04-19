package o5;

import ae.j;
import ae.r;
import androidx.window.extensions.layout.WindowLayoutComponent;

/* JADX INFO: loaded from: classes.dex */
public final class a implements n5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0369a f16361a = new C0369a(null);

    /* JADX INFO: renamed from: o5.a$a, reason: collision with other inner class name */
    public static final class C0369a {
        private C0369a() {
        }

        public /* synthetic */ C0369a(j jVar) {
            this();
        }

        public final n5.a a(WindowLayoutComponent windowLayoutComponent, i5.d dVar) {
            r.f(windowLayoutComponent, "component");
            r.f(dVar, "adapter");
            int iA = i5.e.f12532a.a();
            return iA >= 2 ? new e(windowLayoutComponent) : iA == 1 ? new d(windowLayoutComponent, dVar) : new c();
        }
    }
}
