package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.h0;

/* JADX INFO: loaded from: classes.dex */
final class l extends h implements PopupWindow.OnDismissListener, View.OnKeyListener {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final int f1304v = j.g.f13445m;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f1305b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e f1306c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final d f1307d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f1308e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f1309f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f1310g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f1311h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final h0 f1312i;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private PopupWindow.OnDismissListener f1315l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private View f1316m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    View f1317n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private j.a f1318o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    ViewTreeObserver f1319p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f1320q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f1321r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f1322s;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f1324u;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final ViewTreeObserver.OnGlobalLayoutListener f1313j = new a();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final View.OnAttachStateChangeListener f1314k = new b();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f1323t = 0;

    class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!l.this.a() || l.this.f1312i.x()) {
                return;
            }
            View view = l.this.f1317n;
            if (view == null || !view.isShown()) {
                l.this.dismiss();
            } else {
                l.this.f1312i.b();
            }
        }
    }

    class b implements View.OnAttachStateChangeListener {
        b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = l.this.f1319p;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    l.this.f1319p = view.getViewTreeObserver();
                }
                l lVar = l.this;
                lVar.f1319p.removeGlobalOnLayoutListener(lVar.f1313j);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public l(Context context, e eVar, View view, int i10, int i11, boolean z10) {
        this.f1305b = context;
        this.f1306c = eVar;
        this.f1308e = z10;
        this.f1307d = new d(eVar, LayoutInflater.from(context), z10, f1304v);
        this.f1310g = i10;
        this.f1311h = i11;
        Resources resources = context.getResources();
        this.f1309f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(j.d.f13369d));
        this.f1316m = view;
        this.f1312i = new h0(context, null, i10, i11);
        eVar.c(this, context);
    }

    private boolean z() {
        View view;
        if (a()) {
            return true;
        }
        if (this.f1320q || (view = this.f1316m) == null) {
            return false;
        }
        this.f1317n = view;
        this.f1312i.G(this);
        this.f1312i.H(this);
        this.f1312i.F(true);
        View view2 = this.f1317n;
        boolean z10 = this.f1319p == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f1319p = viewTreeObserver;
        if (z10) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f1313j);
        }
        view2.addOnAttachStateChangeListener(this.f1314k);
        this.f1312i.z(view2);
        this.f1312i.C(this.f1323t);
        if (!this.f1321r) {
            this.f1322s = h.o(this.f1307d, null, this.f1305b, this.f1309f);
            this.f1321r = true;
        }
        this.f1312i.B(this.f1322s);
        this.f1312i.E(2);
        this.f1312i.D(n());
        this.f1312i.b();
        ListView listViewJ = this.f1312i.j();
        listViewJ.setOnKeyListener(this);
        if (this.f1324u && this.f1306c.x() != null) {
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f1305b).inflate(j.g.f13444l, (ViewGroup) listViewJ, false);
            TextView textView = (TextView) frameLayout.findViewById(R.id.title);
            if (textView != null) {
                textView.setText(this.f1306c.x());
            }
            frameLayout.setEnabled(false);
            listViewJ.addHeaderView(frameLayout, null, false);
        }
        this.f1312i.p(this.f1307d);
        this.f1312i.b();
        return true;
    }

    @Override // q.e
    public boolean a() {
        return !this.f1320q && this.f1312i.a();
    }

    @Override // q.e
    public void b() {
        if (!z()) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public void c(e eVar, boolean z10) {
        if (eVar != this.f1306c) {
            return;
        }
        dismiss();
        j.a aVar = this.f1318o;
        if (aVar != null) {
            aVar.c(eVar, z10);
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public void d(boolean z10) {
        this.f1321r = false;
        d dVar = this.f1307d;
        if (dVar != null) {
            dVar.notifyDataSetChanged();
        }
    }

    @Override // q.e
    public void dismiss() {
        if (a()) {
            this.f1312i.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean e() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public void h(j.a aVar) {
        this.f1318o = aVar;
    }

    @Override // q.e
    public ListView j() {
        return this.f1312i.j();
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean k(m mVar) {
        if (mVar.hasVisibleItems()) {
            i iVar = new i(this.f1305b, mVar, this.f1317n, this.f1308e, this.f1310g, this.f1311h);
            iVar.j(this.f1318o);
            iVar.g(h.x(mVar));
            iVar.i(this.f1315l);
            this.f1315l = null;
            this.f1306c.e(false);
            int iF = this.f1312i.f();
            int iO = this.f1312i.o();
            if ((Gravity.getAbsoluteGravity(this.f1323t, androidx.core.view.h.t(this.f1316m)) & 7) == 5) {
                iF += this.f1316m.getWidth();
            }
            if (iVar.n(iF, iO)) {
                j.a aVar = this.f1318o;
                if (aVar == null) {
                    return true;
                }
                aVar.d(mVar);
                return true;
            }
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.h
    public void l(e eVar) {
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        this.f1320q = true;
        this.f1306c.close();
        ViewTreeObserver viewTreeObserver = this.f1319p;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f1319p = this.f1317n.getViewTreeObserver();
            }
            this.f1319p.removeGlobalOnLayoutListener(this.f1313j);
            this.f1319p = null;
        }
        this.f1317n.removeOnAttachStateChangeListener(this.f1314k);
        PopupWindow.OnDismissListener onDismissListener = this.f1315l;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i10, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i10 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // androidx.appcompat.view.menu.h
    public void p(View view) {
        this.f1316m = view;
    }

    @Override // androidx.appcompat.view.menu.h
    public void r(boolean z10) {
        this.f1307d.d(z10);
    }

    @Override // androidx.appcompat.view.menu.h
    public void s(int i10) {
        this.f1323t = i10;
    }

    @Override // androidx.appcompat.view.menu.h
    public void t(int i10) {
        this.f1312i.g(i10);
    }

    @Override // androidx.appcompat.view.menu.h
    public void u(PopupWindow.OnDismissListener onDismissListener) {
        this.f1315l = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.h
    public void v(boolean z10) {
        this.f1324u = z10;
    }

    @Override // androidx.appcompat.view.menu.h
    public void w(int i10) {
        this.f1312i.l(i10);
    }
}
