package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
final class e implements Runnable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final ThreadLocal<e> f4854e = new ThreadLocal<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static Comparator<c> f4855f = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    long f4857b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    long f4858c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    ArrayList<RecyclerView> f4856a = new ArrayList<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ArrayList<c> f4859d = new ArrayList<>();

    static class a implements Comparator<c> {
        a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(c cVar, c cVar2) {
            RecyclerView recyclerView = cVar.f4867d;
            if ((recyclerView == null) != (cVar2.f4867d == null)) {
                return recyclerView == null ? 1 : -1;
            }
            boolean z10 = cVar.f4864a;
            if (z10 != cVar2.f4864a) {
                return z10 ? -1 : 1;
            }
            int i10 = cVar2.f4865b - cVar.f4865b;
            if (i10 != 0) {
                return i10;
            }
            int i11 = cVar.f4866c - cVar2.f4866c;
            if (i11 != 0) {
                return i11;
            }
            return 0;
        }
    }

    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f4860a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f4861b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int[] f4862c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f4863d;

        b() {
        }

        void a() {
            int[] iArr = this.f4862c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f4863d = 0;
        }

        void b(RecyclerView recyclerView, boolean z10) {
            this.f4863d = 0;
            int[] iArr = this.f4862c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.n nVar = recyclerView.f4588l;
        }

        boolean c(int i10) {
            if (this.f4862c != null) {
                int i11 = this.f4863d * 2;
                for (int i12 = 0; i12 < i11; i12 += 2) {
                    if (this.f4862c[i12] == i10) {
                        return true;
                    }
                }
            }
            return false;
        }

        void d(int i10, int i11) {
            this.f4860a = i10;
            this.f4861b = i11;
        }
    }

    static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f4864a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f4865b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f4866c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public RecyclerView f4867d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f4868e;

        c() {
        }

        public void a() {
            this.f4864a = false;
            this.f4865b = 0;
            this.f4866c = 0;
            this.f4867d = null;
            this.f4868e = 0;
        }
    }

    e() {
    }

    private void b() {
        c cVar;
        int size = this.f4856a.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            RecyclerView recyclerView = this.f4856a.get(i11);
            if (recyclerView.getWindowVisibility() == 0) {
                recyclerView.f4603s0.b(recyclerView, false);
                i10 += recyclerView.f4603s0.f4863d;
            }
        }
        this.f4859d.ensureCapacity(i10);
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            RecyclerView recyclerView2 = this.f4856a.get(i13);
            if (recyclerView2.getWindowVisibility() == 0) {
                b bVar = recyclerView2.f4603s0;
                int iAbs = Math.abs(bVar.f4860a) + Math.abs(bVar.f4861b);
                for (int i14 = 0; i14 < bVar.f4863d * 2; i14 += 2) {
                    if (i12 >= this.f4859d.size()) {
                        cVar = new c();
                        this.f4859d.add(cVar);
                    } else {
                        cVar = this.f4859d.get(i12);
                    }
                    int[] iArr = bVar.f4862c;
                    int i15 = iArr[i14 + 1];
                    cVar.f4864a = i15 <= iAbs;
                    cVar.f4865b = iAbs;
                    cVar.f4866c = i15;
                    cVar.f4867d = recyclerView2;
                    cVar.f4868e = iArr[i14];
                    i12++;
                }
            }
        }
        Collections.sort(this.f4859d, f4855f);
    }

    private void c(c cVar, long j10) {
        RecyclerView.b0 b0VarI = i(cVar.f4867d, cVar.f4868e, cVar.f4864a ? Long.MAX_VALUE : j10);
        if (b0VarI == null || b0VarI.f4629b == null || !b0VarI.p() || b0VarI.q()) {
            return;
        }
        h(b0VarI.f4629b.get(), j10);
    }

    private void d(long j10) {
        for (int i10 = 0; i10 < this.f4859d.size(); i10++) {
            c cVar = this.f4859d.get(i10);
            if (cVar.f4867d == null) {
                return;
            }
            c(cVar, j10);
            cVar.a();
        }
    }

    static boolean e(RecyclerView recyclerView, int i10) {
        int iG = recyclerView.f4574e.g();
        for (int i11 = 0; i11 < iG; i11++) {
            RecyclerView.b0 b0VarH = RecyclerView.H(recyclerView.f4574e.f(i11));
            if (b0VarH.f4630c == i10 && !b0VarH.q()) {
                return true;
            }
        }
        return false;
    }

    private void h(RecyclerView recyclerView, long j10) {
        if (recyclerView == null) {
            return;
        }
        if (recyclerView.C && recyclerView.f4574e.g() != 0) {
            recyclerView.m0();
        }
        b bVar = recyclerView.f4603s0;
        bVar.b(recyclerView, true);
        if (bVar.f4863d != 0) {
            try {
                k3.g.a("RV Nested Prefetch");
                recyclerView.f4605t0.c(null);
                for (int i10 = 0; i10 < bVar.f4863d * 2; i10 += 2) {
                    i(recyclerView, bVar.f4862c[i10], j10);
                }
            } finally {
                k3.g.b();
            }
        }
    }

    private RecyclerView.b0 i(RecyclerView recyclerView, int i10, long j10) {
        if (e(recyclerView, i10)) {
            return null;
        }
        RecyclerView.u uVar = recyclerView.f4568b;
        try {
            recyclerView.b0();
            RecyclerView.b0 b0VarA = uVar.A(i10, false, j10);
            if (b0VarA != null) {
                if (!b0VarA.p() || b0VarA.q()) {
                    uVar.a(b0VarA, false);
                } else {
                    uVar.t(b0VarA.f4628a);
                }
            }
            return b0VarA;
        } finally {
            recyclerView.d0(false);
        }
    }

    public void a(RecyclerView recyclerView) {
        this.f4856a.add(recyclerView);
    }

    void f(RecyclerView recyclerView, int i10, int i11) {
        if (recyclerView.isAttachedToWindow() && this.f4857b == 0) {
            this.f4857b = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        recyclerView.f4603s0.d(i10, i11);
    }

    void g(long j10) {
        b();
        d(j10);
    }

    public void j(RecyclerView recyclerView) {
        this.f4856a.remove(recyclerView);
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            k3.g.a("RV Prefetch");
            if (!this.f4856a.isEmpty()) {
                int size = this.f4856a.size();
                long jMax = 0;
                for (int i10 = 0; i10 < size; i10++) {
                    RecyclerView recyclerView = this.f4856a.get(i10);
                    if (recyclerView.getWindowVisibility() == 0) {
                        jMax = Math.max(recyclerView.getDrawingTime(), jMax);
                    }
                }
                if (jMax != 0) {
                    g(TimeUnit.MILLISECONDS.toNanos(jMax) + this.f4858c);
                }
            }
        } finally {
            this.f4857b = 0L;
            k3.g.b();
        }
    }
}
