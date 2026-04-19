package b2;

import android.content.Context;
import android.view.accessibility.AccessibilityManager;

/* JADX INFO: loaded from: classes.dex */
public final class d implements b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final a f5208b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f5209c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AccessibilityManager f5210a;

    private static final class a {
        private a() {
        }

        public /* synthetic */ a(ae.j jVar) {
            this();
        }
    }

    public d(Context context) {
        Object systemService = context.getSystemService("accessibility");
        ae.r.d(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        this.f5210a = (AccessibilityManager) systemService;
    }
}
