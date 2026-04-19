package p;

import android.view.View;
import android.view.animation.Interpolator;
import androidx.core.view.l;
import java.util.ArrayList;
import java.util.Iterator;
import o3.f2;
import o3.g2;

/* JADX INFO: loaded from: classes.dex */
public class g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Interpolator f17754c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    f2 f17755d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f17756e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f17753b = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final g2 f17757f = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final ArrayList<l> f17752a = new ArrayList<>();

    class a extends g2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f17758a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f17759b = 0;

        a() {
        }

        @Override // o3.f2
        public void b(View view) {
            int i10 = this.f17759b + 1;
            this.f17759b = i10;
            if (i10 == g.this.f17752a.size()) {
                f2 f2Var = g.this.f17755d;
                if (f2Var != null) {
                    f2Var.b(null);
                }
                d();
            }
        }

        @Override // o3.g2, o3.f2
        public void c(View view) {
            if (this.f17758a) {
                return;
            }
            this.f17758a = true;
            f2 f2Var = g.this.f17755d;
            if (f2Var != null) {
                f2Var.c(null);
            }
        }

        void d() {
            this.f17759b = 0;
            this.f17758a = false;
            g.this.b();
        }
    }

    public void a() {
        if (this.f17756e) {
            Iterator<l> it = this.f17752a.iterator();
            while (it.hasNext()) {
                it.next().c();
            }
            this.f17756e = false;
        }
    }

    void b() {
        this.f17756e = false;
    }

    public g c(l lVar) {
        if (!this.f17756e) {
            this.f17752a.add(lVar);
        }
        return this;
    }

    public g d(l lVar, l lVar2) {
        this.f17752a.add(lVar);
        lVar2.j(lVar.d());
        this.f17752a.add(lVar2);
        return this;
    }

    public g e(long j10) {
        if (!this.f17756e) {
            this.f17753b = j10;
        }
        return this;
    }

    public g f(Interpolator interpolator) {
        if (!this.f17756e) {
            this.f17754c = interpolator;
        }
        return this;
    }

    public g g(f2 f2Var) {
        if (!this.f17756e) {
            this.f17755d = f2Var;
        }
        return this;
    }

    public void h() {
        if (this.f17756e) {
            return;
        }
        for (l lVar : this.f17752a) {
            long j10 = this.f17753b;
            if (j10 >= 0) {
                lVar.f(j10);
            }
            Interpolator interpolator = this.f17754c;
            if (interpolator != null) {
                lVar.g(interpolator);
            }
            if (this.f17755d != null) {
                lVar.h(this.f17757f);
            }
            lVar.l();
        }
        this.f17756e = true;
    }
}
