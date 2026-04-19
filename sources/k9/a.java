package k9;

import android.app.Activity;
import android.app.PendingIntent;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.d;
import com.google.android.gms.common.api.internal.j;
import com.google.android.gms.internal.fido.zzo;
import com.google.android.gms.internal.fido.zzp;
import com.google.android.gms.internal.fido.zzs;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import l9.u;
import v8.l;

/* JADX INFO: loaded from: classes.dex */
public class a extends d<a.d.c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final a.g f14448a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final com.google.android.gms.common.api.a f14449b;

    static {
        a.g gVar = new a.g();
        f14448a = gVar;
        f14449b = new com.google.android.gms.common.api.a("Fido.FIDO2_API", new zzo(), gVar);
    }

    @Deprecated
    public a(Activity activity) {
        super(activity, (com.google.android.gms.common.api.a<a.d.c>) f14449b, a.d.N, (l) new v8.a());
    }

    public Task<PendingIntent> c(final u uVar) {
        return doRead(j.a().b(new v8.j() { // from class: k9.b
            /* JADX WARN: Multi-variable type inference failed */
            @Override // v8.j
            public final void accept(Object obj, Object obj2) {
                a aVar = this.f14450a;
                u uVar2 = uVar;
                ((zzs) ((zzp) obj).getService()).zzc(new c(aVar, (TaskCompletionSource) obj2), uVar2);
            }
        }).e(5407).a());
    }
}
