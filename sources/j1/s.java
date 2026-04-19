package j1;

import androidx.compose.ui.focus.FocusTargetNode;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import md.i0;

/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<FocusTargetNode, o> f13819a = new LinkedHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final v0.d<zd.a<i0>> f13820b = new v0.d<>(new zd.a[16], 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f13821c;

    /* JADX INFO: Access modifiers changed from: private */
    public final void f() {
        this.f13821c = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g() {
        v0.d<zd.a<i0>> dVar = this.f13820b;
        int iO = dVar.o();
        if (iO > 0) {
            zd.a<i0>[] aVarArrN = dVar.n();
            int i10 = 0;
            do {
                aVarArrN[i10].invoke();
                i10++;
            } while (i10 < iO);
        }
        this.f13820b.i();
        this.f13819a.clear();
        this.f13821c = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h() {
        Iterator<FocusTargetNode> it = this.f13819a.keySet().iterator();
        while (it.hasNext()) {
            it.next().e2();
        }
        this.f13819a.clear();
        this.f13821c = false;
    }

    public final o i(FocusTargetNode focusTargetNode) {
        return this.f13819a.get(focusTargetNode);
    }

    public final void j(FocusTargetNode focusTargetNode, o oVar) {
        Map<FocusTargetNode, o> map = this.f13819a;
        if (oVar == null) {
            throw new IllegalStateException("requires a non-null focus state".toString());
        }
        map.put(focusTargetNode, oVar);
    }
}
