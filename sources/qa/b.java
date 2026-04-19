package qa;

import com.google.firebase.components.ComponentRegistrar;
import da.d;
import da.g;
import da.i;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class b implements i {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object c(String str, da.c cVar, d dVar) {
        try {
            c.b(str);
            return cVar.h().a(dVar);
        } finally {
            c.a();
        }
    }

    @Override // da.i
    public List<da.c<?>> a(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (final da.c<?> cVarT : componentRegistrar.getComponents()) {
            final String strI = cVarT.i();
            if (strI != null) {
                cVarT = cVarT.t(new g() { // from class: qa.a
                    @Override // da.g
                    public final Object a(d dVar) {
                        return b.c(strI, cVarT, dVar);
                    }
                });
            }
            arrayList.add(cVarT);
        }
        return arrayList;
    }
}
