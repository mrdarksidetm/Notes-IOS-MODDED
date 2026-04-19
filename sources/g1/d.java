package g1;

import android.util.Log;
import android.util.SparseArray;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import md.r;

/* JADX INFO: loaded from: classes.dex */
public final class d {
    public static final void a(b bVar, SparseArray<AutofillValue> sparseArray) {
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            int iKeyAt = sparseArray.keyAt(i10);
            AutofillValue autofillValue = sparseArray.get(iKeyAt);
            k kVar = k.f11264a;
            if (kVar.d(autofillValue)) {
                bVar.b().b(iKeyAt, kVar.i(autofillValue).toString());
            } else {
                if (kVar.b(autofillValue)) {
                    throw new r("An operation is not implemented: b/138604541: Add onFill() callback for date");
                }
                if (kVar.c(autofillValue)) {
                    throw new r("An operation is not implemented: b/138604541: Add onFill() callback for list");
                }
                if (kVar.e(autofillValue)) {
                    throw new r("An operation is not implemented: b/138604541:  Add onFill() callback for toggle");
                }
            }
        }
    }

    public static final void b(b bVar, ViewStructure viewStructure) {
        int iA = f.f11263a.a(viewStructure, bVar.b().a().size());
        for (Map.Entry<Integer, m> entry : bVar.b().a().entrySet()) {
            int iIntValue = entry.getKey().intValue();
            m value = entry.getValue();
            f fVar = f.f11263a;
            ViewStructure viewStructureB = fVar.b(viewStructure, iA);
            if (viewStructureB != null) {
                k kVar = k.f11264a;
                AutofillId autofillIdA = kVar.a(viewStructure);
                ae.r.c(autofillIdA);
                kVar.g(viewStructureB, autofillIdA, iIntValue);
                fVar.d(viewStructureB, iIntValue, bVar.c().getContext().getPackageName(), null, null);
                kVar.h(viewStructureB, 1);
                List<o> listA = value.a();
                ArrayList arrayList = new ArrayList(listA.size());
                int size = listA.size();
                for (int i10 = 0; i10 < size; i10++) {
                    arrayList.add(c.a(listA.get(i10)));
                }
                kVar.f(viewStructureB, (String[]) arrayList.toArray(new String[0]));
                k1.h hVarB = value.b();
                if (hVarB == null) {
                    Log.w("Autofill Warning", "Bounding box not set.\n                        Did you call perform autofillTree before the component was positioned? ");
                } else {
                    int iD = ce.c.d(hVarB.f());
                    int iD2 = ce.c.d(hVarB.i());
                    int iD3 = ce.c.d(hVarB.g());
                    f.f11263a.c(viewStructureB, iD, iD2, 0, 0, iD3 - iD, ce.c.d(hVarB.c()) - iD2);
                }
            }
            iA++;
        }
    }
}
