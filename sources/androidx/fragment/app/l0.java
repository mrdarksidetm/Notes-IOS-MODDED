package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class l0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f4117f = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ViewGroup f4118a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<d> f4119b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<d> f4120c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f4121d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f4122e;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(ae.j jVar) {
            this();
        }

        public final l0 a(ViewGroup viewGroup, w wVar) {
            ae.r.f(viewGroup, "container");
            ae.r.f(wVar, "fragmentManager");
            m0 m0VarB0 = wVar.B0();
            ae.r.e(m0VarB0, "fragmentManager.specialEffectsControllerFactory");
            return b(viewGroup, m0VarB0);
        }

        public final l0 b(ViewGroup viewGroup, m0 m0Var) {
            ae.r.f(viewGroup, "container");
            ae.r.f(m0Var, "factory");
            int i10 = j4.b.f13910b;
            Object tag = viewGroup.getTag(i10);
            if (tag instanceof l0) {
                return (l0) tag;
            }
            l0 l0VarA = m0Var.a(viewGroup);
            ae.r.e(l0VarA, "factory.createController(container)");
            viewGroup.setTag(i10, l0VarA);
            return l0VarA;
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f4123a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f4124b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f4125c;

        public final void a(ViewGroup viewGroup) {
            ae.r.f(viewGroup, "container");
            if (!this.f4125c) {
                c(viewGroup);
            }
            this.f4125c = true;
        }

        public boolean b() {
            return this.f4123a;
        }

        public void c(ViewGroup viewGroup) {
            ae.r.f(viewGroup, "container");
        }

        public void d(ViewGroup viewGroup) {
            ae.r.f(viewGroup, "container");
        }

        public void e(e.b bVar, ViewGroup viewGroup) {
            ae.r.f(bVar, "backEvent");
            ae.r.f(viewGroup, "container");
        }

        public void f(ViewGroup viewGroup) {
            ae.r.f(viewGroup, "container");
        }

        public final void g(ViewGroup viewGroup) {
            ae.r.f(viewGroup, "container");
            if (!this.f4124b) {
                f(viewGroup);
            }
            this.f4124b = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class c extends d {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final b0 f4126l;

        /* JADX WARN: Illegal instructions before constructor call */
        public c(d.b bVar, d.a aVar, b0 b0Var) {
            ae.r.f(bVar, "finalState");
            ae.r.f(aVar, "lifecycleImpact");
            ae.r.f(b0Var, "fragmentStateManager");
            n nVarK = b0Var.k();
            ae.r.e(nVarK, "fragmentStateManager.fragment");
            super(bVar, aVar, nVarK);
            this.f4126l = b0Var;
        }

        @Override // androidx.fragment.app.l0.d
        public void e() {
            super.e();
            i().mTransitioning = false;
            this.f4126l.m();
        }

        @Override // androidx.fragment.app.l0.d
        public void q() {
            if (o()) {
                return;
            }
            super.q();
            if (j() != d.a.ADDING) {
                if (j() == d.a.REMOVING) {
                    n nVarK = this.f4126l.k();
                    ae.r.e(nVarK, "fragmentStateManager.fragment");
                    View viewRequireView = nVarK.requireView();
                    ae.r.e(viewRequireView, "fragment.requireView()");
                    if (w.J0(2)) {
                        Log.v("FragmentManager", "Clearing focus " + viewRequireView.findFocus() + " on view " + viewRequireView + " for Fragment " + nVarK);
                    }
                    viewRequireView.clearFocus();
                    return;
                }
                return;
            }
            n nVarK2 = this.f4126l.k();
            ae.r.e(nVarK2, "fragmentStateManager.fragment");
            View viewFindFocus = nVarK2.mView.findFocus();
            if (viewFindFocus != null) {
                nVarK2.setFocusedView(viewFindFocus);
                if (w.J0(2)) {
                    Log.v("FragmentManager", "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + nVarK2);
                }
            }
            View viewRequireView2 = i().requireView();
            ae.r.e(viewRequireView2, "this.fragment.requireView()");
            if (viewRequireView2.getParent() == null) {
                this.f4126l.b();
                viewRequireView2.setAlpha(0.0f);
            }
            if ((viewRequireView2.getAlpha() == 0.0f) && viewRequireView2.getVisibility() == 0) {
                viewRequireView2.setVisibility(4);
            }
            viewRequireView2.setAlpha(nVarK2.getPostOnViewCreatedAlpha());
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private b f4127a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private a f4128b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final n f4129c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final List<Runnable> f4130d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f4131e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f4132f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f4133g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f4134h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private boolean f4135i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final List<b> f4136j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final List<b> f4137k;

        public enum a {
            NONE,
            ADDING,
            REMOVING
        }

        public enum b {
            REMOVED,
            VISIBLE,
            GONE,
            INVISIBLE;


            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f4142a = new a(null);

            public static final class a {
                private a() {
                }

                public /* synthetic */ a(ae.j jVar) {
                    this();
                }

                public final b a(View view) {
                    ae.r.f(view, "<this>");
                    return (((view.getAlpha() > 0.0f ? 1 : (view.getAlpha() == 0.0f ? 0 : -1)) == 0) && view.getVisibility() == 0) ? b.INVISIBLE : b(view.getVisibility());
                }

                public final b b(int i10) {
                    if (i10 == 0) {
                        return b.VISIBLE;
                    }
                    if (i10 == 4) {
                        return b.INVISIBLE;
                    }
                    if (i10 == 8) {
                        return b.GONE;
                    }
                    throw new IllegalArgumentException("Unknown visibility " + i10);
                }
            }

            /* JADX INFO: renamed from: androidx.fragment.app.l0$d$b$b, reason: collision with other inner class name */
            public /* synthetic */ class C0098b {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f4148a;

                static {
                    int[] iArr = new int[b.values().length];
                    try {
                        iArr[b.REMOVED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[b.VISIBLE.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[b.GONE.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[b.INVISIBLE.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    f4148a = iArr;
                }
            }

            public static final b c(int i10) {
                return f4142a.b(i10);
            }

            public final void b(View view, ViewGroup viewGroup) {
                int i10;
                ae.r.f(view, "view");
                ae.r.f(viewGroup, "container");
                int i11 = C0098b.f4148a[ordinal()];
                if (i11 == 1) {
                    ViewParent parent = view.getParent();
                    ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                    if (viewGroup2 != null) {
                        if (w.J0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup2);
                        }
                        viewGroup2.removeView(view);
                        return;
                    }
                    return;
                }
                if (i11 == 2) {
                    if (w.J0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
                    }
                    ViewParent parent2 = view.getParent();
                    if ((parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null) == null) {
                        if (w.J0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Adding view " + view + " to Container " + viewGroup);
                        }
                        viewGroup.addView(view);
                    }
                    i10 = 0;
                } else if (i11 != 3) {
                    i10 = 4;
                    if (i11 != 4) {
                        return;
                    }
                    if (w.J0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
                    }
                } else {
                    if (w.J0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
                    }
                    i10 = 8;
                }
                view.setVisibility(i10);
            }
        }

        public /* synthetic */ class c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f4149a;

            static {
                int[] iArr = new int[a.values().length];
                try {
                    iArr[a.ADDING.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[a.REMOVING.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[a.NONE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f4149a = iArr;
            }
        }

        public d(b bVar, a aVar, n nVar) {
            ae.r.f(bVar, "finalState");
            ae.r.f(aVar, "lifecycleImpact");
            ae.r.f(nVar, "fragment");
            this.f4127a = bVar;
            this.f4128b = aVar;
            this.f4129c = nVar;
            this.f4130d = new ArrayList();
            this.f4135i = true;
            ArrayList arrayList = new ArrayList();
            this.f4136j = arrayList;
            this.f4137k = arrayList;
        }

        public final void a(Runnable runnable) {
            ae.r.f(runnable, "listener");
            this.f4130d.add(runnable);
        }

        public final void b(b bVar) {
            ae.r.f(bVar, "effect");
            this.f4136j.add(bVar);
        }

        public final void c(ViewGroup viewGroup) {
            ae.r.f(viewGroup, "container");
            this.f4134h = false;
            if (this.f4131e) {
                return;
            }
            this.f4131e = true;
            if (this.f4136j.isEmpty()) {
                e();
                return;
            }
            Iterator it = nd.c0.C0(this.f4137k).iterator();
            while (it.hasNext()) {
                ((b) it.next()).a(viewGroup);
            }
        }

        public final void d(ViewGroup viewGroup, boolean z10) {
            ae.r.f(viewGroup, "container");
            if (this.f4131e) {
                return;
            }
            if (z10) {
                this.f4133g = true;
            }
            c(viewGroup);
        }

        public void e() {
            this.f4134h = false;
            if (this.f4132f) {
                return;
            }
            if (w.J0(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.f4132f = true;
            Iterator<T> it = this.f4130d.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }

        public final void f(b bVar) {
            ae.r.f(bVar, "effect");
            if (this.f4136j.remove(bVar) && this.f4136j.isEmpty()) {
                e();
            }
        }

        public final List<b> g() {
            return this.f4137k;
        }

        public final b h() {
            return this.f4127a;
        }

        public final n i() {
            return this.f4129c;
        }

        public final a j() {
            return this.f4128b;
        }

        public final boolean k() {
            return this.f4135i;
        }

        public final boolean l() {
            return this.f4131e;
        }

        public final boolean m() {
            return this.f4132f;
        }

        public final boolean n() {
            return this.f4133g;
        }

        public final boolean o() {
            return this.f4134h;
        }

        public final void p(b bVar, a aVar) {
            a aVar2;
            ae.r.f(bVar, "finalState");
            ae.r.f(aVar, "lifecycleImpact");
            int i10 = c.f4149a[aVar.ordinal()];
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3 && this.f4127a != b.REMOVED) {
                        if (w.J0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f4129c + " mFinalState = " + this.f4127a + " -> " + bVar + com.amazon.a.a.o.c.a.b.f7490a);
                        }
                        this.f4127a = bVar;
                        return;
                    }
                    return;
                }
                if (w.J0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f4129c + " mFinalState = " + this.f4127a + " -> REMOVED. mLifecycleImpact  = " + this.f4128b + " to REMOVING.");
                }
                this.f4127a = b.REMOVED;
                aVar2 = a.REMOVING;
            } else {
                if (this.f4127a != b.REMOVED) {
                    return;
                }
                if (w.J0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f4129c + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + this.f4128b + " to ADDING.");
                }
                this.f4127a = b.VISIBLE;
                aVar2 = a.ADDING;
            }
            this.f4128b = aVar2;
            this.f4135i = true;
        }

        public void q() {
            this.f4134h = true;
        }

        public final void r(boolean z10) {
            this.f4135i = z10;
        }

        public String toString() {
            return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {finalState = " + this.f4127a + " lifecycleImpact = " + this.f4128b + " fragment = " + this.f4129c + '}';
        }
    }

    public /* synthetic */ class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4150a;

        static {
            int[] iArr = new int[d.a.values().length];
            try {
                iArr[d.a.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f4150a = iArr;
        }
    }

    public l0(ViewGroup viewGroup) {
        ae.r.f(viewGroup, "container");
        this.f4118a = viewGroup;
        this.f4119b = new ArrayList();
        this.f4120c = new ArrayList();
    }

    private final void A() {
        for (d dVar : this.f4119b) {
            if (dVar.j() == d.a.ADDING) {
                View viewRequireView = dVar.i().requireView();
                ae.r.e(viewRequireView, "fragment.requireView()");
                dVar.p(d.b.f4142a.b(viewRequireView.getVisibility()), d.a.NONE);
            }
        }
    }

    private final void g(d.b bVar, d.a aVar, b0 b0Var) {
        synchronized (this.f4119b) {
            n nVarK = b0Var.k();
            ae.r.e(nVarK, "fragmentStateManager.fragment");
            d dVarO = o(nVarK);
            if (dVarO == null) {
                if (b0Var.k().mTransitioning) {
                    n nVarK2 = b0Var.k();
                    ae.r.e(nVarK2, "fragmentStateManager.fragment");
                    dVarO = p(nVarK2);
                } else {
                    dVarO = null;
                }
            }
            if (dVarO != null) {
                dVarO.p(bVar, aVar);
                return;
            }
            final c cVar = new c(bVar, aVar, b0Var);
            this.f4119b.add(cVar);
            cVar.a(new Runnable() { // from class: androidx.fragment.app.j0
                @Override // java.lang.Runnable
                public final void run() {
                    l0.h(this.f4110a, cVar);
                }
            });
            cVar.a(new Runnable() { // from class: androidx.fragment.app.k0
                @Override // java.lang.Runnable
                public final void run() {
                    l0.i(this.f4113a, cVar);
                }
            });
            md.i0 i0Var = md.i0.f15558a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(l0 l0Var, c cVar) {
        ae.r.f(l0Var, "this$0");
        ae.r.f(cVar, "$operation");
        if (l0Var.f4119b.contains(cVar)) {
            d.b bVarH = cVar.h();
            View view = cVar.i().mView;
            ae.r.e(view, "operation.fragment.mView");
            bVarH.b(view, l0Var.f4118a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(l0 l0Var, c cVar) {
        ae.r.f(l0Var, "this$0");
        ae.r.f(cVar, "$operation");
        l0Var.f4119b.remove(cVar);
        l0Var.f4120c.remove(cVar);
    }

    private final d o(n nVar) {
        Object next;
        Iterator<T> it = this.f4119b.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            d dVar = (d) next;
            if (ae.r.b(dVar.i(), nVar) && !dVar.l()) {
                break;
            }
        }
        return (d) next;
    }

    private final d p(n nVar) {
        Object next;
        Iterator<T> it = this.f4120c.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            d dVar = (d) next;
            if (ae.r.b(dVar.i(), nVar) && !dVar.l()) {
                break;
            }
        }
        return (d) next;
    }

    public static final l0 u(ViewGroup viewGroup, w wVar) {
        return f4117f.a(viewGroup, wVar);
    }

    public static final l0 v(ViewGroup viewGroup, m0 m0Var) {
        return f4117f.b(viewGroup, m0Var);
    }

    private final void z(List<d> list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            list.get(i10).q();
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            nd.z.C(arrayList, ((d) it.next()).g());
        }
        List listC0 = nd.c0.C0(nd.c0.H0(arrayList));
        int size2 = listC0.size();
        for (int i11 = 0; i11 < size2; i11++) {
            ((b) listC0.get(i11)).g(this.f4118a);
        }
    }

    public final void B(boolean z10) {
        this.f4121d = z10;
    }

    public final void c(d dVar) {
        ae.r.f(dVar, "operation");
        if (dVar.k()) {
            d.b bVarH = dVar.h();
            View viewRequireView = dVar.i().requireView();
            ae.r.e(viewRequireView, "operation.fragment.requireView()");
            bVarH.b(viewRequireView, this.f4118a);
            dVar.r(false);
        }
    }

    public abstract void d(List<d> list, boolean z10);

    public void e(List<d> list) {
        ae.r.f(list, "operations");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            nd.z.C(arrayList, ((d) it.next()).g());
        }
        List listC0 = nd.c0.C0(nd.c0.H0(arrayList));
        int size = listC0.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((b) listC0.get(i10)).d(this.f4118a);
        }
        int size2 = list.size();
        for (int i11 = 0; i11 < size2; i11++) {
            c(list.get(i11));
        }
        List listC02 = nd.c0.C0(list);
        int size3 = listC02.size();
        for (int i12 = 0; i12 < size3; i12++) {
            d dVar = (d) listC02.get(i12);
            if (dVar.g().isEmpty()) {
                dVar.e();
            }
        }
    }

    public final void f() {
        if (w.J0(3)) {
            Log.d("FragmentManager", "SpecialEffectsController: Completing Back ");
        }
        z(this.f4120c);
        e(this.f4120c);
    }

    public final void j(d.b bVar, b0 b0Var) {
        ae.r.f(bVar, "finalState");
        ae.r.f(b0Var, "fragmentStateManager");
        if (w.J0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + b0Var.k());
        }
        g(bVar, d.a.ADDING, b0Var);
    }

    public final void k(b0 b0Var) {
        ae.r.f(b0Var, "fragmentStateManager");
        if (w.J0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + b0Var.k());
        }
        g(d.b.GONE, d.a.NONE, b0Var);
    }

    public final void l(b0 b0Var) {
        ae.r.f(b0Var, "fragmentStateManager");
        if (w.J0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + b0Var.k());
        }
        g(d.b.REMOVED, d.a.REMOVING, b0Var);
    }

    public final void m(b0 b0Var) {
        ae.r.f(b0Var, "fragmentStateManager");
        if (w.J0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + b0Var.k());
        }
        g(d.b.VISIBLE, d.a.NONE, b0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x016d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void n() {
        /*
            Method dump skipped, instruction units count: 423
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.l0.n():void");
    }

    public final void q() {
        if (w.J0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        boolean zIsAttachedToWindow = this.f4118a.isAttachedToWindow();
        synchronized (this.f4119b) {
            A();
            z(this.f4119b);
            for (d dVar : nd.c0.F0(this.f4120c)) {
                if (w.J0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: " + (zIsAttachedToWindow ? "" : "Container " + this.f4118a + " is not attached to window. ") + "Cancelling running operation " + dVar);
                }
                dVar.c(this.f4118a);
            }
            for (d dVar2 : nd.c0.F0(this.f4119b)) {
                if (w.J0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: " + (zIsAttachedToWindow ? "" : "Container " + this.f4118a + " is not attached to window. ") + "Cancelling pending operation " + dVar2);
                }
                dVar2.c(this.f4118a);
            }
            md.i0 i0Var = md.i0.f15558a;
        }
    }

    public final void r() {
        if (this.f4122e) {
            if (w.J0(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
            }
            this.f4122e = false;
            n();
        }
    }

    public final d.a s(b0 b0Var) {
        ae.r.f(b0Var, "fragmentStateManager");
        n nVarK = b0Var.k();
        ae.r.e(nVarK, "fragmentStateManager.fragment");
        d dVarO = o(nVarK);
        d.a aVarJ = dVarO != null ? dVarO.j() : null;
        d dVarP = p(nVarK);
        d.a aVarJ2 = dVarP != null ? dVarP.j() : null;
        int i10 = aVarJ == null ? -1 : e.f4150a[aVarJ.ordinal()];
        return (i10 == -1 || i10 == 1) ? aVarJ2 : aVarJ;
    }

    public final ViewGroup t() {
        return this.f4118a;
    }

    public final boolean w() {
        return !this.f4119b.isEmpty();
    }

    public final void x() {
        d dVarPrevious;
        synchronized (this.f4119b) {
            A();
            List<d> list = this.f4119b;
            ListIterator<d> listIterator = list.listIterator(list.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    dVarPrevious = null;
                    break;
                }
                dVarPrevious = listIterator.previous();
                d dVar = dVarPrevious;
                d.b.a aVar = d.b.f4142a;
                View view = dVar.i().mView;
                ae.r.e(view, "operation.fragment.mView");
                d.b bVarA = aVar.a(view);
                d.b bVarH = dVar.h();
                d.b bVar = d.b.VISIBLE;
                if (bVarH == bVar && bVarA != bVar) {
                    break;
                }
            }
            d dVar2 = dVarPrevious;
            n nVarI = dVar2 != null ? dVar2.i() : null;
            this.f4122e = nVarI != null ? nVarI.isPostponed() : false;
            md.i0 i0Var = md.i0.f15558a;
        }
    }

    public final void y(e.b bVar) {
        ae.r.f(bVar, "backEvent");
        if (w.J0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Processing Progress " + bVar.a());
        }
        List<d> list = this.f4120c;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            nd.z.C(arrayList, ((d) it.next()).g());
        }
        List listC0 = nd.c0.C0(nd.c0.H0(arrayList));
        int size = listC0.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((b) listC0.get(i10)).e(bVar, this.f4118a);
        }
    }
}
