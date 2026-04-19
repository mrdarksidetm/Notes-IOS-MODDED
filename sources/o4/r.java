package o4;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class r {

    static final class a extends ae.s implements zd.l<View, View> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f16357a = new a();

        a() {
            super(1);
        }

        @Override // zd.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final View invoke(View view) {
            ae.r.f(view, "currentView");
            Object parent = view.getParent();
            if (parent instanceof View) {
                return (View) parent;
            }
            return null;
        }
    }

    static final class b extends ae.s implements zd.l<View, e> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f16358a = new b();

        b() {
            super(1);
        }

        @Override // zd.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final e invoke(View view) {
            ae.r.f(view, "viewParent");
            Object tag = view.getTag(p4.a.f18224a);
            if (tag instanceof e) {
                return (e) tag;
            }
            return null;
        }
    }

    public static final e a(View view) {
        ae.r.f(view, "<this>");
        return (e) ie.o.o(ie.o.t(ie.m.f(view, a.f16357a), b.f16358a));
    }

    public static final void b(View view, e eVar) {
        ae.r.f(view, "<this>");
        view.setTag(p4.a.f18224a, eVar);
    }
}
