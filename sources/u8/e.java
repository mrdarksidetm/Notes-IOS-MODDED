package u8;

import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes.dex */
public final class e {
    public static <R extends h> d<R> a(R r10, com.google.android.gms.common.api.e eVar) {
        w8.m.l(r10, "Result must not be null");
        w8.m.b(!r10.getStatus().B(), "Status code must not be SUCCESS");
        q qVar = new q(eVar, r10);
        qVar.setResult(r10);
        return qVar;
    }

    public static <R extends h> c<R> b(R r10, com.google.android.gms.common.api.e eVar) {
        w8.m.l(r10, "Result must not be null");
        r rVar = new r(eVar);
        rVar.setResult(r10);
        return new v8.i(rVar);
    }

    public static d<Status> c(Status status, com.google.android.gms.common.api.e eVar) {
        w8.m.l(status, "Result must not be null");
        v8.m mVar = new v8.m(eVar);
        mVar.setResult(status);
        return mVar;
    }
}
