package a3;

import ae.s;
import android.content.Context;
import android.view.View;
import android.view.Window;
import md.i0;
import t0.e2;
import t0.k1;
import t0.k3;
import t0.l;
import t0.o;
import t0.o2;
import t0.q;
import zd.p;

/* JADX INFO: loaded from: classes.dex */
final class d extends androidx.compose.ui.platform.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Window f392a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final k1 f393b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f394c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f395d;

    static final class a extends s implements p<l, Integer, i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f397b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i10) {
            super(2);
            this.f397b = i10;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ i0 invoke(l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return i0.f15558a;
        }

        public final void invoke(l lVar, int i10) {
            d.this.Content(lVar, e2.a(this.f397b | 1));
        }
    }

    public d(Context context, Window window) {
        super(context, null, 0, 6, null);
        this.f392a = window;
        this.f393b = k3.e(c.f389a.a(), null, 2, null);
    }

    private final p<l, Integer, i0> a() {
        return (p) this.f393b.getValue();
    }

    private final int b() {
        return ce.c.d(getContext().getResources().getConfiguration().screenHeightDp * getContext().getResources().getDisplayMetrics().density);
    }

    private final int c() {
        return ce.c.d(getContext().getResources().getConfiguration().screenWidthDp * getContext().getResources().getDisplayMetrics().density);
    }

    private final void setContent(p<? super l, ? super Integer, i0> pVar) {
        this.f393b.setValue(pVar);
    }

    @Override // androidx.compose.ui.platform.a
    public void Content(l lVar, int i10) {
        l lVarP = lVar.p(1735448596);
        if (o.I()) {
            o.U(1735448596, i10, -1, "androidx.compose.ui.window.DialogLayout.Content (AndroidDialog.android.kt:268)");
        }
        a().invoke(lVarP, 0);
        if (o.I()) {
            o.T();
        }
        o2 o2VarV = lVarP.v();
        if (o2VarV != null) {
            o2VarV.a(new a(i10));
        }
    }

    public final boolean d() {
        return this.f394c;
    }

    public Window e() {
        return this.f392a;
    }

    public final void f(q qVar, p<? super l, ? super Integer, i0> pVar) {
        setParentCompositionContext(qVar);
        setContent(pVar);
        this.f395d = true;
        createComposition();
    }

    public final void g(boolean z10) {
        this.f394c = z10;
    }

    @Override // androidx.compose.ui.platform.a
    protected boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f395d;
    }

    @Override // androidx.compose.ui.platform.a
    public void internalOnLayout$ui_release(boolean z10, int i10, int i11, int i12, int i13) {
        View childAt;
        super.internalOnLayout$ui_release(z10, i10, i11, i12, i13);
        if (this.f394c || (childAt = getChildAt(0)) == null) {
            return;
        }
        e().setLayout(childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
    }

    @Override // androidx.compose.ui.platform.a
    public void internalOnMeasure$ui_release(int i10, int i11) {
        if (!this.f394c) {
            i10 = View.MeasureSpec.makeMeasureSpec(c(), Integer.MIN_VALUE);
            i11 = View.MeasureSpec.makeMeasureSpec(b(), Integer.MIN_VALUE);
        }
        super.internalOnMeasure$ui_release(i10, i11);
    }
}
