package x4;

import ae.r;
import ae.s;
import android.view.View;
import ie.m;
import ie.o;
import zd.l;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    static final class a extends s implements l<View, View> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f22974a = new a();

        a() {
            super(1);
        }

        @Override // zd.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final View invoke(View view) {
            r.f(view, "view");
            Object parent = view.getParent();
            if (parent instanceof View) {
                return (View) parent;
            }
            return null;
        }
    }

    static final class b extends s implements l<View, f> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f22975a = new b();

        b() {
            super(1);
        }

        @Override // zd.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final f invoke(View view) {
            r.f(view, "view");
            Object tag = view.getTag(x4.a.f22958a);
            if (tag instanceof f) {
                return (f) tag;
            }
            return null;
        }
    }

    public static final f a(View view) {
        r.f(view, "<this>");
        return (f) o.o(o.t(m.f(view, a.f22974a), b.f22975a));
    }

    public static final void b(View view, f fVar) {
        r.f(view, "<this>");
        view.setTag(x4.a.f22958a, fVar);
    }
}
