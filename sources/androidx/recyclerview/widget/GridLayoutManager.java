package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import p3.g;

/* JADX INFO: loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {
    boolean F;
    int G;
    final SparseIntArray H;
    final SparseIntArray I;
    c J;
    final Rect K;

    public static final class a extends c {
        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public int b(int i10) {
            return 1;
        }
    }

    public static class b extends RecyclerView.o {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f4540e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f4541f;

        public b(int i10, int i11) {
            super(i10, i11);
            this.f4540e = -1;
            this.f4541f = 0;
        }

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f4540e = -1;
            this.f4541f = 0;
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f4540e = -1;
            this.f4541f = 0;
        }

        public b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f4540e = -1;
            this.f4541f = 0;
        }

        public int b() {
            return this.f4540e;
        }

        public int c() {
            return this.f4541f;
        }
    }

    public static abstract class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final SparseIntArray f4542a = new SparseIntArray();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f4543b = false;

        public int a(int i10, int i11) {
            int iB = b(i10);
            int i12 = 0;
            int i13 = 0;
            for (int i14 = 0; i14 < i10; i14++) {
                int iB2 = b(i14);
                i12 += iB2;
                if (i12 == i11) {
                    i13++;
                    i12 = 0;
                } else if (i12 > i11) {
                    i13++;
                    i12 = iB2;
                }
            }
            return i12 + iB > i11 ? i13 + 1 : i13;
        }

        public abstract int b(int i10);

        public void c() {
            this.f4542a.clear();
        }
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.F = false;
        this.G = -1;
        this.H = new SparseIntArray();
        this.I = new SparseIntArray();
        this.J = new a();
        this.K = new Rect();
        Y0(RecyclerView.n.J(context, attributeSet, i10, i11).f4679b);
    }

    private int X0(RecyclerView.u uVar, RecyclerView.y yVar, int i10) {
        if (!yVar.b()) {
            return this.J.a(i10, this.G);
        }
        int iD = uVar.d(i10);
        if (iD != -1) {
            return this.J.a(iD, this.G);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i10);
        return 0;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.n
    public boolean H0() {
        return this.B == null && !this.F;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public int L(RecyclerView.u uVar, RecyclerView.y yVar) {
        if (this.f4544q == 0) {
            return this.G;
        }
        if (yVar.a() < 1) {
            return 0;
        }
        return X0(uVar, yVar, yVar.a() - 1) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void W0(boolean z10) {
        if (z10) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.W0(false);
    }

    public void Y0(int i10) {
        if (i10 == this.G) {
            return;
        }
        this.F = true;
        if (i10 >= 1) {
            this.G = i10;
            this.J.c();
            D0();
        } else {
            throw new IllegalArgumentException("Span count should be at least 1. Provided " + i10);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public boolean d(RecyclerView.o oVar) {
        return oVar instanceof b;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void e0(RecyclerView.u uVar, RecyclerView.y yVar, View view, p3.g gVar) {
        int iC;
        int iB;
        int iC2;
        boolean z10;
        boolean z11;
        int i10;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof b)) {
            super.d0(view, gVar);
            return;
        }
        b bVar = (b) layoutParams;
        int iX0 = X0(uVar, yVar, bVar.a());
        if (this.f4544q == 0) {
            int iB2 = bVar.b();
            iC = bVar.c();
            iC2 = 1;
            z10 = this.G > 1 && bVar.c() == this.G;
            z11 = false;
            i10 = iB2;
            iB = iX0;
        } else {
            iC = 1;
            iB = bVar.b();
            iC2 = bVar.c();
            z10 = this.G > 1 && bVar.c() == this.G;
            z11 = false;
            i10 = iX0;
        }
        gVar.h0(g.f.a(i10, iC, iB, iC2, z10, z11));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void g0(RecyclerView recyclerView, int i10, int i11) {
        this.J.c();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void h0(RecyclerView recyclerView) {
        this.J.c();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void i0(RecyclerView recyclerView, int i10, int i11, int i12) {
        this.J.c();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void j0(RecyclerView recyclerView, int i10, int i11) {
        this.J.c();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void l0(RecyclerView recyclerView, int i10, int i11, Object obj) {
        this.J.c();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.n
    public RecyclerView.o n() {
        return this.f4544q == 0 ? new b(-2, -1) : new b(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public RecyclerView.o o(Context context, AttributeSet attributeSet) {
        return new b(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public RecyclerView.o p(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new b((ViewGroup.MarginLayoutParams) layoutParams) : new b(layoutParams);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public int v(RecyclerView.u uVar, RecyclerView.y yVar) {
        if (this.f4544q == 1) {
            return this.G;
        }
        if (yVar.a() < 1) {
            return 0;
        }
        return X0(uVar, yVar, yVar.a() - 1) + 1;
    }
}
