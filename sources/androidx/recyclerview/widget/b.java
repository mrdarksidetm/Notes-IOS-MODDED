package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final InterfaceC0111b f4768a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final a f4769b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final List<View> f4770c = new ArrayList();

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        long f4771a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        a f4772b;

        a() {
        }

        private void c() {
            if (this.f4772b == null) {
                this.f4772b = new a();
            }
        }

        void a(int i10) {
            if (i10 < 64) {
                this.f4771a &= ~(1 << i10);
                return;
            }
            a aVar = this.f4772b;
            if (aVar != null) {
                aVar.a(i10 - 64);
            }
        }

        int b(int i10) {
            a aVar = this.f4772b;
            return aVar == null ? i10 >= 64 ? Long.bitCount(this.f4771a) : Long.bitCount(this.f4771a & ((1 << i10) - 1)) : i10 < 64 ? Long.bitCount(this.f4771a & ((1 << i10) - 1)) : aVar.b(i10 - 64) + Long.bitCount(this.f4771a);
        }

        boolean d(int i10) {
            if (i10 < 64) {
                return (this.f4771a & (1 << i10)) != 0;
            }
            c();
            return this.f4772b.d(i10 - 64);
        }

        boolean e(int i10) {
            if (i10 >= 64) {
                c();
                return this.f4772b.e(i10 - 64);
            }
            long j10 = 1 << i10;
            long j11 = this.f4771a;
            boolean z10 = (j11 & j10) != 0;
            long j12 = j11 & (~j10);
            this.f4771a = j12;
            long j13 = j10 - 1;
            this.f4771a = (j12 & j13) | Long.rotateRight((~j13) & j12, 1);
            a aVar = this.f4772b;
            if (aVar != null) {
                if (aVar.d(0)) {
                    g(63);
                }
                this.f4772b.e(0);
            }
            return z10;
        }

        void f() {
            this.f4771a = 0L;
            a aVar = this.f4772b;
            if (aVar != null) {
                aVar.f();
            }
        }

        void g(int i10) {
            if (i10 < 64) {
                this.f4771a |= 1 << i10;
            } else {
                c();
                this.f4772b.g(i10 - 64);
            }
        }

        public String toString() {
            if (this.f4772b == null) {
                return Long.toBinaryString(this.f4771a);
            }
            return this.f4772b.toString() + "xx" + Long.toBinaryString(this.f4771a);
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.b$b, reason: collision with other inner class name */
    interface InterfaceC0111b {
        View a(int i10);

        int b();

        void c();

        int d(View view);

        RecyclerView.b0 e(View view);

        void f(int i10);

        void g(View view);

        void h(int i10);
    }

    b(InterfaceC0111b interfaceC0111b) {
        this.f4768a = interfaceC0111b;
    }

    private int e(int i10) {
        if (i10 < 0) {
            return -1;
        }
        int iB = this.f4768a.b();
        int i11 = i10;
        while (i11 < iB) {
            int iB2 = i10 - (i11 - this.f4769b.b(i11));
            if (iB2 == 0) {
                while (this.f4769b.d(i11)) {
                    i11++;
                }
                return i11;
            }
            i11 += iB2;
        }
        return -1;
    }

    private boolean n(View view) {
        if (!this.f4770c.remove(view)) {
            return false;
        }
        this.f4768a.g(view);
        return true;
    }

    void a(int i10) {
        int iE = e(i10);
        this.f4769b.e(iE);
        this.f4768a.f(iE);
    }

    View b(int i10) {
        int size = this.f4770c.size();
        for (int i11 = 0; i11 < size; i11++) {
            View view = this.f4770c.get(i11);
            RecyclerView.b0 b0VarE = this.f4768a.e(view);
            if (b0VarE.k() == i10 && !b0VarE.q() && !b0VarE.s()) {
                return view;
            }
        }
        return null;
    }

    View c(int i10) {
        return this.f4768a.a(e(i10));
    }

    int d() {
        return this.f4768a.b() - this.f4770c.size();
    }

    View f(int i10) {
        return this.f4768a.a(i10);
    }

    int g() {
        return this.f4768a.b();
    }

    int h(View view) {
        int iD = this.f4768a.d(view);
        if (iD == -1 || this.f4769b.d(iD)) {
            return -1;
        }
        return iD - this.f4769b.b(iD);
    }

    boolean i(View view) {
        return this.f4770c.contains(view);
    }

    void j() {
        this.f4769b.f();
        for (int size = this.f4770c.size() - 1; size >= 0; size--) {
            this.f4768a.g(this.f4770c.get(size));
            this.f4770c.remove(size);
        }
        this.f4768a.c();
    }

    void k(int i10) {
        int iE = e(i10);
        View viewA = this.f4768a.a(iE);
        if (viewA == null) {
            return;
        }
        if (this.f4769b.e(iE)) {
            n(viewA);
        }
        this.f4768a.h(iE);
    }

    boolean l(View view) {
        int iD = this.f4768a.d(view);
        if (iD == -1) {
            n(view);
            return true;
        }
        if (!this.f4769b.d(iD)) {
            return false;
        }
        this.f4769b.e(iD);
        n(view);
        this.f4768a.h(iD);
        return true;
    }

    void m(View view) {
        int iD = this.f4768a.d(view);
        if (iD < 0) {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
        if (this.f4769b.d(iD)) {
            this.f4769b.a(iD);
            n(view);
        } else {
            throw new RuntimeException("trying to unhide a view that was not hidden" + view);
        }
    }

    public String toString() {
        return this.f4769b.toString() + ", hidden list:" + this.f4770c.size();
    }
}
