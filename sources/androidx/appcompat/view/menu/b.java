package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.h0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import r.r;

/* JADX INFO: loaded from: classes.dex */
final class b extends h implements View.OnKeyListener, PopupWindow.OnDismissListener {
    private static final int B = j.g.f13437e;
    boolean A;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f1181b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f1182c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f1183d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f1184e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f1185f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final Handler f1186g;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private View f1194o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    View f1195p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f1197r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f1198s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f1199t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f1200u;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f1202w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private j.a f1203x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    ViewTreeObserver f1204y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private PopupWindow.OnDismissListener f1205z;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List<e> f1187h = new ArrayList();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final List<d> f1188i = new ArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final ViewTreeObserver.OnGlobalLayoutListener f1189j = new a();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final View.OnAttachStateChangeListener f1190k = new ViewOnAttachStateChangeListenerC0029b();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final r f1191l = new c();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f1192m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f1193n = 0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f1201v = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f1196q = D();

    class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!b.this.a() || b.this.f1188i.size() <= 0 || b.this.f1188i.get(0).f1213a.x()) {
                return;
            }
            View view = b.this.f1195p;
            if (view == null || !view.isShown()) {
                b.this.dismiss();
                return;
            }
            Iterator<d> it = b.this.f1188i.iterator();
            while (it.hasNext()) {
                it.next().f1213a.b();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.view.menu.b$b, reason: collision with other inner class name */
    class ViewOnAttachStateChangeListenerC0029b implements View.OnAttachStateChangeListener {
        ViewOnAttachStateChangeListenerC0029b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = b.this.f1204y;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    b.this.f1204y = view.getViewTreeObserver();
                }
                b bVar = b.this;
                bVar.f1204y.removeGlobalOnLayoutListener(bVar.f1189j);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    class c implements r {

        class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ d f1209a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ MenuItem f1210b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ e f1211c;

            a(d dVar, MenuItem menuItem, e eVar) {
                this.f1209a = dVar;
                this.f1210b = menuItem;
                this.f1211c = eVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                d dVar = this.f1209a;
                if (dVar != null) {
                    b.this.A = true;
                    dVar.f1214b.e(false);
                    b.this.A = false;
                }
                if (this.f1210b.isEnabled() && this.f1210b.hasSubMenu()) {
                    this.f1211c.L(this.f1210b, 4);
                }
            }
        }

        c() {
        }

        @Override // r.r
        public void c(e eVar, MenuItem menuItem) {
            b.this.f1186g.removeCallbacksAndMessages(null);
            int size = b.this.f1188i.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    i10 = -1;
                    break;
                } else if (eVar == b.this.f1188i.get(i10).f1214b) {
                    break;
                } else {
                    i10++;
                }
            }
            if (i10 == -1) {
                return;
            }
            int i11 = i10 + 1;
            b.this.f1186g.postAtTime(new a(i11 < b.this.f1188i.size() ? b.this.f1188i.get(i11) : null, menuItem, eVar), eVar, SystemClock.uptimeMillis() + 200);
        }

        @Override // r.r
        public void d(e eVar, MenuItem menuItem) {
            b.this.f1186g.removeCallbacksAndMessages(eVar);
        }
    }

    private static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final h0 f1213a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final e f1214b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f1215c;

        public d(h0 h0Var, e eVar, int i10) {
            this.f1213a = h0Var;
            this.f1214b = eVar;
            this.f1215c = i10;
        }

        public ListView a() {
            return this.f1213a.j();
        }
    }

    public b(Context context, View view, int i10, int i11, boolean z10) {
        this.f1181b = context;
        this.f1194o = view;
        this.f1183d = i10;
        this.f1184e = i11;
        this.f1185f = z10;
        Resources resources = context.getResources();
        this.f1182c = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(j.d.f13369d));
        this.f1186g = new Handler();
    }

    private int A(e eVar) {
        int size = this.f1188i.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (eVar == this.f1188i.get(i10).f1214b) {
                return i10;
            }
        }
        return -1;
    }

    private MenuItem B(e eVar, e eVar2) {
        int size = eVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = eVar.getItem(i10);
            if (item.hasSubMenu() && eVar2 == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }

    private View C(d dVar, e eVar) {
        androidx.appcompat.view.menu.d dVar2;
        int headersCount;
        int firstVisiblePosition;
        MenuItem menuItemB = B(dVar.f1214b, eVar);
        if (menuItemB == null) {
            return null;
        }
        ListView listViewA = dVar.a();
        ListAdapter adapter = listViewA.getAdapter();
        int i10 = 0;
        if (adapter instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
            headersCount = headerViewListAdapter.getHeadersCount();
            dVar2 = (androidx.appcompat.view.menu.d) headerViewListAdapter.getWrappedAdapter();
        } else {
            dVar2 = (androidx.appcompat.view.menu.d) adapter;
            headersCount = 0;
        }
        int count = dVar2.getCount();
        while (true) {
            if (i10 >= count) {
                i10 = -1;
                break;
            }
            if (menuItemB == dVar2.getItem(i10)) {
                break;
            }
            i10++;
        }
        if (i10 != -1 && (firstVisiblePosition = (i10 + headersCount) - listViewA.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < listViewA.getChildCount()) {
            return listViewA.getChildAt(firstVisiblePosition);
        }
        return null;
    }

    private int D() {
        return androidx.core.view.h.t(this.f1194o) == 1 ? 0 : 1;
    }

    private int E(int i10) {
        List<d> list = this.f1188i;
        ListView listViewA = list.get(list.size() - 1).a();
        int[] iArr = new int[2];
        listViewA.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        this.f1195p.getWindowVisibleDisplayFrame(rect);
        return this.f1196q == 1 ? (iArr[0] + listViewA.getWidth()) + i10 > rect.right ? 0 : 1 : iArr[0] - i10 < 0 ? 1 : 0;
    }

    private void F(e eVar) {
        d dVar;
        View viewC;
        int i10;
        int i11;
        int i12;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f1181b);
        androidx.appcompat.view.menu.d dVar2 = new androidx.appcompat.view.menu.d(eVar, layoutInflaterFrom, this.f1185f, B);
        if (!a() && this.f1201v) {
            dVar2.d(true);
        } else if (a()) {
            dVar2.d(h.x(eVar));
        }
        int iO = h.o(dVar2, null, this.f1181b, this.f1182c);
        h0 h0VarZ = z();
        h0VarZ.p(dVar2);
        h0VarZ.B(iO);
        h0VarZ.C(this.f1193n);
        if (this.f1188i.size() > 0) {
            List<d> list = this.f1188i;
            dVar = list.get(list.size() - 1);
            viewC = C(dVar, eVar);
        } else {
            dVar = null;
            viewC = null;
        }
        if (viewC != null) {
            h0VarZ.Q(false);
            h0VarZ.N(null);
            int iE = E(iO);
            boolean z10 = iE == 1;
            this.f1196q = iE;
            if (Build.VERSION.SDK_INT >= 26) {
                h0VarZ.z(viewC);
                i11 = 0;
                i10 = 0;
            } else {
                int[] iArr = new int[2];
                this.f1194o.getLocationOnScreen(iArr);
                int[] iArr2 = new int[2];
                viewC.getLocationOnScreen(iArr2);
                if ((this.f1193n & 7) == 5) {
                    iArr[0] = iArr[0] + this.f1194o.getWidth();
                    iArr2[0] = iArr2[0] + viewC.getWidth();
                }
                i10 = iArr2[0] - iArr[0];
                i11 = iArr2[1] - iArr[1];
            }
            if ((this.f1193n & 5) == 5) {
                if (!z10) {
                    iO = viewC.getWidth();
                    i12 = i10 - iO;
                }
                i12 = i10 + iO;
            } else {
                if (z10) {
                    iO = viewC.getWidth();
                    i12 = i10 + iO;
                }
                i12 = i10 - iO;
            }
            h0VarZ.g(i12);
            h0VarZ.I(true);
            h0VarZ.l(i11);
        } else {
            if (this.f1197r) {
                h0VarZ.g(this.f1199t);
            }
            if (this.f1198s) {
                h0VarZ.l(this.f1200u);
            }
            h0VarZ.D(n());
        }
        this.f1188i.add(new d(h0VarZ, eVar, this.f1196q));
        h0VarZ.b();
        ListView listViewJ = h0VarZ.j();
        listViewJ.setOnKeyListener(this);
        if (dVar == null && this.f1202w && eVar.x() != null) {
            FrameLayout frameLayout = (FrameLayout) layoutInflaterFrom.inflate(j.g.f13444l, (ViewGroup) listViewJ, false);
            TextView textView = (TextView) frameLayout.findViewById(R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(eVar.x());
            listViewJ.addHeaderView(frameLayout, null, false);
            h0VarZ.b();
        }
    }

    private h0 z() {
        h0 h0Var = new h0(this.f1181b, null, this.f1183d, this.f1184e);
        h0Var.P(this.f1191l);
        h0Var.H(this);
        h0Var.G(this);
        h0Var.z(this.f1194o);
        h0Var.C(this.f1193n);
        h0Var.F(true);
        h0Var.E(2);
        return h0Var;
    }

    @Override // q.e
    public boolean a() {
        return this.f1188i.size() > 0 && this.f1188i.get(0).f1213a.a();
    }

    @Override // q.e
    public void b() {
        if (a()) {
            return;
        }
        Iterator<e> it = this.f1187h.iterator();
        while (it.hasNext()) {
            F(it.next());
        }
        this.f1187h.clear();
        View view = this.f1194o;
        this.f1195p = view;
        if (view != null) {
            boolean z10 = this.f1204y == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f1204y = viewTreeObserver;
            if (z10) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f1189j);
            }
            this.f1195p.addOnAttachStateChangeListener(this.f1190k);
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public void c(e eVar, boolean z10) {
        int iA = A(eVar);
        if (iA < 0) {
            return;
        }
        int i10 = iA + 1;
        if (i10 < this.f1188i.size()) {
            this.f1188i.get(i10).f1214b.e(false);
        }
        d dVarRemove = this.f1188i.remove(iA);
        dVarRemove.f1214b.O(this);
        if (this.A) {
            dVarRemove.f1213a.O(null);
            dVarRemove.f1213a.A(0);
        }
        dVarRemove.f1213a.dismiss();
        int size = this.f1188i.size();
        this.f1196q = size > 0 ? this.f1188i.get(size - 1).f1215c : D();
        if (size != 0) {
            if (z10) {
                this.f1188i.get(0).f1214b.e(false);
                return;
            }
            return;
        }
        dismiss();
        j.a aVar = this.f1203x;
        if (aVar != null) {
            aVar.c(eVar, true);
        }
        ViewTreeObserver viewTreeObserver = this.f1204y;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f1204y.removeGlobalOnLayoutListener(this.f1189j);
            }
            this.f1204y = null;
        }
        this.f1195p.removeOnAttachStateChangeListener(this.f1190k);
        this.f1205z.onDismiss();
    }

    @Override // androidx.appcompat.view.menu.j
    public void d(boolean z10) {
        Iterator<d> it = this.f1188i.iterator();
        while (it.hasNext()) {
            h.y(it.next().a().getAdapter()).notifyDataSetChanged();
        }
    }

    @Override // q.e
    public void dismiss() {
        int size = this.f1188i.size();
        if (size > 0) {
            d[] dVarArr = (d[]) this.f1188i.toArray(new d[size]);
            for (int i10 = size - 1; i10 >= 0; i10--) {
                d dVar = dVarArr[i10];
                if (dVar.f1213a.a()) {
                    dVar.f1213a.dismiss();
                }
            }
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean e() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public void h(j.a aVar) {
        this.f1203x = aVar;
    }

    @Override // q.e
    public ListView j() {
        if (this.f1188i.isEmpty()) {
            return null;
        }
        return this.f1188i.get(r0.size() - 1).a();
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean k(m mVar) {
        for (d dVar : this.f1188i) {
            if (mVar == dVar.f1214b) {
                dVar.a().requestFocus();
                return true;
            }
        }
        if (!mVar.hasVisibleItems()) {
            return false;
        }
        l(mVar);
        j.a aVar = this.f1203x;
        if (aVar != null) {
            aVar.d(mVar);
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.h
    public void l(e eVar) {
        eVar.c(this, this.f1181b);
        if (a()) {
            F(eVar);
        } else {
            this.f1187h.add(eVar);
        }
    }

    @Override // androidx.appcompat.view.menu.h
    protected boolean m() {
        return false;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        d dVar;
        int size = this.f1188i.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                dVar = null;
                break;
            }
            dVar = this.f1188i.get(i10);
            if (!dVar.f1213a.a()) {
                break;
            } else {
                i10++;
            }
        }
        if (dVar != null) {
            dVar.f1214b.e(false);
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
        if (this.f1194o != view) {
            this.f1194o = view;
            this.f1193n = o3.h.a(this.f1192m, androidx.core.view.h.t(view));
        }
    }

    @Override // androidx.appcompat.view.menu.h
    public void r(boolean z10) {
        this.f1201v = z10;
    }

    @Override // androidx.appcompat.view.menu.h
    public void s(int i10) {
        if (this.f1192m != i10) {
            this.f1192m = i10;
            this.f1193n = o3.h.a(i10, androidx.core.view.h.t(this.f1194o));
        }
    }

    @Override // androidx.appcompat.view.menu.h
    public void t(int i10) {
        this.f1197r = true;
        this.f1199t = i10;
    }

    @Override // androidx.appcompat.view.menu.h
    public void u(PopupWindow.OnDismissListener onDismissListener) {
        this.f1205z = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.h
    public void v(boolean z10) {
        this.f1202w = z10;
    }

    @Override // androidx.appcompat.view.menu.h
    public void w(int i10) {
        this.f1198s = true;
        this.f1200u = i10;
    }
}
