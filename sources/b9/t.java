package b9;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.d;
import com.google.android.gms.common.api.internal.h;
import com.google.android.gms.common.api.internal.j;
import com.google.android.gms.internal.base.zav;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class t extends com.google.android.gms.common.api.d implements a9.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final a.g f5547a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final a.AbstractC0174a f5548b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final com.google.android.gms.common.api.a f5549c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f5550d = 0;

    static {
        a.g gVar = new a.g();
        f5547a = gVar;
        p pVar = new p();
        f5548b = pVar;
        f5549c = new com.google.android.gms.common.api.a("ModuleInstall.API", pVar, gVar);
    }

    public t(Context context) {
        super(context, (com.google.android.gms.common.api.a<a.d.c>) f5549c, a.d.N, d.a.f8400c);
    }

    @Override // a9.d
    public final Task<a9.g> a(a9.f fVar) {
        final a aVarU = a.u(fVar);
        final a9.a aVarB = fVar.b();
        Executor executorC = fVar.c();
        if (aVarU.x().isEmpty()) {
            return Tasks.forResult(new a9.g(0));
        }
        if (aVarB == null) {
            j.a aVarA = com.google.android.gms.common.api.internal.j.a();
            aVarA.d(zav.zaa);
            aVarA.c(true);
            aVarA.e(27304);
            aVarA.b(new v8.j() { // from class: b9.o
                /* JADX WARN: Multi-variable type inference failed */
                @Override // v8.j
                public final void accept(Object obj, Object obj2) {
                    ((i) ((u) obj).getService()).b(new q(this.f5539a, (TaskCompletionSource) obj2), aVarU, null);
                }
            });
            return doRead(aVarA.a());
        }
        w8.m.k(aVarB);
        com.google.android.gms.common.api.internal.e eVarRegisterListener = executorC == null ? registerListener(aVarB, a9.a.class.getSimpleName()) : com.google.android.gms.common.api.internal.f.b(aVarB, executorC, a9.a.class.getSimpleName());
        final d dVar = new d(eVarRegisterListener);
        final AtomicReference atomicReference = new AtomicReference();
        v8.j jVar = new v8.j() { // from class: b9.l
            /* JADX WARN: Multi-variable type inference failed */
            @Override // v8.j
            public final void accept(Object obj, Object obj2) {
                ((i) ((u) obj).getService()).b(new r(this.f5531a, atomicReference, (TaskCompletionSource) obj2, aVarB), aVarU, dVar);
            }
        };
        v8.j jVar2 = new v8.j() { // from class: b9.m
            /* JADX WARN: Multi-variable type inference failed */
            @Override // v8.j
            public final void accept(Object obj, Object obj2) {
                ((i) ((u) obj).getService()).c(new s(this.f5536a, (TaskCompletionSource) obj2), dVar);
            }
        };
        h.a aVarA2 = com.google.android.gms.common.api.internal.h.a();
        aVarA2.g(eVarRegisterListener);
        aVarA2.d(zav.zaa);
        aVarA2.c(true);
        aVarA2.b(jVar);
        aVarA2.f(jVar2);
        aVarA2.e(27305);
        return doRegisterEventListener(aVarA2.a()).onSuccessTask(new SuccessContinuation() { // from class: b9.n
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                int i10 = t.f5550d;
                AtomicReference atomicReference2 = atomicReference;
                return atomicReference2.get() != null ? Tasks.forResult((a9.g) atomicReference2.get()) : Tasks.forException(new com.google.android.gms.common.api.b(Status.f8387h));
            }
        });
    }
}
