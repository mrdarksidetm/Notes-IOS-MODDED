package p0;

import android.content.Context;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import nd.u;
import nd.z;

/* JADX INFO: loaded from: classes.dex */
public final class i extends ViewGroup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f17827a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<l> f17828b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<l> f17829c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final j f17830d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f17831e;

    public i(Context context) {
        super(context);
        this.f17827a = 5;
        ArrayList arrayList = new ArrayList();
        this.f17828b = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f17829c = arrayList2;
        this.f17830d = new j();
        setClipChildren(false);
        l lVar = new l(context);
        addView(lVar);
        arrayList.add(lVar);
        arrayList2.add(lVar);
        this.f17831e = 1;
        setTag(f1.e.J, Boolean.TRUE);
    }

    public final void a(a aVar) {
        aVar.o();
        l lVarB = this.f17830d.b(aVar);
        if (lVarB != null) {
            lVarB.d();
            this.f17830d.c(aVar);
            this.f17829c.add(lVarB);
        }
    }

    public final l b(a aVar) {
        l lVarB = this.f17830d.b(aVar);
        if (lVarB != null) {
            return lVarB;
        }
        l lVar = (l) z.L(this.f17829c);
        if (lVar == null) {
            if (this.f17831e > u.o(this.f17828b)) {
                lVar = new l(getContext());
                addView(lVar);
                this.f17828b.add(lVar);
            } else {
                lVar = this.f17828b.get(this.f17831e);
                a aVarA = this.f17830d.a(lVar);
                if (aVarA != null) {
                    aVarA.o();
                    this.f17830d.c(aVarA);
                    lVar.d();
                }
            }
            int i10 = this.f17831e;
            this.f17831e = i10 < this.f17827a + (-1) ? i10 + 1 : 0;
        }
        this.f17830d.d(aVar, lVar);
        return lVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        setMeasuredDimension(0, 0);
    }
}
