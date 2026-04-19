package c5;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import c5.l;
import java.util.ArrayList;
import java.util.List;
import k3.d;

/* JADX INFO: loaded from: classes.dex */
public class e extends androidx.fragment.app.g0 {

    class a extends l.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Rect f6440a;

        a(Rect rect) {
            this.f6440a = rect;
        }
    }

    class b implements l.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f6442a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ArrayList f6443b;

        b(View view, ArrayList arrayList) {
            this.f6442a = view;
            this.f6443b = arrayList;
        }

        @Override // c5.l.f
        public void a(l lVar) {
        }

        @Override // c5.l.f
        public void b(l lVar) {
        }

        @Override // c5.l.f
        public void c(l lVar) {
        }

        @Override // c5.l.f
        public void d(l lVar) {
            lVar.T(this);
            this.f6442a.setVisibility(8);
            int size = this.f6443b.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((View) this.f6443b.get(i10)).setVisibility(0);
            }
        }

        @Override // c5.l.f
        public void e(l lVar) {
            lVar.T(this);
            lVar.b(this);
        }
    }

    class c extends m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f6445a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ArrayList f6446b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f6447c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ ArrayList f6448d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Object f6449e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ ArrayList f6450f;

        c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f6445a = obj;
            this.f6446b = arrayList;
            this.f6447c = obj2;
            this.f6448d = arrayList2;
            this.f6449e = obj3;
            this.f6450f = arrayList3;
        }

        @Override // c5.l.f
        public void d(l lVar) {
            lVar.T(this);
        }

        @Override // c5.m, c5.l.f
        public void e(l lVar) {
            Object obj = this.f6445a;
            if (obj != null) {
                e.this.D(obj, this.f6446b, null);
            }
            Object obj2 = this.f6447c;
            if (obj2 != null) {
                e.this.D(obj2, this.f6448d, null);
            }
            Object obj3 = this.f6449e;
            if (obj3 != null) {
                e.this.D(obj3, this.f6450f, null);
            }
        }
    }

    class d implements d.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ l f6452a;

        d(l lVar) {
            this.f6452a = lVar;
        }

        @Override // k3.d.a
        public void onCancel() {
            this.f6452a.cancel();
        }
    }

    /* JADX INFO: renamed from: c5.e$e, reason: collision with other inner class name */
    class C0153e implements l.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Runnable f6454a;

        C0153e(Runnable runnable) {
            this.f6454a = runnable;
        }

        @Override // c5.l.f
        public void a(l lVar) {
        }

        @Override // c5.l.f
        public void b(l lVar) {
        }

        @Override // c5.l.f
        public void c(l lVar) {
        }

        @Override // c5.l.f
        public void d(l lVar) {
            this.f6454a.run();
        }

        @Override // c5.l.f
        public void e(l lVar) {
        }
    }

    class f extends l.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Rect f6456a;

        f(Rect rect) {
            this.f6456a = rect;
        }
    }

    private static boolean C(l lVar) {
        return (androidx.fragment.app.g0.l(lVar.D()) && androidx.fragment.app.g0.l(lVar.E()) && androidx.fragment.app.g0.l(lVar.F())) ? false : true;
    }

    @Override // androidx.fragment.app.g0
    public void A(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        p pVar = (p) obj;
        if (pVar != null) {
            pVar.G().clear();
            pVar.G().addAll(arrayList2);
            D(pVar, arrayList, arrayList2);
        }
    }

    @Override // androidx.fragment.app.g0
    public Object B(Object obj) {
        if (obj == null) {
            return null;
        }
        p pVar = new p();
        pVar.i0((l) obj);
        return pVar;
    }

    public void D(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        l lVar = (l) obj;
        int i10 = 0;
        if (lVar instanceof p) {
            p pVar = (p) lVar;
            int iL0 = pVar.l0();
            while (i10 < iL0) {
                D(pVar.k0(i10), arrayList, arrayList2);
                i10++;
            }
            return;
        }
        if (C(lVar)) {
            return;
        }
        List<View> listG = lVar.G();
        if (listG.size() == arrayList.size() && listG.containsAll(arrayList)) {
            int size = arrayList2 == null ? 0 : arrayList2.size();
            while (i10 < size) {
                lVar.c(arrayList2.get(i10));
                i10++;
            }
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                lVar.U(arrayList.get(size2));
            }
        }
    }

    @Override // androidx.fragment.app.g0
    public void a(Object obj, View view) {
        if (obj != null) {
            ((l) obj).c(view);
        }
    }

    @Override // androidx.fragment.app.g0
    public void b(Object obj, ArrayList<View> arrayList) {
        l lVar = (l) obj;
        if (lVar == null) {
            return;
        }
        int i10 = 0;
        if (lVar instanceof p) {
            p pVar = (p) lVar;
            int iL0 = pVar.l0();
            while (i10 < iL0) {
                b(pVar.k0(i10), arrayList);
                i10++;
            }
            return;
        }
        if (C(lVar) || !androidx.fragment.app.g0.l(lVar.G())) {
            return;
        }
        int size = arrayList.size();
        while (i10 < size) {
            lVar.c(arrayList.get(i10));
            i10++;
        }
    }

    @Override // androidx.fragment.app.g0
    public void e(ViewGroup viewGroup, Object obj) {
        n.a(viewGroup, (l) obj);
    }

    @Override // androidx.fragment.app.g0
    public boolean g(Object obj) {
        return obj instanceof l;
    }

    @Override // androidx.fragment.app.g0
    public Object h(Object obj) {
        if (obj != null) {
            return ((l) obj).clone();
        }
        return null;
    }

    @Override // androidx.fragment.app.g0
    public Object o(Object obj, Object obj2, Object obj3) {
        l lVarQ0 = (l) obj;
        l lVar = (l) obj2;
        l lVar2 = (l) obj3;
        if (lVarQ0 != null && lVar != null) {
            lVarQ0 = new p().i0(lVarQ0).i0(lVar).q0(1);
        } else if (lVarQ0 == null) {
            lVarQ0 = lVar != null ? lVar : null;
        }
        if (lVar2 == null) {
            return lVarQ0;
        }
        p pVar = new p();
        if (lVarQ0 != null) {
            pVar.i0(lVarQ0);
        }
        pVar.i0(lVar2);
        return pVar;
    }

    @Override // androidx.fragment.app.g0
    public Object p(Object obj, Object obj2, Object obj3) {
        p pVar = new p();
        if (obj != null) {
            pVar.i0((l) obj);
        }
        if (obj2 != null) {
            pVar.i0((l) obj2);
        }
        if (obj3 != null) {
            pVar.i0((l) obj3);
        }
        return pVar;
    }

    @Override // androidx.fragment.app.g0
    public void r(Object obj, View view, ArrayList<View> arrayList) {
        ((l) obj).b(new b(view, arrayList));
    }

    @Override // androidx.fragment.app.g0
    public void s(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        ((l) obj).b(new c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    @Override // androidx.fragment.app.g0
    public void u(Object obj, Rect rect) {
        if (obj != null) {
            ((l) obj).Z(new f(rect));
        }
    }

    @Override // androidx.fragment.app.g0
    public void v(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            k(view, rect);
            ((l) obj).Z(new a(rect));
        }
    }

    @Override // androidx.fragment.app.g0
    public void w(androidx.fragment.app.n nVar, Object obj, k3.d dVar, Runnable runnable) {
        l lVar = (l) obj;
        dVar.b(new d(lVar));
        lVar.b(new C0153e(runnable));
    }

    @Override // androidx.fragment.app.g0
    public void z(Object obj, View view, ArrayList<View> arrayList) {
        p pVar = (p) obj;
        List<View> listG = pVar.G();
        listG.clear();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            androidx.fragment.app.g0.f(listG, arrayList.get(i10));
        }
        listG.add(view);
        arrayList.add(view);
        b(pVar, arrayList);
    }
}
