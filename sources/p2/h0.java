package p2;

import android.view.Choreographer;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import v1.n0;

/* JADX INFO: loaded from: classes.dex */
public final class h0 implements z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View f18125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final m f18126b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Executor f18127c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f18128d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private zd.l<? super List<? extends h>, md.i0> f18129e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private zd.l<? super j, md.i0> f18130f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private e0 f18131g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private k f18132h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private List<WeakReference<a0>> f18133i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final md.l f18134j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final p2.e f18135k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final v0.d<a> f18136l;

    private enum a {
        StartInput,
        StopInput,
        ShowKeyboard,
        HideKeyboard
    }

    static final class b extends ae.s implements zd.a<BaseInputConnection> {
        b() {
            super(0);
        }

        @Override // zd.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final BaseInputConnection invoke() {
            return new BaseInputConnection(h0.this.h(), false);
        }
    }

    public static final class c implements l {
        c() {
        }

        @Override // p2.l
        public void a(KeyEvent keyEvent) {
            h0.this.g().sendKeyEvent(keyEvent);
        }

        @Override // p2.l
        public void b(a0 a0Var) {
            int size = h0.this.f18133i.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (ae.r.b(((WeakReference) h0.this.f18133i.get(i10)).get(), a0Var)) {
                    h0.this.f18133i.remove(i10);
                    return;
                }
            }
        }

        @Override // p2.l
        public void c(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
            h0.this.f18135k.a(z10, z11, z12, z13, z14, z15);
        }

        @Override // p2.l
        public void d(int i10) {
            h0.this.f18130f.invoke(j.i(i10));
        }

        @Override // p2.l
        public void e(List<? extends h> list) {
            h0.this.f18129e.invoke(list);
        }
    }

    static final class d extends ae.s implements zd.l<List<? extends h>, md.i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f18144a = new d();

        d() {
            super(1);
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ md.i0 invoke(List<? extends h> list) {
            invoke2(list);
            return md.i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(List<? extends h> list) {
        }
    }

    static final class e extends ae.s implements zd.l<j, md.i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f18145a = new e();

        e() {
            super(1);
        }

        public final void a(int i10) {
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ md.i0 invoke(j jVar) {
            a(jVar.o());
            return md.i0.f15558a;
        }
    }

    public h0(View view, n0 n0Var) {
        this(view, n0Var, new n(view), null, 8, null);
    }

    public h0(View view, n0 n0Var, m mVar, Executor executor) {
        this.f18125a = view;
        this.f18126b = mVar;
        this.f18127c = executor;
        this.f18129e = d.f18144a;
        this.f18130f = e.f18145a;
        this.f18131g = new e0("", i2.e0.f12353b.a(), (i2.e0) null, 4, (ae.j) null);
        this.f18132h = k.f18158f.a();
        this.f18133i = new ArrayList();
        this.f18134j = md.n.a(md.p.f15571c, new b());
        this.f18135k = new p2.e(n0Var, mVar);
        this.f18136l = new v0.d<>(new a[16], 0);
    }

    public /* synthetic */ h0(View view, n0 n0Var, m mVar, Executor executor, int i10, ae.j jVar) {
        this(view, n0Var, mVar, (i10 & 8) != 0 ? k0.d(Choreographer.getInstance()) : executor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BaseInputConnection g() {
        return (BaseInputConnection) this.f18134j.getValue();
    }

    public final InputConnection f(EditorInfo editorInfo) {
        if (!this.f18128d) {
            return null;
        }
        k0.h(editorInfo, this.f18132h, this.f18131g);
        k0.i(editorInfo);
        a0 a0Var = new a0(this.f18131g, new c(), this.f18132h.b());
        this.f18133i.add(new WeakReference<>(a0Var));
        return a0Var;
    }

    public final View h() {
        return this.f18125a;
    }

    public final boolean i() {
        return this.f18128d;
    }
}
