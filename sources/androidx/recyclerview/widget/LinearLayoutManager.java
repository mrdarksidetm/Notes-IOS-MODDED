package androidx.recyclerview.widget;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class LinearLayoutManager extends RecyclerView.n {
    private boolean A;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private c f4545r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    h f4546s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f4547t;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    int f4544q = 1;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f4548u = false;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    boolean f4549v = false;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f4550w = false;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f4551x = true;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    int f4552y = -1;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    int f4553z = Integer.MIN_VALUE;
    d B = null;
    final a C = new a();
    private final b D = new b();
    private int E = 2;

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        h f4554a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f4555b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f4556c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f4557d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f4558e;

        a() {
            a();
        }

        void a() {
            this.f4555b = -1;
            this.f4556c = Integer.MIN_VALUE;
            this.f4557d = false;
            this.f4558e = false;
        }

        public String toString() {
            return "AnchorInfo{mPosition=" + this.f4555b + ", mCoordinate=" + this.f4556c + ", mLayoutFromEnd=" + this.f4557d + ", mValid=" + this.f4558e + '}';
        }
    }

    protected static class b {
        protected b() {
        }
    }

    static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f4559a = true;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f4560b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f4561c = false;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        List<RecyclerView.b0> f4562d = null;

        c() {
        }
    }

    public static class d implements Parcelable {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f4563a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f4564b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f4565c;

        static class a implements Parcelable.Creator<d> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public d createFromParcel(Parcel parcel) {
                return new d(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public d[] newArray(int i10) {
                return new d[i10];
            }
        }

        public d() {
        }

        d(Parcel parcel) {
            this.f4563a = parcel.readInt();
            this.f4564b = parcel.readInt();
            this.f4565c = parcel.readInt() == 1;
        }

        public d(d dVar) {
            this.f4563a = dVar.f4563a;
            this.f4564b = dVar.f4564b;
            this.f4565c = dVar.f4565c;
        }

        void a() {
            this.f4563a = -1;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f4563a);
            parcel.writeInt(this.f4564b);
            parcel.writeInt(this.f4565c ? 1 : 0);
        }
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        RecyclerView.n.c cVarJ = RecyclerView.n.J(context, attributeSet, i10, i11);
        U0(cVarJ.f4678a);
        V0(cVarJ.f4680c);
        W0(cVarJ.f4681d);
    }

    private int I0(RecyclerView.y yVar) {
        if (t() == 0) {
            return 0;
        }
        M0();
        return j.a(yVar, this.f4546s, O0(!this.f4551x, true), N0(!this.f4551x, true), this, this.f4551x);
    }

    private int J0(RecyclerView.y yVar) {
        if (t() == 0) {
            return 0;
        }
        M0();
        return j.b(yVar, this.f4546s, O0(!this.f4551x, true), N0(!this.f4551x, true), this, this.f4551x, this.f4549v);
    }

    private int K0(RecyclerView.y yVar) {
        if (t() == 0) {
            return 0;
        }
        M0();
        return j.c(yVar, this.f4546s, O0(!this.f4551x, true), N0(!this.f4551x, true), this, this.f4551x);
    }

    private View N0(boolean z10, boolean z11) {
        int iT;
        int iT2;
        if (this.f4549v) {
            iT = 0;
            iT2 = t();
        } else {
            iT = t() - 1;
            iT2 = -1;
        }
        return R0(iT, iT2, z10, z11);
    }

    private View O0(boolean z10, boolean z11) {
        int iT;
        int iT2;
        if (this.f4549v) {
            iT = t() - 1;
            iT2 = -1;
        } else {
            iT = 0;
            iT2 = t();
        }
        return R0(iT, iT2, z10, z11);
    }

    private View S0() {
        return s(this.f4549v ? 0 : t() - 1);
    }

    private View T0() {
        return s(this.f4549v ? t() - 1 : 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public boolean H0() {
        return this.B == null && this.f4547t == this.f4550w;
    }

    c L0() {
        return new c();
    }

    void M0() {
        if (this.f4545r == null) {
            this.f4545r = L0();
        }
    }

    public int P0() {
        View viewR0 = R0(0, t(), false, true);
        if (viewR0 == null) {
            return -1;
        }
        return I(viewR0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public boolean Q() {
        return true;
    }

    public int Q0() {
        View viewR0 = R0(t() - 1, -1, false, true);
        if (viewR0 == null) {
            return -1;
        }
        return I(viewR0);
    }

    View R0(int i10, int i11, boolean z10, boolean z11) {
        M0();
        return (this.f4544q == 0 ? this.f4664e : this.f4665f).a(i10, i11, z10 ? 24579 : 320, z11 ? 320 : 0);
    }

    public void U0(int i10) {
        if (i10 != 0 && i10 != 1) {
            throw new IllegalArgumentException("invalid orientation:" + i10);
        }
        a(null);
        if (i10 != this.f4544q || this.f4546s == null) {
            h hVarB = h.b(this, i10);
            this.f4546s = hVarB;
            this.C.f4554a = hVarB;
            this.f4544q = i10;
            D0();
        }
    }

    public void V0(boolean z10) {
        a(null);
        if (z10 == this.f4548u) {
            return;
        }
        this.f4548u = z10;
        D0();
    }

    public void W0(boolean z10) {
        a(null);
        if (this.f4550w == z10) {
            return;
        }
        this.f4550w = z10;
        D0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void Y(RecyclerView recyclerView, RecyclerView.u uVar) {
        super.Y(recyclerView, uVar);
        if (this.A) {
            w0(uVar);
            uVar.b();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void Z(AccessibilityEvent accessibilityEvent) {
        super.Z(accessibilityEvent);
        if (t() > 0) {
            accessibilityEvent.setFromIndex(P0());
            accessibilityEvent.setToIndex(Q0());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void a(String str) {
        if (this.B == null) {
            super.a(str);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public boolean b() {
        return this.f4544q == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public boolean c() {
        return this.f4544q == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public int f(RecyclerView.y yVar) {
        return I0(yVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public int g(RecyclerView.y yVar) {
        return J0(yVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public int h(RecyclerView.y yVar) {
        return K0(yVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public int i(RecyclerView.y yVar) {
        return I0(yVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public int j(RecyclerView.y yVar) {
        return J0(yVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public int k(RecyclerView.y yVar) {
        return K0(yVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public RecyclerView.o n() {
        return new RecyclerView.o(-2, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void p0(Parcelable parcelable) {
        if (parcelable instanceof d) {
            this.B = (d) parcelable;
            D0();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public Parcelable q0() {
        if (this.B != null) {
            return new d(this.B);
        }
        d dVar = new d();
        if (t() > 0) {
            M0();
            boolean z10 = this.f4547t ^ this.f4549v;
            dVar.f4565c = z10;
            if (z10) {
                View viewS0 = S0();
                dVar.f4564b = this.f4546s.f() - this.f4546s.d(viewS0);
                dVar.f4563a = I(viewS0);
            } else {
                View viewT0 = T0();
                dVar.f4563a = I(viewT0);
                dVar.f4564b = this.f4546s.e(viewT0) - this.f4546s.g();
            }
        } else {
            dVar.a();
        }
        return dVar;
    }
}
