package com.google.android.gms.common.api.internal;

import android.os.SystemClock;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes.dex */
final class b0 implements OnCompleteListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f8429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f8430b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final v8.b f8431c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f8432d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f8433e;

    b0(c cVar, int i10, v8.b bVar, long j10, long j11, String str, String str2) {
        this.f8429a = cVar;
        this.f8430b = i10;
        this.f8431c = bVar;
        this.f8432d = j10;
        this.f8433e = j11;
    }

    static b0 a(c cVar, int i10, v8.b bVar) {
        boolean zA;
        if (!cVar.e()) {
            return null;
        }
        w8.o oVarA = w8.n.b().a();
        if (oVarA == null) {
            zA = true;
        } else {
            if (!oVarA.z()) {
                return null;
            }
            zA = oVarA.A();
            v vVarT = cVar.t(bVar);
            if (vVarT != null) {
                if (!(vVarT.w() instanceof com.google.android.gms.common.internal.b)) {
                    return null;
                }
                com.google.android.gms.common.internal.b bVar2 = (com.google.android.gms.common.internal.b) vVarT.w();
                if (bVar2.hasConnectionInfo() && !bVar2.isConnecting()) {
                    w8.d dVarB = b(vVarT, bVar2, i10);
                    if (dVarB == null) {
                        return null;
                    }
                    vVarT.H();
                    zA = dVarB.B();
                }
            }
        }
        return new b0(cVar, i10, bVar, zA ? System.currentTimeMillis() : 0L, zA ? SystemClock.elapsedRealtime() : 0L, null, null);
    }

    private static w8.d b(v vVar, com.google.android.gms.common.internal.b bVar, int i10) {
        int[] iArrX;
        int[] iArrZ;
        w8.d telemetryConfiguration = bVar.getTelemetryConfiguration();
        if (telemetryConfiguration == null || !telemetryConfiguration.A() || ((iArrX = telemetryConfiguration.x()) != null ? !e9.b.a(iArrX, i10) : !((iArrZ = telemetryConfiguration.z()) == null || !e9.b.a(iArrZ, i10))) || vVar.t() >= telemetryConfiguration.u()) {
            return null;
        }
        return telemetryConfiguration;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        v vVarT;
        int iB;
        int i10;
        int i11;
        int iU;
        long j10;
        long j11;
        int iElapsedRealtime;
        if (this.f8429a.e()) {
            w8.o oVarA = w8.n.b().a();
            if ((oVarA == null || oVarA.z()) && (vVarT = this.f8429a.t(this.f8431c)) != null && (vVarT.w() instanceof com.google.android.gms.common.internal.b)) {
                com.google.android.gms.common.internal.b bVar = (com.google.android.gms.common.internal.b) vVarT.w();
                int i12 = 0;
                boolean zA = this.f8432d > 0;
                int gCoreServiceId = bVar.getGCoreServiceId();
                int iX = 100;
                if (oVarA != null) {
                    zA &= oVarA.A();
                    int iU2 = oVarA.u();
                    int iX2 = oVarA.x();
                    iB = oVarA.B();
                    if (bVar.hasConnectionInfo() && !bVar.isConnecting()) {
                        w8.d dVarB = b(vVarT, bVar, this.f8430b);
                        if (dVarB == null) {
                            return;
                        }
                        boolean z10 = dVarB.B() && this.f8432d > 0;
                        iX2 = dVarB.u();
                        zA = z10;
                    }
                    i11 = iU2;
                    i10 = iX2;
                } else {
                    iB = 0;
                    i10 = 100;
                    i11 = 5000;
                }
                c cVar = this.f8429a;
                if (task.isSuccessful()) {
                    iU = 0;
                } else if (task.isCanceled()) {
                    i12 = iX;
                    iU = -1;
                } else {
                    Exception exception = task.getException();
                    if (exception instanceof com.google.android.gms.common.api.b) {
                        Status status = ((com.google.android.gms.common.api.b) exception).getStatus();
                        iX = status.x();
                        t8.b bVarU = status.u();
                        if (bVarU != null) {
                            iU = bVarU.u();
                            i12 = iX;
                        }
                        i12 = iX;
                        iU = -1;
                    } else {
                        i12 = 101;
                        iU = -1;
                    }
                }
                if (zA) {
                    long j12 = this.f8432d;
                    long j13 = this.f8433e;
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    iElapsedRealtime = (int) (SystemClock.elapsedRealtime() - j13);
                    j11 = jCurrentTimeMillis;
                    j10 = j12;
                } else {
                    j10 = 0;
                    j11 = 0;
                    iElapsedRealtime = -1;
                }
                cVar.F(new w8.j(this.f8430b, i12, iU, j10, j11, null, null, gCoreServiceId, iElapsedRealtime), iB, i11, i10);
            }
        }
    }
}
