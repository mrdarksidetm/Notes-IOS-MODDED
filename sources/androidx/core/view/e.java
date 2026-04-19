package androidx.core.view;

import android.os.Build;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f3341a;

    private static class a extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final View f3342a;

        a(View view) {
            this.f3342a = view;
        }
    }

    private static class b extends a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private View f3343b;

        b(View view) {
            super(view);
            this.f3343b = view;
        }
    }

    private static class c {
        c() {
        }
    }

    public e(View view) {
        this.f3341a = Build.VERSION.SDK_INT >= 30 ? new b(view) : new a(view);
    }
}
