package p2;

import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.EditorBoundsInfo;
import l1.l1;

/* JADX INFO: loaded from: classes.dex */
final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f18085a = new b();

    private b() {
    }

    public static final CursorAnchorInfo.Builder a(CursorAnchorInfo.Builder builder, k1.h hVar) {
        return builder.setEditorBoundsInfo(new EditorBoundsInfo.Builder().setEditorBounds(l1.a(hVar)).setHandwritingBounds(l1.a(hVar)).build());
    }
}
