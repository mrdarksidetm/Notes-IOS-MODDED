package o4;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class s {

    static final class a extends ae.s implements zd.l<View, View> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f16359a = new a();

        a() {
            super(1);
        }

        @Override // zd.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final View invoke(View view) {
            ae.r.f(view, "view");
            Object parent = view.getParent();
            if (parent instanceof View) {
                return (View) parent;
            }
            return null;
        }
    }

    static final class b extends ae.s implements zd.l<View, q> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f16360a = new b();

        b() {
            super(1);
        }

        @Override // zd.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final q invoke(View view) {
            ae.r.f(view, "view");
            Object tag = view.getTag(q4.c.f18980a);
            if (tag instanceof q) {
                return (q) tag;
            }
            return null;
        }
    }

    public static final q a(View view) {
        ae.r.f(view, "<this>");
        return (q) ie.o.o(ie.o.t(ie.m.f(view, a.f16359a), b.f16360a));
    }

    public static final void b(View view, q qVar) {
        ae.r.f(view, "<this>");
        view.setTag(q4.c.f18980a, qVar);
    }
}
