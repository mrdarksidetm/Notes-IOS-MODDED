package e;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class x {

    static final class a extends ae.s implements zd.l<View, View> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f10141a = new a();

        a() {
            super(1);
        }

        @Override // zd.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final View invoke(View view) {
            ae.r.f(view, "it");
            Object parent = view.getParent();
            if (parent instanceof View) {
                return (View) parent;
            }
            return null;
        }
    }

    static final class b extends ae.s implements zd.l<View, u> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f10142a = new b();

        b() {
            super(1);
        }

        @Override // zd.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final u invoke(View view) {
            ae.r.f(view, "it");
            Object tag = view.getTag(v.f10140b);
            if (tag instanceof u) {
                return (u) tag;
            }
            return null;
        }
    }

    public static final u a(View view) {
        ae.r.f(view, "<this>");
        return (u) ie.o.o(ie.o.t(ie.m.f(view, a.f10141a), b.f10142a));
    }

    public static final void b(View view, u uVar) {
        ae.r.f(view, "<this>");
        ae.r.f(uVar, "onBackPressedDispatcherOwner");
        view.setTag(v.f10140b, uVar);
    }
}
