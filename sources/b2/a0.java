package b2;

import android.view.ActionMode;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class a0 implements r1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View f5175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ActionMode f5176b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final d2.a f5177c = new d2.a(new a(), null, null, null, null, null, 62, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private s1 f5178d = s1.Hidden;

    static final class a extends ae.s implements zd.a<md.i0> {
        a() {
            super(0);
        }

        @Override // zd.a
        public /* bridge */ /* synthetic */ md.i0 invoke() {
            invoke2();
            return md.i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            a0.this.f5176b = null;
        }
    }

    public a0(View view) {
        this.f5175a = view;
    }
}
