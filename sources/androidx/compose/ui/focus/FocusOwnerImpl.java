package androidx.compose.ui.focus;

import a2.f0;
import a2.r0;
import a2.w0;
import ae.d0;
import android.view.KeyEvent;
import androidx.compose.ui.e;
import androidx.compose.ui.focus.b;
import androidx.compose.ui.focus.f;
import j1.o;
import java.util.ArrayList;
import md.i0;
import md.q;
import t1.c;
import w2.r;
import z.s;

/* JADX INFO: loaded from: classes.dex */
public final class FocusOwnerImpl implements j1.i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final j1.e f2678b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public r f2681e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private s f2682f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private FocusTargetNode f2677a = new FocusTargetNode();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final j1.s f2679c = new j1.s();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final androidx.compose.ui.e f2680d = new r0<FocusTargetNode>() { // from class: androidx.compose.ui.focus.FocusOwnerImpl$modifier$1
        public boolean equals(Object obj) {
            return obj == this;
        }

        @Override // a2.r0
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public FocusTargetNode a() {
            return this.f2690b.r();
        }

        @Override // a2.r0
        public int hashCode() {
            return this.f2690b.r().hashCode();
        }

        @Override // a2.r0
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public void c(FocusTargetNode focusTargetNode) {
        }
    };

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f2683a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f2684b;

        static {
            int[] iArr = new int[j1.a.values().length];
            try {
                iArr[j1.a.Redirected.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[j1.a.Cancelled.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[j1.a.RedirectCancelled.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[j1.a.None.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f2683a = iArr;
            int[] iArr2 = new int[o.values().length];
            try {
                iArr2[o.Active.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[o.ActiveParent.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[o.Captured.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[o.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            f2684b = iArr2;
        }
    }

    static final class b extends ae.s implements zd.l<FocusTargetNode, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ FocusTargetNode f2685a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ FocusOwnerImpl f2686b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f2687c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ d0 f2688d;

        public /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f2689a;

            static {
                int[] iArr = new int[j1.a.values().length];
                try {
                    iArr[j1.a.Redirected.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[j1.a.Cancelled.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[j1.a.RedirectCancelled.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[j1.a.None.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                f2689a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(FocusTargetNode focusTargetNode, FocusOwnerImpl focusOwnerImpl, int i10, d0 d0Var) {
            super(1);
            this.f2685a = focusTargetNode;
            this.f2686b = focusOwnerImpl;
            this.f2687c = i10;
            this.f2688d = d0Var;
        }

        @Override // zd.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(FocusTargetNode focusTargetNode) {
            e.c cVar;
            boolean zI;
            androidx.compose.ui.node.a aVarH0;
            if (ae.r.b(focusTargetNode, this.f2685a)) {
                return Boolean.FALSE;
            }
            int iA = w0.a(1024);
            if (!focusTargetNode.L0().H1()) {
                throw new IllegalStateException("visitAncestors called on an unattached node".toString());
            }
            e.c cVarE1 = focusTargetNode.L0().E1();
            f0 f0VarK = a2.k.k(focusTargetNode);
            loop0: while (true) {
                cVar = null;
                zI = true;
                if (f0VarK == null) {
                    break;
                }
                if ((f0VarK.h0().k().x1() & iA) != 0) {
                    while (cVarE1 != null) {
                        if ((cVarE1.C1() & iA) != 0) {
                            e.c cVarG = cVarE1;
                            v0.d dVar = null;
                            while (cVarG != null) {
                                if (cVarG instanceof FocusTargetNode) {
                                    cVar = cVarG;
                                    break loop0;
                                }
                                if (((cVarG.C1() & iA) != 0) && (cVarG instanceof a2.l)) {
                                    int i10 = 0;
                                    for (e.c cVarB2 = ((a2.l) cVarG).b2(); cVarB2 != null; cVarB2 = cVarB2.y1()) {
                                        if ((cVarB2.C1() & iA) != 0) {
                                            i10++;
                                            if (i10 == 1) {
                                                cVarG = cVarB2;
                                            } else {
                                                if (dVar == null) {
                                                    dVar = new v0.d(new e.c[16], 0);
                                                }
                                                if (cVarG != null) {
                                                    dVar.b(cVarG);
                                                    cVarG = null;
                                                }
                                                dVar.b(cVarB2);
                                            }
                                        }
                                    }
                                    if (i10 == 1) {
                                    }
                                }
                                cVarG = a2.k.g(dVar);
                            }
                        }
                        cVarE1 = cVarE1.E1();
                    }
                }
                f0VarK = f0VarK.k0();
                cVarE1 = (f0VarK == null || (aVarH0 = f0VarK.h0()) == null) ? null : aVarH0.o();
            }
            if (cVar == null) {
                throw new IllegalStateException("Focus search landed at the root.".toString());
            }
            j1.s sVarH = this.f2686b.h();
            int i11 = this.f2687c;
            d0 d0Var = this.f2688d;
            try {
                if (sVarH.f13821c) {
                    sVarH.g();
                }
                sVarH.f();
                int i12 = a.f2689a[h.h(focusTargetNode, i11).ordinal()];
                if (i12 != 1) {
                    if (i12 == 2 || i12 == 3) {
                        d0Var.f699a = true;
                    } else {
                        if (i12 != 4) {
                            throw new q();
                        }
                        zI = h.i(focusTargetNode);
                    }
                }
                return Boolean.valueOf(zI);
            } finally {
                sVarH.h();
            }
        }
    }

    public FocusOwnerImpl(zd.l<? super zd.a<i0>, i0> lVar) {
        this.f2678b = new j1.e(lVar);
    }

    private final e.c s(a2.j jVar) {
        int iA = w0.a(1024) | w0.a(8192);
        if (!jVar.L0().H1()) {
            throw new IllegalStateException("visitLocalDescendants called on an unattached node".toString());
        }
        e.c cVarL0 = jVar.L0();
        e.c cVar = null;
        if ((cVarL0.x1() & iA) != 0) {
            while (true) {
                cVarL0 = cVarL0.y1();
                if (cVarL0 == null) {
                    break;
                }
                if ((cVarL0.C1() & iA) != 0) {
                    if ((w0.a(1024) & cVarL0.C1()) != 0) {
                        return cVar;
                    }
                    cVar = cVarL0;
                }
            }
        }
        return cVar;
    }

    private final boolean t(KeyEvent keyEvent) {
        long jA = t1.d.a(keyEvent);
        int iB = t1.d.b(keyEvent);
        c.a aVar = t1.c.f21207a;
        if (t1.c.e(iB, aVar.a())) {
            s sVar = this.f2682f;
            if (sVar == null) {
                sVar = new s(3);
                this.f2682f = sVar;
            }
            sVar.k(jA);
        } else if (t1.c.e(iB, aVar.b())) {
            s sVar2 = this.f2682f;
            if (!(sVar2 != null && sVar2.a(jA))) {
                return false;
            }
            s sVar3 = this.f2682f;
            if (sVar3 != null) {
                sVar3.l(jA);
            }
        }
        return true;
    }

    private final boolean u(int i10) {
        if (this.f2677a.h2().c() && !this.f2677a.h2().a()) {
            b.a aVar = androidx.compose.ui.focus.b.f2698b;
            if (androidx.compose.ui.focus.b.l(i10, aVar.e()) ? true : androidx.compose.ui.focus.b.l(i10, aVar.f())) {
                o(false);
                if (this.f2677a.h2().a()) {
                    return j(i10);
                }
                return false;
            }
        }
        return false;
    }

    @Override // j1.i
    public void a(r rVar) {
        this.f2681e = rVar;
    }

    @Override // j1.i
    public void b(FocusTargetNode focusTargetNode) {
        this.f2678b.d(focusTargetNode);
    }

    @Override // j1.i
    public androidx.compose.ui.e c() {
        return this.f2680d;
    }

    @Override // j1.i
    public void d() {
        if (this.f2677a.h2() == o.Inactive) {
            this.f2677a.k2(o.Active);
        }
    }

    @Override // j1.i
    public void f(boolean z10, boolean z11) {
        o oVar;
        j1.s sVarH = h();
        try {
            if (sVarH.f13821c) {
                sVarH.g();
            }
            sVarH.f();
            if (!z10) {
                int i10 = a.f2683a[h.e(this.f2677a, androidx.compose.ui.focus.b.f2698b.c()).ordinal()];
                if (i10 == 1 || i10 == 2 || i10 == 3) {
                    return;
                }
            }
            o oVarH2 = this.f2677a.h2();
            if (h.c(this.f2677a, z10, z11)) {
                FocusTargetNode focusTargetNode = this.f2677a;
                int i11 = a.f2684b[oVarH2.ordinal()];
                if (i11 == 1 || i11 == 2 || i11 == 3) {
                    oVar = o.Active;
                } else {
                    if (i11 != 4) {
                        throw new q();
                    }
                    oVar = o.Inactive;
                }
                focusTargetNode.k2(oVar);
            }
            i0 i0Var = i0.f15558a;
        } finally {
            sVarH.h();
        }
    }

    @Override // j1.i
    public void g(j1.j jVar) {
        this.f2678b.f(jVar);
    }

    @Override // j1.i
    public j1.s h() {
        return this.f2679c;
    }

    @Override // j1.i
    public k1.h i() {
        FocusTargetNode focusTargetNodeB = i.b(this.f2677a);
        if (focusTargetNodeB != null) {
            return i.d(focusTargetNodeB);
        }
        return null;
    }

    @Override // j1.f
    public boolean j(int i10) {
        FocusTargetNode focusTargetNodeB = i.b(this.f2677a);
        if (focusTargetNodeB == null) {
            return false;
        }
        f fVarA = i.a(focusTargetNodeB, i10, q());
        f.a aVar = f.f2723b;
        if (fVarA != aVar.b()) {
            return fVarA != aVar.a() && fVarA.c();
        }
        d0 d0Var = new d0();
        boolean zE = i.e(this.f2677a, i10, q(), new b(focusTargetNodeB, this, i10, d0Var));
        if (d0Var.f699a) {
            return false;
        }
        return zE || u(i10);
    }

    @Override // j1.i
    public void k(j1.c cVar) {
        this.f2678b.e(cVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v24 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r1v24, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v4, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r1v42 */
    /* JADX WARN: Type inference failed for: r1v43 */
    /* JADX WARN: Type inference failed for: r1v44 */
    /* JADX WARN: Type inference failed for: r1v45 */
    /* JADX WARN: Type inference failed for: r1v5, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r1v6, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r1v7, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r9v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v25 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    @Override // j1.i
    public boolean l(KeyEvent keyEvent) {
        t1.g gVar;
        int size;
        androidx.compose.ui.node.a aVarH0;
        ?? G;
        androidx.compose.ui.node.a aVarH02;
        FocusTargetNode focusTargetNodeB = i.b(this.f2677a);
        if (focusTargetNodeB != null) {
            int iA = w0.a(131072);
            if (!focusTargetNodeB.L0().H1()) {
                throw new IllegalStateException("visitAncestors called on an unattached node".toString());
            }
            e.c cVarE1 = focusTargetNodeB.L0().E1();
            f0 f0VarK = a2.k.k(focusTargetNodeB);
            loop0: while (true) {
                if (f0VarK == null) {
                    G = 0;
                    break;
                }
                if ((f0VarK.h0().k().x1() & iA) != 0) {
                    while (cVarE1 != null) {
                        if ((cVarE1.C1() & iA) != 0) {
                            v0.d dVar = null;
                            G = cVarE1;
                            while (G != 0) {
                                if (G instanceof t1.g) {
                                    break loop0;
                                }
                                if (((G.C1() & iA) != 0) && (G instanceof a2.l)) {
                                    e.c cVarB2 = ((a2.l) G).b2();
                                    int i10 = 0;
                                    G = G;
                                    while (cVarB2 != null) {
                                        if ((cVarB2.C1() & iA) != 0) {
                                            i10++;
                                            if (i10 == 1) {
                                                G = cVarB2;
                                            } else {
                                                if (dVar == null) {
                                                    dVar = new v0.d(new e.c[16], 0);
                                                }
                                                if (G != 0) {
                                                    dVar.b(G);
                                                    G = 0;
                                                }
                                                dVar.b(cVarB2);
                                            }
                                        }
                                        cVarB2 = cVarB2.y1();
                                        G = G;
                                    }
                                    if (i10 == 1) {
                                    }
                                }
                                G = a2.k.g(dVar);
                            }
                        }
                        cVarE1 = cVarE1.E1();
                    }
                }
                f0VarK = f0VarK.k0();
                cVarE1 = (f0VarK == null || (aVarH02 = f0VarK.h0()) == null) ? null : aVarH02.o();
            }
            gVar = (t1.g) G;
        } else {
            gVar = null;
        }
        if (gVar != null) {
            int iA2 = w0.a(131072);
            if (!gVar.L0().H1()) {
                throw new IllegalStateException("visitAncestors called on an unattached node".toString());
            }
            e.c cVarE12 = gVar.L0().E1();
            f0 f0VarK2 = a2.k.k(gVar);
            ArrayList arrayList = null;
            while (f0VarK2 != null) {
                if ((f0VarK2.h0().k().x1() & iA2) != 0) {
                    while (cVarE12 != null) {
                        if ((cVarE12.C1() & iA2) != 0) {
                            e.c cVarG = cVarE12;
                            v0.d dVar2 = null;
                            while (cVarG != null) {
                                if (cVarG instanceof t1.g) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.add(cVarG);
                                } else if (((cVarG.C1() & iA2) != 0) && (cVarG instanceof a2.l)) {
                                    int i11 = 0;
                                    for (e.c cVarB22 = ((a2.l) cVarG).b2(); cVarB22 != null; cVarB22 = cVarB22.y1()) {
                                        if ((cVarB22.C1() & iA2) != 0) {
                                            i11++;
                                            if (i11 == 1) {
                                                cVarG = cVarB22;
                                            } else {
                                                if (dVar2 == null) {
                                                    dVar2 = new v0.d(new e.c[16], 0);
                                                }
                                                if (cVarG != null) {
                                                    dVar2.b(cVarG);
                                                    cVarG = null;
                                                }
                                                dVar2.b(cVarB22);
                                            }
                                        }
                                    }
                                    if (i11 == 1) {
                                    }
                                }
                                cVarG = a2.k.g(dVar2);
                            }
                        }
                        cVarE12 = cVarE12.E1();
                    }
                }
                f0VarK2 = f0VarK2.k0();
                cVarE12 = (f0VarK2 == null || (aVarH0 = f0VarK2.h0()) == null) ? null : aVarH0.o();
            }
            if (arrayList != null && arrayList.size() - 1 >= 0) {
                while (true) {
                    int i12 = size - 1;
                    if (((t1.g) arrayList.get(size)).L(keyEvent)) {
                        return true;
                    }
                    if (i12 < 0) {
                        break;
                    }
                    size = i12;
                }
            }
            ?? L0 = gVar.L0();
            v0.d dVar3 = null;
            while (L0 != 0) {
                if (!(L0 instanceof t1.g)) {
                    if (((L0.C1() & iA2) != 0) && (L0 instanceof a2.l)) {
                        e.c cVarB23 = ((a2.l) L0).b2();
                        int i13 = 0;
                        L0 = L0;
                        while (cVarB23 != null) {
                            if ((cVarB23.C1() & iA2) != 0) {
                                i13++;
                                if (i13 == 1) {
                                    L0 = cVarB23;
                                } else {
                                    if (dVar3 == null) {
                                        dVar3 = new v0.d(new e.c[16], 0);
                                    }
                                    if (L0 != 0) {
                                        dVar3.b(L0);
                                        L0 = 0;
                                    }
                                    dVar3.b(cVarB23);
                                }
                            }
                            cVarB23 = cVarB23.y1();
                            L0 = L0;
                        }
                        if (i13 == 1) {
                        }
                    }
                } else if (((t1.g) L0).L(keyEvent)) {
                    return true;
                }
                L0 = a2.k.g(dVar3);
            }
            ?? L02 = gVar.L0();
            v0.d dVar4 = null;
            while (L02 != 0) {
                if (!(L02 instanceof t1.g)) {
                    if (((L02.C1() & iA2) != 0) && (L02 instanceof a2.l)) {
                        e.c cVarB24 = ((a2.l) L02).b2();
                        int i14 = 0;
                        L02 = L02;
                        while (cVarB24 != null) {
                            if ((cVarB24.C1() & iA2) != 0) {
                                i14++;
                                if (i14 == 1) {
                                    L02 = cVarB24;
                                } else {
                                    if (dVar4 == null) {
                                        dVar4 = new v0.d(new e.c[16], 0);
                                    }
                                    if (L02 != 0) {
                                        dVar4.b(L02);
                                        L02 = 0;
                                    }
                                    dVar4.b(cVarB24);
                                }
                            }
                            cVarB24 = cVarB24.y1();
                            L02 = L02;
                        }
                        if (i14 == 1) {
                        }
                    }
                } else if (((t1.g) L02).E0(keyEvent)) {
                    return true;
                }
                L02 = a2.k.g(dVar4);
            }
            if (arrayList != null) {
                int size2 = arrayList.size();
                for (int i15 = 0; i15 < size2; i15++) {
                    if (((t1.g) arrayList.get(i15)).E0(keyEvent)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v24 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r1v24, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v4, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r1v42 */
    /* JADX WARN: Type inference failed for: r1v43 */
    /* JADX WARN: Type inference failed for: r1v44 */
    /* JADX WARN: Type inference failed for: r1v45 */
    /* JADX WARN: Type inference failed for: r1v5, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r1v6, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r1v7, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r9v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v25 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    @Override // j1.i
    public boolean m(x1.b bVar) {
        x1.a aVar;
        int size;
        androidx.compose.ui.node.a aVarH0;
        ?? G;
        androidx.compose.ui.node.a aVarH02;
        FocusTargetNode focusTargetNodeB = i.b(this.f2677a);
        if (focusTargetNodeB != null) {
            int iA = w0.a(16384);
            if (!focusTargetNodeB.L0().H1()) {
                throw new IllegalStateException("visitAncestors called on an unattached node".toString());
            }
            e.c cVarE1 = focusTargetNodeB.L0().E1();
            f0 f0VarK = a2.k.k(focusTargetNodeB);
            loop0: while (true) {
                if (f0VarK == null) {
                    G = 0;
                    break;
                }
                if ((f0VarK.h0().k().x1() & iA) != 0) {
                    while (cVarE1 != null) {
                        if ((cVarE1.C1() & iA) != 0) {
                            v0.d dVar = null;
                            G = cVarE1;
                            while (G != 0) {
                                if (G instanceof x1.a) {
                                    break loop0;
                                }
                                if (((G.C1() & iA) != 0) && (G instanceof a2.l)) {
                                    e.c cVarB2 = ((a2.l) G).b2();
                                    int i10 = 0;
                                    G = G;
                                    while (cVarB2 != null) {
                                        if ((cVarB2.C1() & iA) != 0) {
                                            i10++;
                                            if (i10 == 1) {
                                                G = cVarB2;
                                            } else {
                                                if (dVar == null) {
                                                    dVar = new v0.d(new e.c[16], 0);
                                                }
                                                if (G != 0) {
                                                    dVar.b(G);
                                                    G = 0;
                                                }
                                                dVar.b(cVarB2);
                                            }
                                        }
                                        cVarB2 = cVarB2.y1();
                                        G = G;
                                    }
                                    if (i10 == 1) {
                                    }
                                }
                                G = a2.k.g(dVar);
                            }
                        }
                        cVarE1 = cVarE1.E1();
                    }
                }
                f0VarK = f0VarK.k0();
                cVarE1 = (f0VarK == null || (aVarH02 = f0VarK.h0()) == null) ? null : aVarH02.o();
            }
            aVar = (x1.a) G;
        } else {
            aVar = null;
        }
        if (aVar != null) {
            int iA2 = w0.a(16384);
            if (!aVar.L0().H1()) {
                throw new IllegalStateException("visitAncestors called on an unattached node".toString());
            }
            e.c cVarE12 = aVar.L0().E1();
            f0 f0VarK2 = a2.k.k(aVar);
            ArrayList arrayList = null;
            while (f0VarK2 != null) {
                if ((f0VarK2.h0().k().x1() & iA2) != 0) {
                    while (cVarE12 != null) {
                        if ((cVarE12.C1() & iA2) != 0) {
                            e.c cVarG = cVarE12;
                            v0.d dVar2 = null;
                            while (cVarG != null) {
                                if (cVarG instanceof x1.a) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.add(cVarG);
                                } else if (((cVarG.C1() & iA2) != 0) && (cVarG instanceof a2.l)) {
                                    int i11 = 0;
                                    for (e.c cVarB22 = ((a2.l) cVarG).b2(); cVarB22 != null; cVarB22 = cVarB22.y1()) {
                                        if ((cVarB22.C1() & iA2) != 0) {
                                            i11++;
                                            if (i11 == 1) {
                                                cVarG = cVarB22;
                                            } else {
                                                if (dVar2 == null) {
                                                    dVar2 = new v0.d(new e.c[16], 0);
                                                }
                                                if (cVarG != null) {
                                                    dVar2.b(cVarG);
                                                    cVarG = null;
                                                }
                                                dVar2.b(cVarB22);
                                            }
                                        }
                                    }
                                    if (i11 == 1) {
                                    }
                                }
                                cVarG = a2.k.g(dVar2);
                            }
                        }
                        cVarE12 = cVarE12.E1();
                    }
                }
                f0VarK2 = f0VarK2.k0();
                cVarE12 = (f0VarK2 == null || (aVarH0 = f0VarK2.h0()) == null) ? null : aVarH0.o();
            }
            if (arrayList != null && arrayList.size() - 1 >= 0) {
                while (true) {
                    int i12 = size - 1;
                    if (((x1.a) arrayList.get(size)).q0(bVar)) {
                        return true;
                    }
                    if (i12 < 0) {
                        break;
                    }
                    size = i12;
                }
            }
            ?? L0 = aVar.L0();
            v0.d dVar3 = null;
            while (L0 != 0) {
                if (!(L0 instanceof x1.a)) {
                    if (((L0.C1() & iA2) != 0) && (L0 instanceof a2.l)) {
                        e.c cVarB23 = ((a2.l) L0).b2();
                        int i13 = 0;
                        L0 = L0;
                        while (cVarB23 != null) {
                            if ((cVarB23.C1() & iA2) != 0) {
                                i13++;
                                if (i13 == 1) {
                                    L0 = cVarB23;
                                } else {
                                    if (dVar3 == null) {
                                        dVar3 = new v0.d(new e.c[16], 0);
                                    }
                                    if (L0 != 0) {
                                        dVar3.b(L0);
                                        L0 = 0;
                                    }
                                    dVar3.b(cVarB23);
                                }
                            }
                            cVarB23 = cVarB23.y1();
                            L0 = L0;
                        }
                        if (i13 == 1) {
                        }
                    }
                } else if (((x1.a) L0).q0(bVar)) {
                    return true;
                }
                L0 = a2.k.g(dVar3);
            }
            ?? L02 = aVar.L0();
            v0.d dVar4 = null;
            while (L02 != 0) {
                if (!(L02 instanceof x1.a)) {
                    if (((L02.C1() & iA2) != 0) && (L02 instanceof a2.l)) {
                        e.c cVarB24 = ((a2.l) L02).b2();
                        int i14 = 0;
                        L02 = L02;
                        while (cVarB24 != null) {
                            if ((cVarB24.C1() & iA2) != 0) {
                                i14++;
                                if (i14 == 1) {
                                    L02 = cVarB24;
                                } else {
                                    if (dVar4 == null) {
                                        dVar4 = new v0.d(new e.c[16], 0);
                                    }
                                    if (L02 != 0) {
                                        dVar4.b(L02);
                                        L02 = 0;
                                    }
                                    dVar4.b(cVarB24);
                                }
                            }
                            cVarB24 = cVarB24.y1();
                            L02 = L02;
                        }
                        if (i14 == 1) {
                        }
                    }
                } else if (((x1.a) L02).N0(bVar)) {
                    return true;
                }
                L02 = a2.k.g(dVar4);
            }
            if (arrayList != null) {
                int size2 = arrayList.size();
                for (int i15 = 0; i15 < size2; i15++) {
                    if (((x1.a) arrayList.get(i15)).N0(bVar)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // j1.i
    public void n() {
        h.c(this.f2677a, true, true);
    }

    @Override // j1.f
    public void o(boolean z10) {
        f(z10, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v24 */
    /* JADX WARN: Type inference failed for: r2v10, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v3, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v20, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r3v21, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v39 */
    /* JADX WARN: Type inference failed for: r3v4, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r3v40 */
    /* JADX WARN: Type inference failed for: r3v5, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v31 */
    /* JADX WARN: Type inference failed for: r9v32 */
    /* JADX WARN: Type inference failed for: r9v40 */
    /* JADX WARN: Type inference failed for: r9v41, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r9v42 */
    /* JADX WARN: Type inference failed for: r9v43, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r9v44, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v45 */
    /* JADX WARN: Type inference failed for: r9v46 */
    /* JADX WARN: Type inference failed for: r9v47 */
    /* JADX WARN: Type inference failed for: r9v48 */
    /* JADX WARN: Type inference failed for: r9v49 */
    /* JADX WARN: Type inference failed for: r9v50 */
    @Override // j1.i
    public boolean p(KeyEvent keyEvent) {
        int size;
        androidx.compose.ui.node.a aVarH0;
        ?? G;
        androidx.compose.ui.node.a aVarH02;
        if (!t(keyEvent)) {
            return false;
        }
        FocusTargetNode focusTargetNodeB = i.b(this.f2677a);
        if (focusTargetNodeB == null) {
            throw new IllegalStateException("Event can't be processed because we do not have an active focus target.".toString());
        }
        e.c cVarS = s(focusTargetNodeB);
        if (cVarS == null) {
            int iA = w0.a(8192);
            if (!focusTargetNodeB.L0().H1()) {
                throw new IllegalStateException("visitAncestors called on an unattached node".toString());
            }
            e.c cVarE1 = focusTargetNodeB.L0().E1();
            f0 f0VarK = a2.k.k(focusTargetNodeB);
            loop0: while (true) {
                if (f0VarK == null) {
                    G = 0;
                    break;
                }
                if ((f0VarK.h0().k().x1() & iA) != 0) {
                    while (cVarE1 != null) {
                        if ((cVarE1.C1() & iA) != 0) {
                            v0.d dVar = null;
                            G = cVarE1;
                            while (G != 0) {
                                if (G instanceof t1.e) {
                                    break loop0;
                                }
                                if (((G.C1() & iA) != 0) && (G instanceof a2.l)) {
                                    e.c cVarB2 = ((a2.l) G).b2();
                                    int i10 = 0;
                                    G = G;
                                    while (cVarB2 != null) {
                                        if ((cVarB2.C1() & iA) != 0) {
                                            i10++;
                                            if (i10 == 1) {
                                                G = cVarB2;
                                            } else {
                                                if (dVar == null) {
                                                    dVar = new v0.d(new e.c[16], 0);
                                                }
                                                if (G != 0) {
                                                    dVar.b(G);
                                                    G = 0;
                                                }
                                                dVar.b(cVarB2);
                                            }
                                        }
                                        cVarB2 = cVarB2.y1();
                                        G = G;
                                    }
                                    if (i10 == 1) {
                                    }
                                }
                                G = a2.k.g(dVar);
                            }
                        }
                        cVarE1 = cVarE1.E1();
                    }
                }
                f0VarK = f0VarK.k0();
                cVarE1 = (f0VarK == null || (aVarH02 = f0VarK.h0()) == null) ? null : aVarH02.o();
            }
            t1.e eVar = (t1.e) G;
            cVarS = eVar != null ? eVar.L0() : null;
        }
        if (cVarS != null) {
            int iA2 = w0.a(8192);
            if (!cVarS.L0().H1()) {
                throw new IllegalStateException("visitAncestors called on an unattached node".toString());
            }
            e.c cVarE12 = cVarS.L0().E1();
            f0 f0VarK2 = a2.k.k(cVarS);
            ArrayList arrayList = null;
            while (f0VarK2 != null) {
                if ((f0VarK2.h0().k().x1() & iA2) != 0) {
                    while (cVarE12 != null) {
                        if ((cVarE12.C1() & iA2) != 0) {
                            e.c cVarG = cVarE12;
                            v0.d dVar2 = null;
                            while (cVarG != null) {
                                if (cVarG instanceof t1.e) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.add(cVarG);
                                } else if (((cVarG.C1() & iA2) != 0) && (cVarG instanceof a2.l)) {
                                    int i11 = 0;
                                    for (e.c cVarB22 = ((a2.l) cVarG).b2(); cVarB22 != null; cVarB22 = cVarB22.y1()) {
                                        if ((cVarB22.C1() & iA2) != 0) {
                                            i11++;
                                            if (i11 == 1) {
                                                cVarG = cVarB22;
                                            } else {
                                                if (dVar2 == null) {
                                                    dVar2 = new v0.d(new e.c[16], 0);
                                                }
                                                if (cVarG != null) {
                                                    dVar2.b(cVarG);
                                                    cVarG = null;
                                                }
                                                dVar2.b(cVarB22);
                                            }
                                        }
                                    }
                                    if (i11 == 1) {
                                    }
                                }
                                cVarG = a2.k.g(dVar2);
                            }
                        }
                        cVarE12 = cVarE12.E1();
                    }
                }
                f0VarK2 = f0VarK2.k0();
                cVarE12 = (f0VarK2 == null || (aVarH0 = f0VarK2.h0()) == null) ? null : aVarH0.o();
            }
            if (arrayList != null && arrayList.size() - 1 >= 0) {
                while (true) {
                    int i12 = size - 1;
                    if (((t1.e) arrayList.get(size)).E(keyEvent)) {
                        return true;
                    }
                    if (i12 < 0) {
                        break;
                    }
                    size = i12;
                }
            }
            ?? L0 = cVarS.L0();
            v0.d dVar3 = null;
            while (L0 != 0) {
                if (!(L0 instanceof t1.e)) {
                    if (((L0.C1() & iA2) != 0) && (L0 instanceof a2.l)) {
                        e.c cVarB23 = ((a2.l) L0).b2();
                        int i13 = 0;
                        L0 = L0;
                        while (cVarB23 != null) {
                            if ((cVarB23.C1() & iA2) != 0) {
                                i13++;
                                if (i13 == 1) {
                                    L0 = cVarB23;
                                } else {
                                    if (dVar3 == null) {
                                        dVar3 = new v0.d(new e.c[16], 0);
                                    }
                                    if (L0 != 0) {
                                        dVar3.b(L0);
                                        L0 = 0;
                                    }
                                    dVar3.b(cVarB23);
                                }
                            }
                            cVarB23 = cVarB23.y1();
                            L0 = L0;
                        }
                        if (i13 == 1) {
                        }
                    }
                } else if (((t1.e) L0).E(keyEvent)) {
                    return true;
                }
                L0 = a2.k.g(dVar3);
            }
            ?? L02 = cVarS.L0();
            v0.d dVar4 = null;
            while (L02 != 0) {
                if (!(L02 instanceof t1.e)) {
                    if (((L02.C1() & iA2) != 0) && (L02 instanceof a2.l)) {
                        e.c cVarB24 = ((a2.l) L02).b2();
                        int i14 = 0;
                        L02 = L02;
                        while (cVarB24 != null) {
                            if ((cVarB24.C1() & iA2) != 0) {
                                i14++;
                                if (i14 == 1) {
                                    L02 = cVarB24;
                                } else {
                                    if (dVar4 == null) {
                                        dVar4 = new v0.d(new e.c[16], 0);
                                    }
                                    if (L02 != 0) {
                                        dVar4.b(L02);
                                        L02 = 0;
                                    }
                                    dVar4.b(cVarB24);
                                }
                            }
                            cVarB24 = cVarB24.y1();
                            L02 = L02;
                        }
                        if (i14 == 1) {
                        }
                    }
                } else if (((t1.e) L02).V(keyEvent)) {
                    return true;
                }
                L02 = a2.k.g(dVar4);
            }
            if (arrayList != null) {
                int size2 = arrayList.size();
                for (int i15 = 0; i15 < size2; i15++) {
                    if (((t1.e) arrayList.get(i15)).V(keyEvent)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public r q() {
        r rVar = this.f2681e;
        if (rVar != null) {
            return rVar;
        }
        ae.r.t("layoutDirection");
        return null;
    }

    public final FocusTargetNode r() {
        return this.f2677a;
    }
}
