package o6;

import hf.z;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class e {
    public static final void a(hf.j jVar, z zVar) {
        if (jVar.j(zVar)) {
            return;
        }
        j.d(jVar.o(zVar));
    }

    public static final void b(hf.j jVar, z zVar) throws IOException {
        try {
            IOException iOException = null;
            for (z zVar2 : jVar.k(zVar)) {
                try {
                    if (jVar.l(zVar2).f()) {
                        b(jVar, zVar2);
                    }
                    jVar.h(zVar2);
                } catch (IOException e10) {
                    if (iOException == null) {
                        iOException = e10;
                    }
                }
            }
            if (iOException != null) {
                throw iOException;
            }
        } catch (FileNotFoundException unused) {
        }
    }
}
