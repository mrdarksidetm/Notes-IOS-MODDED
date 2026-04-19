package androidx.compose.ui.platform;

import android.view.accessibility.AccessibilityNodeInfo;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f2923a = new h();

    private h() {
    }

    public final void a(AccessibilityNodeInfo accessibilityNodeInfo, List<String> list) {
        accessibilityNodeInfo.setAvailableExtraData(list);
    }
}
