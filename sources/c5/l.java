package c5;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.graphics.Path;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class l implements Cloneable {
    private static final int[] F = {2, 1, 3, 4};
    private static final g G = new a();
    private static ThreadLocal<z.a<Animator, d>> H = new ThreadLocal<>();
    private e C;
    private z.a<String, String> D;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private ArrayList<s> f6486t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private ArrayList<s> f6487u;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f6467a = getClass().getName();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f6468b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    long f6469c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private TimeInterpolator f6470d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    ArrayList<Integer> f6471e = new ArrayList<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    ArrayList<View> f6472f = new ArrayList<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ArrayList<String> f6473g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ArrayList<Class<?>> f6474h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private ArrayList<Integer> f6475i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private ArrayList<View> f6476j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private ArrayList<Class<?>> f6477k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private ArrayList<String> f6478l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private ArrayList<Integer> f6479m = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private ArrayList<View> f6480n = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private ArrayList<Class<?>> f6481o = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private t f6482p = new t();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private t f6483q = new t();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    p f6484r = null;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int[] f6485s = F;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    boolean f6488v = false;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    ArrayList<Animator> f6489w = new ArrayList<>();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f6490x = 0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f6491y = false;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f6492z = false;
    private ArrayList<f> A = null;
    private ArrayList<Animator> B = new ArrayList<>();
    private g E = G;

    class a extends g {
        a() {
        }

        @Override // c5.g
        public Path a(float f10, float f11, float f12, float f13) {
            Path path = new Path();
            path.moveTo(f10, f11);
            path.lineTo(f12, f13);
            return path;
        }
    }

    class b extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ z.a f6493a;

        b(z.a aVar) {
            this.f6493a = aVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f6493a.remove(animator);
            l.this.f6489w.remove(animator);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            l.this.f6489w.add(animator);
        }
    }

    class c extends AnimatorListenerAdapter {
        c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            l.this.r();
            animator.removeListener(this);
        }
    }

    private static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        View f6496a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String f6497b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        s f6498c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        o0 f6499d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        l f6500e;

        d(View view, String str, l lVar, o0 o0Var, s sVar) {
            this.f6496a = view;
            this.f6497b = str;
            this.f6498c = sVar;
            this.f6499d = o0Var;
            this.f6500e = lVar;
        }
    }

    public static abstract class e {
    }

    public interface f {
        void a(l lVar);

        void b(l lVar);

        void c(l lVar);

        void d(l lVar);

        void e(l lVar);
    }

    private static z.a<Animator, d> B() {
        z.a<Animator, d> aVar = H.get();
        if (aVar != null) {
            return aVar;
        }
        z.a<Animator, d> aVar2 = new z.a<>();
        H.set(aVar2);
        return aVar2;
    }

    private static boolean L(s sVar, s sVar2, String str) {
        Object obj = sVar.f6534a.get(str);
        Object obj2 = sVar2.f6534a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return true ^ obj.equals(obj2);
    }

    private void M(z.a<View, s> aVar, z.a<View, s> aVar2, SparseArray<View> sparseArray, SparseArray<View> sparseArray2) {
        View view;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            View viewValueAt = sparseArray.valueAt(i10);
            if (viewValueAt != null && K(viewValueAt) && (view = sparseArray2.get(sparseArray.keyAt(i10))) != null && K(view)) {
                s sVar = aVar.get(viewValueAt);
                s sVar2 = aVar2.get(view);
                if (sVar != null && sVar2 != null) {
                    this.f6486t.add(sVar);
                    this.f6487u.add(sVar2);
                    aVar.remove(viewValueAt);
                    aVar2.remove(view);
                }
            }
        }
    }

    private void N(z.a<View, s> aVar, z.a<View, s> aVar2) {
        s sVarRemove;
        for (int size = aVar.size() - 1; size >= 0; size--) {
            View viewG = aVar.g(size);
            if (viewG != null && K(viewG) && (sVarRemove = aVar2.remove(viewG)) != null && K(sVarRemove.f6535b)) {
                this.f6486t.add(aVar.i(size));
                this.f6487u.add(sVarRemove);
            }
        }
    }

    private void O(z.a<View, s> aVar, z.a<View, s> aVar2, z.m<View> mVar, z.m<View> mVar2) {
        View viewE;
        int iM = mVar.m();
        for (int i10 = 0; i10 < iM; i10++) {
            View viewN = mVar.n(i10);
            if (viewN != null && K(viewN) && (viewE = mVar2.e(mVar.h(i10))) != null && K(viewE)) {
                s sVar = aVar.get(viewN);
                s sVar2 = aVar2.get(viewE);
                if (sVar != null && sVar2 != null) {
                    this.f6486t.add(sVar);
                    this.f6487u.add(sVar2);
                    aVar.remove(viewN);
                    aVar2.remove(viewE);
                }
            }
        }
    }

    private void P(z.a<View, s> aVar, z.a<View, s> aVar2, z.a<String, View> aVar3, z.a<String, View> aVar4) {
        View view;
        int size = aVar3.size();
        for (int i10 = 0; i10 < size; i10++) {
            View viewL = aVar3.l(i10);
            if (viewL != null && K(viewL) && (view = aVar4.get(aVar3.g(i10))) != null && K(view)) {
                s sVar = aVar.get(viewL);
                s sVar2 = aVar2.get(view);
                if (sVar != null && sVar2 != null) {
                    this.f6486t.add(sVar);
                    this.f6487u.add(sVar2);
                    aVar.remove(viewL);
                    aVar2.remove(view);
                }
            }
        }
    }

    private void Q(t tVar, t tVar2) {
        z.a<View, s> aVar = new z.a<>(tVar.f6537a);
        z.a<View, s> aVar2 = new z.a<>(tVar2.f6537a);
        int i10 = 0;
        while (true) {
            int[] iArr = this.f6485s;
            if (i10 >= iArr.length) {
                d(aVar, aVar2);
                return;
            }
            int i11 = iArr[i10];
            if (i11 == 1) {
                N(aVar, aVar2);
            } else if (i11 == 2) {
                P(aVar, aVar2, tVar.f6540d, tVar2.f6540d);
            } else if (i11 == 3) {
                M(aVar, aVar2, tVar.f6538b, tVar2.f6538b);
            } else if (i11 == 4) {
                O(aVar, aVar2, tVar.f6539c, tVar2.f6539c);
            }
            i10++;
        }
    }

    private void W(Animator animator, z.a<Animator, d> aVar) {
        if (animator != null) {
            animator.addListener(new b(aVar));
            f(animator);
        }
    }

    private void d(z.a<View, s> aVar, z.a<View, s> aVar2) {
        for (int i10 = 0; i10 < aVar.size(); i10++) {
            s sVarL = aVar.l(i10);
            if (K(sVarL.f6535b)) {
                this.f6486t.add(sVarL);
                this.f6487u.add(null);
            }
        }
        for (int i11 = 0; i11 < aVar2.size(); i11++) {
            s sVarL2 = aVar2.l(i11);
            if (K(sVarL2.f6535b)) {
                this.f6487u.add(sVarL2);
                this.f6486t.add(null);
            }
        }
    }

    private static void e(t tVar, View view, s sVar) {
        tVar.f6537a.put(view, sVar);
        int id2 = view.getId();
        if (id2 >= 0) {
            if (tVar.f6538b.indexOfKey(id2) >= 0) {
                tVar.f6538b.put(id2, null);
            } else {
                tVar.f6538b.put(id2, view);
            }
        }
        String strA = androidx.core.view.h.A(view);
        if (strA != null) {
            if (tVar.f6540d.containsKey(strA)) {
                tVar.f6540d.put(strA, null);
            } else {
                tVar.f6540d.put(strA, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (tVar.f6539c.f(itemIdAtPosition) < 0) {
                    androidx.core.view.h.e0(view, true);
                    tVar.f6539c.i(itemIdAtPosition, view);
                    return;
                }
                View viewE = tVar.f6539c.e(itemIdAtPosition);
                if (viewE != null) {
                    androidx.core.view.h.e0(viewE, false);
                    tVar.f6539c.i(itemIdAtPosition, null);
                }
            }
        }
    }

    private void h(View view, boolean z10) {
        if (view == null) {
            return;
        }
        int id2 = view.getId();
        ArrayList<Integer> arrayList = this.f6475i;
        if (arrayList == null || !arrayList.contains(Integer.valueOf(id2))) {
            ArrayList<View> arrayList2 = this.f6476j;
            if (arrayList2 == null || !arrayList2.contains(view)) {
                ArrayList<Class<?>> arrayList3 = this.f6477k;
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        if (this.f6477k.get(i10).isInstance(view)) {
                            return;
                        }
                    }
                }
                if (view.getParent() instanceof ViewGroup) {
                    s sVar = new s(view);
                    if (z10) {
                        j(sVar);
                    } else {
                        g(sVar);
                    }
                    sVar.f6536c.add(this);
                    i(sVar);
                    e(z10 ? this.f6482p : this.f6483q, view, sVar);
                }
                if (view instanceof ViewGroup) {
                    ArrayList<Integer> arrayList4 = this.f6479m;
                    if (arrayList4 == null || !arrayList4.contains(Integer.valueOf(id2))) {
                        ArrayList<View> arrayList5 = this.f6480n;
                        if (arrayList5 == null || !arrayList5.contains(view)) {
                            ArrayList<Class<?>> arrayList6 = this.f6481o;
                            if (arrayList6 != null) {
                                int size2 = arrayList6.size();
                                for (int i11 = 0; i11 < size2; i11++) {
                                    if (this.f6481o.get(i11).isInstance(view)) {
                                        return;
                                    }
                                }
                            }
                            ViewGroup viewGroup = (ViewGroup) view;
                            for (int i12 = 0; i12 < viewGroup.getChildCount(); i12++) {
                                h(viewGroup.getChildAt(i12), z10);
                            }
                        }
                    }
                }
            }
        }
    }

    public o A() {
        return null;
    }

    public long C() {
        return this.f6468b;
    }

    public List<Integer> D() {
        return this.f6471e;
    }

    public List<String> E() {
        return this.f6473g;
    }

    public List<Class<?>> F() {
        return this.f6474h;
    }

    public List<View> G() {
        return this.f6472f;
    }

    public String[] H() {
        return null;
    }

    public s I(View view, boolean z10) {
        p pVar = this.f6484r;
        if (pVar != null) {
            return pVar.I(view, z10);
        }
        return (z10 ? this.f6482p : this.f6483q).f6537a.get(view);
    }

    public boolean J(s sVar, s sVar2) {
        if (sVar == null || sVar2 == null) {
            return false;
        }
        String[] strArrH = H();
        if (strArrH == null) {
            Iterator<String> it = sVar.f6534a.keySet().iterator();
            while (it.hasNext()) {
                if (L(sVar, sVar2, it.next())) {
                }
            }
            return false;
        }
        for (String str : strArrH) {
            if (!L(sVar, sVar2, str)) {
            }
        }
        return false;
        return true;
    }

    boolean K(View view) {
        ArrayList<Class<?>> arrayList;
        ArrayList<String> arrayList2;
        int id2 = view.getId();
        ArrayList<Integer> arrayList3 = this.f6475i;
        if (arrayList3 != null && arrayList3.contains(Integer.valueOf(id2))) {
            return false;
        }
        ArrayList<View> arrayList4 = this.f6476j;
        if (arrayList4 != null && arrayList4.contains(view)) {
            return false;
        }
        ArrayList<Class<?>> arrayList5 = this.f6477k;
        if (arrayList5 != null) {
            int size = arrayList5.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (this.f6477k.get(i10).isInstance(view)) {
                    return false;
                }
            }
        }
        if (this.f6478l != null && androidx.core.view.h.A(view) != null && this.f6478l.contains(androidx.core.view.h.A(view))) {
            return false;
        }
        if ((this.f6471e.size() == 0 && this.f6472f.size() == 0 && (((arrayList = this.f6474h) == null || arrayList.isEmpty()) && ((arrayList2 = this.f6473g) == null || arrayList2.isEmpty()))) || this.f6471e.contains(Integer.valueOf(id2)) || this.f6472f.contains(view)) {
            return true;
        }
        ArrayList<String> arrayList6 = this.f6473g;
        if (arrayList6 != null && arrayList6.contains(androidx.core.view.h.A(view))) {
            return true;
        }
        if (this.f6474h != null) {
            for (int i11 = 0; i11 < this.f6474h.size(); i11++) {
                if (this.f6474h.get(i11).isInstance(view)) {
                    return true;
                }
            }
        }
        return false;
    }

    public void R(View view) {
        if (this.f6492z) {
            return;
        }
        for (int size = this.f6489w.size() - 1; size >= 0; size--) {
            c5.a.b(this.f6489w.get(size));
        }
        ArrayList<f> arrayList = this.A;
        if (arrayList != null && arrayList.size() > 0) {
            ArrayList arrayList2 = (ArrayList) this.A.clone();
            int size2 = arrayList2.size();
            for (int i10 = 0; i10 < size2; i10++) {
                ((f) arrayList2.get(i10)).c(this);
            }
        }
        this.f6491y = true;
    }

    void S(ViewGroup viewGroup) {
        d dVar;
        this.f6486t = new ArrayList<>();
        this.f6487u = new ArrayList<>();
        Q(this.f6482p, this.f6483q);
        z.a<Animator, d> aVarB = B();
        int size = aVarB.size();
        o0 o0VarD = a0.d(viewGroup);
        for (int i10 = size - 1; i10 >= 0; i10--) {
            Animator animatorG = aVarB.g(i10);
            if (animatorG != null && (dVar = aVarB.get(animatorG)) != null && dVar.f6496a != null && o0VarD.equals(dVar.f6499d)) {
                s sVar = dVar.f6498c;
                View view = dVar.f6496a;
                s sVarI = I(view, true);
                s sVarV = v(view, true);
                if (sVarI == null && sVarV == null) {
                    sVarV = this.f6483q.f6537a.get(view);
                }
                if (!(sVarI == null && sVarV == null) && dVar.f6500e.J(sVar, sVarV)) {
                    if (animatorG.isRunning() || animatorG.isStarted()) {
                        animatorG.cancel();
                    } else {
                        aVarB.remove(animatorG);
                    }
                }
            }
        }
        q(viewGroup, this.f6482p, this.f6483q, this.f6486t, this.f6487u);
        X();
    }

    public l T(f fVar) {
        ArrayList<f> arrayList = this.A;
        if (arrayList == null) {
            return this;
        }
        arrayList.remove(fVar);
        if (this.A.size() == 0) {
            this.A = null;
        }
        return this;
    }

    public l U(View view) {
        this.f6472f.remove(view);
        return this;
    }

    public void V(View view) {
        if (this.f6491y) {
            if (!this.f6492z) {
                for (int size = this.f6489w.size() - 1; size >= 0; size--) {
                    c5.a.c(this.f6489w.get(size));
                }
                ArrayList<f> arrayList = this.A;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList arrayList2 = (ArrayList) this.A.clone();
                    int size2 = arrayList2.size();
                    for (int i10 = 0; i10 < size2; i10++) {
                        ((f) arrayList2.get(i10)).a(this);
                    }
                }
            }
            this.f6491y = false;
        }
    }

    protected void X() {
        e0();
        z.a<Animator, d> aVarB = B();
        for (Animator animator : this.B) {
            if (aVarB.containsKey(animator)) {
                e0();
                W(animator, aVarB);
            }
        }
        this.B.clear();
        r();
    }

    public l Y(long j10) {
        this.f6469c = j10;
        return this;
    }

    public void Z(e eVar) {
        this.C = eVar;
    }

    public l a0(TimeInterpolator timeInterpolator) {
        this.f6470d = timeInterpolator;
        return this;
    }

    public l b(f fVar) {
        if (this.A == null) {
            this.A = new ArrayList<>();
        }
        this.A.add(fVar);
        return this;
    }

    public void b0(g gVar) {
        if (gVar == null) {
            gVar = G;
        }
        this.E = gVar;
    }

    public l c(View view) {
        this.f6472f.add(view);
        return this;
    }

    public void c0(o oVar) {
    }

    protected void cancel() {
        for (int size = this.f6489w.size() - 1; size >= 0; size--) {
            this.f6489w.get(size).cancel();
        }
        ArrayList<f> arrayList = this.A;
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        ArrayList arrayList2 = (ArrayList) this.A.clone();
        int size2 = arrayList2.size();
        for (int i10 = 0; i10 < size2; i10++) {
            ((f) arrayList2.get(i10)).b(this);
        }
    }

    public l d0(long j10) {
        this.f6468b = j10;
        return this;
    }

    protected void e0() {
        if (this.f6490x == 0) {
            ArrayList<f> arrayList = this.A;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.A.clone();
                int size = arrayList2.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((f) arrayList2.get(i10)).e(this);
                }
            }
            this.f6492z = false;
        }
        this.f6490x++;
    }

    protected void f(Animator animator) {
        if (animator == null) {
            r();
            return;
        }
        if (s() >= 0) {
            animator.setDuration(s());
        }
        if (C() >= 0) {
            animator.setStartDelay(C() + animator.getStartDelay());
        }
        if (u() != null) {
            animator.setInterpolator(u());
        }
        animator.addListener(new c());
        animator.start();
    }

    String f0(String str) {
        String str2 = str + getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) + ": ";
        if (this.f6469c != -1) {
            str2 = str2 + "dur(" + this.f6469c + ") ";
        }
        if (this.f6468b != -1) {
            str2 = str2 + "dly(" + this.f6468b + ") ";
        }
        if (this.f6470d != null) {
            str2 = str2 + "interp(" + this.f6470d + ") ";
        }
        if (this.f6471e.size() <= 0 && this.f6472f.size() <= 0) {
            return str2;
        }
        String str3 = str2 + "tgts(";
        if (this.f6471e.size() > 0) {
            for (int i10 = 0; i10 < this.f6471e.size(); i10++) {
                if (i10 > 0) {
                    str3 = str3 + ", ";
                }
                str3 = str3 + this.f6471e.get(i10);
            }
        }
        if (this.f6472f.size() > 0) {
            for (int i11 = 0; i11 < this.f6472f.size(); i11++) {
                if (i11 > 0) {
                    str3 = str3 + ", ";
                }
                str3 = str3 + this.f6472f.get(i11);
            }
        }
        return str3 + ")";
    }

    public abstract void g(s sVar);

    void i(s sVar) {
    }

    public abstract void j(s sVar);

    void k(ViewGroup viewGroup, boolean z10) {
        ArrayList<String> arrayList;
        ArrayList<Class<?>> arrayList2;
        z.a<String, String> aVar;
        m(z10);
        if ((this.f6471e.size() > 0 || this.f6472f.size() > 0) && (((arrayList = this.f6473g) == null || arrayList.isEmpty()) && ((arrayList2 = this.f6474h) == null || arrayList2.isEmpty()))) {
            for (int i10 = 0; i10 < this.f6471e.size(); i10++) {
                View viewFindViewById = viewGroup.findViewById(this.f6471e.get(i10).intValue());
                if (viewFindViewById != null) {
                    s sVar = new s(viewFindViewById);
                    if (z10) {
                        j(sVar);
                    } else {
                        g(sVar);
                    }
                    sVar.f6536c.add(this);
                    i(sVar);
                    e(z10 ? this.f6482p : this.f6483q, viewFindViewById, sVar);
                }
            }
            for (int i11 = 0; i11 < this.f6472f.size(); i11++) {
                View view = this.f6472f.get(i11);
                s sVar2 = new s(view);
                if (z10) {
                    j(sVar2);
                } else {
                    g(sVar2);
                }
                sVar2.f6536c.add(this);
                i(sVar2);
                e(z10 ? this.f6482p : this.f6483q, view, sVar2);
            }
        } else {
            h(viewGroup, z10);
        }
        if (z10 || (aVar = this.D) == null) {
            return;
        }
        int size = aVar.size();
        ArrayList arrayList3 = new ArrayList(size);
        for (int i12 = 0; i12 < size; i12++) {
            arrayList3.add(this.f6482p.f6540d.remove(this.D.g(i12)));
        }
        for (int i13 = 0; i13 < size; i13++) {
            View view2 = (View) arrayList3.get(i13);
            if (view2 != null) {
                this.f6482p.f6540d.put(this.D.l(i13), view2);
            }
        }
    }

    void m(boolean z10) {
        t tVar;
        if (z10) {
            this.f6482p.f6537a.clear();
            this.f6482p.f6538b.clear();
            tVar = this.f6482p;
        } else {
            this.f6483q.f6537a.clear();
            this.f6483q.f6538b.clear();
            tVar = this.f6483q;
        }
        tVar.f6539c.b();
    }

    @Override // 
    /* JADX INFO: renamed from: n */
    public l clone() {
        try {
            l lVar = (l) super.clone();
            lVar.B = new ArrayList<>();
            lVar.f6482p = new t();
            lVar.f6483q = new t();
            lVar.f6486t = null;
            lVar.f6487u = null;
            return lVar;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public Animator p(ViewGroup viewGroup, s sVar, s sVar2) {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void q(android.view.ViewGroup r19, c5.t r20, c5.t r21, java.util.ArrayList<c5.s> r22, java.util.ArrayList<c5.s> r23) {
        /*
            Method dump skipped, instruction units count: 313
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c5.l.q(android.view.ViewGroup, c5.t, c5.t, java.util.ArrayList, java.util.ArrayList):void");
    }

    protected void r() {
        int i10 = this.f6490x - 1;
        this.f6490x = i10;
        if (i10 == 0) {
            ArrayList<f> arrayList = this.A;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.A.clone();
                int size = arrayList2.size();
                for (int i11 = 0; i11 < size; i11++) {
                    ((f) arrayList2.get(i11)).d(this);
                }
            }
            for (int i12 = 0; i12 < this.f6482p.f6539c.m(); i12++) {
                View viewN = this.f6482p.f6539c.n(i12);
                if (viewN != null) {
                    androidx.core.view.h.e0(viewN, false);
                }
            }
            for (int i13 = 0; i13 < this.f6483q.f6539c.m(); i13++) {
                View viewN2 = this.f6483q.f6539c.n(i13);
                if (viewN2 != null) {
                    androidx.core.view.h.e0(viewN2, false);
                }
            }
            this.f6492z = true;
        }
    }

    public long s() {
        return this.f6469c;
    }

    public e t() {
        return this.C;
    }

    public String toString() {
        return f0("");
    }

    public TimeInterpolator u() {
        return this.f6470d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x002e, code lost:
    
        if (r3 < 0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0030, code lost:
    
        if (r8 == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0032, code lost:
    
        r7 = r6.f6487u;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0035, code lost:
    
        r7 = r6.f6486t;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x003e, code lost:
    
        return r7.get(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:?, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    c5.s v(android.view.View r7, boolean r8) {
        /*
            r6 = this;
            c5.p r0 = r6.f6484r
            if (r0 == 0) goto L9
            c5.s r7 = r0.v(r7, r8)
            return r7
        L9:
            if (r8 == 0) goto Le
            java.util.ArrayList<c5.s> r0 = r6.f6486t
            goto L10
        Le:
            java.util.ArrayList<c5.s> r0 = r6.f6487u
        L10:
            r1 = 0
            if (r0 != 0) goto L14
            return r1
        L14:
            int r2 = r0.size()
            r3 = -1
            r4 = 0
        L1a:
            if (r4 >= r2) goto L2e
            java.lang.Object r5 = r0.get(r4)
            c5.s r5 = (c5.s) r5
            if (r5 != 0) goto L25
            return r1
        L25:
            android.view.View r5 = r5.f6535b
            if (r5 != r7) goto L2b
            r3 = r4
            goto L2e
        L2b:
            int r4 = r4 + 1
            goto L1a
        L2e:
            if (r3 < 0) goto L3e
            if (r8 == 0) goto L35
            java.util.ArrayList<c5.s> r7 = r6.f6487u
            goto L37
        L35:
            java.util.ArrayList<c5.s> r7 = r6.f6486t
        L37:
            java.lang.Object r7 = r7.get(r3)
            r1 = r7
            c5.s r1 = (c5.s) r1
        L3e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: c5.l.v(android.view.View, boolean):c5.s");
    }

    public String x() {
        return this.f6467a;
    }

    public g z() {
        return this.E;
    }
}
