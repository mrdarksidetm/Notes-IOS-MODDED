package o6;

import okhttp3.Call;
import okhttp3.Response;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    public static final Object a(Call call, qd.d<? super Response> dVar) {
        le.p pVar = new le.p(rd.c.c(dVar), 1);
        pVar.A();
        k kVar = new k(call, pVar);
        call.o(kVar);
        pVar.p(kVar);
        Object objX = pVar.x();
        if (objX == rd.d.e()) {
            sd.f.c(dVar);
        }
        return objX;
    }
}
