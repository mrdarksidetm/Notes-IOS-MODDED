package r4;

import androidx.lifecycle.e;
import androidx.lifecycle.w;
import androidx.lifecycle.y;
import o4.q;
import q4.a;
import t0.l;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    private static final <VM extends w> VM a(q qVar, Class<VM> cls, String str, y.b bVar, q4.a aVar) {
        y yVar;
        if (bVar != null) {
            yVar = new y(qVar.getViewModelStore(), bVar, aVar);
        } else {
            yVar = qVar instanceof e ? new y(qVar.getViewModelStore(), ((e) qVar).getDefaultViewModelProviderFactory(), aVar) : new y(qVar);
        }
        return str != null ? (VM) yVar.b(str, cls) : (VM) yVar.a(cls);
    }

    public static final <VM extends w> VM b(Class<VM> cls, q qVar, String str, y.b bVar, q4.a aVar, l lVar, int i10, int i11) {
        lVar.e(-1439476281);
        if ((i11 & 2) != 0 && (qVar = a.f19180a.a(lVar, 6)) == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
        }
        if ((i11 & 4) != 0) {
            str = null;
        }
        if ((i11 & 8) != 0) {
            bVar = null;
        }
        if ((i11 & 16) != 0) {
            aVar = qVar instanceof e ? ((e) qVar).getDefaultViewModelCreationExtras() : a.C0398a.f18979b;
        }
        VM vm = (VM) a(qVar, cls, str, bVar, aVar);
        lVar.K();
        return vm;
    }
}
