package a3;

import ae.s;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import t0.a2;
import t0.v;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final a2<String> f387a = v.d(null, a.f388a, 1, null);

    static final class a extends s implements zd.a<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f388a = new a();

        a() {
            super(0);
        }

        @Override // zd.a
        public final String invoke() {
            return "DEFAULT_TEST_TAG";
        }
    }

    public static final boolean a(View view) {
        ViewGroup.LayoutParams layoutParams = view.getRootView().getLayoutParams();
        WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
        return (layoutParams2 == null || (layoutParams2.flags & 8192) == 0) ? false : true;
    }
}
