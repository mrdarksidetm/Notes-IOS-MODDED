package androidx.core.app;

import android.os.Bundle;
import androidx.core.app.g;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f3256a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f3257b = new Object();

    static Bundle a(g.a aVar) {
        Bundle bundle = new Bundle();
        IconCompat iconCompatD = aVar.d();
        bundle.putInt("icon", iconCompatD != null ? iconCompatD.i() : 0);
        bundle.putCharSequence(com.amazon.a.a.o.b.S, aVar.h());
        bundle.putParcelable("actionIntent", aVar.a());
        Bundle bundle2 = aVar.c() != null ? new Bundle(aVar.c()) : new Bundle();
        bundle2.putBoolean("android.support.allowGeneratedReplies", aVar.b());
        bundle.putBundle("extras", bundle2);
        bundle.putParcelableArray("remoteInputs", c(aVar.e()));
        bundle.putBoolean("showsUserInterface", aVar.g());
        bundle.putInt("semanticAction", aVar.f());
        return bundle;
    }

    private static Bundle b(l lVar) {
        Bundle bundle = new Bundle();
        bundle.putString("resultKey", lVar.i());
        bundle.putCharSequence("label", lVar.h());
        bundle.putCharSequenceArray("choices", lVar.e());
        bundle.putBoolean("allowFreeFormInput", lVar.c());
        bundle.putBundle("extras", lVar.g());
        Set<String> setD = lVar.d();
        if (setD != null && !setD.isEmpty()) {
            ArrayList<String> arrayList = new ArrayList<>(setD.size());
            Iterator<String> it = setD.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
            bundle.putStringArrayList("allowedDataTypes", arrayList);
        }
        return bundle;
    }

    private static Bundle[] c(l[] lVarArr) {
        if (lVarArr == null) {
            return null;
        }
        Bundle[] bundleArr = new Bundle[lVarArr.length];
        for (int i10 = 0; i10 < lVarArr.length; i10++) {
            bundleArr[i10] = b(lVarArr[i10]);
        }
        return bundleArr;
    }
}
