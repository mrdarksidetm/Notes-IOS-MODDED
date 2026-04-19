package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final RecyclerView.n f4877a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f4878b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Rect f4879c;

    static class a extends h {
        a(RecyclerView.n nVar) {
            super(nVar, null);
        }

        @Override // androidx.recyclerview.widget.h
        public int d(View view) {
            return this.f4877a.z(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.o) view.getLayoutParams())).rightMargin;
        }

        @Override // androidx.recyclerview.widget.h
        public int e(View view) {
            return this.f4877a.y(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.o) view.getLayoutParams())).leftMargin;
        }

        @Override // androidx.recyclerview.widget.h
        public int f() {
            return this.f4877a.O() - this.f4877a.G();
        }

        @Override // androidx.recyclerview.widget.h
        public int g() {
            return this.f4877a.F();
        }

        @Override // androidx.recyclerview.widget.h
        public int h() {
            return (this.f4877a.O() - this.f4877a.F()) - this.f4877a.G();
        }
    }

    static class b extends h {
        b(RecyclerView.n nVar) {
            super(nVar, null);
        }

        @Override // androidx.recyclerview.widget.h
        public int d(View view) {
            return this.f4877a.w(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.o) view.getLayoutParams())).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.h
        public int e(View view) {
            return this.f4877a.A(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.o) view.getLayoutParams())).topMargin;
        }

        @Override // androidx.recyclerview.widget.h
        public int f() {
            return this.f4877a.B() - this.f4877a.E();
        }

        @Override // androidx.recyclerview.widget.h
        public int g() {
            return this.f4877a.H();
        }

        @Override // androidx.recyclerview.widget.h
        public int h() {
            return (this.f4877a.B() - this.f4877a.H()) - this.f4877a.E();
        }
    }

    private h(RecyclerView.n nVar) {
        this.f4878b = Integer.MIN_VALUE;
        this.f4879c = new Rect();
        this.f4877a = nVar;
    }

    /* synthetic */ h(RecyclerView.n nVar, a aVar) {
        this(nVar);
    }

    public static h a(RecyclerView.n nVar) {
        return new a(nVar);
    }

    public static h b(RecyclerView.n nVar, int i10) {
        if (i10 == 0) {
            return a(nVar);
        }
        if (i10 == 1) {
            return c(nVar);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    public static h c(RecyclerView.n nVar) {
        return new b(nVar);
    }

    public abstract int d(View view);

    public abstract int e(View view);

    public abstract int f();

    public abstract int g();

    public abstract int h();
}
