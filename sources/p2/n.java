package p2;

import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.InputMethodManager;

/* JADX INFO: loaded from: classes.dex */
public final class n implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View f18165a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final md.l f18166b = md.n.a(md.p.f15571c, new a());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final androidx.core.view.e f18167c;

    static final class a extends ae.s implements zd.a<InputMethodManager> {
        a() {
            super(0);
        }

        @Override // zd.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InputMethodManager invoke() {
            Object systemService = n.this.f18165a.getContext().getSystemService("input_method");
            ae.r.d(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            return (InputMethodManager) systemService;
        }
    }

    public n(View view) {
        this.f18165a = view;
        this.f18167c = new androidx.core.view.e(view);
    }

    private final InputMethodManager b() {
        return (InputMethodManager) this.f18166b.getValue();
    }

    @Override // p2.m
    public boolean isActive() {
        return b().isActive(this.f18165a);
    }

    @Override // p2.m
    public void updateCursorAnchorInfo(CursorAnchorInfo cursorAnchorInfo) {
        b().updateCursorAnchorInfo(this.f18165a, cursorAnchorInfo);
    }
}
