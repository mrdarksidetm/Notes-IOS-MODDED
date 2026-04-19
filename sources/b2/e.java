package b2;

import android.content.ClipDescription;
import android.content.ClipboardManager;
import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class e implements i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ClipboardManager f5239a;

    public e(ClipboardManager clipboardManager) {
        this.f5239a = clipboardManager;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public e(Context context) {
        Object systemService = context.getSystemService("clipboard");
        ae.r.d(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        this((ClipboardManager) systemService);
    }

    public boolean a() {
        ClipDescription primaryClipDescription = this.f5239a.getPrimaryClipDescription();
        if (primaryClipDescription != null) {
            return primaryClipDescription.hasMimeType("text/*");
        }
        return false;
    }
}
