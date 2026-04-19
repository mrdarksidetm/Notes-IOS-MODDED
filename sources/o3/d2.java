package o3;

import android.view.View;
import android.view.ViewParent;

/* JADX INFO: loaded from: classes.dex */
public final class d2 {

    /* synthetic */ class a extends ae.o implements zd.l<ViewParent, ViewParent> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f16314a = new a();

        a() {
            super(1, ViewParent.class, "getParent", "getParent()Landroid/view/ViewParent;", 0);
        }

        @Override // zd.l
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final ViewParent invoke(ViewParent viewParent) {
            return viewParent.getParent();
        }
    }

    public static final ie.g<ViewParent> a(View view) {
        return ie.m.f(view.getParent(), a.f16314a);
    }
}
