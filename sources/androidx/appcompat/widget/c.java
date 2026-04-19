package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.ActionMenuView;
import java.util.ArrayList;
import o3.a;

/* JADX INFO: loaded from: classes.dex */
class c extends androidx.appcompat.view.menu.a implements a.InterfaceC0367a {
    RunnableC0031c A;
    private b B;
    final f C;
    int D;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    d f1593k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Drawable f1594l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f1595m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f1596n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f1597o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f1598p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f1599q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f1600r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f1601s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f1602t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f1603u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f1604v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f1605w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final SparseBooleanArray f1606x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    e f1607y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    a f1608z;

    private class a extends androidx.appcompat.view.menu.i {
        public a(Context context, androidx.appcompat.view.menu.m mVar, View view) {
            super(context, mVar, view, false, j.a.f13342l);
            if (!((androidx.appcompat.view.menu.g) mVar.getItem()).l()) {
                View view2 = c.this.f1593k;
                f(view2 == null ? (View) ((androidx.appcompat.view.menu.a) c.this).f1179i : view2);
            }
            j(c.this.C);
        }

        @Override // androidx.appcompat.view.menu.i
        protected void e() {
            c cVar = c.this;
            cVar.f1608z = null;
            cVar.D = 0;
            super.e();
        }
    }

    private class b extends ActionMenuItemView.b {
        b() {
        }

        @Override // androidx.appcompat.view.menu.ActionMenuItemView.b
        public q.e a() {
            a aVar = c.this.f1608z;
            if (aVar != null) {
                return aVar.c();
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.c$c, reason: collision with other inner class name */
    private class RunnableC0031c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private e f1611a;

        public RunnableC0031c(e eVar) {
            this.f1611a = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (((androidx.appcompat.view.menu.a) c.this).f1173c != null) {
                ((androidx.appcompat.view.menu.a) c.this).f1173c.d();
            }
            View view = (View) ((androidx.appcompat.view.menu.a) c.this).f1179i;
            if (view != null && view.getWindowToken() != null && this.f1611a.m()) {
                c.this.f1607y = this.f1611a;
            }
            c.this.A = null;
        }
    }

    private class d extends r implements ActionMenuView.a {

        class a extends e0 {

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            final /* synthetic */ c f1614j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(View view, c cVar) {
                super(view);
                this.f1614j = cVar;
            }

            @Override // androidx.appcompat.widget.e0
            public q.e b() {
                e eVar = c.this.f1607y;
                if (eVar == null) {
                    return null;
                }
                return eVar.c();
            }

            @Override // androidx.appcompat.widget.e0
            public boolean c() {
                c.this.K();
                return true;
            }

            @Override // androidx.appcompat.widget.e0
            public boolean d() {
                c cVar = c.this;
                if (cVar.A != null) {
                    return false;
                }
                cVar.B();
                return true;
            }
        }

        public d(Context context) {
            super(context, null, j.a.f13341k);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            t0.a(this, getContentDescription());
            setOnTouchListener(new a(this, c.this));
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public boolean a() {
            return false;
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public boolean b() {
            return false;
        }

        @Override // android.view.View
        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            c.this.K();
            return true;
        }

        @Override // android.widget.ImageView
        protected boolean setFrame(int i10, int i11, int i12, int i13) {
            boolean frame = super.setFrame(i10, i11, i12, i13);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (drawable != null && background != null) {
                int width = getWidth();
                int height = getHeight();
                int iMax = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                androidx.core.graphics.drawable.a.d(background, paddingLeft - iMax, paddingTop - iMax, paddingLeft + iMax, paddingTop + iMax);
            }
            return frame;
        }
    }

    private class e extends androidx.appcompat.view.menu.i {
        public e(Context context, androidx.appcompat.view.menu.e eVar, View view, boolean z10) {
            super(context, eVar, view, z10, j.a.f13342l);
            h(8388613);
            j(c.this.C);
        }

        @Override // androidx.appcompat.view.menu.i
        protected void e() {
            if (((androidx.appcompat.view.menu.a) c.this).f1173c != null) {
                ((androidx.appcompat.view.menu.a) c.this).f1173c.close();
            }
            c.this.f1607y = null;
            super.e();
        }
    }

    private class f implements j.a {
        f() {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public void c(androidx.appcompat.view.menu.e eVar, boolean z10) {
            if (eVar instanceof androidx.appcompat.view.menu.m) {
                eVar.D().e(false);
            }
            j.a aVarM = c.this.m();
            if (aVarM != null) {
                aVarM.c(eVar, z10);
            }
        }

        @Override // androidx.appcompat.view.menu.j.a
        public boolean d(androidx.appcompat.view.menu.e eVar) {
            if (eVar == ((androidx.appcompat.view.menu.a) c.this).f1173c) {
                return false;
            }
            c.this.D = ((androidx.appcompat.view.menu.m) eVar).getItem().getItemId();
            j.a aVarM = c.this.m();
            if (aVarM != null) {
                return aVarM.d(eVar);
            }
            return false;
        }
    }

    public c(Context context) {
        super(context, j.g.f13435c, j.g.f13434b);
        this.f1606x = new SparseBooleanArray();
        this.C = new f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private View z(MenuItem menuItem) {
        ViewGroup viewGroup = (ViewGroup) this.f1179i;
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if ((childAt instanceof k.a) && ((k.a) childAt).getItemData() == menuItem) {
                return childAt;
            }
        }
        return null;
    }

    public Drawable A() {
        d dVar = this.f1593k;
        if (dVar != null) {
            return dVar.getDrawable();
        }
        if (this.f1595m) {
            return this.f1594l;
        }
        return null;
    }

    public boolean B() {
        Object obj;
        RunnableC0031c runnableC0031c = this.A;
        if (runnableC0031c != null && (obj = this.f1179i) != null) {
            ((View) obj).removeCallbacks(runnableC0031c);
            this.A = null;
            return true;
        }
        e eVar = this.f1607y;
        if (eVar == null) {
            return false;
        }
        eVar.b();
        return true;
    }

    public boolean C() {
        a aVar = this.f1608z;
        if (aVar == null) {
            return false;
        }
        aVar.b();
        return true;
    }

    public boolean D() {
        return this.A != null || E();
    }

    public boolean E() {
        e eVar = this.f1607y;
        return eVar != null && eVar.d();
    }

    public void F(Configuration configuration) {
        if (!this.f1601s) {
            this.f1600r = p.a.b(this.f1172b).d();
        }
        androidx.appcompat.view.menu.e eVar = this.f1173c;
        if (eVar != null) {
            eVar.K(true);
        }
    }

    public void G(boolean z10) {
        this.f1604v = z10;
    }

    public void H(ActionMenuView actionMenuView) {
        this.f1179i = actionMenuView;
        actionMenuView.b(this.f1173c);
    }

    public void I(Drawable drawable) {
        d dVar = this.f1593k;
        if (dVar != null) {
            dVar.setImageDrawable(drawable);
        } else {
            this.f1595m = true;
            this.f1594l = drawable;
        }
    }

    public void J(boolean z10) {
        this.f1596n = z10;
        this.f1597o = true;
    }

    public boolean K() {
        androidx.appcompat.view.menu.e eVar;
        if (!this.f1596n || E() || (eVar = this.f1173c) == null || this.f1179i == null || this.A != null || eVar.z().isEmpty()) {
            return false;
        }
        RunnableC0031c runnableC0031c = new RunnableC0031c(new e(this.f1172b, this.f1173c, this.f1593k, true));
        this.A = runnableC0031c;
        ((View) this.f1179i).post(runnableC0031c);
        return true;
    }

    @Override // androidx.appcompat.view.menu.a
    public void b(androidx.appcompat.view.menu.g gVar, k.a aVar) {
        aVar.d(gVar, 0);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
        actionMenuItemView.setItemInvoker((ActionMenuView) this.f1179i);
        if (this.B == null) {
            this.B = new b();
        }
        actionMenuItemView.setPopupCallback(this.B);
    }

    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.j
    public void c(androidx.appcompat.view.menu.e eVar, boolean z10) {
        y();
        super.c(eVar, z10);
    }

    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.j
    public void d(boolean z10) {
        super.d(z10);
        ((View) this.f1179i).requestLayout();
        androidx.appcompat.view.menu.e eVar = this.f1173c;
        boolean z11 = false;
        if (eVar != null) {
            ArrayList<androidx.appcompat.view.menu.g> arrayListS = eVar.s();
            int size = arrayListS.size();
            for (int i10 = 0; i10 < size; i10++) {
                o3.a aVarB = arrayListS.get(i10).b();
                if (aVarB != null) {
                    aVarB.i(this);
                }
            }
        }
        androidx.appcompat.view.menu.e eVar2 = this.f1173c;
        ArrayList<androidx.appcompat.view.menu.g> arrayListZ = eVar2 != null ? eVar2.z() : null;
        if (this.f1596n && arrayListZ != null) {
            int size2 = arrayListZ.size();
            if (size2 == 1) {
                z11 = !arrayListZ.get(0).isActionViewExpanded();
            } else if (size2 > 0) {
                z11 = true;
            }
        }
        d dVar = this.f1593k;
        if (z11) {
            if (dVar == null) {
                this.f1593k = new d(this.f1171a);
            }
            ViewGroup viewGroup = (ViewGroup) this.f1593k.getParent();
            if (viewGroup != this.f1179i) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.f1593k);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f1179i;
                actionMenuView.addView(this.f1593k, actionMenuView.B());
            }
        } else if (dVar != null) {
            Object parent = dVar.getParent();
            Object obj = this.f1179i;
            if (parent == obj) {
                ((ViewGroup) obj).removeView(this.f1593k);
            }
        }
        ((ActionMenuView) this.f1179i).setOverflowReserved(this.f1596n);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.appcompat.widget.c] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r15v1, types: [androidx.appcompat.view.menu.g] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v12 */
    @Override // androidx.appcompat.view.menu.j
    public boolean e() {
        ArrayList<androidx.appcompat.view.menu.g> arrayListE;
        int size;
        int i10;
        int iH;
        ?? r02;
        int i11;
        c cVar = this;
        androidx.appcompat.view.menu.e eVar = cVar.f1173c;
        View view = null;
        ?? r32 = 0;
        if (eVar != null) {
            arrayListE = eVar.E();
            size = arrayListE.size();
        } else {
            arrayListE = null;
            size = 0;
        }
        int i12 = cVar.f1600r;
        int i13 = cVar.f1599q;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) cVar.f1179i;
        boolean z10 = false;
        int i14 = 0;
        int i15 = 0;
        for (int i16 = 0; i16 < size; i16++) {
            androidx.appcompat.view.menu.g gVar = arrayListE.get(i16);
            if (gVar.o()) {
                i14++;
            } else if (gVar.n()) {
                i15++;
            } else {
                z10 = true;
            }
            if (cVar.f1604v && gVar.isActionViewExpanded()) {
                i12 = 0;
            }
        }
        if (cVar.f1596n && (z10 || i15 + i14 > i12)) {
            i12--;
        }
        int i17 = i12 - i14;
        SparseBooleanArray sparseBooleanArray = cVar.f1606x;
        sparseBooleanArray.clear();
        if (cVar.f1602t) {
            int i18 = cVar.f1605w;
            iH = i13 / i18;
            i10 = i18 + ((i13 % i18) / iH);
        } else {
            i10 = 0;
            iH = 0;
        }
        int i19 = 0;
        int i20 = 0;
        ?? r03 = cVar;
        while (i19 < size) {
            androidx.appcompat.view.menu.g gVar2 = arrayListE.get(i19);
            if (gVar2.o()) {
                View viewN = r03.n(gVar2, view, viewGroup);
                if (r03.f1602t) {
                    iH -= ActionMenuView.H(viewN, i10, iH, iMakeMeasureSpec, r32);
                } else {
                    viewN.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                }
                int measuredWidth = viewN.getMeasuredWidth();
                i13 -= measuredWidth;
                if (i20 == 0) {
                    i20 = measuredWidth;
                }
                int groupId = gVar2.getGroupId();
                if (groupId != 0) {
                    sparseBooleanArray.put(groupId, true);
                }
                gVar2.u(true);
                r02 = r32;
                i11 = size;
            } else if (gVar2.n()) {
                int groupId2 = gVar2.getGroupId();
                boolean z11 = sparseBooleanArray.get(groupId2);
                boolean z12 = (i17 > 0 || z11) && i13 > 0 && (!r03.f1602t || iH > 0);
                boolean z13 = z12;
                i11 = size;
                if (z12) {
                    View viewN2 = r03.n(gVar2, null, viewGroup);
                    if (r03.f1602t) {
                        int iH2 = ActionMenuView.H(viewN2, i10, iH, iMakeMeasureSpec, 0);
                        iH -= iH2;
                        if (iH2 == 0) {
                            z13 = false;
                        }
                    } else {
                        viewN2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                    }
                    boolean z14 = z13;
                    int measuredWidth2 = viewN2.getMeasuredWidth();
                    i13 -= measuredWidth2;
                    if (i20 == 0) {
                        i20 = measuredWidth2;
                    }
                    z12 = z14 & (!r03.f1602t ? i13 + i20 <= 0 : i13 < 0);
                }
                if (z12 && groupId2 != 0) {
                    sparseBooleanArray.put(groupId2, true);
                } else if (z11) {
                    sparseBooleanArray.put(groupId2, false);
                    for (int i21 = 0; i21 < i19; i21++) {
                        androidx.appcompat.view.menu.g gVar3 = arrayListE.get(i21);
                        if (gVar3.getGroupId() == groupId2) {
                            if (gVar3.l()) {
                                i17++;
                            }
                            gVar3.u(false);
                        }
                    }
                }
                if (z12) {
                    i17--;
                }
                gVar2.u(z12);
                r02 = 0;
            } else {
                r02 = r32;
                i11 = size;
                gVar2.u(r02);
            }
            i19++;
            r32 = r02;
            size = i11;
            view = null;
            r03 = this;
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.j
    public void i(Context context, androidx.appcompat.view.menu.e eVar) {
        super.i(context, eVar);
        Resources resources = context.getResources();
        p.a aVarB = p.a.b(context);
        if (!this.f1597o) {
            this.f1596n = aVarB.h();
        }
        if (!this.f1603u) {
            this.f1598p = aVarB.c();
        }
        if (!this.f1601s) {
            this.f1600r = aVarB.d();
        }
        int measuredWidth = this.f1598p;
        if (this.f1596n) {
            if (this.f1593k == null) {
                d dVar = new d(this.f1171a);
                this.f1593k = dVar;
                if (this.f1595m) {
                    dVar.setImageDrawable(this.f1594l);
                    this.f1594l = null;
                    this.f1595m = false;
                }
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f1593k.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
            measuredWidth -= this.f1593k.getMeasuredWidth();
        } else {
            this.f1593k = null;
        }
        this.f1599q = measuredWidth;
        this.f1605w = (int) (resources.getDisplayMetrics().density * 56.0f);
    }

    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.j
    public boolean k(androidx.appcompat.view.menu.m mVar) {
        boolean z10 = false;
        if (!mVar.hasVisibleItems()) {
            return false;
        }
        androidx.appcompat.view.menu.m mVar2 = mVar;
        while (mVar2.f0() != this.f1173c) {
            mVar2 = (androidx.appcompat.view.menu.m) mVar2.f0();
        }
        View viewZ = z(mVar2.getItem());
        if (viewZ == null) {
            return false;
        }
        this.D = mVar.getItem().getItemId();
        int size = mVar.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                break;
            }
            MenuItem item = mVar.getItem(i10);
            if (item.isVisible() && item.getIcon() != null) {
                z10 = true;
                break;
            }
            i10++;
        }
        a aVar = new a(this.f1172b, mVar, viewZ);
        this.f1608z = aVar;
        aVar.g(z10);
        this.f1608z.k();
        super.k(mVar);
        return true;
    }

    @Override // androidx.appcompat.view.menu.a
    public boolean l(ViewGroup viewGroup, int i10) {
        if (viewGroup.getChildAt(i10) == this.f1593k) {
            return false;
        }
        return super.l(viewGroup, i10);
    }

    @Override // androidx.appcompat.view.menu.a
    public View n(androidx.appcompat.view.menu.g gVar, View view, ViewGroup viewGroup) {
        View actionView = gVar.getActionView();
        if (actionView == null || gVar.j()) {
            actionView = super.n(gVar, view, viewGroup);
        }
        actionView.setVisibility(gVar.isActionViewExpanded() ? 8 : 0);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.generateLayoutParams(layoutParams));
        }
        return actionView;
    }

    @Override // androidx.appcompat.view.menu.a
    public androidx.appcompat.view.menu.k o(ViewGroup viewGroup) {
        androidx.appcompat.view.menu.k kVar = this.f1179i;
        androidx.appcompat.view.menu.k kVarO = super.o(viewGroup);
        if (kVar != kVarO) {
            ((ActionMenuView) kVarO).setPresenter(this);
        }
        return kVarO;
    }

    @Override // androidx.appcompat.view.menu.a
    public boolean q(int i10, androidx.appcompat.view.menu.g gVar) {
        return gVar.l();
    }

    public boolean y() {
        return B() | C();
    }
}
