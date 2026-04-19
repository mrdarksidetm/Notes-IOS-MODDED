package y8;

import android.content.Context;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.d;
import com.google.android.gms.common.api.internal.j;
import com.google.android.gms.internal.base.zaf;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import w8.q;
import w8.s;
import w8.t;

/* JADX INFO: loaded from: classes.dex */
public final class d extends com.google.android.gms.common.api.d implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final a.g f23549a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final a.AbstractC0174a f23550b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final com.google.android.gms.common.api.a f23551c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f23552d = 0;

    static {
        a.g gVar = new a.g();
        f23549a = gVar;
        c cVar = new c();
        f23550b = cVar;
        f23551c = new com.google.android.gms.common.api.a("ClientTelemetry.API", cVar, gVar);
    }

    public d(Context context, t tVar) {
        super(context, (com.google.android.gms.common.api.a<t>) f23551c, tVar, d.a.f8400c);
    }

    @Override // w8.s
    public final Task<Void> b(final q qVar) {
        j.a aVarA = j.a();
        aVarA.d(zaf.zaa);
        aVarA.c(false);
        aVarA.b(new v8.j() { // from class: y8.b
            /* JADX WARN: Multi-variable type inference failed */
            @Override // v8.j
            public final void accept(Object obj, Object obj2) {
                int i10 = d.f23552d;
                ((a) ((e) obj).getService()).b(qVar);
                ((TaskCompletionSource) obj2).setResult(null);
            }
        });
        return doBestEffortWrite(aVarA.a());
    }
}
