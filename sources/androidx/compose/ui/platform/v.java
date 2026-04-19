package androidx.compose.ui.platform;

import android.content.Context;
import android.util.AttributeSet;
import md.i0;
import t0.e2;
import t0.k1;
import t0.k3;
import t0.o2;

/* JADX INFO: loaded from: classes.dex */
public final class v extends androidx.compose.ui.platform.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k1<zd.p<t0.l, Integer, i0>> f3098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f3099b;

    static final class a extends ae.s implements zd.p<t0.l, Integer, i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f3101b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i10) {
            super(2);
            this.f3101b = i10;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ i0 invoke(t0.l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return i0.f15558a;
        }

        public final void invoke(t0.l lVar, int i10) {
            v.this.Content(lVar, e2.a(this.f3101b | 1));
        }
    }

    public v(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f3098a = k3.e(null, null, 2, null);
    }

    public /* synthetic */ v(Context context, AttributeSet attributeSet, int i10, int i11, ae.j jVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    protected static /* synthetic */ void getShouldCreateCompositionOnAttachedToWindow$annotations() {
    }

    @Override // androidx.compose.ui.platform.a
    public void Content(t0.l lVar, int i10) {
        t0.l lVarP = lVar.p(420213850);
        if (t0.o.I()) {
            t0.o.U(420213850, i10, -1, "androidx.compose.ui.platform.ComposeView.Content (ComposeView.android.kt:426)");
        }
        zd.p<t0.l, Integer, i0> value = this.f3098a.getValue();
        if (value != null) {
            value.invoke(lVarP, 0);
        }
        if (t0.o.I()) {
            t0.o.T();
        }
        o2 o2VarV = lVarP.v();
        if (o2VarV != null) {
            o2VarV.a(new a(i10));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return v.class.getName();
    }

    @Override // androidx.compose.ui.platform.a
    protected boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f3099b;
    }

    public final void setContent(zd.p<? super t0.l, ? super Integer, i0> pVar) {
        this.f3099b = true;
        this.f3098a.setValue(pVar);
        if (isAttachedToWindow()) {
            createComposition();
        }
    }
}
