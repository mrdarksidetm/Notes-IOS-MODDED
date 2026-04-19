package c5;

import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import c5.l;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class p extends l {
    int Y;
    private ArrayList<l> I = new ArrayList<>();
    private boolean X = true;
    boolean Z = false;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private int f6527a0 = 0;

    class a extends m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ l f6528a;

        a(l lVar) {
            this.f6528a = lVar;
        }

        @Override // c5.l.f
        public void d(l lVar) {
            this.f6528a.X();
            lVar.T(this);
        }
    }

    static class b extends m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        p f6530a;

        b(p pVar) {
            this.f6530a = pVar;
        }

        @Override // c5.l.f
        public void d(l lVar) {
            p pVar = this.f6530a;
            int i10 = pVar.Y - 1;
            pVar.Y = i10;
            if (i10 == 0) {
                pVar.Z = false;
                pVar.r();
            }
            lVar.T(this);
        }

        @Override // c5.m, c5.l.f
        public void e(l lVar) {
            p pVar = this.f6530a;
            if (pVar.Z) {
                return;
            }
            pVar.e0();
            this.f6530a.Z = true;
        }
    }

    private void j0(l lVar) {
        this.I.add(lVar);
        lVar.f6484r = this;
    }

    private void s0() {
        b bVar = new b(this);
        Iterator<l> it = this.I.iterator();
        while (it.hasNext()) {
            it.next().b(bVar);
        }
        this.Y = this.I.size();
    }

    @Override // c5.l
    public void R(View view) {
        super.R(view);
        int size = this.I.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.I.get(i10).R(view);
        }
    }

    @Override // c5.l
    public void V(View view) {
        super.V(view);
        int size = this.I.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.I.get(i10).V(view);
        }
    }

    @Override // c5.l
    protected void X() {
        if (this.I.isEmpty()) {
            e0();
            r();
            return;
        }
        s0();
        if (this.X) {
            Iterator<l> it = this.I.iterator();
            while (it.hasNext()) {
                it.next().X();
            }
            return;
        }
        for (int i10 = 1; i10 < this.I.size(); i10++) {
            this.I.get(i10 - 1).b(new a(this.I.get(i10)));
        }
        l lVar = this.I.get(0);
        if (lVar != null) {
            lVar.X();
        }
    }

    @Override // c5.l
    public void Z(l.e eVar) {
        super.Z(eVar);
        this.f6527a0 |= 8;
        int size = this.I.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.I.get(i10).Z(eVar);
        }
    }

    @Override // c5.l
    public void b0(g gVar) {
        super.b0(gVar);
        this.f6527a0 |= 4;
        if (this.I != null) {
            for (int i10 = 0; i10 < this.I.size(); i10++) {
                this.I.get(i10).b0(gVar);
            }
        }
    }

    @Override // c5.l
    public void c0(o oVar) {
        super.c0(oVar);
        this.f6527a0 |= 2;
        int size = this.I.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.I.get(i10).c0(oVar);
        }
    }

    @Override // c5.l
    protected void cancel() {
        super.cancel();
        int size = this.I.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.I.get(i10).cancel();
        }
    }

    @Override // c5.l
    String f0(String str) {
        String strF0 = super.f0(str);
        for (int i10 = 0; i10 < this.I.size(); i10++) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(strF0);
            sb2.append("\n");
            sb2.append(this.I.get(i10).f0(str + "  "));
            strF0 = sb2.toString();
        }
        return strF0;
    }

    @Override // c5.l
    public void g(s sVar) {
        if (K(sVar.f6535b)) {
            for (l lVar : this.I) {
                if (lVar.K(sVar.f6535b)) {
                    lVar.g(sVar);
                    sVar.f6536c.add(lVar);
                }
            }
        }
    }

    @Override // c5.l
    /* JADX INFO: renamed from: g0, reason: merged with bridge method [inline-methods] */
    public p b(l.f fVar) {
        return (p) super.b(fVar);
    }

    @Override // c5.l
    /* JADX INFO: renamed from: h0, reason: merged with bridge method [inline-methods] */
    public p c(View view) {
        for (int i10 = 0; i10 < this.I.size(); i10++) {
            this.I.get(i10).c(view);
        }
        return (p) super.c(view);
    }

    @Override // c5.l
    void i(s sVar) {
        super.i(sVar);
        int size = this.I.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.I.get(i10).i(sVar);
        }
    }

    public p i0(l lVar) {
        j0(lVar);
        long j10 = this.f6469c;
        if (j10 >= 0) {
            lVar.Y(j10);
        }
        if ((this.f6527a0 & 1) != 0) {
            lVar.a0(u());
        }
        if ((this.f6527a0 & 2) != 0) {
            A();
            lVar.c0(null);
        }
        if ((this.f6527a0 & 4) != 0) {
            lVar.b0(z());
        }
        if ((this.f6527a0 & 8) != 0) {
            lVar.Z(t());
        }
        return this;
    }

    @Override // c5.l
    public void j(s sVar) {
        if (K(sVar.f6535b)) {
            for (l lVar : this.I) {
                if (lVar.K(sVar.f6535b)) {
                    lVar.j(sVar);
                    sVar.f6536c.add(lVar);
                }
            }
        }
    }

    public l k0(int i10) {
        if (i10 < 0 || i10 >= this.I.size()) {
            return null;
        }
        return this.I.get(i10);
    }

    public int l0() {
        return this.I.size();
    }

    @Override // c5.l
    /* JADX INFO: renamed from: m0, reason: merged with bridge method [inline-methods] */
    public p T(l.f fVar) {
        return (p) super.T(fVar);
    }

    @Override // c5.l
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public l clone() {
        p pVar = (p) super.clone();
        pVar.I = new ArrayList<>();
        int size = this.I.size();
        for (int i10 = 0; i10 < size; i10++) {
            pVar.j0(this.I.get(i10).clone());
        }
        return pVar;
    }

    @Override // c5.l
    /* JADX INFO: renamed from: n0, reason: merged with bridge method [inline-methods] */
    public p U(View view) {
        for (int i10 = 0; i10 < this.I.size(); i10++) {
            this.I.get(i10).U(view);
        }
        return (p) super.U(view);
    }

    @Override // c5.l
    /* JADX INFO: renamed from: o0, reason: merged with bridge method [inline-methods] */
    public p Y(long j10) {
        ArrayList<l> arrayList;
        super.Y(j10);
        if (this.f6469c >= 0 && (arrayList = this.I) != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.I.get(i10).Y(j10);
            }
        }
        return this;
    }

    @Override // c5.l
    /* JADX INFO: renamed from: p0, reason: merged with bridge method [inline-methods] */
    public p a0(TimeInterpolator timeInterpolator) {
        this.f6527a0 |= 1;
        ArrayList<l> arrayList = this.I;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.I.get(i10).a0(timeInterpolator);
            }
        }
        return (p) super.a0(timeInterpolator);
    }

    @Override // c5.l
    protected void q(ViewGroup viewGroup, t tVar, t tVar2, ArrayList<s> arrayList, ArrayList<s> arrayList2) {
        long jC = C();
        int size = this.I.size();
        for (int i10 = 0; i10 < size; i10++) {
            l lVar = this.I.get(i10);
            if (jC > 0 && (this.X || i10 == 0)) {
                long jC2 = lVar.C();
                if (jC2 > 0) {
                    lVar.d0(jC2 + jC);
                } else {
                    lVar.d0(jC);
                }
            }
            lVar.q(viewGroup, tVar, tVar2, arrayList, arrayList2);
        }
    }

    public p q0(int i10) {
        if (i10 == 0) {
            this.X = true;
        } else {
            if (i10 != 1) {
                throw new AndroidRuntimeException("Invalid parameter for TransitionSet ordering: " + i10);
            }
            this.X = false;
        }
        return this;
    }

    @Override // c5.l
    /* JADX INFO: renamed from: r0, reason: merged with bridge method [inline-methods] */
    public p d0(long j10) {
        return (p) super.d0(j10);
    }
}
