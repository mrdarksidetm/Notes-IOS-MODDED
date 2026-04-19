package p003if;

import ae.r;
import hf.i;
import hf.j;
import hf.z;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import nd.k;

/* JADX INFO: loaded from: classes2.dex */
public final class h {
    public static final void a(j jVar, z zVar, boolean z10) {
        r.f(jVar, "<this>");
        r.f(zVar, "dir");
        k kVar = new k();
        for (z zVarM = zVar; zVarM != null && !jVar.j(zVarM); zVarM = zVarM.m()) {
            kVar.addFirst(zVarM);
        }
        if (z10 && kVar.isEmpty()) {
            throw new IOException(zVar + " already exist.");
        }
        Iterator<E> it = kVar.iterator();
        while (it.hasNext()) {
            jVar.f((z) it.next());
        }
    }

    public static final boolean b(j jVar, z zVar) {
        r.f(jVar, "<this>");
        r.f(zVar, "path");
        return jVar.m(zVar) != null;
    }

    public static final i c(j jVar, z zVar) throws FileNotFoundException {
        r.f(jVar, "<this>");
        r.f(zVar, "path");
        i iVarM = jVar.m(zVar);
        if (iVarM != null) {
            return iVarM;
        }
        throw new FileNotFoundException("no such file: " + zVar);
    }
}
